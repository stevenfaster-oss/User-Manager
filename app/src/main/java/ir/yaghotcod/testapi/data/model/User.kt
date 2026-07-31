package ir.yaghotcod.testapi.data.model

object User {
    data class User(
        val id: Int,
        val name: String,
        val username: String,
        val email: String,
        val phone: String
    )
}