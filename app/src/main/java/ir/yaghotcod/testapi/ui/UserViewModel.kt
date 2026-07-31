package ir.yaghotcod.testapi.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ir.yaghotcod.testapi.data.model.User
import ir.yaghotcod.testapi.data.remote.RetrofitClient
import ir.yaghotcod.testapi.data.repository.UserRepository
import ir.yaghotcod.testapi.utils.Resource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class UserViewModel : ViewModel() {

    // ساخت نمونه ریپازیتوری (در برنامه‌های بزرگتر از DI مثل Hilt استفاده می‌شود)
    private val repository = UserRepository(RetrofitClient.apiService)

    private val _usersState = MutableStateFlow<Resource<List<User>>>(Resource.Loading())
    val usersState: StateFlow<Resource<List<User>>> = _usersState

    init {
        fetchUsers()
    }

    fun fetchUsers() {
        viewModelScope.launch {
            _usersState.value = Resource.Loading()
            val result = repository.getUsers()
            _usersState.value = result
        }
    }
}