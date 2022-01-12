package com.android.robolectric.presenter.search

import com.android.robolectric.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
}
