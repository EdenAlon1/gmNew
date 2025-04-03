package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehlc {
    public final int a;
    public int b;
    public int[] c;
    public int d;
    public final int e;
    public final int f;
    public int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;

    protected ehlc(Context context, AttributeSet attributeSet, int i, int i2) {
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray a = ehiz.a(context, attributeSet, ehml.a, i, i2, new int[0]);
        int a2 = ehmq.a(context, a, 10, dimensionPixelSize);
        this.a = a2;
        this.b = Math.min(ehmq.a(context, a, 9, 0), Math.round(a2 / 2.0f));
        this.e = a.getInt(6, 0);
        this.f = a.getInt(1, 0);
        this.g = a.getDimensionPixelSize(4, 0);
        int abs = Math.abs(a.getDimensionPixelSize(13, 0));
        this.h = Math.abs(a.getDimensionPixelSize(14, abs));
        this.i = Math.abs(a.getDimensionPixelSize(15, abs));
        this.j = Math.abs(a.getDimensionPixelSize(11, 0));
        this.k = a.getDimensionPixelSize(12, 0);
        this.l = a.getFloat(2, 1.0f);
        if (!a.hasValue(3)) {
            this.c = new int[]{ehdr.c(context, R.attr.colorPrimary, -1)};
        } else if (a.peekValue(3).type != 1) {
            this.c = new int[]{a.getColor(3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(a.getResourceId(3, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (a.hasValue(8)) {
            this.d = a.getColor(8, -1);
        } else {
            this.d = this.c[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            this.d = ehdr.a(this.d, (int) (f * 255.0f));
        }
        a.recycle();
    }

    public void a() {
        if (this.g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }

    public final boolean b(boolean z) {
        if (this.j > 0) {
            return !z ? this.i > 0 : this.h > 0;
        }
        return false;
    }

    public final boolean c() {
        return this.f != 0;
    }

    public final boolean d() {
        return this.e != 0;
    }
}
