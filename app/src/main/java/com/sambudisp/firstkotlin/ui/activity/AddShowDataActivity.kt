package com.sambudisp.firstkotlin.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.sambudisp.firstkotlin.R

class AddShowDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_show_data)
        //tombol back
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    //tombol back
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId== android.R.id.home) finish() //ga pake kurung kurawal karena cuma sebaris, kalau lebih dari sebaris pakai kurung kurawal
        return super.onOptionsItemSelected(item)
    }
}
