package com.example.sampleapp.base

import androidx.fragment.app.Fragment


abstract class BaseFragment(layout: Int): Fragment(layout) {

    abstract val TAG: String

    fun showToast(msg: Int) {
        if (activity is BaseActivity) {
            (activity as BaseActivity).showToast(msg)
        }
    }

    fun showToast(msg: String) {
        if (activity is BaseActivity) {
            (activity as BaseActivity).showToast(msg)
        }
    }

    fun showAndLogE(msg: String) {
        if (activity is BaseActivity) {
            (activity as BaseActivity).showAndLogE(msg)
        }
    }

    fun showAndLogD(msg: String) {
        if (activity is BaseActivity) {
            (activity as BaseActivity).showAndLogD(msg)
        }
    }
}