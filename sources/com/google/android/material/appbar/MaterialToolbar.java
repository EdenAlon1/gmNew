package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.egzx;
import defpackage.ehfy;
import defpackage.ehiz;
import defpackage.ehjb;
import defpackage.ehop;
import defpackage.ehoq;
import defpackage.ehua;
import defpackage.od;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaterialToolbar extends Toolbar {
    private static final ImageView.ScaleType[] E = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer D;
    private boolean F;
    private boolean G;
    private ImageView.ScaleType H;
    private Boolean I;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    private final void F(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredWidth2 = view.getMeasuredWidth();
        int i = measuredWidth - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @Override // android.support.v7.widget.Toolbar
    public final void o(int i) {
        Menu h = h();
        boolean z = h instanceof od;
        if (z) {
            ((od) h).s();
        }
        super.o(i);
        if (z) {
            ((od) h).r();
        }
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ehoq.c(this);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.F || this.G) {
            List c = ehjb.c(this, this.s);
            TextView textView = c.isEmpty() ? null : (TextView) Collections.min(c, ehjb.a);
            List c2 = ehjb.c(this, this.t);
            TextView textView2 = c2.isEmpty() ? null : (TextView) Collections.max(c2, ehjb.a);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.F && textView != null) {
                    F(textView, pair);
                }
                if (this.G && textView2 != null) {
                    F(textView2, pair);
                }
            }
        }
        ImageView imageView3 = this.d;
        Drawable drawable2 = imageView3 != null ? imageView3.getDrawable() : null;
        if (drawable2 != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(drawable2.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.I;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.H;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void s(Drawable drawable) {
        if (drawable != null && this.D != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.D.intValue());
        }
        super.s(drawable);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        ehoq.b(this, f);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(ehua.a(context, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        ColorStateList a;
        Context context2 = getContext();
        TypedArray a2 = ehiz.a(context2, attributeSet, egzx.e, i, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (a2.hasValue(2)) {
            this.D = Integer.valueOf(a2.getColor(2, -1));
            Drawable e = e();
            if (e != null) {
                s(e);
            }
        }
        this.F = a2.getBoolean(4, false);
        this.G = a2.getBoolean(3, false);
        int i2 = a2.getInt(1, -1);
        if (i2 >= 0 && i2 < 8) {
            this.H = E[i2];
        }
        if (a2.hasValue(0)) {
            this.I = Boolean.valueOf(a2.getBoolean(0, false));
        }
        a2.recycle();
        Drawable background = getBackground();
        if (background == null) {
            a = ColorStateList.valueOf(0);
        } else {
            a = ehfy.a(background);
        }
        if (a != null) {
            ehop ehopVar = new ehop();
            ehopVar.O(a);
            ehopVar.K(context2);
            ehopVar.N(getElevation());
            setBackground(ehopVar);
        }
    }
}
