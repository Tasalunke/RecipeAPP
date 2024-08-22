package com.free_tanmay_salunke.recipeapp

import okhttp3.Route

sealed class Screen(val route: String) {
object RecipeScreen : Screen("recipeScreen")
object  DetaliScreen :Screen("detailsScreen")
}