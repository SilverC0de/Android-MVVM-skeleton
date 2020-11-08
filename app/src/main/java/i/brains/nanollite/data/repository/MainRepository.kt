package i.brains.nanollite.data.repository

import i.brains.nanollite.data.api.ApiHelper
import i.brains.nanollite.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}