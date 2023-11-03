package com.miwas.gettable.presentation.mainpage

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.miwas.gettable.R
import com.miwas.gettable.domain.Restaurant

class RestaurantsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val title: TextView = itemView.findViewById(R.id.title)
    private val addressAndTime: TextView = itemView.findViewById(R.id.address_and_time)
    private val image: ImageView = itemView.findViewById(R.id.image_view)

    fun bind(restaurant: Restaurant) {
        val addressAndTimeText = restaurant.address + COMMA + SPACE + restaurant.workingTime
        val resourceId = itemView.resources.getIdentifier(
            restaurant.imageUrl, "drawable",
            itemView.context.packageName
        )

        title.text = restaurant.name
        addressAndTime.text = addressAndTimeText
        image.setImageDrawable(itemView.resources.getDrawable(resourceId))
    }

    companion object {
        private const val SPACE = " "
        private const val COMMA = ","
    }
}