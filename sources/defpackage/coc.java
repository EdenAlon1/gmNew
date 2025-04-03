package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coc extends cnj {
    private int f;

    public coc() {
        this((byte[]) null);
    }

    private final int h(long j) {
        long j2;
        int i;
        int i2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i3 = -862048943;
        int a = cob.a(j) * (-862048943);
        int i4 = a ^ (a << 16);
        int i5 = i4 >>> 7;
        int i6 = this.d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = jArr3[i9] >>> i10;
            int i11 = 1;
            long j5 = jArr3[i9 + 1] << (64 - i10);
            int i12 = i8;
            int i13 = 0;
            long j6 = i4 & 127;
            long j7 = (((-i10) >> 63) & j5) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (~j8) & ((-72340172838076673L) + j8) & (-9187201950435737472L);
            while (j9 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i7) & i6;
                int i14 = i3;
                if (this.b[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i3 = i14;
            }
            int i15 = i3;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int i16 = i(i5);
                if (this.f != 0 || ((this.a[i16 >> 3] >> ((i16 & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    i = 0;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i17 = this.d;
                    if (i17 > 8) {
                        j3 = 128;
                        if (Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i17 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            int i18 = this.d;
                            long[] jArr5 = this.b;
                            Object[] objArr = this.c;
                            int i19 = i18 + 7;
                            j2 = 255;
                            int i20 = 0;
                            while (i20 < (i19 >> 3)) {
                                long j10 = jArr4[i20] & (-9187201950435737472L);
                                jArr4[i20] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i20++;
                                i13 = i13;
                            }
                            i = i13;
                            int A = ffdo.A(jArr4);
                            int i21 = A - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i21] = (jArr4[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[A] = jArr4[i];
                            int i22 = i;
                            while (i22 != i18) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j12 = (jArr4[i23] >> i24) & 255;
                                if (j12 != 128 && j12 == 254) {
                                    int a2 = cob.a(jArr5[i22]) * i15;
                                    int i25 = a2 ^ (a2 << 16);
                                    int i26 = i25 & 127;
                                    int i27 = i25 >>> 7;
                                    int i28 = i(i27);
                                    int i29 = i27 & i18;
                                    long j13 = j11;
                                    int i30 = i11;
                                    long j14 = i26;
                                    if (((i28 - i29) & i18) / 8 == ((i22 - i29) & i18) / 8) {
                                        jArr4[i23] = (jArr4[i23] & (~(255 << i24))) | (j14 << i24);
                                        jArr4[ffdo.A(jArr4)] = (jArr4[i] & j13) | Long.MIN_VALUE;
                                        i22++;
                                        i11 = i30;
                                        j11 = j13;
                                    } else {
                                        int i31 = i28 >> 3;
                                        long j15 = jArr4[i31];
                                        int i32 = (i28 & 7) << 3;
                                        long j16 = j14 << i32;
                                        long j17 = (~(255 << i32)) & j15;
                                        if (((j15 >> i32) & 255) == 128) {
                                            long j18 = ~(255 << i24);
                                            jArr4[i31] = j17 | j16;
                                            jArr4[i23] = (j18 & jArr4[i23]) | (128 << i24);
                                            jArr5[i28] = jArr5[i22];
                                            jArr5[i22] = 0;
                                            objArr[i28] = objArr[i22];
                                            objArr[i22] = null;
                                        } else {
                                            jArr4[i31] = j17 | j16;
                                            long j19 = jArr5[i28];
                                            jArr5[i28] = jArr5[i22];
                                            jArr5[i22] = j19;
                                            Object obj = objArr[i28];
                                            objArr[i28] = objArr[i22];
                                            objArr[i22] = obj;
                                            i22--;
                                        }
                                        jArr4[ffdo.A(jArr4)] = (jArr4[i] & j13) | Long.MIN_VALUE;
                                        i22++;
                                        j11 = j13;
                                        i11 = i30;
                                    }
                                } else {
                                    i22++;
                                }
                            }
                            i2 = i11;
                            j();
                            i16 = i(i5);
                        }
                    } else {
                        j3 = 128;
                    }
                    j2 = 255;
                    i = 0;
                    i2 = 1;
                    int b = cpg.b(this.d);
                    long[] jArr6 = this.a;
                    long[] jArr7 = this.b;
                    Object[] objArr2 = this.c;
                    int i33 = this.d;
                    k(b);
                    long[] jArr8 = this.a;
                    long[] jArr9 = this.b;
                    Object[] objArr3 = this.c;
                    int i34 = this.d;
                    int i35 = 0;
                    while (i35 < i33) {
                        if (((jArr6[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j3) {
                            long j20 = jArr7[i35];
                            int a3 = cob.a(j20) * i15;
                            jArr = jArr8;
                            int i36 = i((a3 ^ (a3 << 16)) >>> 7);
                            int i37 = i36 >> 3;
                            int i38 = (i36 & 7) << 3;
                            jArr2 = jArr6;
                            long j21 = (jArr[i37] & (~(255 << i38))) | ((r15 & 127) << i38);
                            jArr[i37] = j21;
                            jArr[(((i36 - 7) & i34) + (i34 & 7)) >> 3] = j21;
                            jArr9[i36] = j20;
                            objArr3[i36] = objArr2[i35];
                        } else {
                            jArr = jArr8;
                            jArr2 = jArr6;
                        }
                        i35++;
                        jArr8 = jArr;
                        jArr6 = jArr2;
                    }
                    i16 = i(i5);
                }
                this.e++;
                int i39 = this.f;
                long[] jArr10 = this.a;
                int i40 = i16 >> 3;
                long j22 = jArr10[i40];
                int i41 = (i16 & 7) << 3;
                if (((j22 >> i41) & j2) != j3) {
                    i2 = i;
                }
                this.f = i39 - i2;
                int i42 = this.d;
                long j23 = (j6 << i41) | (j22 & (~(j2 << i41)));
                jArr10[i40] = j23;
                jArr10[(((i16 - 7) & i42) + (i42 & 7)) >> 3] = j23;
                return i16;
            }
            i8 = i12 + 8;
            i7 = (i7 + i8) & i6;
            i3 = i15;
        }
    }

    private final int i(int i) {
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

    private final void j() {
        this.f = cpg.a(this.d) - this.e;
    }

    private final void k(int i) {
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
        j();
        this.b = new long[max];
        this.c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = defpackage.cob.a(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r1 >>> 7
            int r3 = r0.d
            r2 = r2 & r3
            r4 = 0
        L13:
            r5 = r1 & 127(0x7f, float:1.78E-43)
            long[] r6 = r0.a
            r7 = r2 & 7
            int r8 = r2 >> 3
            r9 = r6[r8]
            int r7 = r7 << 3
            long r9 = r9 >>> r7
            int r8 = r8 + 1
            r11 = r6[r8]
            int r6 = 64 - r7
            long r11 = r11 << r6
            long r6 = (long) r7
            long r6 = -r6
            long r13 = (long) r5
            r5 = 63
            long r5 = r6 >> r5
            long r5 = r5 & r11
            long r5 = r5 | r9
            r7 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r7
            long r7 = r5 ^ r13
            r9 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r9 = r9 + r7
            long r7 = ~r7
            long r7 = r7 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L46:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            r14 = -1
            if (r13 == 0) goto L63
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r3
            long[] r12 = r0.b
            r15 = r12[r11]
            int r12 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r12 != 0) goto L5e
            goto L6d
        L5e:
            r11 = -1
            long r11 = r11 + r7
            long r7 = r7 & r11
            goto L46
        L63:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L9f
            r11 = r14
        L6d:
            r1 = 0
            if (r11 < 0) goto L9e
            int r2 = r0.e
            int r2 = r2 + r14
            r0.e = r2
            long[] r2 = r0.a
            int r3 = r0.d
            int r4 = r11 >> 3
            r5 = r2[r4]
            r7 = r11 & 7
            int r7 = r7 << 3
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 << r7
            long r8 = ~r8
            long r5 = r5 & r8
            r8 = 254(0xfe, double:1.255E-321)
            long r7 = r8 << r7
            long r5 = r5 | r7
            r2[r4] = r5
            int r4 = r11 + (-7)
            r4 = r4 & r3
            r3 = r3 & 7
            int r4 = r4 + r3
            int r3 = r4 >> 3
            r2[r3] = r5
            java.lang.Object[] r2 = r0.c
            r3 = r2[r11]
            r2[r11] = r1
            return r3
        L9e:
            return r1
        L9f:
            int r4 = r4 + 8
            int r2 = r2 + r4
            r2 = r2 & r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coc.d(long):java.lang.Object");
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
        j();
    }

    public final void f(long j, Object obj) {
        int h = h(j);
        this.b[h] = j;
        this.c[h] = obj;
    }

    public final void g(long j, Object obj) {
        int h = h(j);
        Object[] objArr = this.c;
        Object obj2 = objArr[h];
        this.b[h] = j;
        objArr[h] = obj;
    }

    public coc(int i) {
        k(cpg.d(i));
    }

    public /* synthetic */ coc(byte[] bArr) {
        this(6);
    }
}
