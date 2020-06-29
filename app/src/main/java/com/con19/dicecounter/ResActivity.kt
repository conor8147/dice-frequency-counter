package com.con19.dicecounter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_res.*

class ResActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_res)

        val countArray: IntArray = intent.getIntArrayExtra(COUNTS)!!

        textView.text = textView.text.toString() + countArray[0].toString()
        textView2.text = textView2.text.toString() + countArray[1].toString()
        textView3.text = textView5.text.toString() + countArray[2].toString()
        textView4.text = textView4.text.toString() + countArray[3].toString()
        textView5.text = textView5.text.toString() + countArray[4].toString()
        textView6.text = textView6.text.toString() + countArray[5].toString()
        textView7.text = textView7.text.toString() + countArray[6].toString()
        textView8.text = textView8.text.toString() + countArray[7].toString()
        textView9.text = textView9.text.toString() + countArray[8].toString()
        textView10.text = textView10.text.toString() + countArray[9].toString()
        textView11.text = textView11.text.toString() + countArray[10].toString()
        textView12.text = textView12.text.toString() + countArray[11].toString()

        goBackButton.setOnClickListener {
            finish()
        }

        resetButton.setOnClickListener {
            finishAffinity()
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
