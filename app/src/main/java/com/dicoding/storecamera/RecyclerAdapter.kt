package com.dicoding.storecamera

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val image = intArrayOf(
        R.drawable.sony_alpha_a7r_iii,
        R.drawable.sony_alpha_a7r_iii,
        R.drawable.sony_alpha_a7r_iii,
        R.drawable.sony_alpha_a7r_iii,
        R.drawable.sony_alpha_a7r_iii,
        R.drawable.sony_alpha_a7r_iii,
        R.drawable.sony_alpha_a7r_iii,
        R.drawable.sony_alpha_a7r_iii,
        R.drawable.sony_alpha_a7r_iii,
        R.drawable.sony_alpha_a7r_iii
    )

    private val title = arrayOf(
        "Sony one",
        "Sony two",
        "Sony tree",
        "Sony four",
        "Sony five",
        "Sony six",
        "Sony seven",
        "Sony eight",
        "Sony nine",
        "Sony ten"
    )

    private val description = arrayOf(
        "Lorem Ipsum",
        "Lorem Ipsum",
        "Lorem Ipsum",
        "Lorem Ipsum",
        "Lorem Ipsum",
        "Lorem Ipsum",
        "Lorem Ipsum",
        "Lorem Ipsum",
        "Lorem Ipsum",
        "Lorem Ipsum"
    )

    private val price = arrayOf(
        "Rp.100.000",
        "Rp.100.000",
        "Rp.100.000",
        "Rp.100.000",
        "Rp.100.000",
        "Rp.100.000",
        "Rp.100.000",
        "Rp.100.000",
        "Rp.100.000",
        "Rp.100.000"
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