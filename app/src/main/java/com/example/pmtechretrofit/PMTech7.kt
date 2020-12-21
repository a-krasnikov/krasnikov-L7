package com.example.pmtechretrofit

import com.example.pmtechretrofit.model.Fact
import com.example.pmtechretrofit.retrofit.CatService
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

fun main() {

    val catService = CatService.provideCatService()

    catService.getFacts().enqueue(object : Callback<List<Fact>> {
        override fun onResponse(call: Call<List<Fact>>, response: Response<List<Fact>>) {
            if (response.isSuccessful) {
                response.body()?.forEach(::println)
            } else {
                println("Server return an Error: ${response.code()} - ${response.message()}")
            }
        }

        override fun onFailure(call: Call<List<Fact>>, t: Throwable) {
            when (t) {
                is IOException -> {
                    println("Network failure!!!")
                    t.printStackTrace()
                }
                else -> {
                    println("Error!!!")
                    t.printStackTrace()
                }
            }
        }
    })
}
