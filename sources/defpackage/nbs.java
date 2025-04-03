package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbs {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        if (r9 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        if (r9 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008e, code lost:
    
        if (r9 != 8) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.nbr a(defpackage.luu r9) {
        /*
            r0 = 16
            int r1 = r9.d(r0)
            int r0 = r9.d(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.d(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.d(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.d(r1)
            boolean r2 = r9.p()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.d(r2)
            boolean r5 = r9.p()
            if (r5 == 0) goto L47
            int r5 = r9.d(r4)
            if (r5 <= 0) goto L47
            r9.n(r1)
        L47:
            boolean r5 = r9.p()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            r8 = 1
            if (r8 == r5) goto L56
            r5 = r6
            goto L57
        L56:
            r5 = r7
        L57:
            int r9 = r9.d(r3)
            if (r5 != r6) goto L66
            r6 = 13
            if (r9 != r6) goto L66
            int[] r9 = defpackage.nbs.b
            r9 = r9[r6]
            goto L94
        L66:
            r6 = 0
            if (r5 != r7) goto L93
            r7 = 14
            if (r9 >= r7) goto L93
            int[] r6 = defpackage.nbs.b
            r6 = r6[r9]
            int r2 = r2 % 5
            r7 = 8
            if (r2 == r8) goto L8c
            r8 = 11
            if (r2 == r1) goto L87
            if (r2 == r4) goto L8c
            if (r2 == r3) goto L80
            goto L93
        L80:
            if (r9 == r4) goto L90
            if (r9 == r7) goto L90
            if (r9 != r8) goto L93
            goto L90
        L87:
            if (r9 == r7) goto L90
            if (r9 != r8) goto L93
            goto L90
        L8c:
            if (r9 == r4) goto L90
            if (r9 != r7) goto L93
        L90:
            int r9 = r6 + 1
            goto L94
        L93:
            r9 = r6
        L94:
            nbr r1 = new nbr
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbs.a(luu):nbr");
    }

    public static void b(int i, luv luvVar) {
        luvVar.G(7);
        byte[] bArr = luvVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
        bArr[5] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
        bArr[6] = (byte) (i & PrivateKeyType.INVALID);
    }

    public static void c(luu luuVar, nbq nbqVar) {
        int d = luuVar.d(5);
        luuVar.n(2);
        if (luuVar.p()) {
            luuVar.n(5);
        }
        if (d >= 7 && d <= 10) {
            luuVar.m();
        }
        if (luuVar.p()) {
            int d2 = luuVar.d(3);
            if (nbqVar.b == -1 && d >= 0 && d <= 15 && (d2 == 0 || d2 == 1)) {
                nbqVar.b = d;
            }
            if (luuVar.p()) {
                f(luuVar);
            }
        }
    }

    public static void d(luu luuVar, nbq nbqVar) {
        luuVar.n(2);
        boolean p = luuVar.p();
        int d = luuVar.d(8);
        for (int i = 0; i < d; i++) {
            luuVar.n(2);
            if (luuVar.p()) {
                luuVar.n(5);
            }
            if (p) {
                luuVar.n(24);
            } else {
                if (luuVar.p()) {
                    if (!luuVar.p()) {
                        luuVar.n(4);
                    }
                    nbqVar.c = luuVar.d(6) + 1;
                }
                luuVar.n(4);
            }
        }
        if (luuVar.p()) {
            luuVar.n(3);
            if (luuVar.p()) {
                f(luuVar);
            }
        }
    }

    public static boolean e(luu luuVar) {
        if (luuVar.a() < 66) {
            return false;
        }
        luuVar.n(66);
        return true;
    }

    private static void f(luu luuVar) {
        int d = luuVar.d(6);
        if (d < 2 || d > 42) {
            throw new lrg(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(d)), null, false, 1);
        }
        luuVar.n(d * 8);
    }
}
