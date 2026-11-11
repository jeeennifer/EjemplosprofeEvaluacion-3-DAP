package com.example.appejemplo.repository

import com.example.appejemplo.data.model.Post
import com.example.appejemplo.data.remote.RetrofitInstance

class PostRepository {
    suspend fun getPosts(): List<Post> {
        return RetrofitInstance.api.getPosts()
    }
}