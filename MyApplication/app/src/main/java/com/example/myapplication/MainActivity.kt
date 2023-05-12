package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton = findViewById<Button>(R.id.btn_open_activity)
        boton.setOnClickListener(View.OnClickListener {
            Toast.makeText(this@MainActivity,"texto",Toast.LENGTH_SHORT).show()
        })
    }
}