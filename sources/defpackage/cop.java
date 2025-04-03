package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cop extends cpf {
    private int f;

    public cop() {
        this((byte[]) null);
    }

    private final int l(int i) {
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

    private final void m() {
        this.f = cpg.a(this.d) - this.e;
    }

    private final void n(int i) {
        long[] jArr;
        Object[] objArr;
        int i2 = 0;
        int max = i > 0 ? Math.max(7, cpg.c(i)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = cpg.a;
        } else {
            jArr = new long[(max + 15) >> 3];
            ffdo.s(jArr, -9187201950435737472L, jArr.length);
            int i3 = max >> 3;
            long j = 255 << ((max & 7) << 3);
            jArr[i3] = (jArr[i3] & (~j)) | j;
        }
        this.a = jArr;
        m();
        if (max == 0) {
            objArr = cpu.c;
        } else {
            i2 = max;
            objArr = new Object[max];
        }
        this.b = objArr;
        this.c = i2 == 0 ? cpu.c : new Object[i2];
    }

    public final int a(Object obj) {
        long j;
        long j2;
        int i;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = this.d;
        int i6 = i4 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j4 = jArr3[i8] >>> i9;
            long j5 = jArr3[i8 + 1] << (64 - i9);
            int i10 = i3;
            int i11 = 0;
            long j6 = i3 & 127;
            long j7 = (j5 & ((-i9) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i6) & i5;
                int i12 = i2;
                if (ffkj.e(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i2 = i12;
            }
            int i13 = i2;
            long j10 = j7 & ((~j7) << 6) & (-9187201950435737472L);
            char c = '\b';
            if (j10 != 0) {
                int l = l(i4);
                long j11 = 255;
                if (this.f != 0 || ((this.a[l >> 3] >> ((l & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    i = 0;
                    j3 = 128;
                } else {
                    int i14 = this.d;
                    if (i14 > 8) {
                        j3 = 128;
                        if (Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i14 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            int i15 = this.d;
                            Object[] objArr = this.b;
                            Object[] objArr2 = this.c;
                            int i16 = i15 + 7;
                            int i17 = 0;
                            while (i17 < (i16 >> 3)) {
                                char c2 = c;
                                long j12 = jArr4[i17] & (-9187201950435737472L);
                                jArr4[i17] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i17++;
                                i16 = i16;
                                i11 = i11;
                                c = c2;
                                j11 = j11;
                            }
                            j2 = j11;
                            int i18 = i11;
                            int A = ffdo.A(jArr4);
                            int i19 = A - 1;
                            jArr4[i19] = (jArr4[i19] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[A] = jArr4[i18];
                            int i20 = i18;
                            while (i20 != i15) {
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                long j13 = (jArr4[i21] >> i22) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    Object obj2 = objArr[i20];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : i18) * i13;
                                    int i23 = hashCode2 ^ (hashCode2 << 16);
                                    int i24 = i23 & 127;
                                    int i25 = i23 >>> 7;
                                    int l2 = l(i25);
                                    int i26 = i25 & i15;
                                    int i27 = i18;
                                    long j14 = j6;
                                    long[] jArr5 = jArr4;
                                    long j15 = i24;
                                    if (((l2 - i26) & i15) / 8 == ((i20 - i26) & i15) / 8) {
                                        jArr5[i21] = (j15 << i22) | ((~(j2 << i22)) & jArr5[i21]);
                                        jArr5[ffdo.A(jArr5)] = jArr5[i27];
                                        i20++;
                                    } else {
                                        int i28 = l2 >> 3;
                                        long j16 = jArr5[i28];
                                        int i29 = (l2 & 7) << 3;
                                        long j17 = j15 << i29;
                                        long j18 = (~(j2 << i29)) & j16;
                                        if (((j16 >> i29) & j2) == 128) {
                                            long j19 = ~(j2 << i22);
                                            jArr5[i28] = j18 | j17;
                                            jArr5[i21] = (jArr5[i21] & j19) | (128 << i22);
                                            objArr[l2] = objArr[i20];
                                            objArr[i20] = null;
                                            objArr2[l2] = objArr2[i20];
                                            objArr2[i20] = null;
                                        } else {
                                            jArr5[i28] = j18 | j17;
                                            Object obj3 = objArr[l2];
                                            objArr[l2] = objArr[i20];
                                            objArr[i20] = obj3;
                                            Object obj4 = objArr2[l2];
                                            objArr2[l2] = objArr2[i20];
                                            objArr2[i20] = obj4;
                                            i20--;
                                        }
                                        jArr5[ffdo.A(jArr5)] = jArr5[i27];
                                        i20++;
                                    }
                                    jArr4 = jArr5;
                                    i18 = i27;
                                    j6 = j14;
                                } else {
                                    i20++;
                                }
                            }
                            j = j6;
                            i = i18;
                            m();
                            l = l(i4);
                        }
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    i = 0;
                    int b = cpg.b(this.d);
                    long[] jArr6 = this.a;
                    Object[] objArr3 = this.b;
                    Object[] objArr4 = this.c;
                    int i30 = this.d;
                    n(b);
                    long[] jArr7 = this.a;
                    Object[] objArr5 = this.b;
                    Object[] objArr6 = this.c;
                    int i31 = this.d;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr6[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < j3) {
                            Object obj5 = objArr3[i32];
                            int hashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i13;
                            int l3 = l((hashCode3 ^ (hashCode3 << 16)) >>> 7);
                            int i33 = l3 >> 3;
                            int i34 = (l3 & 7) << 3;
                            jArr = jArr7;
                            jArr2 = jArr6;
                            long j20 = (jArr7[i33] & (~(255 << i34))) | ((r12 & 127) << i34);
                            jArr[i33] = j20;
                            jArr[(((l3 - 7) & i31) + (i31 & 7)) >> 3] = j20;
                            objArr5[l3] = obj5;
                            objArr6[l3] = objArr4[i32];
                        } else {
                            jArr = jArr7;
                            jArr2 = jArr6;
                        }
                        i32++;
                        jArr6 = jArr2;
                        jArr7 = jArr;
                    }
                    l = l(i4);
                }
                this.e++;
                int i35 = this.f;
                long[] jArr8 = this.a;
                int i36 = l >> 3;
                long j21 = jArr8[i36];
                int i37 = (l & 7) << 3;
                this.f = i35 - (((j21 >> i37) & j2) != j3 ? i : 1);
                int i38 = this.d;
                long j22 = (j21 & (~(j2 << i37))) | (j << i37);
                jArr8[i36] = j22;
                jArr8[(((l - 7) & i38) + (i38 & 7)) >> 3] = j22;
                return ~l;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i3 = i10;
            i2 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 == 0) goto L8
            int r1 = r15.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            int r2 = r14.d
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r3
            int r3 = r1 << 16
            r1 = r1 ^ r3
            int r3 = r1 >>> 7
        L14:
            r3 = r3 & r2
            r4 = r1 & 127(0x7f, float:1.78E-43)
            long[] r5 = r14.a
            r6 = r3 & 7
            int r7 = r3 >> 3
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
        L48:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L66
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r3
            r10 = r10 & r2
            java.lang.Object[] r11 = r14.b
            r11 = r11[r10]
            boolean r11 = defpackage.ffkj.e(r11, r15)
            if (r11 == 0) goto L61
            goto L70
        L61:
            r10 = -1
            long r10 = r10 + r6
            long r6 = r6 & r10
            goto L48
        L66:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L79
            r10 = -1
        L70:
            if (r10 < 0) goto L77
            java.lang.Object r15 = r14.c(r10)
            return r15
        L77:
            r15 = 0
            return r15
        L79:
            int r0 = r0 + 8
            int r3 = r3 + r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cop.b(java.lang.Object):java.lang.Object");
    }

    public final Object c(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.d;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void d() {
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
        ffdo.d(this.b, null, 0, this.d);
        m();
    }

    public final void e(Object obj, Object obj2) {
        int a = a(obj);
        if (a < 0) {
            a = ~a;
        }
        this.b[a] = obj;
        this.c[a] = obj2;
    }

    public cop(int i) {
        if (i < 0) {
            cpx.a("Capacity must be a positive value.");
        }
        n(cpg.d(i));
    }

    public /* synthetic */ cop(byte[] bArr) {
        this(6);
    }
}
