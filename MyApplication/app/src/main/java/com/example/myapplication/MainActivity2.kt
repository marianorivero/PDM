package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val valor = intent.extras?.getString("key")
        Log.i("tag", valor.toString())
    }

    override fun onStart() {
        super.onStart()
        Log.i("onStart2","Metodo OnStart2")
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResume2","Metodo OnResume2")
    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause2","Metodo OnPause2")
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop2","Metodo OnStop2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("onDestroy2","Metodo OnDestroy2")
    }
}