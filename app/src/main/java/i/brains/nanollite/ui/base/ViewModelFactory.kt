package i.brains.nanollite.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import i.brains.nanollite.data.api.ApiHelper
import i.brains.nanollite.data.repository.MainRepository
import i.brains.nanollite.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}