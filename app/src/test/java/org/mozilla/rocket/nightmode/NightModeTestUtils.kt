package org.mozilla.rocket.nightmode

import android.app.Activity
import android.view.WindowManager

import org.mozilla.focus.utils.Settings
import org.robolectric.Robolectric
import org.robolectric.RuntimeEnvironment

import org.junit.Assert.assertTrue

internal object NightModeTestUtils {

    private val TARGET_BRIGHTNESS = 30.0f

    fun <T : Activity> testActivityBrightness(classname: Class<T>): T {
        Settings.getInstance(RuntimeEnvironment.application).setNightMode(true)
        Settings.getInstance(RuntimeEnvironment.application).nightModeBrightnessValue = TARGET_BRIGHTNESS
        val activity = Robolectric.setupActivity(classname)

        val layoutParams = activity.window.attributes
        assertTrue(TARGET_BRIGHTNESS == layoutParams.screenBrightness)

        return activity

    }
}
