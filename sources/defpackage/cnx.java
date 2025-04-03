package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnx extends cna {
    private int e;

    public cnx() {
        this((byte[]) null);
    }

    private final int g(int i) {
        int i2 = this.c;
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
        this.e = cpg.a(this.c) - this.d;
    }

    private final void i(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, cpg.c(i)) : 0;
        this.c = max;
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
    }

    public final int b(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i3 = -862048943;
        int i4 = i * (-862048943);
        int i5 = i4 ^ (i4 << 16);
        int i6 = i5 >>> 7;
        int i7 = this.c;
        int i8 = i6 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = jArr3[i10] >>> i11;
            int i12 = 1;
            long j5 = jArr3[i10 + 1] << (64 - i11);
            int i13 = i3;
            int i14 = i5;
            long j6 = i5 & 127;
            long j7 = (j5 & ((-i11) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            for (long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i8) & i7;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
            }
            long j10 = j7 & ((~j7) << 6) & (-9187201950435737472L);
            int i15 = 8;
            if (j10 != 0) {
                int g = g(i6);
                long j11 = 255;
                if (this.e != 0 || ((this.a[g >> 3] >> ((g & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i16 = this.c;
                    if (i16 > 8) {
                        j3 = 128;
                        if (Long.compare((this.d * 32) ^ Long.MIN_VALUE, (i16 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            int i17 = this.c;
                            int[] iArr = this.b;
                            int i18 = i17 + 7;
                            int i19 = 0;
                            while (i19 < (i18 >> 3)) {
                                long j12 = jArr4[i19] & (-9187201950435737472L);
                                jArr4[i19] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i19++;
                                i15 = i15;
                                j11 = j11;
                            }
                            int i20 = i15;
                            j2 = j11;
                            int A = ffdo.A(jArr4);
                            int i21 = A - 1;
                            jArr4[i21] = (jArr4[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[A] = jArr4[0];
                            int i22 = 0;
                            while (i22 != i17) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j13 = (jArr4[i23] >> i24) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    int i25 = iArr[i22] * i13;
                                    int i26 = i25 ^ (i25 << 16);
                                    int i27 = i26 & 127;
                                    int i28 = i26 >>> 7;
                                    int g2 = g(i28);
                                    int i29 = i28 & i17;
                                    int i30 = i13;
                                    int i31 = ((g2 - i29) & i17) / 8;
                                    int i32 = ((i22 - i29) & i17) / i20;
                                    int i33 = i20;
                                    int i34 = i12;
                                    long j14 = i27;
                                    if (i31 == i32) {
                                        jArr4[i23] = ((~(j2 << i24)) & jArr4[i23]) | (j14 << i24);
                                        jArr4[ffdo.A(jArr4)] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i22++;
                                        i12 = i34;
                                        i13 = i30;
                                        i20 = i33;
                                    } else {
                                        int i35 = g2 >> 3;
                                        long j15 = jArr4[i35];
                                        int i36 = (g2 & 7) << 3;
                                        long j16 = j14 << i36;
                                        long j17 = j6;
                                        long[] jArr5 = jArr4;
                                        long j18 = j15 & (~(j2 << i36));
                                        if (((j15 >> i36) & j2) == 128) {
                                            long j19 = ~(j2 << i24);
                                            jArr5[i35] = j18 | j16;
                                            jArr5[i23] = (j19 & jArr5[i23]) | (128 << i24);
                                            iArr[g2] = iArr[i22];
                                            iArr[i22] = 0;
                                        } else {
                                            jArr5[i35] = j18 | j16;
                                            int i37 = iArr[g2];
                                            iArr[g2] = iArr[i22];
                                            iArr[i22] = i37;
                                            i22--;
                                        }
                                        jArr5[ffdo.A(jArr5)] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i22++;
                                        jArr4 = jArr5;
                                        i12 = i34;
                                        i13 = i30;
                                        i20 = i33;
                                        j6 = j17;
                                    }
                                } else {
                                    i22++;
                                }
                            }
                            j = j6;
                            i2 = i12;
                            h();
                            g = g(i6);
                        }
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    i2 = 1;
                    int b = cpg.b(this.c);
                    long[] jArr6 = this.a;
                    int[] iArr2 = this.b;
                    int i38 = this.c;
                    i(b);
                    long[] jArr7 = this.a;
                    int[] iArr3 = this.b;
                    int i39 = this.c;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr6[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < j3) {
                            int i41 = iArr2[i40];
                            int i42 = i41 * i13;
                            int g3 = g((i42 ^ (i42 << 16)) >>> 7);
                            int i43 = g3 >> 3;
                            int i44 = (g3 & 7) << 3;
                            jArr = jArr7;
                            jArr2 = jArr6;
                            long j20 = ((~(255 << i44)) & jArr7[i43]) | ((r10 & 127) << i44);
                            jArr[i43] = j20;
                            jArr[(((g3 - 7) & i39) + (i39 & 7)) >> 3] = j20;
                            iArr3[g3] = i41;
                        } else {
                            jArr = jArr7;
                            jArr2 = jArr6;
                        }
                        i40++;
                        jArr6 = jArr2;
                        jArr7 = jArr;
                    }
                    g = g(i6);
                }
                this.d++;
                int i45 = this.e;
                long[] jArr8 = this.a;
                int i46 = g >> 3;
                long j21 = jArr8[i46];
                int i47 = (g & 7) << 3;
                if (((j21 >> i47) & j2) != j3) {
                    i2 = 0;
                }
                this.e = i45 - i2;
                int i48 = this.c;
                long j22 = (j21 & (~(j2 << i47))) | (j << i47);
                jArr8[i46] = j22;
                jArr8[(((g - 7) & i48) + (i48 & 7)) >> 3] = j22;
                return g;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i5 = i14;
            i3 = i13;
        }
    }

    public final void c() {
        this.d = 0;
        if (this.a != cpg.a) {
            ffdo.s(r0, -9187201950435737472L, this.a.length);
            long[] jArr = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        h();
    }

    public final void d(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.c;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
    }

    public final boolean e(int i) {
        int i2 = this.d;
        this.b[b(i)] = i;
        return this.d != i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r2 = r2 * r1
            int r3 = r2 << 16
            r2 = r2 ^ r3
            int r3 = r2 >>> 7
            int r4 = r0.c
            r3 = r3 & r4
            r6 = 0
        L11:
            r7 = r2 & 127(0x7f, float:1.78E-43)
            long[] r8 = r0.a
            r9 = r3 & 7
            int r10 = r3 >> 3
            r11 = r8[r10]
            int r9 = r9 << 3
            long r11 = r11 >>> r9
            r13 = 1
            int r10 = r10 + r13
            r14 = r8[r10]
            int r8 = 64 - r9
            long r14 = r14 << r8
            long r8 = (long) r9
            long r8 = -r8
            r16 = r6
            long r5 = (long) r7
            r7 = 63
            long r7 = r8 >> r7
            long r7 = r7 & r14
            long r7 = r7 | r11
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r5 = r5 * r11
            long r5 = r5 ^ r7
            r11 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r11 = r11 + r5
            long r5 = ~r5
            long r5 = r5 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r11
        L45:
            r14 = 0
            int r9 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r9 == 0) goto L5f
            int r9 = java.lang.Long.numberOfTrailingZeros(r5)
            int r9 = r9 >> 3
            int r9 = r9 + r3
            r9 = r9 & r4
            int[] r14 = r0.b
            r14 = r14[r9]
            if (r14 != r1) goto L5a
            goto L69
        L5a:
            r14 = -1
            long r14 = r14 + r5
            long r5 = r5 & r14
            goto L45
        L5f:
            long r5 = ~r7
            r9 = 6
            long r5 = r5 << r9
            long r5 = r5 & r7
            long r5 = r5 & r11
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 == 0) goto L74
            r9 = -1
        L69:
            if (r9 < 0) goto L6d
            r5 = r13
            goto L6e
        L6d:
            r5 = 0
        L6e:
            if (r5 == 0) goto L73
            r0.d(r9)
        L73:
            return r5
        L74:
            int r6 = r16 + 8
            int r3 = r3 + r6
            r3 = r3 & r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnx.f(int):boolean");
    }

    public cnx(int i) {
        if (i < 0) {
            cpx.a("Capacity must be a positive value.");
        }
        i(cpg.d(i));
    }

    public /* synthetic */ cnx(byte[] bArr) {
        this(6);
    }
}
