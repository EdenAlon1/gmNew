package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.ehfy;
import defpackage.ehiz;
import defpackage.ehjg;
import defpackage.ehji;
import defpackage.ehua;
import defpackage.kps;
import defpackage.yt;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaterialSwitch extends SwitchCompat {
    private static final int[] m = {R.attr.state_with_icon};
    private Drawable n;
    private Drawable o;
    private int p;
    private Drawable q;
    private Drawable r;
    private ColorStateList s;
    private ColorStateList t;
    private PorterDuff.Mode u;
    private ColorStateList v;
    private ColorStateList w;
    private PorterDuff.Mode x;
    private int[] y;
    private int[] z;

    public MaterialSwitch(Context context) {
        this(context, null);
    }

    private static void j(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable != null) {
            drawable.setTint(kps.e(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
        }
    }

    private final void k() {
        ColorStateList colorStateList = this.s;
        if (colorStateList == null && this.t == null && this.v == null && this.w == null) {
            return;
        }
        float f = this.j;
        if (colorStateList != null) {
            j(this.n, colorStateList, this.y, this.z, f);
        }
        ColorStateList colorStateList2 = this.t;
        if (colorStateList2 != null) {
            j(this.o, colorStateList2, this.y, this.z, f);
        }
        ColorStateList colorStateList3 = this.v;
        if (colorStateList3 != null) {
            j(this.q, colorStateList3, this.y, this.z, f);
        }
        ColorStateList colorStateList4 = this.w;
        if (colorStateList4 != null) {
            j(this.r, colorStateList4, this.y, this.z, f);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        k();
        super.invalidate();
    }

    @Override // android.support.v7.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.o != null) {
            mergeDrawableStates(onCreateDrawableState, m);
        }
        int[] iArr = new int[onCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : onCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.y = iArr;
        this.z = ehfy.g(onCreateDrawableState);
        return onCreateDrawableState;
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet, int i) {
        super(ehua.a(context, attributeSet, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, i);
        Drawable drawable;
        this.p = -1;
        Context context2 = getContext();
        this.n = this.a;
        this.s = this.b;
        this.b = null;
        this.d = true;
        super.a();
        this.q = this.e;
        this.v = this.f;
        this.f = null;
        this.h = true;
        super.b();
        yt b = ehiz.b(context2, attributeSet, ehji.a, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.o = b.h(0);
        this.p = b.b(1, -1);
        this.t = b.g(2);
        this.u = ehjg.c(b.c(3, -1), PorterDuff.Mode.SRC_IN);
        this.r = b.h(4);
        this.w = b.g(5);
        this.x = ehjg.c(b.c(6, -1), PorterDuff.Mode.SRC_IN);
        b.o();
        this.k = false;
        invalidate();
        this.n = ehfy.h(this.n, this.s, this.c);
        this.o = ehfy.h(this.o, this.t, this.u);
        k();
        Drawable drawable2 = this.n;
        Drawable drawable3 = this.o;
        int i2 = this.p;
        Drawable c = ehfy.c(drawable2, drawable3, i2, i2);
        Drawable drawable4 = this.a;
        if (drawable4 != null) {
            drawable4.setCallback(null);
        }
        this.a = c;
        if (c != null) {
            c.setCallback(this);
        }
        requestLayout();
        refreshDrawableState();
        this.q = ehfy.h(this.q, this.v, this.g);
        this.r = ehfy.h(this.r, this.w, this.x);
        k();
        Drawable drawable5 = this.q;
        if (drawable5 != null && (drawable = this.r) != null) {
            drawable5 = new LayerDrawable(new Drawable[]{drawable5, drawable});
        } else if (drawable5 == null) {
            drawable5 = this.r;
        }
        if (drawable5 != null) {
            this.i = drawable5.getIntrinsicWidth();
            requestLayout();
        }
        Drawable drawable6 = this.e;
        if (drawable6 != null) {
            drawable6.setCallback(null);
        }
        this.e = drawable5;
        if (drawable5 != null) {
            drawable5.setCallback(this);
        }
        requestLayout();
    }
}
