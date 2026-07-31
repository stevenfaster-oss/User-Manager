package ir.yaghotcod.testapi.data.remote

import ir.yaghotcod.testapi.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}