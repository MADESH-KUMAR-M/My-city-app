package com.example.mycity.ui

import androidx.lifecycle.ViewModel
import com.example.mycity.R
import com.example.mycity.data.Data
import com.example.mycity.data.Data.getCoffeeShop
import com.example.mycity.data.Data.getParks
import com.example.mycity.data.Data.getRestaurant
import com.example.mycity.data.Data.getShopping
import com.example.mycity.data.Data.getTheatre
import com.example.mycity.model.Details
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


class AppViewModel: ViewModel(){

        private val _uiState = MutableStateFlow(AppUiState())
        val uiState: StateFlow<AppUiState> = _uiState

    fun updateCategory(category: Int){
        _uiState.value = _uiState.value.copy(
            category = category,
            placeList = getList(category)
        )
    }
    fun updatePlace(selectedPlace: Details) {
        _uiState.value = _uiState.value.copy(
            place = selectedPlace
        )
    }
    fun updateTitle(title: Int){
        _uiState.value = _uiState.value.copy(
            title = title
        )
    }
}

fun getList(category: Int) : List<Details>{
    return when(category){
        R.string.Coffee_shop -> getCoffeeShop()
        R.string.restaurant -> getRestaurant()
        R.string.parks -> getParks()
        R.string.shopping -> getShopping()
        R.string.theatre -> getTheatre()
        else -> getCoffeeShop()
    }
}


data class AppUiState(
    val cartegoryList: List<Int> = Data.category,
    val category : Int = R.string.Coffee_shop,
    val title: Int = R.string.app_name,
    val placeList: List<Details> = getList(category),
    val place : Details = placeList[0]
) {
    companion object
}
