package com.example.appejemplo.data.remote

import com.example.appejemplo.data.model.Post
import retrofit2.http.GET

interface ApiService {
    @GET(value = "/posts")
    suspend fun getPosts(): List<Post>
}