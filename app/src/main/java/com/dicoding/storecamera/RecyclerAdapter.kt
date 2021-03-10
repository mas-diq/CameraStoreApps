package com.dicoding.storecamera

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val image = intArrayOf(
        R.drawable.alpha_1,
        R.drawable.fx3,
        R.drawable.alpha_9_2,
        R.drawable.alpha_7s_3,
        R.drawable.alpha_7c,
        R.drawable.alpha_7r_4,
        R.drawable.alpha_6100,
        R.drawable.alpha_6600,
        R.drawable.alpha_7r_3,
        R.drawable.alpha_9,
        R.drawable.alpha_6400
    )

    private val title = arrayOf(
        "α1",
        "FX3",
        "α9 II",
        "α7S III",
        "α7C",
        "α7R IV",
        "α6100",
        "α6600",
        "α7R III ",
        "α9",
        "α6400"
    )

    private val description = arrayOf(
        "Superb Resolution Camera",
        "Full-frame Cinema Line",
        "Full-frame Pro Camera",
        "Pro Movie/Still Capability",
        "Mini Full-frame Camera",
        "Camera with 61.0MP",
        "APS-C camera with Fast AF",
        "Premium E-mount APS-C",
        "35mm Full-frame Camera",
        "Full-frame Stacked CMOS",
        "E-mount with APS-C Sensor"
    )

    private val price = arrayOf(
        "Coming Soon",
        "Coming Soon",
        "Rp.63,499,000",
        "Rp.50,999,000",
        "Rp.26,999,000",
        "Rp.49,000,000",
        "Rp.9,999,000",
        "Rp.20,999,000",
        "Rp.36,999,000",
        "Rp.56,999,000",
        "Rp.12,999,000"
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemImage.setImageResource(image[position])
        holder.itemTitle.text = title[position]
        holder.itemDescription.text = description[position]
        holder.itemPrice.text = price[position]
    }

    override fun getItemCount(): Int {
        return title.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDescription: TextView
        var itemPrice: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDescription = itemView.findViewById(R.id.item_description)
            itemPrice = itemView.findViewById(R.id.item_price)
        }
    }
}