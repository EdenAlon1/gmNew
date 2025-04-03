package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhsw extends fhsv {
    public final int e;
    final fhtb f;
    private final int g;
    private final int[] h;

    public fhsw(int i, int[] iArr, fhtb fhtbVar) {
        this.e = i;
        this.g = iArr.length == 1 ? 2 : 3;
        this.h = iArr;
        this.f = fhtbVar;
    }

    @Override // defpackage.fhsx
    public final int b() {
        return this.e;
    }

    @Override // defpackage.fhsx
    public final BigInteger c() {
        fhtb fhtbVar = this.f;
        int c = fhtbVar.c();
        if (c == 0) {
            return fhsr.a;
        }
        int i = c - 1;
        long j = fhtbVar.b[i];
        byte[] bArr = new byte[8];
        int i2 = 0;
        boolean z = false;
        for (int i3 = 7; i3 >= 0; i3--) {
            byte b = (byte) (j >>> (i3 * 8));
            if (z || b != 0) {
                bArr[i2] = b;
                i2++;
                z = true;
            } else {
                z = false;
            }
        }
        byte[] bArr2 = new byte[(i * 8) + i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = bArr[i4];
        }
        for (int i5 = c - 2; i5 >= 0; i5--) {
            long j2 = fhtbVar.b[i5];
            int i6 = 7;
            while (i6 >= 0) {
                bArr2[i2] = (byte) (j2 >>> (i6 * 8));
                i6--;
                i2++;
            }
        }
        return new BigInteger(1, bArr2);
    }

    @Override // defpackage.fhsx
    public final fhsx d(fhsx fhsxVar) {
        fhtb fhtbVar = (fhtb) this.f.clone();
        fhtbVar.m(((fhsw) fhsxVar).f);
        return new fhsw(this.e, this.h, fhtbVar);
    }

    @Override // defpackage.fhsx
    public final fhsx e() {
        fhtb fhtbVar;
        fhtb fhtbVar2 = this.f;
        if (fhtbVar2.b.length == 0) {
            fhtbVar = new fhtb(new long[]{1});
        } else {
            long[] l = fhtbVar2.l(Math.max(1, fhtbVar2.c()));
            l[0] = 1 ^ l[0];
            fhtbVar = new fhtb(l);
        }
        return new fhsw(this.e, this.h, fhtbVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fhsw)) {
            return false;
        }
        fhsw fhswVar = (fhsw) obj;
        return this.e == fhswVar.e && this.g == fhswVar.g && Arrays.equals(this.h, fhswVar.h) && this.f.equals(fhswVar.f);
    }

    @Override // defpackage.fhsx
    public final fhsx f(fhsx fhsxVar) {
        return h(fhsxVar.g());
    }

    @Override // defpackage.fhsx
    public final fhsx g() {
        int i;
        fhtb fhtbVar = this.f;
        int a = fhtbVar.a();
        if (a == 0) {
            throw new IllegalStateException();
        }
        int[] iArr = this.h;
        int i2 = this.e;
        int i3 = 1;
        if (a != 1) {
            Object clone = fhtbVar.clone();
            int i4 = (i2 + 63) >>> 6;
            fhtb fhtbVar2 = new fhtb(i4);
            fhtb.p(fhtbVar2.b, i2, i2, iArr);
            fhtb fhtbVar3 = new fhtb(i4);
            int i5 = 0;
            fhtbVar3.b[0] = 1;
            fhtb fhtbVar4 = new fhtb(i4);
            int[] iArr2 = new int[2];
            iArr2[0] = a;
            int i6 = i2 + 1;
            iArr2[1] = i6;
            fhtb[] fhtbVarArr = {(fhtb) clone, fhtbVar2};
            int[] iArr3 = new int[2];
            iArr3[0] = 1;
            iArr3[1] = 0;
            fhtb[] fhtbVarArr2 = {fhtbVar3, fhtbVar4};
            int i7 = i6 - iArr2[0];
            while (true) {
                if (i7 < 0) {
                    i7 = -i7;
                    iArr2[i3] = i6;
                    iArr3[i3] = i5;
                    int i8 = 1 - i3;
                    int i9 = iArr2[i8];
                    i5 = iArr3[i8];
                    i3 = i8;
                    i6 = i9;
                }
                i = 1 - i3;
                fhtbVarArr[i3].h(fhtbVarArr[i], iArr2[i], i7);
                int b = fhtbVarArr[i3].b(i6);
                if (b == 0) {
                    break;
                }
                int i10 = iArr3[i];
                fhtbVarArr2[i3].h(fhtbVarArr2[i], i10, i7);
                int i11 = i10 + i7;
                if (i11 > i5) {
                    i5 = i11;
                } else if (i11 == i5) {
                    i5 = fhtbVarArr2[i3].b(i5);
                }
                i7 += b - i6;
                i6 = b;
            }
            fhtbVar = fhtbVarArr2[i];
        }
        return new fhsw(i2, iArr, fhtbVar);
    }

    @Override // defpackage.fhsx
    public final fhsx h(fhsx fhsxVar) {
        int i;
        int i2;
        fhtb fhtbVar = ((fhsw) fhsxVar).f;
        int i3 = this.e;
        int[] iArr = this.h;
        fhtb fhtbVar2 = this.f;
        int a = fhtbVar2.a();
        if (a == 0) {
            fhtbVar = fhtbVar2;
        } else {
            int a2 = fhtbVar.a();
            if (a2 != 0) {
                fhtb fhtbVar3 = a > a2 ? fhtbVar2 : fhtbVar;
                if (a <= a2) {
                    fhtbVar = fhtbVar2;
                }
                int i4 = a > a2 ? a : a2;
                if (a > a2) {
                    a = a2;
                }
                int i5 = a + i4 + 62;
                int i6 = (a + 63) >>> 6;
                int i7 = i5 >>> 6;
                int i8 = (i4 + 63) >>> 6;
                int i9 = 0;
                if (i6 == 1) {
                    long j = fhtbVar.b[0];
                    if (j != 1) {
                        long[] jArr = new long[i7];
                        fhtb.o(j, fhtbVar3.b, i8, jArr);
                        fhtbVar = fhtb.r(jArr, i7, i3, iArr);
                    } else {
                        fhtbVar = fhtbVar3;
                    }
                } else {
                    int i10 = (i4 + 70) >>> 6;
                    int i11 = i10 << 4;
                    int[] iArr2 = new int[16];
                    long[] jArr2 = new long[i11];
                    iArr2[1] = i10;
                    System.arraycopy(fhtbVar3.b, 0, jArr2, i10, i8);
                    int i12 = 2;
                    int i13 = i10;
                    while (i12 < 16) {
                        int i14 = i13 + i10;
                        iArr2[i12] = i14;
                        if ((i12 & 1) == 0) {
                            int i15 = i10;
                            fhtb.s(jArr2, i14 >>> 1, jArr2, i14, i15, 1);
                            i2 = i15;
                        } else {
                            int i16 = i10;
                            i2 = i16;
                            fhtb.f(jArr2, i16, jArr2, i14 - i16, jArr2, i14, i2);
                            i14 = i14;
                        }
                        i12++;
                        i13 = i14;
                        i10 = i2;
                    }
                    int i17 = i10;
                    long[] jArr3 = new long[i11];
                    fhtb.s(jArr2, 0, jArr3, 0, i11, 4);
                    long[] jArr4 = fhtbVar.b;
                    int i18 = i7 << 3;
                    long[] jArr5 = new long[i18];
                    while (i9 < i6) {
                        long j2 = jArr4[i9];
                        int i19 = i9;
                        while (true) {
                            long[] jArr6 = jArr3;
                            long[] jArr7 = jArr2;
                            fhtb.g(jArr5, i19, jArr7, iArr2[((int) j2) & 15], jArr6, iArr2[((int) (j2 >>> 4)) & 15], i17);
                            int i20 = i19;
                            jArr2 = jArr7;
                            jArr3 = jArr6;
                            i = i17;
                            j2 >>>= 8;
                            if (j2 == 0) {
                                break;
                            }
                            i17 = i;
                            i19 = i20 + i7;
                        }
                        i9++;
                        i17 = i;
                    }
                    while (true) {
                        int i21 = i18 - i7;
                        if (i21 == 0) {
                            break;
                        }
                        fhtb.d(jArr5, i21 - i7, jArr5, i21, i7, 8);
                        i18 = i21;
                    }
                    fhtbVar = fhtb.r(jArr5, i7, i3, iArr);
                }
            }
        }
        return new fhsw(i3, iArr, fhtbVar);
    }

    public final int hashCode() {
        return (this.f.hashCode() ^ this.e) ^ fics.b(this.h);
    }

    @Override // defpackage.fhsx
    public final fhsx i(fhsx fhsxVar, fhsx fhsxVar2, fhsx fhsxVar3) {
        fhtb fhtbVar = ((fhsw) fhsxVar).f;
        fhtb fhtbVar2 = ((fhsw) fhsxVar2).f;
        fhtb fhtbVar3 = ((fhsw) fhsxVar3).f;
        fhtb fhtbVar4 = this.f;
        fhtb n = fhtbVar4.n(fhtbVar);
        fhtb n2 = fhtbVar2.n(fhtbVar3);
        Object obj = n;
        if (n == fhtbVar4 || n == fhtbVar) {
            obj = n.clone();
        }
        fhtb fhtbVar5 = (fhtb) obj;
        fhtbVar5.m(n2);
        fhtbVar5.i(this.e, this.h);
        return new fhsw(this.e, this.h, fhtbVar5);
    }

    @Override // defpackage.fhsx
    public final fhsx j() {
        return (this.f.k() || this.f.j()) ? this : m(this.e - 1);
    }

    @Override // defpackage.fhsx
    public final fhsx k() {
        int i = this.e;
        int[] iArr = this.h;
        fhtb fhtbVar = this.f;
        int c = fhtbVar.c();
        if (c != 0) {
            int i2 = c + c;
            long[] jArr = new long[i2];
            for (int i3 = 0; i3 < i2; i3 += 2) {
                long j = fhtbVar.b[i3 >>> 1];
                jArr[i3] = fhtb.e((int) j);
                jArr[i3 + 1] = fhtb.e((int) (j >>> 32));
            }
            fhtbVar = new fhtb(jArr, fhtb.q(jArr, i2, i, iArr));
        }
        return new fhsw(i, iArr, fhtbVar);
    }

    @Override // defpackage.fhsx
    public final fhsx l(fhsx fhsxVar, fhsx fhsxVar2) {
        fhtb fhtbVar;
        fhtb fhtbVar2 = ((fhsw) fhsxVar).f;
        fhtb fhtbVar3 = ((fhsw) fhsxVar2).f;
        fhtb fhtbVar4 = this.f;
        int c = fhtbVar4.c();
        if (c == 0) {
            fhtbVar = fhtbVar4;
        } else {
            int i = c + c;
            long[] jArr = new long[i];
            for (int i2 = 0; i2 < i; i2 += 2) {
                long j = fhtbVar4.b[i2 >>> 1];
                jArr[i2] = fhtb.e((int) j);
                jArr[i2 + 1] = fhtb.e((int) (j >>> 32));
            }
            fhtbVar = new fhtb(jArr, i);
        }
        fhtb n = fhtbVar2.n(fhtbVar3);
        Object obj = fhtbVar;
        if (fhtbVar == fhtbVar4) {
            obj = fhtbVar.clone();
        }
        fhtb fhtbVar5 = (fhtb) obj;
        fhtbVar5.m(n);
        fhtbVar5.i(this.e, this.h);
        return new fhsw(this.e, this.h, fhtbVar5);
    }

    @Override // defpackage.fhsx
    public final fhsx m(int i) {
        if (i <= 0) {
            return this;
        }
        int i2 = this.e;
        int[] iArr = this.h;
        fhtb fhtbVar = this.f;
        int c = fhtbVar.c();
        if (c != 0) {
            int i3 = (i2 + 63) >>> 6;
            int i4 = i3 + i3;
            long[] jArr = new long[i4];
            System.arraycopy(fhtbVar.b, 0, jArr, 0, c);
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                int i5 = c + c;
                while (true) {
                    c--;
                    if (c >= 0) {
                        long j = jArr[c];
                        jArr[i5 - 1] = fhtb.e((int) (j >>> 32));
                        i5 -= 2;
                        jArr[i5] = fhtb.e((int) j);
                    }
                }
                c = fhtb.q(jArr, i4, i2, iArr);
            }
            fhtbVar = new fhtb(jArr, c);
        }
        return new fhsw(i2, iArr, fhtbVar);
    }

    @Override // defpackage.fhsx
    public final boolean n() {
        return this.f.j();
    }

    @Override // defpackage.fhsx
    public final boolean o() {
        return this.f.k();
    }
}
