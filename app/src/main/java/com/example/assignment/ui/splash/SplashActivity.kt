package com.example.assignment.ui.splash

import android.animation.Animator
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.assignment.databinding.ActivitySplashBinding
import com.example.assignment.ui.info.InfoActivity

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navigateToInfoScreen: Boolean? = intent.extras?.getBoolean(NAVIGATE_TO_INFO)

        if (navigateToInfoScreen == true)
            navigateToInfoScreen()
        else
            setUpAnimation()
    }

    private fun setUpAnimation() {
        binding.lottieAnimationView.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(p0: Animator?) {
                Log.e(TAG, "onAnimationStarted")
            }

            override fun onAnimationEnd(p0: Animator?) {
                Log.e(TAG, "onAnimationEnd")
                navigateToInfoScreen()
            }

            override fun onAnimationCancel(p0: Animator?) {
                Log.e(TAG, "onAnimationCanceled")
            }

            override fun onAnimationRepeat(p0: Animator?) {
                Log.e(TAG, "onAnimationRepeated")
            }

        })
        binding.lottieAnimationView.animate()
    }

    private fun navigateToInfoScreen() {
        Intent(this, InfoActivity::class.java).apply {
            startActivity(this)
            finish()
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
    }

    companion object {
        const val TAG = "SplashActivity"
        const val NAVIGATE_TO_INFO = "navigate_to_info"
    }
}