package com.example.luifergram.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.luifergram.R
import kotlinx.android.synthetic.main.actionbar_toolbar.*

class CreateAccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
        showToolbar(resources.getString(R.string.toolbar_title_create_account), true)
    }

    fun showToolbar(tittle : String, upButton : Boolean){

        setSupportActionBar(toolbar)
        supportActionBar?.setTitle(tittle)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(upButton)

    }
}
