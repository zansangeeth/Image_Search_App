package com.codinginflow.imagesearchapp.ui.gallery

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView
import com.codinginflow.imagesearchapp.databinding.UnsplashPhotoLoadStateFooterBinding

/**
 **@Project -> Image Search App
 **@Author -> Sangeeth on 7/27/2022
 */
class UnsplashPhotoLoadStateAdapter: LoadStateAdapter<UnsplashPhotoLoadStateAdapter.LoadStateViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): LoadStateViewHolder {
        val binding = UnsplashPhotoLoadStateFooterBinding.inflate(LayoutInflater.from(parent.context),  parent, false)
        return LoadStateViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LoadStateViewHolder, loadState: LoadState) {
        holder.bind(loadState)
    }

    class LoadStateViewHolder(private val binding : UnsplashPhotoLoadStateFooterBinding) :
            RecyclerView.ViewHolder(binding.root){

                fun bind(loadState: LoadState){
                    binding.apply {
                        progressBar.isVisible = loadState is LoadState.Loading
                        progressBar.isVisible = loadState is LoadState.Loading
                    }
                }
            }
}