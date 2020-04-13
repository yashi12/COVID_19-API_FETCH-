package com.example.covid_19api_fetch

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Client {
    var retrofit = Retrofit.Builder()
        .baseUrl("https://api.covid19api.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    var api: CovidService = retrofit.create<CovidService>(CovidService::class.java)
}