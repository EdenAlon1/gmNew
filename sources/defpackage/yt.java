package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yt {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    private yt(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static yt j(Context context, int i, int[] iArr) {
        return new yt(context, context.obtainStyledAttributes(i, iArr));
    }

    public static yt k(Context context, AttributeSet attributeSet, int[] iArr) {
        return new yt(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static yt l(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new yt(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public final int a(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public final int b(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public final int c(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public final int d(int i, int i2) {
        return this.b.getInteger(i, i2);
    }

    public final int e(int i, int i2) {
        return this.b.getLayoutDimension(i, i2);
    }

    public final int f(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public final ColorStateList g(int i) {
        int resourceId;
        ColorStateList d;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0 || (d = koa.d(this.a, resourceId)) == null) ? this.b.getColorStateList(i) : d;
    }

    public final Drawable h(int i) {
        int resourceId;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) ? this.b.getDrawable(i) : ku.a(this.a, resourceId);
    }

    public final Drawable i(int i) {
        int resourceId;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return qu.d().g(this.a, resourceId);
    }

    public final CharSequence m(int i) {
        return this.b.getText(i);
    }

    public final String n(int i) {
        return this.b.getString(i);
    }

    public final void o() {
        this.b.recycle();
    }

    public final boolean p(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public final boolean q(int i) {
        return this.b.hasValue(i);
    }

    public final int r(int i) {
        return this.b.getColor(i, 0);
    }

    public final float s(int i) {
        return this.b.getDimension(i, -1.0f);
    }
}
