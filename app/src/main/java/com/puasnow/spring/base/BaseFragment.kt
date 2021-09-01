package com.puasnow.spring.base

import android.os.Bundle
import androidx.activity.addCallback
import androidx.fragment.app.Fragment

class BaseFragment: Fragment() {

    private var onBackPressListener: (() -> Unit)? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requireActivity().onBackPressedDispatcher.addCallback(this) {
            onBackPressListener?.invoke()
        }
    }


    fun setOnBackPressListener(onBackPressListener1: () -> Unit) {
        this.onBackPressListener = onBackPressListener1
    }
}