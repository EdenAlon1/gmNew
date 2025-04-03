package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class enrf extends enra {
    protected enrf() {
    }

    public static char[] a(char[] cArr, int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }
}
