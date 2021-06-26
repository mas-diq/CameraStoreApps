package com.dicoding.storecamera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_detail.*

class AboutActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val btnMove: ImageView = findViewById(R.id.btnBackAbout)
        btnMove.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnBackAbout -> {
                val moveIntent = Intent(this@AboutActivity, MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}