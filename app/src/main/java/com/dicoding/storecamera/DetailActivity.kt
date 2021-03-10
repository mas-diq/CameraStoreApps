package com.dicoding.storecamera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DetailActivity : AppCompatActivity(), View.OnClickListener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btnMove: Button = findViewById(R.id.btnBack)
        btnMove.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnBack -> {
                val moveIntent = Intent(this@DetailActivity, MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}