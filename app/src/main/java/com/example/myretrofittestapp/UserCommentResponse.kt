package com.example.myretrofittestapp


import com.squareup.moshi.Json

class UserCommentResponse : ArrayList<UserCommentResponse.UserCommentResponseItem>(){
    data class UserCommentResponseItem(
        @Json(name = "body")
        val body: String?,
        @Json(name = "id")
        val id: Int?,
        @Json(name = "title")
        val title: String?,
        @Json(name = "userId")
        val userId: Int?
    )
}