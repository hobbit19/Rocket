package org.mozilla.rocket.nightmode

import org.junit.Test
import org.junit.runner.RunWith
import org.mozilla.focus.screenshot.ScreenshotViewerActivity
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class NightScreenshotViewerActivityTest {

    @Test
    fun testActivityBrightness() {
        NightModeTestUtils.testActivityBrightness(ScreenshotViewerActivity::class.java)
    }

}
