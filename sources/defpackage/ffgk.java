package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class ffgk extends ffgj {
    public static final int b(int i, int... iArr) {
        for (int i2 = 0; i2 < 4; i2++) {
            i = Math.max(i, iArr[i2]);
        }
        return i;
    }

    public static final Comparable c(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2) >= 0 ? comparable : comparable2;
    }
}
