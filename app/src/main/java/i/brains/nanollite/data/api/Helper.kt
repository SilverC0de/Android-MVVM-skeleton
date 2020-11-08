package i.brains.nanollite.data.api

class ApiHelper(private val apiService: ApiService) {
    fun getUsers() = apiService.getUsers()

}