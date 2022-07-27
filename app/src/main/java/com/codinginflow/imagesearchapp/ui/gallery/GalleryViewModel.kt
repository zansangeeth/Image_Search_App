package com.codinginflow.imagesearchapp.ui.gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.codinginflow.imagesearchapp.data.UnsplashRepository

/**
 **@Project -> Image Search App
 **@Author -> Sangeeth on 7/27/2022
 */
class GalleryViewModel @ViewModelInject constructor(
    private val repository: UnsplashRepository
    ) : ViewModel() {

    private val currentQuery = MutableLiveData(DEFAULT_QUERY)
        val photos = currentQuery.switchMap {queryString ->
            repository.getSearchResults(queryString).cachedIn(viewModelScope)

        }

    fun searchPhotos(query : String){
        currentQuery.value = query
    }

    companion object{
        private val DEFAULT_QUERY = "cats"
    }
}