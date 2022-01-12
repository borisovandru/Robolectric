package com.android.robolectric.view.details

import com.android.robolectric.view.ViewContract

internal interface ViewDetailsContract : ViewContract {
    fun setCount(count: Int)
}