package com.dmich.kotlinreddit.commons

import com.dmich.kotlinreddit.commons.adapter.AdapterConstants
import com.dmich.kotlinreddit.commons.adapter.ViewType

data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}
