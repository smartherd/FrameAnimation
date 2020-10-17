package com.sriyank.frameanimation

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	private lateinit var frameAnimation: AnimationDrawable

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

	}

	override fun onStart() {
		super.onStart()

		myImageView.setBackgroundResource(R.drawable.battery_animation_list)

		frameAnimation = myImageView.background as AnimationDrawable
		frameAnimation.start()
	}

	/* Button click event handler */
	fun startStopAnimation(view: View) {

		if (frameAnimation.isRunning)
			frameAnimation.stop()
		else
			frameAnimation.start()
	}
}