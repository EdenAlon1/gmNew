package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jky {
    public final jkw a;
    public final jlb b;
    public boolean c;
    public Object d;
    private final cok e;
    private boolean f;
    private boolean g;
    private long h;
    private final ffix i;
    private final iah j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jky() {
        this(null);
        cmz.a();
    }

    private final void g(iui iuiVar, long j, boolean z) {
        long j2;
        char c;
        iwi z2 = iuiVar.z();
        ivm x = iuiVar.x();
        int w = x.w();
        int v = x.v();
        int a = kaa.a(j) + w;
        int b = kaa.b(j) + v;
        int b2 = kaa.b(j);
        int a2 = kaa.a(j);
        iah iahVar = this.j;
        iahVar.b(a2, b2, a, b);
        while (true) {
            j2 = 4294967295L;
            c = ' ';
            if (z2 == null) {
                break;
            }
            iwu iwuVar = z2.C;
            long j3 = z2.x;
            long floatToRawIntBits = (Float.floatToRawIntBits(kaa.a(j3)) << 32) | (Float.floatToRawIntBits(kaa.b(j3)) & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
            iahVar.a += intBitsToFloat;
            iahVar.b += intBitsToFloat2;
            iahVar.c += intBitsToFloat;
            iahVar.d += intBitsToFloat2;
            z2 = z2.v;
            if (iwuVar != null) {
                float[] m = iwuVar.m();
                if (!icn.a(m)) {
                    icm.b(m, iahVar);
                }
            }
        }
        int i = (int) iahVar.a;
        int i2 = (int) iahVar.b;
        int i3 = (int) iahVar.c;
        int i4 = (int) iahVar.d;
        int i5 = iuiVar.d;
        if (!z) {
            jkw jkwVar = this.a;
            int i6 = i5 & 67108863;
            long[] jArr = jkwVar.a;
            int i7 = jkwVar.c;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                long j4 = j2;
                long j5 = jArr[i9];
                char c2 = c;
                if ((((int) j5) & 67108863) == i6) {
                    jArr[i8] = (i << c2) | (i2 & j4);
                    jArr[i8 + 1] = (i3 << c2) | (i4 & j4);
                    jArr[i9] = j5 | 2305843009213693952L;
                    break;
                } else {
                    i8 += 3;
                    j2 = j4;
                    c = c2;
                }
            }
        }
        iui u = iuiVar.u();
        jkw.a(this.a, i5, i, i2, i3, i4, u != null ? u.d : -1);
        b();
    }

    private final void h(iui iuiVar) {
        hne s = iuiVar.s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            iui iuiVar2 = (iui) objArr[i2];
            g(iuiVar2, iuiVar2.z().x, false);
            h(iuiVar2);
        }
    }

    private static final long i(iui iuiVar) {
        float[] m;
        int a;
        iwi z = iuiVar.z();
        iwi y = iuiVar.y();
        long j = 0;
        while (y != null && y != z) {
            iwu iwuVar = y.C;
            j = kab.b(j, y.x);
            y = y.v;
            if (iwuVar != null && (a = jkz.a((m = iwuVar.m()))) != 3) {
                if ((a & 2) == 0) {
                    return 9223372034707292159L;
                }
                j = icm.a(m, j);
            }
        }
        return kab.c(j);
    }

    public final void a() {
        Throwable th;
        long j;
        long j2;
        Handler handler = huk.a;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f) {
            this.f = false;
            cok cokVar = this.e;
            Object[] objArr = cokVar.b;
            int i = cokVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((ffix) objArr[i2]).invoke();
            }
            jkw jkwVar = this.a;
            long[] jArr = jkwVar.a;
            int i3 = jkwVar.c;
            for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
                long j3 = jArr[i4 + 2];
                if ((((int) (j3 >> 61)) & 1) != 0) {
                    long j4 = jArr[i4];
                    long j5 = jArr[i4 + 1];
                    if (((jla) this.b.a.a(((int) j3) & 67108863)) != null) {
                        throw null;
                    }
                }
            }
            jkw jkwVar2 = this.a;
            long[] jArr2 = jkwVar2.a;
            int i5 = jkwVar2.c;
            for (int i6 = 0; i6 < jArr2.length - 2 && i6 < i5; i6 += 3) {
                int i7 = i6 + 2;
                jArr2[i7] = jArr2[i7] & (-2305843009213693953L);
            }
        }
        if (this.c) {
            this.c = false;
            cnw cnwVar = this.b.a;
            Object[] objArr2 = cnwVar.c;
            long[] jArr3 = cnwVar.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                th = null;
                int i8 = 0;
                j = 128;
                while (true) {
                    long j6 = jArr3[i8];
                    j2 = 255;
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j6 & 255) < 128 && ((jla) objArr2[(i8 << 3) + i10]) != null) {
                                throw null;
                            }
                            j6 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        }
                    }
                    if (i8 == length) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
        }
        th = null;
        j = 128;
        j2 = 255;
        if (this.g) {
            this.g = false;
            jkw jkwVar3 = this.a;
            long[] jArr4 = jkwVar3.a;
            int i11 = jkwVar3.c;
            long[] jArr5 = jkwVar3.b;
            int i12 = 0;
            for (int i13 = 0; i13 < jArr4.length - 2 && i12 < jArr5.length - 2 && i13 < i11; i13 += 3) {
                int i14 = i13 + 2;
                if (jArr4[i14] != 2305843009213693951L) {
                    jArr5[i12] = jArr4[i13];
                    jArr5[i12 + 1] = jArr4[i13 + 1];
                    jArr5[i12 + 2] = jArr4[i14];
                    i12 += 3;
                }
            }
            jkwVar3.c = i12;
            jkwVar3.a = jArr5;
            jkwVar3.b = jArr4;
        }
        jlb jlbVar = this.b;
        if (jlbVar.b > currentTimeMillis) {
            return;
        }
        cnw cnwVar2 = jlbVar.a;
        Object[] objArr3 = cnwVar2.c;
        long[] jArr6 = cnwVar2.a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i15 = 0;
            while (true) {
                long j7 = jArr6[i15];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j7 & j2) < j && ((jla) objArr3[(i15 << 3) + i17]) != null) {
                            throw th;
                        }
                        j7 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                }
                if (i15 == length2) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        jlbVar.b = -1L;
    }

    public final void b() {
        this.f = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.lang.Runnable] */
    public final void c(iui iuiVar) {
        this.f = true;
        int i = iuiVar.d & 67108863;
        jkw jkwVar = this.a;
        long[] jArr = jkwVar.a;
        int i2 = jkwVar.c;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 67108863) == i) {
                jArr[i4] = 2305843009213693952L | j;
                break;
            }
            i3 += 3;
        }
        ?? r11 = this.d;
        boolean z2 = r11 != 0;
        long j2 = this.b.b;
        if (j2 >= 0) {
            z = z2;
        } else if (z2) {
            return;
        }
        if (this.h == j2 && z) {
            return;
        }
        if (r11 != 0) {
            huk.a.removeCallbacks(r11);
        }
        Handler handler = huk.a;
        long currentTimeMillis = System.currentTimeMillis();
        long max = Math.max(j2, 16 + currentTimeMillis);
        this.h = max;
        final ffix ffixVar = this.i;
        Runnable runnable = new Runnable() { // from class: huj
            @Override // java.lang.Runnable
            public final void run() {
                Handler handler2 = huk.a;
                ffix.this.invoke();
            }
        };
        huk.a.postDelayed(runnable, max - currentTimeMillis);
        this.d = runnable;
    }

    public final void d(iui iuiVar) {
        long i = i(iuiVar);
        if (!jkz.b(i)) {
            h(iuiVar);
            return;
        }
        iuiVar.g = i;
        iuiVar.aC();
        hne s = iuiVar.s();
        Object[] objArr = s.a;
        int i2 = s.b;
        for (int i3 = 0; i3 < i2; i3++) {
            iui iuiVar2 = (iui) objArr[i3];
            e(iuiVar2, iuiVar2.z().x, false);
        }
        c(iuiVar);
    }

    public final void e(iui iuiVar, long j, boolean z) {
        char c;
        long j2;
        int i;
        long j3;
        int i2;
        char c2;
        int i3;
        long j4;
        char c3;
        int i4;
        char c4;
        long[] jArr;
        float[] m;
        int a;
        ivm x = iuiVar.x();
        int w = x.w();
        int v = x.v();
        iui u = iuiVar.u();
        long j5 = iuiVar.e;
        long j6 = iuiVar.f;
        long j7 = j6 >> 32;
        long j8 = j6 & 4294967295L;
        int i5 = 1;
        if (u != null) {
            char c5 = ' ';
            boolean z2 = u.h;
            j2 = 4294967295L;
            long j9 = u.e;
            boolean b = jkz.b(j9);
            i = 0;
            long j10 = u.g;
            if (!b) {
                iwi z3 = iuiVar.z();
                long j11 = 0;
                while (true) {
                    if (z3 == null) {
                        j3 = kab.c(j11);
                        c = c5;
                        break;
                    }
                    iwu iwuVar = z3.C;
                    j11 = kab.b(j11, z3.x);
                    z3 = z3.v;
                    if (iwuVar != null && (a = jkz.a((m = iwuVar.m()))) != 3) {
                        if ((a & 2) == 0) {
                            j3 = 9223372034707292159L;
                            c = c5;
                            break;
                        }
                        j11 = icm.a(m, j11);
                    }
                }
            } else {
                if (z2) {
                    j10 = i(u);
                    u.g = j10;
                    u.aC();
                }
                i2 = !jkz.b(j10) ? 1 : 0;
                j3 = kaa.d(kaa.d(j9, j10), j);
                c2 = c5;
                if (i2 == 0 || !jkz.b(j3)) {
                    g(iuiVar, j, z);
                }
                iuiVar.e = j3;
                iuiVar.f = (w << c2) | (v & j2);
                int a2 = kaa.a(j3);
                int b2 = kaa.b(j3);
                int i6 = a2 + w;
                int i7 = b2 + v;
                if (!z && kaa.f(j3, j5) && ((int) j7) == w && ((int) j8) == v) {
                    return;
                }
                int i8 = iuiVar.d;
                if (!z) {
                    jkw jkwVar = this.a;
                    int i9 = 67108863;
                    int i10 = i8 & 67108863;
                    long[] jArr2 = jkwVar.a;
                    int i11 = jkwVar.c;
                    int i12 = i;
                    while (i12 < jArr2.length - 2 && i12 < i11) {
                        int i13 = i12 + 2;
                        long j12 = jArr2[i13];
                        int i14 = i9;
                        if ((((int) j12) & i14) == i10) {
                            long j13 = jArr2[i12];
                            jArr2[i12] = (a2 << c2) | (b2 & j2);
                            jArr2[i12 + 1] = (i6 << c2) | (i7 & j2);
                            long j14 = 2305843009213693952L;
                            jArr2[i13] = j12 | 2305843009213693952L;
                            int i15 = b2 - ((int) j13);
                            if (((a2 - ((int) (j13 >> c2)) != 0 ? 1 : i) | (i15 != 0 ? 1 : i)) != 0) {
                                long j15 = -4503599560261633L;
                                long j16 = j12 & (-4503599560261633L);
                                long[] jArr3 = jkwVar.a;
                                long[] jArr4 = jkwVar.b;
                                int i16 = jkwVar.c / 3;
                                long j17 = (i12 + 3) & i14;
                                char c6 = 26;
                                jArr4[i] = j16 | (j17 << 26);
                                while (i5 > 0) {
                                    i5--;
                                    long j18 = jArr4[i5];
                                    int i17 = ((int) j18) & i14;
                                    int i18 = ((int) (j18 >> c6)) & i14;
                                    char c7 = 511;
                                    int i19 = ((int) (j18 >> 52)) & 511;
                                    if (i19 == 511) {
                                        j4 = j15;
                                        i3 = i16;
                                    } else {
                                        i3 = i19 + i18;
                                        j4 = j15;
                                    }
                                    while (i18 < jArr3.length - 2 && i18 < i3) {
                                        int i20 = i18 + 3;
                                        int i21 = i18 + 2;
                                        long j19 = jArr3[i21];
                                        long j20 = j14;
                                        if ((((int) (j19 >> c6)) & i14) == i17) {
                                            long j21 = jArr3[i18];
                                            int i22 = i18 + 1;
                                            c4 = c6;
                                            jArr = jArr3;
                                            long j22 = jArr[i22];
                                            i4 = i15;
                                            jArr[i18] = ((((int) j21) + i4) & j2) | ((((int) (j21 >> c2)) + r6) << c2);
                                            jArr[i22] = ((((int) j22) + i4) & j2) | ((((int) (j22 >> c2)) + r6) << c2);
                                            jArr[i21] = j19 | j20;
                                            c3 = 511;
                                            if ((((int) (j19 >> 52)) & 511) > 0) {
                                                jArr4[i5] = (j19 & j4) | ((i20 & i14) << c4);
                                                i5++;
                                            }
                                        } else {
                                            c3 = c7;
                                            i4 = i15;
                                            c4 = c6;
                                            jArr = jArr3;
                                        }
                                        c6 = c4;
                                        i18 = i20;
                                        c7 = c3;
                                        j14 = j20;
                                        jArr3 = jArr;
                                        i15 = i4;
                                    }
                                    c6 = c6;
                                    j15 = j4;
                                    j14 = j14;
                                    jArr3 = jArr3;
                                    i15 = i15;
                                }
                            }
                            b();
                            return;
                        }
                        i12 += 3;
                        i9 = i14;
                    }
                }
                iui u2 = iuiVar.u();
                jkw.a(this.a, i8, a2, b2, i6, i7, u2 != null ? u2.d : -1);
                b();
                return;
            }
        } else {
            c = ' ';
            j2 = 4294967295L;
            i = 0;
            j3 = j;
        }
        i2 = i;
        c2 = c;
        if (i2 == 0) {
        }
        g(iuiVar, j, z);
    }

    public final void f(iui iuiVar) {
        int i = iuiVar.d & 67108863;
        jkw jkwVar = this.a;
        long[] jArr = jkwVar.a;
        int i2 = jkwVar.c;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                break;
            }
            i3 += 3;
        }
        b();
        this.g = true;
    }

    public jky(byte[] bArr) {
        this.a = new jkw();
        this.b = new jlb();
        this.e = new cok((byte[]) null);
        this.h = -1L;
        this.i = new jkx(this);
        this.j = new iah();
    }
}
