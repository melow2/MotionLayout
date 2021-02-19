package com.jeit.motionlayout.step

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.AppBarLayout
import com.jeit.motionlayout.R
import kotlinx.android.synthetic.main.activity_step8.*

class Step8Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step8)
        coordinateMotion()
    }

    private fun coordinateMotion() {
        appbar_layout.addOnOffsetChangedListener(
            AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
                val seekPosition = -verticalOffset / appBarLayout.totalScrollRange.toFloat()
                motion_layout.progress = seekPosition
            }
        )
    }

}