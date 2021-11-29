package com.example.assignment.ui.splash

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.core.app.launchActivity
import org.junit.After
import org.junit.Test


class SplashActivityTest {

    private lateinit var scenario: ActivityScenario<SplashActivity>

    @After
    fun tearDown() {
        scenario.close()
    }

    @Test
    fun test_launch_splash_activity_with_logo_animation() {
        val intent = Intent(ApplicationProvider.getApplicationContext(), SplashActivity::class.java)
        scenario = launchActivity(intent)
    }

    @Test
    fun test_launch_splash_activity_without_logo_animation() {
        val intent = Intent(
            ApplicationProvider.getApplicationContext(),
            SplashActivity::class.java
        ).putExtra("navigate_to_info", true)
        scenario = launchActivity(intent)
    }
}