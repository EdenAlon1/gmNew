package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.clw;
import defpackage.clx;
import defpackage.cly;
import defpackage.clz;
import defpackage.kvo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final clx f;
    private static final int[] g = {R.attr.colorBackground};
    public static final cly e = new cly();

    public CardView(Context context) {
        this(context, null);
    }

    public float gt() {
        return cly.c(this.f);
    }

    public void gu(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        clz clzVar = (clz) this.f.a;
        clzVar.a(valueOf);
        clzVar.invalidateSelf();
    }

    public void gv(float f) {
        this.f.b.setElevation(f);
    }

    public void gw(float f) {
        clz clzVar = (clz) this.f.a;
        if (f == clzVar.a) {
            return;
        }
        clzVar.a = f;
        clzVar.b(null);
        clzVar.invalidateSelf();
    }

    public final float gx() {
        return cly.b(this.f);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        clx clxVar = new clx(this);
        this.f = clxVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, clw.a, i, com.google.android.apps.messaging.R.style.CardView);
        kvo.o(this, context, clw.a, attributeSet, obtainStyledAttributes, i, com.google.android.apps.messaging.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(g);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.google.android.apps.messaging.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.google.android.apps.messaging.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(7, false);
        this.b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        cly clyVar = e;
        clz clzVar = new clz(valueOf, dimension);
        clxVar.a = clzVar;
        clxVar.b.setBackgroundDrawable(clzVar);
        CardView cardView = clxVar.b;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        clyVar.a(clxVar, dimension3);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
