package com.example.myretrofittestapp

import retrofit2.Call
import retrofit2.http.GET

interface DataFetching {
    @GET("comment")
    fun getData() : Call<UserCommentResponse>
}