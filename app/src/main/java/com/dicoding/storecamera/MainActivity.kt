package com.dicoding.storecamera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener  {

    private lateinit var recyclerView : RecyclerView
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val button
        val btnMoveAbout: Button = findViewById(R.id.btnAbout)
        btnMoveAbout.setOnClickListener(this)

        val btnMoveDetail: Button = findViewById(R.id.btnDetail)
        btnMoveDetail.setOnClickListener(this)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)

        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        adapter = RecyclerAdapter()
        recyclerView.adapter = adapter
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnAbout -> {
                val moveIntentAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntentAbout)
            }
            R.id.btnDetail ->{
                val moveIntentAbout = Intent(this@MainActivity, DetailActivity::class.java)
                startActivity(moveIntentAbout)
            }
        }
    }
}