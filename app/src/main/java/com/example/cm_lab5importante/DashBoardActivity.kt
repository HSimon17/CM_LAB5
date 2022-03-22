package com.example.cm_lab5importante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DashBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        val parametro = intent.getStringExtra(PARAM_NAME)
        val textView = findViewById<TextView>(R.id.dashboard_tv1)
        //textView.setText(parametro)
        textView.text = parametro
    }
}