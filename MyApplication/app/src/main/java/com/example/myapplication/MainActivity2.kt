package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter: UserAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val valor = intent.extras?.getString("key")
        Log.i("tag", valor.toString())
        
        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = UserAdapter(generarUsuarios())

        recyclerView.adapter = adapter
    }

    private fun generarNombres() : List<String> {
        val nameList = mutableListOf<String>()
        for (i in 1..100){
            nameList.add("Name $i")
        }
        return nameList
    }

    private fun generarUsuarios() : List<User> {
        val userList = mutableListOf<User>()
        for (i in 1..100){
            val user = User (
                "User $i",
                i,
                "url"
            )
            userList.add(user)
        }
        return userList
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

class UserAdapter (private val userList : List<User>): RecyclerView.Adapter<UserAdapter.UserViewHolder>(){
    class UserViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        private val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)

        fun bind(name: String){
            nameTextView.text = name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]
        holder.bind(user.name)
    }
}


//crear clase "user" (name:string, edad:int, imageURL: string)
//generateLis devolver 100 objetos User
//modificar el adapter para que muestre la liste de objeto User
//modificar ViewHolder para que muestre la edad y la imagen
class User (
    val name: String,
    val edad: Int,
    val imageURL: String){
}