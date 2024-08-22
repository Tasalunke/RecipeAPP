package com.free_tanmay_salunke.recipeapp

data class Category(
    val idCategory:String,
    val strCategory:String,
    val strCategoryThumb:String,
    val strCategoryDescription:String
)

// make response
data class CategoriesResponse(val categories:List<Category>)