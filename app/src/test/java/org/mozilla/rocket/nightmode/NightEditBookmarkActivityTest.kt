package org.mozilla.rocket.nightmode

import org.junit.Test
import org.junit.runner.RunWith
import org.mozilla.focus.activity.EditBookmarkActivity
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class NightEditBookmarkActivityTest {

    @Test
    fun testActivityBrightness() {
        NightModeTestUtils.testActivityBrightness(EditBookmarkActivity::class.java)
    }

}
