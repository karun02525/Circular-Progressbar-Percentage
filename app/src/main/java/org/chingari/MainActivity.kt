package org.chingari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var currentprogress = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateProgressResult()

        increase_progress.setOnClickListener{

            if ( currentprogress <= 90 )
            {
                currentprogress += 10
                updateProgressResult()
            }
        }

        decrease_progress.setOnClickListener{

            if ( currentprogress >= 10 )
            {
                currentprogress -= 10
                updateProgressResult()
            }
        }
    }

    private fun updateProgressResult() {
        progressbar.progress = currentprogress
        text_progress.text = "$currentprogress%"
    }
}