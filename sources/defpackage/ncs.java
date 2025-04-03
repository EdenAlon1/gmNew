package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncs {
    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[EDGE_INSN: B:10:0x003c->B:11:0x003c BREAK  A[LOOP:0: B:2:0x0001->B:9:0x003a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[LOOP:0: B:2:0x0001->B:9:0x003a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(defpackage.ncp r9, byte[] r10, int r11, int r12) {
        /*
            r0 = 0
        L1:
            if (r0 >= r12) goto L3c
            int r1 = r11 + r0
            int r5 = r12 - r0
            r2 = r9
            nce r2 = (defpackage.nce) r2
            r2.h(r5)
            int r3 = r2.e
            int r4 = r2.d
            int r3 = r3 - r4
            r8 = -1
            if (r3 != 0) goto L27
            byte[] r3 = r2.c
            r6 = 0
            r7 = 1
            int r3 = r2.b(r3, r4, r5, r6, r7)
            if (r3 != r8) goto L21
            r3 = r8
            goto L37
        L21:
            int r4 = r2.e
            int r4 = r4 + r3
            r2.e = r4
            goto L2b
        L27:
            int r3 = java.lang.Math.min(r5, r3)
        L2b:
            byte[] r4 = r2.c
            int r5 = r2.d
            java.lang.System.arraycopy(r4, r5, r10, r1, r3)
            int r1 = r2.d
            int r1 = r1 + r3
            r2.d = r1
        L37:
            if (r3 != r8) goto L3a
            goto L3c
        L3a:
            int r0 = r0 + r3
            goto L1
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncs.a(ncp, byte[], int, int):int");
    }

    public static void b(boolean z, String str) {
        if (!z) {
            throw new lrg(str, null, true, 1);
        }
    }

    public static boolean c(ncp ncpVar, byte[] bArr, int i, int i2) {
        try {
            ncpVar.j(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean d(ncp ncpVar, int i) {
        try {
            ncpVar.l(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(ncp ncpVar, byte[] bArr, int i, boolean z) {
        try {
            return ncpVar.n(bArr, 0, i, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }
}
