package com.android.robolectric.presenter

interface PresenterContract<ViewContract> {
    fun onAttach(viewContract: ViewContract)
    fun onDetach()
}