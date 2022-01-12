package com.android.robolectric.presenter.search

import com.android.robolectric.presenter.PresenterContract
import com.android.robolectric.view.search.ViewSearchContract

internal interface PresenterSearchContract : PresenterContract<ViewSearchContract> {
    fun searchGitHub(searchQuery: String)
}
