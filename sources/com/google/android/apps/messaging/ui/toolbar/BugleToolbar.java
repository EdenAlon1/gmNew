package com.google.android.apps.messaging.ui.toolbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BugleToolbar extends Toolbar {
    public BugleToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.support.v7.widget.Toolbar
    public final void s(Drawable drawable) {
        super.s(drawable);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof AppCompatImageButton) {
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) childAt;
                ViewGroup.LayoutParams layoutParams = appCompatImageButton.getLayoutParams();
                layoutParams.height = -1;
                appCompatImageButton.setImageDrawable(drawable);
                if (appCompatImageButton.getContentDescription() == null) {
                    appCompatImageButton.setContentDescription(getContext().getString(R.string.abc_toolbar_collapse_description));
                }
                appCompatImageButton.setLayoutParams(layoutParams);
            }
        }
    }

    public BugleToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
