package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egzm extends LinearLayout.LayoutParams {
    public int a;
    public egzk b;
    public Interpolator c;

    public egzm() {
        super(-1, -2);
        this.a = 1;
    }

    public egzm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, egzx.b);
        this.a = obtainStyledAttributes.getInt(1, 0);
        this.b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new egzl();
        if (obtainStyledAttributes.hasValue(2)) {
            this.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public egzm(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public egzm(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public egzm(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }
}
