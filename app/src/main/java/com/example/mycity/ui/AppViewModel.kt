package com.example.mycity.ui.theme

import androidx.lifecycle.ViewModel
import com.example.mycity.R
import com.example.mycity.data.data
import com.example.mycity.data.data.getCoffeeShop
import com.example.mycity.data.data.getParks
import com.example.mycity.data.data.getRestaurant
import com.example.mycity.data.data.getShopping
import com.example.mycity.data.data.getTheatre
import com.example.mycity.model.Details
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AppViewModel: ViewModel(){

        private val _uiState = MutableStateFlow(AppUiState())
        val uiState: StateFlow<AppUiState> = _uiState.asStateFlow()

        fun updateCategory(selectedCategory: Int) {
            _uiState.value = AppUiState(
                category = selectedCategory,
            )
        }
    fun updatePlace(selectedPlace: Details) {
        _uiState.value = AppUiState(
            place = selectedPlace
        )
    }
    fun changeDisplay(move: Int){
        _uiState.value = AppUiState(
            display = move
        )
    }
}



data class AppUiState(
    val display: Int = 1,
    val cartegoryList: List<Int> = data.category,
    val category : Int = R.string.Coffee_shop ,
    val placeList: List<Details> = when(category){
            R.string.Coffee_shop -> getCoffeeShop()
            R.string.restaurant -> getRestaurant()
            R.string.parks -> getParks()
            R.string.shopping -> getShopping()
            R.string.theatre -> getTheatre()
            else -> getCoffeeShop()
                                                 },
    val place : Details = placeList[0]
)