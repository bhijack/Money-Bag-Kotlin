package com.bozs.moneybag

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private final val LOADING_TIME : Long = 5000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countdownLoading().start()
    }

    fun countdownLoading(): CountDownTimer {
        return object :CountDownTimer(LOADING_TIME,1000){
            override fun onTick(millisUntilFinished: Long) {
                loading.text = "LOADING..."+ millisUntilFinished/1000
            }

            override fun onFinish() {
                val intent = Intent(this@MainActivity,EditBagActivity::class.java)
                startActivity(intent)

            }
        }
    }
}
