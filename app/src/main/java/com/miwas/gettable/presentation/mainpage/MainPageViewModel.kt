package com.miwas.gettable.presentation.mainpage

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.miwas.gettable.App
import com.miwas.gettable.domain.Restaurant

class MainPageViewModel: ViewModel() {
    private val database = App.databaseRepository
    val restaurantsData = MutableLiveData<List<Restaurant>>()

    fun start() {
        getRestaurantsList()
    }

    private fun getRestaurantsList() {
        val restaurants = database.getAllRestaurants()
        restaurantsData.postValue(restaurants)
    }

}