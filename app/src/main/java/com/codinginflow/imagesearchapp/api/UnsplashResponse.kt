package com.codinginflow.imagesearchapp.api

import com.codinginflow.imagesearchapp.data.UnsplashPhoto

/**
 **@Project -> Image Search App
 **@Author -> Sangeeth on 7/22/2022
 */
data class UnsplashResponse(val results: List<UnsplashPhoto>)