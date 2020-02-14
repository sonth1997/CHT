package com.example.quanlichitieu.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.quanlichitieu.R
import com.example.quanlichitieu.add.AddFragment
import com.example.quanlichitieu.home.HomeFragment
import com.example.quanlichitieu.trend.SpendFragment
import com.example.quanlichitieu.user.UserFragment
import com.example.quanlichitieu.word.WordFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mNavigation = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId){
            R.id.nav_home -> {
                createHome()
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_spend -> {
                createSpend()
                return@OnNavigationItemSelectedListener true
            } R.id.nav_word -> {
            createWord()
            return@OnNavigationItemSelectedListener true
        }
            R.id.nav_user -> {
                createUser()
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_add -> {
                createAdd()
                return@OnNavigationItemSelectedListener true
            }
        }
        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createHome()
        bottomNav.setOnNavigationItemSelectedListener(mNavigation)


    } private fun createHome(){
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = HomeFragment()
        transaction.replace(R.id.mainHolder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    private fun createSpend(){
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = SpendFragment()
        transaction.replace(R.id.mainHolder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    private fun createWord(){
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = WordFragment()
        transaction.replace(R.id.mainHolder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    private fun createUser(){
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = UserFragment()
        transaction.replace(R.id.mainHolder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    private fun createAdd(){
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = AddFragment()
        transaction.replace(R.id.mainHolder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.menu_actionbar,menu)
        return true
    }

}
