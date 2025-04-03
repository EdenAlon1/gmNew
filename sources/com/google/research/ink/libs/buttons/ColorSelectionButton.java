package com.google.research.ink.libs.buttons;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;
import defpackage.faca;
import defpackage.facb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ColorSelectionButton extends View {
    private static final Interpolator e = new AccelerateDecelerateInterpolator();
    public final float a;
    public final int b;
    public final String c;
    public boolean d;
    private final int f;
    private final int g;
    private final Drawable h;

    public ColorSelectionButton(Context context) {
        this(context, null, 0);
    }

    public final void a(boolean z) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        String str = this.c;
        if (str != null) {
            if (z) {
                str = getContext().getString(R.string.color_selected_template, this.c);
            }
            setContentDescription(str);
        }
        if (getWidth() <= 0) {
            setScaleX(z ? this.a : 1.0f);
            setScaleY(z ? this.a : 1.0f);
            this.d = z;
        } else if (z || this.d) {
            boolean z2 = this.d;
            float f = z2 ? this.a : 1.0f;
            float f2 = z ? this.a : 1.0f;
            if (z && z2) {
                float f3 = this.a * 1.2f;
                ofFloat = ObjectAnimator.ofFloat(this, "scaleX", f, f3, f2);
                ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", f, f3, f2);
            } else {
                ofFloat = ObjectAnimator.ofFloat(this, "scaleX", f, f2);
                ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", f, f2);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setInterpolator(e);
            animatorSet.setDuration(120L);
            animatorSet.addListener(new faca(this, z));
            animatorSet.start();
        }
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int width = getWidth() - this.g;
        int height = getHeight() - this.g;
        this.h.setBounds(width / 2, height / 2, getWidth() - ((getWidth() - this.g) / 2), getHeight() - ((getHeight() - this.g) / 2));
        this.h.draw(canvas);
    }

    public ColorSelectionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorSelectionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, facb.a, 0, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, getResources().getDimensionPixelSize(R.dimen.ink_default_active_diameter));
        this.f = dimensionPixelSize;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.ink_default_inactive_diameter));
        this.g = dimensionPixelSize2;
        this.a = dimensionPixelSize / dimensionPixelSize2;
        int color = obtainStyledAttributes.getColor(4, -16777216);
        this.b = color;
        String string = obtainStyledAttributes.getString(1);
        this.c = string;
        setContentDescription(string);
        int resourceId = obtainStyledAttributes.getResourceId(2, -1);
        if (resourceId == -1) {
            Drawable mutate = getContext().getDrawable(R.drawable.ink_color_button).mutate();
            this.h = mutate;
            mutate.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        } else {
            this.h = getContext().getDrawable(resourceId).mutate();
        }
        invalidate();
        obtainStyledAttributes.recycle();
    }
}
