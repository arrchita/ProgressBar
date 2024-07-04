package com.example.progressbaretp

import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var progressBar: ProgressBar
    private lateinit var startButton: Button
    private var progressStatus = 0
//    private lateinit var percentageText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar = findViewById(R.id.progressbar)
        startButton = findViewById(R.id.start_progress)
//        percentageText = findViewById(R.id.percentText)

        startButton.setOnClickListener {
            if (progressStatus < 100) {
                progressStatus += 10
                progressBar.progress = progressStatus
//                percentageText.text = "$progressStatus%"
            }
        }
    }
}





























