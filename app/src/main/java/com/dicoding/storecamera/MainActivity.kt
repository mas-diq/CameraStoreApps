package com.dicoding.storecamera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rv : RecyclerView
    private var layoutManager: RecyclerView.LayoutManager? = null
    private val adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv = findViewById(R.id.recyclerView)
        rv.layoutManager = LinearLayoutManager(this)
        val adapter =
        rv.adapter =
        layoutManager = LinearLayoutManager(this)

        adapter = RecyclerAdapter()
        recyclerView.adaper = adapter
    }
}