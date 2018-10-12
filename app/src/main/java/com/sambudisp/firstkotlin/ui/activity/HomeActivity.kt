package com.sambudisp.firstkotlin.ui.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.sambudisp.firstkotlin.R
import com.sambudisp.firstkotlin.ui.fragment.HelpFragment
import com.sambudisp.firstkotlin.ui.fragment.HomeFragment
import com.sambudisp.firstkotlin.ui.fragment.ProfilFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        homeJalan() //memunculkan fragment mana yang mau pertama diload, biasanya kan HOME dulu
        setupView()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.toolbarMenuAdd) {
            val goAddShowData = Intent(this, AddShowDataActivity::class.java)
            startActivity(goAddShowData)
            //finish() //tidak difinish karena nantinya ada tombol BACK di action bar actv selanjutnya
            return true
        }
        return super.onOptionsItemSelected(item)
    }


    private fun setupView() {
        navBottom.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navHome -> {
                    setupFragment(HomeFragment()) //tittle juga bisa dibuat melalui parameter disini
                    this.title = getString(R.string.home) //mengubah judul/tittle Action Bar sesuai yang kita inginkan, kita abil dari strings.xml aja
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navHelp -> {
                    setupFragment(HelpFragment())
                    this.title = getString(R.string.help)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navProfil -> {
                    setupFragment(ProfilFragment())
                    this.title = getString(R.string.profil)
                    return@setOnNavigationItemSelectedListener true
                }
            }
            return@setOnNavigationItemSelectedListener false
        }
    }

    private fun homeJalan() {
        setupFragment(HomeFragment())
        this.title = getString(R.string.home)
    }

    private fun setupFragment(fragment: Fragment) { //pastikan disini import fragment yang v4
        //proses mereplace container (tumbal) dengan fragment yang kita ingin tampilkan saat menu navigasi diklik
        val transaksi: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaksi.replace(R.id.frameContainer, fragment) //frameContainer adalah IDnya container kita
        transaksi.addToBackStack(null)
        transaksi.commit()
    }
}
