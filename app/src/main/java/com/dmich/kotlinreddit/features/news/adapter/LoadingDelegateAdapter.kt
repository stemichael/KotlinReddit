package com.dmich.kotlinreddit.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.dmich.kotlinreddit.commons.adapter.ViewType
import com.dmich.kotlinreddit.commons.adapter.ViewTypeDelegateAdapter
import com.dmich.kotlinreddit.R
import com.dmich.kotlinreddit.commons.extensions.inflate

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)) {
    }
}