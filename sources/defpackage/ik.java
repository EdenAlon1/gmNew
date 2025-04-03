package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ik extends ViewGroup.MarginLayoutParams {
    public int a;

    public ik(int i, int i2) {
        super(i, i2);
        this.a = 8388627;
    }

    public ik(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kt.b);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public ik(ik ikVar) {
        super((ViewGroup.MarginLayoutParams) ikVar);
        this.a = 0;
        this.a = ikVar.a;
    }

    public ik(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
