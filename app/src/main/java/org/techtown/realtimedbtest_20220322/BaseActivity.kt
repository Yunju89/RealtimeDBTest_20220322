package org.techtown.realtimedbtest_20220322

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    lateinit var mContext : Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mContext = this

        setupEvents()
        setValues()

    }

    abstract fun setupEvents()

    abstract fun setValues()
}