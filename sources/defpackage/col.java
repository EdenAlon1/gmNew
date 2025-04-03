package defpackage;

import androidx.car.app.model.Alert;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class col extends cpb {
    private int h;

    public col() {
        this((byte[]) null);
    }

    private final int i(int i) {
        int i2 = this.f;
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
        this.h = cpg.a(this.f) - this.g;
    }

    private final void k(int i) {
        long[] jArr;
        int i2;
        Object[] objArr;
        long[] jArr2;
        int i3 = 0;
        int max = i > 0 ? Math.max(7, cpg.c(i)) : 0;
        this.f = max;
        if (max == 0) {
            jArr = cpg.a;
            i2 = 0;
        } else {
            jArr = new long[(max + 15) >> 3];
            ffdo.s(jArr, -9187201950435737472L, jArr.length);
            i2 = max;
        }
        this.a = jArr;
        long[] jArr3 = this.a;
        int i4 = i2 >> 3;
        long j = 255 << ((7 & i2) << 3);
        jArr3[i4] = (jArr3[i4] & (~j)) | j;
        j();
        if (max == 0) {
            objArr = cpu.c;
        } else {
            i3 = max;
            objArr = new Object[max];
        }
        this.b = objArr;
        if (i3 == 0) {
            jArr2 = cpm.a;
        } else {
            jArr2 = new long[i3];
            ffdo.s(jArr2, 4611686018427387903L, jArr2.length);
        }
        this.c = jArr2;
    }

    public final int a(Object obj) {
        long j;
        long j2;
        int i;
        long j3;
        int i2;
        long[] jArr;
        long[] jArr2;
        int i3;
        int i4 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = this.f;
        int i8 = i6 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = jArr3[i10] >>> i11;
            long j5 = jArr3[i10 + 1] << (64 - i11);
            int i12 = i5;
            int i13 = 0;
            long j6 = i5 & 127;
            long j7 = (j5 & ((-i11) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i8) & i7;
                int i14 = i4;
                if (ffkj.e(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i4 = i14;
            }
            int i15 = i4;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int i16 = i(i6);
                if (this.h != 0 || ((this.a[i16 >> 3] >> ((i16 & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    i = 0;
                    j3 = 128;
                } else {
                    int i17 = this.f;
                    j3 = 128;
                    if (i17 > 8 && Long.compare((this.g * 32) ^ Long.MIN_VALUE, (i17 * 25) ^ Long.MIN_VALUE) <= 0) {
                        long[] jArr4 = this.a;
                        if (jArr4 == null) {
                            j = j6;
                            i3 = i6;
                            j2 = 255;
                            i = 0;
                            i16 = i(i3);
                        } else {
                            int i18 = this.f;
                            Object[] objArr = this.b;
                            long[] jArr5 = this.c;
                            long[] jArr6 = new long[i18];
                            j2 = 255;
                            ffdo.s(jArr6, 9223372034707292159L, i18);
                            int i19 = (i18 + 7) >> 3;
                            int i20 = 0;
                            while (i20 < i19) {
                                int i21 = i13;
                                long j10 = jArr4[i20] & (-9187201950435737472L);
                                jArr4[i20] = ((~j10) + (j10 >>> 7)) & (-72340172838076674L);
                                i20++;
                                i6 = i6;
                                i13 = i21;
                            }
                            int i22 = i6;
                            i = i13;
                            int A = ffdo.A(jArr4);
                            int i23 = A - 1;
                            jArr4[i23] = (jArr4[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[A] = jArr4[i];
                            int i24 = i;
                            while (i24 != i18) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j11 = (jArr4[i25] >> i26) & 255;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj2 = objArr[i24];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : i) * i15;
                                    int i27 = hashCode2 ^ (hashCode2 << 16);
                                    int i28 = i27 & 127;
                                    int i29 = i27 >>> 7;
                                    int i30 = i(i29);
                                    int i31 = i29 & i18;
                                    long j12 = j6;
                                    long j13 = i28;
                                    if (((i30 - i31) & i18) / 8 == ((i24 - i31) & i18) / 8) {
                                        int i32 = i24 + 1;
                                        jArr4[i25] = (j13 << i26) | (jArr4[i25] & (~(255 << i26)));
                                        if (jArr6[i24] == 9223372034707292159L) {
                                            long j14 = i24;
                                            jArr6[i24] = j14 | (j14 << 32);
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[i];
                                        i24 = i32;
                                    } else {
                                        long j15 = i24;
                                        int i33 = i22;
                                        long j16 = i30;
                                        int i34 = i30 >> 3;
                                        long j17 = jArr4[i34];
                                        int i35 = (i30 & 7) << 3;
                                        long j18 = j13 << i35;
                                        long j19 = j17 & (~(255 << i35));
                                        if (((j17 >> i35) & 255) == 128) {
                                            long j20 = j15 << 32;
                                            long j21 = ~(255 << i26);
                                            jArr4[i34] = j19 | j18;
                                            jArr4[i25] = (jArr4[i25] & j21) | (128 << i26);
                                            objArr[i30] = objArr[i24];
                                            objArr[i24] = null;
                                            jArr5[i30] = jArr5[i24];
                                            jArr5[i24] = 4611686018427387903L;
                                            int i36 = (int) ((jArr6[i24] >> 32) & 4294967295L);
                                            if (i36 != Integer.MAX_VALUE) {
                                                jArr6[i36] = (jArr6[i36] & (-4294967296L)) | j16;
                                                jArr6[i24] = (jArr6[i24] & 4294967295L) | (-4294967296L);
                                            } else {
                                                jArr6[i24] = 9223372032559808512L | j16;
                                            }
                                            jArr6[i30] = j20 | 2147483647L;
                                        } else {
                                            long j22 = j16 << 32;
                                            jArr4[i34] = j19 | j18;
                                            Object obj3 = objArr[i30];
                                            objArr[i30] = objArr[i24];
                                            objArr[i24] = obj3;
                                            long j23 = jArr5[i30];
                                            jArr5[i30] = jArr5[i24];
                                            jArr5[i24] = j23;
                                            int i37 = (int) ((jArr6[i24] >> 32) & 4294967295L);
                                            if (i37 != Integer.MAX_VALUE) {
                                                jArr6[i37] = (jArr6[i37] & (-4294967296L)) | j16;
                                                jArr6[i24] = j22 | (jArr6[i24] & 4294967295L);
                                            } else {
                                                jArr6[i24] = j22 | j16;
                                                i37 = i24;
                                            }
                                            jArr6[i30] = (i37 << 32) | j15;
                                            i24--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[i];
                                        i24++;
                                        i22 = i33;
                                    }
                                    j6 = j12;
                                } else {
                                    i24++;
                                }
                            }
                            j = j6;
                            i2 = i22;
                            j();
                            long[] jArr7 = this.c;
                            int length = jArr7.length;
                            for (int i38 = i; i38 < length; i38++) {
                                long j24 = jArr7[i38];
                                jArr7[i38] = (((j24 & (-4611686018427387904L)) | (((int) ((j24 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r6] & 4294967295L))) << 31) | (((int) (j24 & 2147483647L)) == Integer.MAX_VALUE ? Alert.DURATION_SHOW_INDEFINITELY : (int) (jArr6[r8] & 4294967295L));
                            }
                            int i39 = this.d;
                            if (i39 != Integer.MAX_VALUE) {
                                this.d = (int) (jArr6[i39] & 4294967295L);
                            }
                            int i40 = this.e;
                            if (i40 != Integer.MAX_VALUE) {
                                this.e = (int) (jArr6[i40] & 4294967295L);
                            }
                            i3 = i2;
                            i16 = i(i3);
                        }
                    }
                    j = j6;
                    i2 = i6;
                    j2 = 255;
                    i = 0;
                    int b = cpg.b(this.f);
                    long[] jArr8 = this.a;
                    Object[] objArr2 = this.b;
                    long[] jArr9 = this.c;
                    int i41 = this.f;
                    int[] iArr = new int[i41];
                    k(b);
                    long[] jArr10 = this.a;
                    Object[] objArr3 = this.b;
                    long[] jArr11 = this.c;
                    int i42 = this.f;
                    int i43 = 0;
                    while (i43 < i41) {
                        if (((jArr8[i43 >> 3] >> ((i43 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr2[i43];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i15;
                            int i44 = i((hashCode3 ^ (hashCode3 << 16)) >>> 7);
                            int i45 = i44 >> 3;
                            int i46 = (i44 & 7) << 3;
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j25 = (jArr10[i45] & (~(255 << i46))) | ((r12 & 127) << i46);
                            jArr[i45] = j25;
                            jArr[(((i44 - 7) & i42) + (i42 & 7)) >> 3] = j25;
                            objArr3[i44] = obj4;
                            jArr11[i44] = jArr9[i43];
                            iArr[i43] = i44;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i43++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.c;
                    int length2 = jArr12.length;
                    for (int i47 = 0; i47 < length2; i47++) {
                        long j26 = jArr12[i47];
                        jArr12[i47] = (((j26 & (-4611686018427387904L)) | (((int) ((j26 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r7])) << 31) | (((int) (j26 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r9]);
                    }
                    int i48 = this.d;
                    if (i48 != Integer.MAX_VALUE) {
                        this.d = iArr[i48];
                    }
                    int i49 = this.e;
                    if (i49 != Integer.MAX_VALUE) {
                        this.e = iArr[i49];
                    }
                    i3 = i2;
                    i16 = i(i3);
                }
                this.g++;
                int i50 = this.h;
                long[] jArr13 = this.a;
                int i51 = i16 >> 3;
                long j27 = jArr13[i51];
                int i52 = (i16 & 7) << 3;
                this.h = i50 - (((j27 >> i52) & j2) != j3 ? i : 1);
                int i53 = this.f;
                long j28 = (j27 & (~(j2 << i52))) | (j << i52);
                jArr13[i51] = j28;
                jArr13[(((i16 - 7) & i53) + (i53 & 7)) >> 3] = j28;
                return i16;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i5 = i12;
            i4 = i15;
        }
    }

    public final void b() {
        this.g = 0;
        if (this.a != cpg.a) {
            ffdo.s(r1, -9187201950435737472L, this.a.length);
            long[] jArr = this.a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        ffdo.d(this.b, null, 0, this.f);
        ffdo.s(r0, 4611686018427387903L, this.c.length);
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = Alert.DURATION_SHOW_INDEFINITELY;
        j();
    }

    public final void c(int i) {
        this.g--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.f;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | i6;
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = (i5 << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final boolean d(Object obj) {
        int i = this.g;
        int a = a(obj);
        this.b[a] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[a] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((2147483647L & a) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.d = a;
        if (this.e == Integer.MAX_VALUE) {
            this.e = a;
        }
        return this.g != i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r1 == 0) goto Lb
            int r3 = r1.hashCode()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            int r4 = r0.f
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r5
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r5 = r5 & r4
            r6 = 0
        L19:
            r7 = r3 & 127(0x7f, float:1.78E-43)
            long[] r8 = r0.a
            r9 = r5 & 7
            int r10 = r5 >> 3
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
            r16 = r3
            long r2 = (long) r7
            r7 = 63
            long r7 = r8 >> r7
            long r7 = r7 & r14
            long r7 = r7 | r11
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r11
            long r2 = r2 ^ r7
            r11 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r11 = r11 + r2
            long r2 = ~r2
            long r2 = r2 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r11
        L4d:
            r14 = 0
            int r9 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r9 == 0) goto L6b
            int r9 = java.lang.Long.numberOfTrailingZeros(r2)
            int r9 = r9 >> 3
            int r9 = r9 + r5
            r9 = r9 & r4
            java.lang.Object[] r14 = r0.b
            r14 = r14[r9]
            boolean r14 = defpackage.ffkj.e(r14, r1)
            if (r14 == 0) goto L66
            goto L75
        L66:
            r14 = -1
            long r14 = r14 + r2
            long r2 = r2 & r14
            goto L4d
        L6b:
            long r2 = ~r7
            r9 = 6
            long r2 = r2 << r9
            long r2 = r2 & r7
            long r2 = r2 & r11
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L80
            r9 = -1
        L75:
            if (r9 < 0) goto L79
            r2 = r13
            goto L7a
        L79:
            r2 = 0
        L7a:
            if (r2 == 0) goto L7f
            r0.c(r9)
        L7f:
            return r2
        L80:
            int r6 = r6 + 8
            int r5 = r5 + r6
            r5 = r5 & r4
            r3 = r16
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.col.e(java.lang.Object):boolean");
    }

    public final boolean f(Collection collection) {
        int i;
        collection.getClass();
        Object[] objArr = this.b;
        int i2 = this.g;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i = 8 - ((~i4) >>> 31);
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (!ffdx.au(collection, objArr[i6])) {
                                c(i6);
                            }
                        }
                        j >>= 8;
                        i5++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2 != this.g;
    }

    public col(int i) {
        k(cpg.d(i));
    }

    public /* synthetic */ col(byte[] bArr) {
        this(6);
    }
}
