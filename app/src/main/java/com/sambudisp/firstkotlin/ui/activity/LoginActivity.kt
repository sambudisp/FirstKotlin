package com.sambudisp.firstkotlin.ui.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sambudisp.firstkotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            login()
        }
    }

    fun login() {

        val  username = edtUsername.text.toString()
        val password = edtPassword.text.toString()

        //isBlank() : spasi tidak dihitung, isEmpty : spasi tetap dihitung ada
        if (username.isBlank() || password.isBlank()) { // bisa juga menggaunakan username == "" tapi lebih baik pakai isBlack(), bisa juga mennggunakan isNotBlank() tergantung logic kita masing2
            Toast.makeText(this, "username dan password belum diisi", Toast.LENGTH_LONG).show()
            println("berhasil")
        } else {
            val goHome = Intent(this, HomeActivity::class.java)
            startActivity(goHome)
            finish()
        }

    }
}
