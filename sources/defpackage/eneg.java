package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eneg {
    static int a(int i, int i2) {
        return i & (~i2);
    }

    static int b(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    static int c(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r4 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        i(r10, r1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r11[r4] = b(r11[r4], r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int d(java.lang.Object r7, java.lang.Object r8, int r9, java.lang.Object r10, int[] r11, java.lang.Object[] r12, java.lang.Object[] r13) {
        /*
            int r0 = defpackage.engc.b(r7)
            r1 = r0 & r9
            int r2 = e(r10, r1)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r0 = a(r0, r9)
            r4 = r3
        L13:
            int r2 = r2 + r3
            r5 = r11[r2]
            r6 = r5 & r9
            int r5 = a(r5, r9)
            if (r5 != r0) goto L3f
            r5 = r12[r2]
            boolean r5 = defpackage.emxb.a(r7, r5)
            if (r5 == 0) goto L3f
            if (r13 == 0) goto L30
            r5 = r13[r2]
            boolean r5 = defpackage.emxb.a(r8, r5)
            if (r5 == 0) goto L3f
        L30:
            if (r4 != r3) goto L36
            i(r10, r1, r6)
            return r2
        L36:
            r7 = r11[r4]
            int r7 = b(r7, r6, r9)
            r11[r4] = r7
            return r2
        L3f:
            if (r6 == 0) goto L44
            r4 = r2
            r2 = r6
            goto L13
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eneg.d(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    static int e(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    static int f(int i) {
        return Math.max(4, engc.c(i + 1));
    }

    static Object g(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(a.h(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    static void h(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    static void i(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
