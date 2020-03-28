package com.bozs.moneybag

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_edit_bag.*


class EditBagActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_bag)
        val toolbar = editBagToolbar as Toolbar
        setSupportActionBar(toolbar)

    }

    fun saveBag(v : View){
        val context = applicationContext
        val name = editBagName.text
        val a = Toast.makeText(context,"BEFORE : ${name}",Toast.LENGTH_LONG)
        a.show()

        val databaseRef = FirebaseDatabase.getInstance().reference
        println("rest")
        println(databaseRef)
//        databaseRef.child("bags").setValue(name)
//        val t = Toast.makeText(context,"SAVE : ${name}",Toast.LENGTH_LONG)
//        t.show()
    }

//    @SuppressLint("ResourceType")
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
////        return super.onCreateOptionsMenu(menu)
//            menuInflater.inflate(R.menu.menu_edit_bag,menu)
//        return true
//    }
}
