package ir.yaghotcod.testapi.data.repository

import ir.yaghotcod.testapi.data.model.User
import ir.yaghotcod.testapi.data.remote.ApiService
import ir.yaghotcod.testapi.utils.Resource


class UserRepository(private val apiService: ApiService) {

    suspend fun getUsers(): Resource<List<User>> {
        return try {
            val response = apiService.getUsers()
            Resource.Success(response)
        } catch (e: Exception) {
            Resource.Error(e.localizedMessage ?: "خطایی در دریافت اطلاعات رخ داد")
        }
    }
}