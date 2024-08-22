package com.free_tanmay_salunke.recipeapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.lang.Error

class MainViewModel : ViewModel() {
    // define 2 this
    private val _categorieState = mutableStateOf(RecipeState())
    val categorieState: State<RecipeState> = _categorieState

init {
    fetchCategories()
}
    private fun fetchCategories() {
        viewModelScope.launch {
            try {
                val response = recipeservice.getCategories()
                _categorieState.value = categorieState.value.copy(
                    list = response.categories,
                    loading = false,
                    error = null
                )

            } catch (e: Exception) {
                _categorieState.value = _categorieState.value.copy(
                    loading = false,
                    error = "Error Fetching categories ${e.message}"
                )

            }
        }
    }

    // define 1
    data class RecipeState(
        val loading: Boolean = true,
        val list: List<Category> = emptyList(),
        val error: String? = null
    )
}