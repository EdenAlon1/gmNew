package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbbi extends cbbo {
    public final int b;
    public final int c;
    public final ImageView.ScaleType d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final boolean j;

    public cbbi(int i, int i2, ImageView.ScaleType scaleType, int i3, int i4, boolean z, boolean z2, int i5, boolean z3) {
        csix.k(i == -1 || i > 0);
        csix.k(i2 == -1 || i2 > 0);
        csix.k(i3 == -1 || i3 > 0);
        csix.k(i4 == -1 || i4 > 0);
        this.b = i;
        this.c = i2;
        this.d = scaleType;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = i5;
        this.j = z3;
    }

    @Override // defpackage.cbbo
    public abstract cbbn f(Context context);

    public String g() {
        throw null;
    }

    public void b(int i, int i2) {
    }
}
