package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jzk {
    public final long a;

    public static final int a(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = ((int) (j >> (((i3 + i3) + (i2 * 3)) + 46))) & ((1 << (18 - r0)) - 1);
        return i4 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i4 - 1;
    }

    public static final int b(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = ((int) (j >> 33)) & ((1 << (((i3 + i3) + (i2 * 3)) + 13)) - 1);
        return i4 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i4 - 1;
    }

    public static final int c(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        return ((int) (j >> (((i3 + i3) + (i2 * 3)) + 15))) & ((1 << (18 - r0)) - 1);
    }

    public static final int d(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        return ((int) (j >> 2)) & ((1 << (((i3 + i3) + (i2 * 3)) + 13)) - 1);
    }

    public static String e(long j) {
        int b = b(j);
        String valueOf = b == Integer.MAX_VALUE ? "Infinity" : String.valueOf(b);
        int a = a(j);
        return "Constraints(minWidth = " + d(j) + ", maxWidth = " + valueOf + ", minHeight = " + c(j) + ", maxHeight = " + (a != Integer.MAX_VALUE ? String.valueOf(a) : "Infinity") + ')';
    }

    public static boolean f(long j, Object obj) {
        return (obj instanceof jzk) && j == ((jzk) obj).a;
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static final boolean h(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = i3 + i3 + (i2 * 3);
        return (((int) (j >> (i4 + 46))) & ((1 << (18 - i4)) + (-1))) != 0;
    }

    public static final boolean i(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        return (((int) (j >> 33)) & ((1 << (((i3 + i3) + (i2 * 3)) + 13)) + (-1))) != 0;
    }

    public static final boolean j(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = i3 + i3 + (i2 * 3);
        int i5 = i4 + 15;
        int i6 = (1 << (18 - i4)) - 1;
        int i7 = ((int) (j >> (i4 + 46))) & i6;
        return (((int) (j >> i5)) & i6) == (i7 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i7 + (-1));
    }

    public static final boolean k(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = (1 << (((i3 + i3) + (i2 * 3)) + 13)) - 1;
        int i5 = ((int) (j >> 33)) & i4;
        return (((int) (j >> 2)) & i4) == (i5 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i5 + (-1));
    }

    public static final long l(int i, int i2, int i3, int i4) {
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            jzy.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return jzl.g(i, i2, i3, i4);
    }

    public static /* synthetic */ long m(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = d(j);
        }
        if ((i5 & 2) != 0) {
            i2 = b(j);
        }
        if ((i5 & 4) != 0) {
            i3 = c(j);
        }
        if ((i5 & 8) != 0) {
            i4 = a(j);
        }
        return l(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public final int hashCode() {
        return jzi.a(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
