package i.brains.nanollite.data.api

import i.brains.nanollite.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>
}