package com.con19.dicecounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

const val COUNTS: String = "Counts"

class MainActivity : AppCompatActivity() {
    val countArray: IntArray = IntArray(12)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_1.setOnClickListener {
            countArray[0]++
        }

        button_2.setOnClickListener {
            countArray[1]++
        }

        button_3.setOnClickListener {
            countArray[2]++
        }

        button_4.setOnClickListener {
            countArray[3]++
        }

        button_5.setOnClickListener {
            countArray[4]++
        }

        button_6.setOnClickListener {
            countArray[5]++
        }

        button_7.setOnClickListener {
            countArray[6]++
        }

        button_8.setOnClickListener {
            countArray[7]++
        }

        button_9.setOnClickListener {
            countArray[8]++
        }

        button_10.setOnClickListener {
            countArray[9]++
        }

        button_11.setOnClickListener {
            countArray[10]++
        }

        button_12.setOnClickListener {
            countArray[11]++
        }


        doneButton.setOnClickListener {
            startActivity(Intent(this, ResActivity::class.java).apply {
                putExtra(COUNTS, countArray)
            })
        }

    }
}
