package com.google.android.apps.messaging.ui.conversation.message;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import defpackage.bcrt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationMessageBubbleView extends LinearLayout {
    public ObjectAnimator a;
    public final bcrt b;
    public int c;
    public ViewGroup d;
    private int e;
    private boolean f;

    public ConversationMessageBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new bcrt();
    }

    public final int a(DisplayMetrics displayMetrics) {
        if (this.f) {
            return Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
        }
        return 0;
    }

    public final DisplayMetrics b() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public final void c(boolean z, boolean z2) {
        boolean z3 = this.f;
        this.f = z;
        if (z3 == z || !z2) {
            return;
        }
        this.d.setMinimumWidth(a(b()));
    }

    public final void d(boolean z) {
        this.d.setMinimumWidth((!z || this.f) ? a(b()) : (int) getResources().getDimension(R.dimen.snippet_minimum_width));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (ViewGroup) findViewById(R.id.message_text_and_info);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (this.e == 0 && measuredWidth != 0) {
            this.e = measuredWidth;
        }
        this.d.getLayoutParams().width = -2;
        this.d.requestLayout();
    }

    public void setMorphWidth(int i) {
        requestLayout();
    }
}
