package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes4.dex */
public final class dtos {
    public static final int a(long j) {
        return j(j, 0);
    }

    public static final int b(long j) {
        return j(j, 1);
    }

    public static final int c(long j) {
        return j(j, 2);
    }

    public static final int d(long j) {
        int b = b(j);
        if (b == -21) {
            b = c(j);
        }
        int a = a(j);
        if (a != -21) {
            b = ffmk.g(a, b);
        }
        if (h(j)) {
            return b;
        }
        int a2 = dtnz.a(b);
        if (a2 <= 0 || a2 > 10) {
            throw new IllegalArgumentException(a.h(a2, "Invalid java priority: "));
        }
        return dtnz.a[a2 - 1];
    }

    public static final long e(long j) {
        return j & 8796093022207L;
    }

    public static final boolean f(long j) {
        return ((j >>> 61) & 1) == 1;
    }

    public static final boolean g(long j) {
        return ((j >>> 62) & 1) == 1;
    }

    public static final boolean h(long j) {
        return (j >>> 63) == 1;
    }

    public static /* synthetic */ long i(long j, boolean z, boolean z2, boolean z3, int i, int i2, long j2, int i3) {
        if ((i3 & 1) != 0) {
            z = h(j);
        }
        boolean z4 = z;
        if ((i3 & 2) != 0) {
            z2 = g(j);
        }
        boolean z5 = z2;
        if ((i3 & 4) != 0) {
            z3 = f(j);
        }
        boolean z6 = z3;
        if ((i3 & 8) != 0) {
            i = c(j);
        }
        int i4 = i;
        int b = (i3 & 16) != 0 ? b(j) : 0;
        if ((i3 & 32) != 0) {
            i2 = a(j);
        }
        return dtou.a(z4, z5, z6, i4, b, i2, (i3 & 64) != 0 ? e(j) : j2);
    }

    private static final int j(long j, int i) {
        return (((int) (j >>> ((i * 6) + 43))) & 63) - 21;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
