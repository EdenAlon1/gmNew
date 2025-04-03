package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class g {
    public static final int a(euza euzaVar, int i, int i2) {
        euzaVar.o(2);
        euzaVar.t(1, i2);
        euzaVar.t(0, i);
        return euzaVar.b();
    }

    public static final int b(euza euzaVar, int[] iArr) {
        int length = iArr.length;
        euzaVar.p(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return euzaVar.c();
            }
            euzaVar.i(iArr[length]);
        }
    }

    public static final int c(euza euzaVar, double[] dArr) {
        int length = dArr.length;
        euzaVar.p(8, length, 8);
        while (true) {
            length--;
            if (length < 0) {
                return euzaVar.c();
            }
            euzaVar.f(dArr[length]);
        }
    }
}
