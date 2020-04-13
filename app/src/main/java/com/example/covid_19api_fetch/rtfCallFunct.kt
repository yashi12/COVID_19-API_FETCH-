package com.example.covid_19api_fetch

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


fun <T> retrofitCallback(fn:(Throwable?,Response<T>?)->Unit):Callback <T>{
    return object :Callback<T>{
        override fun onFailure(call: Call<T>, t: Throwable) {
            return fn(t,null)
        }

        override fun onResponse(call: Call<T>, response: Response<T>) {
            return fn(null,response)
        }

    }
}