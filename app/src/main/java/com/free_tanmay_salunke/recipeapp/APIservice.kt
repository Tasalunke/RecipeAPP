package com.free_tanmay_salunke.recipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
//step2 use URL
private val retrofit = Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val recipeservice = retrofit.create(APIservice::class.java)



// step1 define interface
interface APIservice{
@GET("categories.php")
suspend fun getCategories():CategoriesResponse
}