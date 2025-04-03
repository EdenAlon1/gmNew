package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncv {
    public static int a(luv luvVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return luvVar.j() + 1;
            case 7:
                return luvVar.n() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static boolean b(luv luvVar, ncz nczVar, boolean z, ncu ncuVar) {
        try {
            long t = luvVar.t();
            if (!z) {
                t *= nczVar.b;
            }
            ncuVar.a = t;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r3 != r24.f) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if ((r23.j() * 1000) == r5) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (r4 == r5) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(defpackage.luv r23, defpackage.ncz r24, int r25, defpackage.ncu r26) {
        /*
            Method dump skipped, instructions count: 186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncv.c(luv, ncz, int, ncu):boolean");
    }
}
