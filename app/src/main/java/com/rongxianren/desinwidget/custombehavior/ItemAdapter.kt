package com.rongxianren.desinwidget.custombehavior

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rongxianren.desinwidget.R

class ItemAdapter : RecyclerView.Adapter<ItemAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(item)
    }

    override fun getItemCount(): Int {
        return 50
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.mTitle!!.text = "item $position"
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mTitle: TextView? = null

        init {
            mTitle = itemView.findViewById(R.id.item_title)
        }
    }
}