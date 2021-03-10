package com.dicoding.storecamera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.storecamera.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityDetailBinding
    private var eventsData: Events? = null

    companion object {
        const val EXTRA_EVENT = "extra_event"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Intent data from MainActivity
        eventsData = intent.getParcelableExtra(EXTRA_EVENT)

        if (eventsData != null) {
            Glide.with(this).load(eventsData?.image)
                .apply(RequestOptions())
                .into(binding.imgItemPhoto)
            binding.tvItemModel.text = eventsData?.title
            binding.tvItemDescription.text = eventsData?.description
            binding.tvItemPrice.text = eventsData?.price
        }

        // Return Back Listener
        val returnDetail: Button = binding.btnBack
        returnDetail.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnBack -> finish()
        }
    }
}