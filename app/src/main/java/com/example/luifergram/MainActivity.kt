package com.example.luifergram

import android.content.Intent
import android.graphics.Typeface
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.luifergram.views.ContainerActivity
import com.example.luifergram.views.CreateAccountActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.typeface = Typeface.createFromAsset(assets, "fonts/Billabong.ttf")
        textView.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://platzi.com/clases/")))
        }
        register_here_textView.setOnClickListener {
            val intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }
        login_button.setOnClickListener {
            val intent = Intent(this, ContainerActivity::class.java)
            startActivity(intent)
        }
    }
}
