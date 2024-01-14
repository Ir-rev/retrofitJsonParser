package com.example.retrofitjsonparser.retrofit

import com.example.retrofitjsonparser.retrofit.models.UserModel
import retrofit2.http.GET

interface TestAPI {

    @GET("posts/")
    suspend fun getAllUsersModels(): List<UserModel>

}