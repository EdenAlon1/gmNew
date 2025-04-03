package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nbc {
    public static nbb a(byte[] bArr, int i) {
        ArrayList arrayList;
        int e;
        luv luvVar = new luv(bArr);
        try {
            luvVar.L(4);
            e = luvVar.e();
            luvVar.K(0);
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (e == 1886547818) {
            luvVar.L(8);
            int i2 = luvVar.b;
            int i3 = luvVar.c;
            while (i2 < i3) {
                int e2 = luvVar.e() + i2;
                if (e2 <= i2 || e2 > i3) {
                    break;
                }
                int e3 = luvVar.e();
                if (e3 != 2037673328 && e3 != 1836279920) {
                    luvVar.K(e2);
                    i2 = e2;
                }
                luvVar.J(e2);
                arrayList = c(luvVar);
                break;
            }
            arrayList = null;
        } else {
            arrayList = c(luvVar);
        }
        if (arrayList != null) {
            int size = arrayList.size();
            if (size == 1) {
                naz nazVar = (naz) arrayList.get(0);
                return new nbb(nazVar, nazVar, i);
            }
            if (size == 2) {
                return new nbb((naz) arrayList.get(0), (naz) arrayList.get(1), i);
            }
        }
        return null;
    }

    private static int b(int i) {
        return (i >> 1) ^ (-(i & 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x018b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [naz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList c(defpackage.luv r28) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbc.c(luv):java.util.ArrayList");
    }
}
