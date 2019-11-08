package com.example.luifergram.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade
import com.example.luifergram.R
import com.google.android.material.appbar.CollapsingToolbarLayout
import kotlinx.android.synthetic.main.actionbar_toolbar.*
import kotlinx.android.synthetic.main.actionbar_toolbar.toolbar
import kotlinx.android.synthetic.main.activity_picture_overview.*

class PictureOverviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_overview)
        window.enterTransition=Fade()
        showToolbar("", true)

    }
    fun showToolbar(tittle : String, upButton : Boolean) {

        setSupportActionBar(toolbar)
        supportActionBar?.setTitle(tittle)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(upButton)
        val collapsingToolbarLayout : CollapsingToolbarLayout = findViewById(R.id.collapsing_toolbar)
    }
}
