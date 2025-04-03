package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzl {
    public static final int a(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        if (i >= 262143) {
            return PrivateKeyType.INVALID;
        }
        return 18;
    }

    public static final int b(long j, int i) {
        int c = jzk.c(j);
        if (i < c) {
            i = c;
        }
        int a = jzk.a(j);
        return i > a ? a : i;
    }

    public static final int c(long j, int i) {
        int d = jzk.d(j);
        if (i < d) {
            i = d;
        }
        int b = jzk.b(j);
        return i > b ? b : i;
    }

    public static final long d(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            jzy.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return g(i, i2, i3, i4);
    }

    public static final long e(long j, long j2) {
        int i = (int) (j2 >> 32);
        int d = jzk.d(j);
        if (i < d) {
            i = d;
        }
        int b = jzk.b(j);
        if (i > b) {
            i = b;
        }
        long j3 = i << 32;
        int a = jzk.a(j);
        int i2 = (int) (j2 & 4294967295L);
        int c = jzk.c(j);
        if (i2 < c) {
            i2 = c;
        }
        if (i2 <= a) {
            a = i2;
        }
        return a | j3;
    }

    public static final long f(long j, long j2) {
        int d = jzk.d(j2);
        int d2 = jzk.d(j);
        if (d < d2) {
            d = d2;
        }
        int b = jzk.b(j);
        if (d > b) {
            d = b;
        }
        int b2 = jzk.b(j2);
        if (b2 >= d2) {
            d2 = b2;
        }
        if (d2 <= b) {
            b = d2;
        }
        int c = jzk.c(j2);
        int c2 = jzk.c(j);
        if (c < c2) {
            c = c2;
        }
        int a = jzk.a(j);
        if (c > a) {
            c = a;
        }
        int a2 = jzk.a(j2);
        if (a2 >= c2) {
            c2 = a2;
        }
        if (c2 <= a) {
            a = c2;
        }
        return d(d, b, c, a);
    }

    public static final long g(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int a = a(i5);
        int a2 = a(i6);
        if (a + a2 > 31) {
            j(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = a2 - 13;
        return (((~(i7 >> 31)) & i7) << 33) | (i << 2) | ((i9 >> 1) + (i9 & 1)) | (i3 << (a2 + 2)) | (((~(i8 >> 31)) & i8) << (a2 + 33));
    }

    public static final long h(long j, int i, int i2) {
        int b = jzk.b(j);
        if (b != Integer.MAX_VALUE && (b = b + i) < 0) {
            b = 0;
        }
        int c = jzk.c(j) + i2;
        if (c < 0) {
            c = 0;
        }
        int a = jzk.a(j);
        if (a != Integer.MAX_VALUE && (a = a + i2) < 0) {
            a = 0;
        }
        int d = jzk.d(j) + i;
        return d(d >= 0 ? d : 0, b, c, a);
    }

    public static final Void i(int i) {
        throw new IllegalArgumentException(a.f(i, "Can't represent a size of ", " in Constraints"));
    }

    public static final void j(int i, int i2) {
        throw new IllegalArgumentException(a.x(i2, i, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static /* synthetic */ long k(int i, int i2, int i3, int i4) {
        if (1 == (i4 & 1)) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return d(i, i2, 0, i3);
    }

    public static /* synthetic */ long l(long j, int i, int i2, int i3) {
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return h(j, i, i2);
    }
}
