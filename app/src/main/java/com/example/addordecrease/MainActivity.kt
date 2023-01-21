package com.example.addordecrease

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var visitorCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Find Add Visitor button
        // Buttons id
        val visitorBtn = findViewById<Button>(R.id.addVisitor)
        visitorBtn.text = getString(R.string.add_visitor_btn_txt) // string from res/values/strings.xml

        // Set onClickListener
        visitorBtn.setOnClickListener {
            visitorCount++
            updateCount()
        }

        // Find Decrease Visitor button
        val decreaseBtn = findViewById<Button>(R.id.decreaseVisitor)
        decreaseBtn.text = getString(R.string.decrease_visitor_btn_txt)

        decreaseBtn.setOnClickListener {
            visitorCount--
            updateCount()
        }

        // Count text
        val count = findViewById<TextView>(R.id.count)
        count.text = "${getString(R.string.add_count_txt)}$visitorCount"

        // Reset
        val resetBtn = findViewById<Button>(R.id.reset)
        resetBtn.text = getString(R.string.reset_btn_txt)
        resetBtn.setOnClickListener {
            visitorCount = 0
            updateCount()
        }

        // Amount of visitors text
        val visitorTxt = findViewById<TextView>(R.id.amountOfVisitors)
        visitorTxt.text = getString(R.string.amount_of_visitors_txt)

    }

    // update the count textview
    private fun updateCount() {
        // Visitor count update
        val count = findViewById<TextView>(R.id.count)
        count.text = "${getString(R.string.add_count_txt)}$visitorCount"
    }
}
