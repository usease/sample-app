package com.example.sampleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.sampleapp.base.BaseActivity
import com.example.sampleapp.ui.exhibits.ExhibitsFragment

class MainActivity : BaseActivity(R.layout.activity_main) {

    override val TAG: String = MainActivity::class.simpleName!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<ExhibitsFragment>(R.id.fragment_container_view)
            }
        }
    }
}