package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnw extends cmy {
    private int f;

    public cnw() {
        this((byte[]) null);
    }

    private final int g(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final void h() {
        this.f = cpg.a(this.d) - this.e;
    }

    private final void i(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, cpg.c(i)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = cpg.a;
        } else {
            jArr = new long[(max + 15) >> 3];
            ffdo.s(jArr, -9187201950435737472L, jArr.length);
        }
        this.a = jArr;
        long[] jArr2 = this.a;
        int i2 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr2[i2] = (jArr2[i2] & (~j)) | j;
        h();
        this.b = new int[max];
        this.c = new Object[max];
    }

    public final int c(int i) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2 = -862048943;
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 >>> 7;
        int i6 = this.d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = jArr3[i9] >>> i10;
            long j5 = jArr3[i9 + 1] << (64 - i10);
            int i11 = i2;
            int i12 = i4;
            long j6 = i4 & 127;
            long j7 = (j5 & ((-i10) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            for (long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i7) & i6;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
            }
            long j10 = j7 & ((~j7) << 6) & (-9187201950435737472L);
            char c = '\b';
            if (j10 != 0) {
                int g = g(i5);
                long j11 = 255;
                if (this.f != 0 || ((this.a[g >> 3] >> ((g & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i13 = this.d;
                    if (i13 > 8) {
                        j3 = 128;
                        if (Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i13 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            int i14 = this.d;
                            int[] iArr = this.b;
                            Object[] objArr = this.c;
                            int i15 = i14 + 7;
                            int i16 = 0;
                            while (i16 < (i15 >> 3)) {
                                char c2 = c;
                                long j12 = jArr4[i16] & (-9187201950435737472L);
                                jArr4[i16] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i16++;
                                i15 = i15;
                                i11 = i11;
                                c = c2;
                                j11 = j11;
                            }
                            j2 = j11;
                            int i17 = i11;
                            int A = ffdo.A(jArr4);
                            int i18 = A - 1;
                            jArr4[i18] = (jArr4[i18] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[A] = jArr4[0];
                            int i19 = 0;
                            while (i19 != i14) {
                                int i20 = i19 >> 3;
                                int i21 = (i19 & 7) << 3;
                                long j13 = (jArr4[i20] >> i21) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    int i22 = iArr[i19] * i17;
                                    int i23 = i22 ^ (i22 << 16);
                                    int i24 = i23 & 127;
                                    int i25 = i23 >>> 7;
                                    int g2 = g(i25);
                                    int i26 = i25 & i14;
                                    int i27 = i17;
                                    long j14 = j6;
                                    long[] jArr5 = jArr4;
                                    long j15 = i24;
                                    if (((g2 - i26) & i14) / 8 == ((i19 - i26) & i14) / 8) {
                                        jArr5[i20] = (j15 << i21) | ((~(j2 << i21)) & jArr5[i20]);
                                        jArr5[ffdo.A(jArr5)] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i19++;
                                    } else {
                                        int i28 = g2 >> 3;
                                        long j16 = jArr5[i28];
                                        int i29 = (g2 & 7) << 3;
                                        long j17 = j15 << i29;
                                        long j18 = (~(j2 << i29)) & j16;
                                        if (((j16 >> i29) & j2) == 128) {
                                            long j19 = ~(j2 << i21);
                                            jArr5[i28] = j18 | j17;
                                            jArr5[i20] = (jArr5[i20] & j19) | (128 << i21);
                                            iArr[g2] = iArr[i19];
                                            iArr[i19] = 0;
                                            objArr[g2] = objArr[i19];
                                            objArr[i19] = null;
                                        } else {
                                            jArr5[i28] = j18 | j17;
                                            int i30 = iArr[g2];
                                            iArr[g2] = iArr[i19];
                                            iArr[i19] = i30;
                                            Object obj = objArr[g2];
                                            objArr[g2] = objArr[i19];
                                            objArr[i19] = obj;
                                            i19--;
                                        }
                                        jArr5[ffdo.A(jArr5)] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i19++;
                                    }
                                    jArr4 = jArr5;
                                    i17 = i27;
                                    j6 = j14;
                                } else {
                                    i19++;
                                }
                            }
                            j = j6;
                            h();
                            g = g(i5);
                        }
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    int b = cpg.b(this.d);
                    long[] jArr6 = this.a;
                    int[] iArr2 = this.b;
                    Object[] objArr2 = this.c;
                    int i31 = this.d;
                    i(b);
                    long[] jArr7 = this.a;
                    int[] iArr3 = this.b;
                    Object[] objArr3 = this.c;
                    int i32 = this.d;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr6[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < j3) {
                            int i34 = iArr2[i33];
                            int i35 = i34 * i11;
                            int g3 = g((i35 ^ (i35 << 16)) >>> 7);
                            int i36 = g3 >> 3;
                            int i37 = (g3 & 7) << 3;
                            jArr = jArr7;
                            jArr2 = jArr6;
                            long j20 = (jArr7[i36] & (~(255 << i37))) | ((r12 & 127) << i37);
                            jArr[i36] = j20;
                            jArr[(((g3 - 7) & i32) + (i32 & 7)) >> 3] = j20;
                            iArr3[g3] = i34;
                            objArr3[g3] = objArr2[i33];
                        } else {
                            jArr = jArr7;
                            jArr2 = jArr6;
                        }
                        i33++;
                        jArr6 = jArr2;
                        jArr7 = jArr;
                    }
                    g = g(i5);
                }
                this.e++;
                int i38 = this.f;
                long[] jArr8 = this.a;
                int i39 = g >> 3;
                long j21 = jArr8[i39];
                int i40 = (g & 7) << 3;
                this.f = i38 - (((j21 >> i40) & j2) != j3 ? 0 : 1);
                int i41 = this.d;
                long j22 = (j21 & (~(j2 << i40))) | (j << i40);
                jArr8[i39] = j22;
                jArr8[(((g - 7) & i41) + (i41 & 7)) >> 3] = j22;
                return g;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i4 = i12;
            i2 = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r15) {
        /*
            r14 = this;
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r15
            int r1 = r0 << 16
            r0 = r0 ^ r1
            int r1 = r0 >>> 7
            int r2 = r14.d
            r1 = r1 & r2
            r3 = 0
        Ld:
            r4 = r0 & 127(0x7f, float:1.78E-43)
            long[] r5 = r14.a
            r6 = r1 & 7
            int r7 = r1 >> 3
            r8 = r5[r7]
            int r6 = r6 << 3
            long r8 = r8 >>> r6
            int r7 = r7 + 1
            r10 = r5[r7]
            int r5 = 64 - r6
            long r10 = r10 << r5
            long r5 = (long) r6
            long r5 = -r5
            long r12 = (long) r4
            r4 = 63
            long r4 = r5 >> r4
            long r4 = r4 & r10
            long r4 = r4 | r8
            r6 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r12 = r12 * r6
            long r6 = r4 ^ r12
            r8 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r8 = r8 + r6
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L40:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r13 = -1
            if (r12 == 0) goto L5b
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r2
            int[] r11 = r14.b
            r11 = r11[r10]
            if (r11 != r15) goto L56
            goto L65
        L56:
            r10 = -1
            long r10 = r10 + r6
            long r6 = r6 & r10
            goto L40
        L5b:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L97
            r10 = r13
        L65:
            r15 = 0
            if (r10 < 0) goto L96
            int r0 = r14.e
            int r0 = r0 + r13
            r14.e = r0
            long[] r0 = r14.a
            int r1 = r14.d
            int r2 = r10 >> 3
            r3 = r0[r2]
            r5 = r10 & 7
            int r5 = r5 << 3
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r5
            long r6 = ~r6
            long r3 = r3 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r5 = r6 << r5
            long r3 = r3 | r5
            r0[r2] = r3
            int r2 = r10 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r3
            java.lang.Object[] r0 = r14.c
            r1 = r0[r10]
            r0[r10] = r15
            return r1
        L96:
            return r15
        L97:
            int r3 = r3 + 8
            int r1 = r1 + r3
            r1 = r1 & r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnw.d(int):java.lang.Object");
    }

    public final void e() {
        this.e = 0;
        if (this.a != cpg.a) {
            ffdo.s(r1, -9187201950435737472L, this.a.length);
            long[] jArr = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        ffdo.d(this.c, null, 0, this.d);
        h();
    }

    public final void f(int i, Object obj) {
        int c = c(i);
        this.b[c] = i;
        this.c[c] = obj;
    }

    public cnw(int i) {
        if (i < 0) {
            cpx.a("Capacity must be a positive value.");
        }
        i(cpg.d(i));
    }

    public /* synthetic */ cnw(byte[] bArr) {
        this(6);
    }
}
