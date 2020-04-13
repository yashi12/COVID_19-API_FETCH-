package com.example.covid_19api_fetch

import retrofit2.Call
import retrofit2.http.GET

interface CovidService {
    @GET("summary")
    fun callsummary(): Call<ArrayList<user>>
}