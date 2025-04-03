package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class feo {
    public final long a;
    public final long b;
    public final ioc c;
    public final boolean d;
    public final fcy e;
    public final Comparator f;
    public final cnz g;
    public final List h;
    public int i;
    public int j;
    public int k;

    public feo(long j, long j2, ioc iocVar, boolean z, fcy fcyVar, Comparator comparator) {
        this.a = j;
        this.b = j2;
        this.c = iocVar;
        this.d = z;
        this.e = fcyVar;
        this.f = comparator;
        int i = cng.a;
        this.g = new cnz((byte[]) null);
        this.h = new ArrayList();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    public final int a(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        int b = feq.b(i2, i3) - 1;
        if (b == 0) {
            return this.k - 1;
        }
        if (b != 1) {
            return -1;
        }
        return this.k;
    }
}
