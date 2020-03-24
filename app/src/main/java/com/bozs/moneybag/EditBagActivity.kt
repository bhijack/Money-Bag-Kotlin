package com.bozs.moneybag

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_edit_bag.*


class EditBagActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_bag)
        val toolbar = editBagToolbar as Toolbar
        setSupportActionBar(toolbar)

    }

//    @SuppressLint("ResourceType")
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
////        return super.onCreateOptionsMenu(menu)
//            menuInflater.inflate(R.menu.menu_edit_bag,menu)
//        return true
//    }
}
