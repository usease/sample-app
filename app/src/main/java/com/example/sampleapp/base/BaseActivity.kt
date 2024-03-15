package com.example.sampleapp.base

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import timber.log.Timber

abstract class BaseActivity(layout: Int): AppCompatActivity(layout) {

    abstract val TAG: String

    fun showToast(msg: Int) {
        showToast(getString(msg))
    }

    fun showToast(msg: String) {
        lifecycleScope.launch {
            Toast.makeText(this@BaseActivity, msg, Toast.LENGTH_SHORT).show()
        }
    }

    fun showAndLogD(message: String) {
        Timber.tag(TAG).d(message)
        showToast(message)
    }

    fun showAndLogE(message: String) {
        Timber.tag(TAG).e(message)
        showToast(message)
    }
}