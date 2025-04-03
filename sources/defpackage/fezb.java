package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezb {
    public static final int a(String[] strArr) {
        return strArr.length >> 1;
    }

    public static final String b(int i, String[] strArr) {
        int i2 = i + i;
        if (i2 < 0 || i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public static final String c(int i, String[] strArr) {
        int i2 = i + i + 1;
        if (i2 < 0 || i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }
}
