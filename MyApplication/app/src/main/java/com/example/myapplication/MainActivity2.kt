package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

class MainActivity2 : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val valor = intent.extras?.getString("key")
        Log.i("tag", valor.toString())
        
        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun generarNombres() : List<String> {
        val nameList = mutableListOf<String>()
        for (i in 1..100){
            nameList.add("Name $i")
        }
        return nameList
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

class UserAdapter (private val nameList : List<String>): RecyclerView.Adapter<UserAdapter.UserViewHolder>(){
    class UserViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): UserViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(p0: UserViewHolder, p1: Int) {
        TODO("Not yet implemented")
    }
}
//implemetar la clase UserAdapter