package com.miwas.gettable.presentation.restaurant

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.miwas.gettable.App
import com.miwas.gettable.domain.Restaurant

class RestaurantViewModel : ViewModel() {
    private val database = App.databaseRepository
    val restaurantData = MutableLiveData<Restaurant>()
    val showReserveDialog = MutableLiveData<Boolean>()

    fun start(id: Int) {
        getRestaurantById(id)
    }

    private fun getRestaurantById(id: Int) {
        val restaurant = database.getRestaurantById(id)
        restaurantData.postValue(restaurant)
    }

    fun onReserveClicked() {
        showReserveDialog.postValue(true)
        //TODO: Открываем диалог подтверждения
    }
}