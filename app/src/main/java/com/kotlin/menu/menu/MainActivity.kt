package com.kotlin.menu.menu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtResult.setText("")
    }

    fun order(view: View){

        if(chkStarter.isChecked || chkMain.isChecked){
            var finalResult = getString(R.string.result)

            if(chkStarter.isChecked){
                finalResult = finalResult + "\n${chkStarter.text.toString()}"
            }

            if(chkMain.isChecked){
                finalResult = finalResult + "\n${chkMain.text.toString()}"
            }

            txtResult.setText(finalResult)

        }else{
            txtResult.setText(getString(R.string.option1))

        }
    }
}
