package com.dicoding.storecamera

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val listCamera: ArrayList<Events>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    var onClickItem: ((Events) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        val camera = listCamera[position]

        Glide.with(holder.itemView.context)
            .load(camera.image)
            .apply(RequestOptions())
            .into(holder.itemImage)

        holder.itemTitle.text = camera.title
        holder.itemDescription.text = camera.description
        holder.itemPrice.text = camera.price
    }

    override fun getItemCount(): Int {
        return listCamera.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView = itemView.findViewById(R.id.item_image)
        var itemTitle: TextView = itemView.findViewById(R.id.item_title)
        var itemDescription: TextView = itemView.findViewById(R.id.item_description)
        var itemPrice: TextView = itemView.findViewById(R.id.item_price)

        init {
            itemView.setOnClickListener {
                onClickItem?.invoke(listCamera[adapterPosition])
            }
        }

    }
}