package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkd {
    public static final int a(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            return c(i2, i3, z);
        }
        boolean z2 = !z;
        return d(i, i2, i3, z2) ? b(i, i2, z) : d(i, i2, i3, z) ? b(i, i2, z2) : c(i2, i3, z2);
    }

    private static final int b(int i, int i2, boolean z) {
        return z ? i : i - i2;
    }

    private static final int c(int i, int i2, boolean z) {
        if (z) {
            return 0;
        }
        return i2 - i;
    }

    private static final boolean d(int i, int i2, int i3, boolean z) {
        return z ? i2 <= i : i3 - i2 > i;
    }
}
