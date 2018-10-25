package org.mozilla.rocket.nightmode.themed

import android.content.Context
import android.util.AttributeSet
import android.view.View

class ThemedImageButton(context: Context, attrs: AttributeSet) : android.support.v7.widget.AppCompatImageButton(context, attrs), NightTheme {

    override var themeState = ThemedWidgetUtils.ThemeState.DEFAULT.value

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        return if (isNightTheme()) {
            val drawableState = super.onCreateDrawableState(extraSpace + getThemeDrawableState().size)
            View.mergeDrawableStates(drawableState, getThemeDrawableState())
            drawableState
        } else {
            super.onCreateDrawableState(extraSpace)
        }
    }

    override fun notifyRefreshDrawableState() {
        refreshDrawableState()
    }
}
