package com.dicoding.storecamera

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.storecamera.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var recyclerView: RecyclerView
    private var list: ArrayList<Events> = arrayListOf()
    private lateinit var cardViewEventsAdapter: RecyclerAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val button
        val btnMoveAbout: ImageView = findViewById(R.id.btnAbout)
        btnMoveAbout.setOnClickListener(this)

        // RecyclerCardView
        recyclerView = binding.rv

        list.addAll(EventsData.listData)
        showRecyclerCardView()

        // Events Card Intent Move With Data
        cardViewEventsAdapter.onClickItem = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_EVENT, it)
            startActivity(intent)
        }
    }

    private fun showRecyclerCardView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        cardViewEventsAdapter = RecyclerAdapter(list)
        recyclerView.adapter = cardViewEventsAdapter

        recyclerView.isNestedScrollingEnabled = false
        recyclerView.setHasFixedSize(false)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnAbout -> {
                val moveIntentAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntentAbout)
            }
        }
    }
}
