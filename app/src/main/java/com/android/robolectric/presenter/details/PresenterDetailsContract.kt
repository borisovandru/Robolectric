package com.android.robolectric.presenter.details

import com.android.robolectric.presenter.PresenterContract
import com.android.robolectric.view.details.ViewDetailsContract

internal interface PresenterDetailsContract : PresenterContract<ViewDetailsContract> {
    fun setCounter(count: Int)
    fun onIncrement()
    fun onDecrement()
}
