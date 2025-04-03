package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngc extends nfj {
    public static final nga a = new Object() { // from class: nga
    };
    private final nga b;

    public ngc(nga ngaVar) {
        this.b = ngaVar;
    }

    private static int d(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int e(byte[] bArr, int i, int i2) {
        int f = f(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return f;
        }
        while (true) {
            int length = bArr.length;
            if (f >= length - 1) {
                return length;
            }
            int i3 = f + 1;
            if ((f - i) % 2 == 0 && bArr[i3] == 0) {
                return f;
            }
            f = f(bArr, i3);
        }
    }

    private static int f(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int g(luv luvVar, int i) {
        byte[] bArr = luvVar.a;
        int i2 = luvVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    private static engw h(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return engw.r("");
        }
        int i3 = engw.d;
        engr engrVar = new engr();
        int e = e(bArr, i2, i);
        while (i2 < e) {
            engrVar.h(new String(bArr, i2, e - i2, k(i)));
            i2 = d(i) + e;
            e = e(bArr, i2, i);
        }
        engw g = engrVar.g();
        return g.isEmpty() ? engw.r("") : g;
    }

    private static String i(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String j(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static Charset k(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean l(defpackage.luv r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r1.b
        L6:
            int r3 = r1.b()     // Catch: java.lang.Throwable -> La6
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La2
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L20
            int r7 = r1.e()     // Catch: java.lang.Throwable -> La6
            long r8 = r1.r()     // Catch: java.lang.Throwable -> La6
            int r10 = r1.n()     // Catch: java.lang.Throwable -> La6
            goto L2a
        L20:
            int r7 = r1.l()     // Catch: java.lang.Throwable -> La6
            int r8 = r1.l()     // Catch: java.lang.Throwable -> La6
            long r8 = (long) r8     // Catch: java.lang.Throwable -> La6
            r10 = r6
        L2a:
            r11 = 0
            if (r7 != 0) goto L36
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L36
            if (r10 != 0) goto L36
            goto La2
        L36:
            r7 = 4
            if (r0 != r7) goto L66
            if (r24 != 0) goto L66
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L46
        L43:
            r4 = r6
            goto La2
        L46:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L66:
            if (r0 != r7) goto L76
            r3 = r10 & 64
            if (r3 == 0) goto L6d
            goto L6e
        L6d:
            r4 = r6
        L6e:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L88
        L76:
            if (r0 != r3) goto L86
            r3 = r10 & 32
            if (r3 == 0) goto L7e
            r3 = r4
            goto L7f
        L7e:
            r3 = r6
        L7f:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L84
            goto L88
        L84:
            r4 = r6
            goto L88
        L86:
            r3 = r6
            r4 = r3
        L88:
            if (r4 == 0) goto L8c
            int r3 = r3 + 4
        L8c:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La6
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L92
            goto L43
        L92:
            int r3 = r1.b()     // Catch: java.lang.Throwable -> La6
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La6
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L9c
            goto L43
        L9c:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> La6
            r1.L(r3)     // Catch: java.lang.Throwable -> La6
            goto L6
        La2:
            r1.K(r2)
            return r4
        La6:
            r0 = move-exception
            r1.K(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngc.l(luv, int, int, boolean):boolean");
    }

    private static byte[] m(byte[] bArr, int i, int i2) {
        return i2 <= i ? lvf.c : Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x027f, code lost:
    
        if (r9 == 67) goto L153;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.ngd n(int r33, defpackage.luv r34, boolean r35, int r36, defpackage.nga r37) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngc.n(int, luv, boolean, int, nga):ngd");
    }

    @Override // defpackage.nfj
    protected final lrb b(nfi nfiVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lrb c(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngc.c(byte[], int):lrb");
    }

    public ngc() {
        this(null);
    }
}
