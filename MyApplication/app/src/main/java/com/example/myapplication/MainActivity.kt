package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("onCreate1","Metodo OnCreate1")

        setContentView(R.layout.activity_main)
        val boton = findViewById<Button>(R.id.btn_open_activity)
        val miOnClick = MiOnClick()
        boton.setOnClickListener(miOnClick)

//        boton.setOnClickListener(View.OnClickListener {
//            Toast.makeText(this@MainActivity,"texto de Ejemplo",Toast.LENGTH_SHORT).show()
//            val intent = Intent(this@MainActivity, MainActivity2::class.java)
//            startActivity(intent)
//        })

    }

    override fun onStart() {
        super.onStart()
        Log.i("onStart1","Metodo OnStart2")
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResume1","Metodo OnResume2")
    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause1","Metodo OnPause2")
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop1","Metodo OnStop2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("onDestroy1","Metodo OnDestroy2")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("onRestart1","Metodo OnRestart1")
    }
}

class MiOnClick:View.OnClickListener{
    override fun onClick(p0: View?) {
        Toast.makeText(p0?.context,"texto de Ejemplo",Toast.LENGTH_SHORT).show();
        val intent = Intent(p0?.context, MainActivity2::class.java)
        intent.putExtra("key","value cualquier valor")
        p0?.context?.startActivity(intent)
    }

}