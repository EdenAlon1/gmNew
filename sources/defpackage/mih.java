package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class mih {
    public static int a(int i) {
        return b(i, 0, 0, 0);
    }

    public static int b(int i, int i2, int i3, int i4) {
        return c(i, i2, i3, 0, 128, i4);
    }

    public static int c(int i, int i2, int i3, int i4, int i5, int i6) {
        return i | i2 | i3 | i4 | i5 | i6;
    }

    public static int d(int i) {
        return i & 384;
    }

    public static int e(int i) {
        return i & 7;
    }

    public static int f(int i) {
        return i & 64;
    }

    public static boolean g(int i, boolean z) {
        int e = e(i);
        if (e != 4) {
            return z && e == 3;
        }
        return true;
    }
}
