package com.example.pmtechretrofit.retrofit

import com.example.pmtechretrofit.model.Fact
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface CatService {

    @GET("/facts")
    fun getFacts(): Call<List<Fact>>

    companion object {
        private const val baseUrl = "https://cat-fact.herokuapp.com"

        private val gson = GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
            .create()

        private val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

        fun provideCatService(): CatService =
            retrofit.create(CatService::class.java)
    }
}