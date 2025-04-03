package com.google.research.ink.libs.buttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import defpackage.facb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PenSelectionButton extends ImageView {
    public ColorFilter a;
    public String b;
    public final Drawable c;
    public final int d;
    public final Drawable e;
    public final int f;
    public final int g;
    private final int h;
    private final String i;

    public PenSelectionButton(Context context) {
        this(context, null, 0);
    }

    public final void a() {
        if (TextUtils.isEmpty(this.i)) {
            return;
        }
        if (!isActivated() || TextUtils.isEmpty(this.b)) {
            setContentDescription(this.i);
        } else {
            setContentDescription(String.format("%s: %s", getResources().getString(R.string.color_selected_template, this.i), this.b));
        }
    }

    @Override // android.view.View
    public final void setActivated(boolean z) {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.h != this.d || !z) {
                drawable = this.e;
            }
            setImageDrawable(drawable);
        }
        super.setActivated(z);
        setColorFilter(z ? this.a : null);
        a();
    }

    public PenSelectionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PenSelectionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, facb.b, 0, 0);
        obtainStyledAttributes.getResourceId(6, 0);
        this.h = obtainStyledAttributes.getResourceId(4, -1);
        obtainStyledAttributes.getFloat(5, 0.5f);
        this.f = obtainStyledAttributes.getColor(2, 0);
        this.g = obtainStyledAttributes.getColor(3, -16777216);
        obtainStyledAttributes.getString(7);
        this.i = obtainStyledAttributes.getString(8);
        this.d = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.ink_default_alt_color));
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.c = getContext().getDrawable(resourceId);
        } else {
            this.c = null;
        }
        this.e = getDrawable();
        obtainStyledAttributes.recycle();
        a();
    }
}
