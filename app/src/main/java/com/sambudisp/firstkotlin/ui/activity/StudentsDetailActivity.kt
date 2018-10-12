package com.sambudisp.firstkotlin.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.sambudisp.firstkotlin.R
import com.sambudisp.firstkotlin.model.Students
import com.sambudisp.firstkotlin.ui.fragment.HomeFragment

class StudentsDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students_detail)
        val student: Students? = intent?.getParcelableExtra(HomeFragment.STUDENT)
        this.title = student?.namanya
        Toast.makeText(this, "Terpilih : ${student?.namanya}", Toast.LENGTH_LONG).show()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    //tombol back
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home) finish() //ga pake kurung kurawal karena cuma sebaris, kalau lebih dari sebaris pakai kurung kurawal
        return super.onOptionsItemSelected(item)
    }
}
