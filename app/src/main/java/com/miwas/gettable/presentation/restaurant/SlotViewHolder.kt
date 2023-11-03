package com.miwas.gettable.presentation.restaurant

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.miwas.gettable.R

class SlotViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val slotTime: TextView = itemView.findViewById(R.id.slot_time)

    fun bind(slot: Pair<String, Boolean>) {

        slotTime.text = slot.first

        if (slot.second) {
            itemView.background = itemView.context?.resources?.getDrawable(R.drawable.bg_slot_selected)
        } else {
            itemView.background = itemView.context?.resources?.getDrawable(R.drawable.bg_slot_normal)
        }
    }
}