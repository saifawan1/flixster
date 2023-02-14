package com.codepath.bestsellerlistapp

/**
 * This interface is used by the [BestSellerBooksRecyclerViewAdapter] to ensure
 * it has an appropriate Listener.
 *
 * In this app, it's implemented by [MoviesFragment]
 */
interface OnListFragmentInteractionListener {
    fun onItemClick(item: Movie)
}
