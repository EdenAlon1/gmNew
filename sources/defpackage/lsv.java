package defpackage;

import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsv {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public short[] f;
    public int g;
    public short[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public double r;
    private final int s;
    private final int t;
    private final int u;
    private final short[] v;
    private short[] w;

    public lsv(int i, int i2, float f, float f2, int i3) {
        this.s = i;
        this.a = i2;
        this.b = f;
        this.c = f2;
        this.d = i / i3;
        this.t = i / 400;
        int i4 = i / 65;
        this.u = i4;
        int i5 = i4 + i4;
        this.e = i5;
        this.v = new short[i5];
        int i6 = i5 * i2;
        this.f = new short[i6];
        this.h = new short[i6];
        this.w = new short[i6];
    }

    private final int e(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = PrivateKeyType.INVALID;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = this.a * i;
                i8 += Math.abs(sArr[i10 + i9] - sArr[(i10 + i2) + i9]);
            }
            int i11 = i8 * i6;
            int i12 = i4 * i2;
            if (i11 < i12) {
                i4 = i8;
            }
            if (i11 < i12) {
                i6 = i2;
            }
            int i13 = i8 * i5;
            int i14 = i7 * i2;
            if (i13 > i14) {
                i7 = i8;
            }
            if (i13 > i14) {
                i5 = i2;
            }
            i2++;
        }
        this.p = i4 / i6;
        this.q = i7 / i5;
        return i6;
    }

    private final void f(short[] sArr, int i, int i2) {
        short[] d = d(this.h, this.i, i2);
        this.h = d;
        int i3 = this.i;
        int i4 = this.a;
        System.arraycopy(sArr, i * i4, d, i3 * i4, i2 * i4);
        this.i += i2;
    }

    private final void g(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.e / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.a;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                    i5++;
                }
            }
            this.v[i4] = (short) (i6 / i3);
        }
    }

    private static void h(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    public final int a() {
        lti.c(this.i >= 0);
        int i = this.i * this.a;
        return i + i;
    }

    public final int b() {
        int i = this.g * this.a;
        return i + i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        int i;
        int i2;
        double d;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        long j;
        long j2;
        double d2 = this.b / this.c;
        int i9 = this.i;
        int i10 = 0;
        int i11 = 1;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i12 = this.g;
            if (i12 >= this.e) {
                int i13 = 0;
                while (true) {
                    int i14 = this.m;
                    if (i14 > 0) {
                        int min = Math.min(this.e, i14);
                        f(this.f, i13, min);
                        this.m -= min;
                        i13 += min;
                        d = d2;
                        i2 = i11;
                    } else {
                        short[] sArr = this.f;
                        int i15 = this.s;
                        int i16 = i15 > 4000 ? i15 / 4000 : i11;
                        if (this.a == i11 && i16 == i11) {
                            i = e(sArr, i13, this.t, this.u);
                        } else {
                            g(sArr, i13, i16);
                            int e = e(this.v, i10, this.t / i16, this.u / i16);
                            if (i16 != i11) {
                                int i17 = e * i16;
                                int i18 = i16 * 4;
                                int i19 = this.t;
                                int i20 = i17 - i18;
                                if (i20 >= i19) {
                                    i19 = i20;
                                }
                                int i21 = i17 + i18;
                                int i22 = this.u;
                                if (i21 > i22) {
                                    i21 = i22;
                                }
                                if (this.a == i11) {
                                    i = e(sArr, i13, i19, i21);
                                } else {
                                    g(sArr, i13, i11);
                                    i = e(this.v, i10, i19, i21);
                                }
                            } else {
                                i = e;
                            }
                        }
                        int i23 = this.p;
                        int i24 = (i23 == 0 || (i5 = this.n) == 0 || this.q > i23 * 3 || i23 + i23 <= this.o * 3) ? i : i5;
                        int i25 = i13 + i24;
                        this.o = i23;
                        this.n = i;
                        double d3 = i24;
                        if (d2 > 1.0d) {
                            short[] sArr2 = this.f;
                            double d4 = d2 - 1.0d;
                            if (d2 >= 2.0d) {
                                double d5 = (d3 / d4) + this.r;
                                int round = (int) Math.round(d5);
                                i2 = i11;
                                this.r = d5 - round;
                                i4 = round;
                            } else {
                                i2 = i11;
                                double d6 = (((2.0d - d2) * d3) / d4) + this.r;
                                int round2 = (int) Math.round(d6);
                                this.m = round2;
                                this.r = d6 - round2;
                                i4 = i24;
                            }
                            short[] d7 = d(this.h, this.i, i4);
                            this.h = d7;
                            int i26 = i13;
                            h(i4, this.a, d7, this.i, sArr2, i26, sArr2, i25);
                            this.i += i4;
                            i13 = i26 + i24 + i4;
                            d = d2;
                        } else {
                            i2 = i11;
                            int i27 = i24;
                            short[] sArr3 = this.f;
                            double d8 = 1.0d - d2;
                            if (d2 < 0.5d) {
                                d = d2;
                                double d9 = ((d3 * d2) / d8) + this.r;
                                int round3 = (int) Math.round(d9);
                                this.r = d9 - round3;
                                i3 = round3;
                            } else {
                                d = d2;
                                double d10 = ((d3 * ((d + d) - 1.0d)) / d8) + this.r;
                                int round4 = (int) Math.round(d10);
                                this.m = round4;
                                this.r = d10 - round4;
                                i3 = i27;
                            }
                            int i28 = i27 + i3;
                            short[] d11 = d(this.h, this.i, i28);
                            this.h = d11;
                            int i29 = this.a;
                            System.arraycopy(sArr3, i13 * i29, d11, this.i * i29, i29 * i27);
                            h(i3, this.a, this.h, this.i + i27, sArr3, i25, sArr3, i13);
                            this.i += i28;
                            i13 += i3;
                        }
                    }
                    if (this.e + i13 > i12) {
                        break;
                    }
                    i11 = i2;
                    d2 = d;
                    i10 = 0;
                }
                int i30 = this.g - i13;
                short[] sArr4 = this.f;
                int i31 = this.a;
                System.arraycopy(sArr4, i13 * i31, sArr4, 0, i31 * i30);
                this.g = i30;
                f = this.d * this.c;
                if (f != 1.0f || this.i == i9) {
                }
                int i32 = this.s;
                float f2 = i32 / f;
                long j3 = i32;
                long j4 = (long) f2;
                while (j4 != 0 && j3 != 0 && j4 % 2 == 0 && j3 % 2 == 0) {
                    j4 /= 2;
                    j3 /= 2;
                }
                int i33 = this.i - i9;
                short[] d12 = d(this.w, this.j, i33);
                this.w = d12;
                short[] sArr5 = this.h;
                int i34 = this.a;
                System.arraycopy(sArr5, i9 * i34, d12, this.j * i34, i34 * i33);
                this.i = i9;
                this.j += i33;
                int i35 = 0;
                while (true) {
                    i6 = this.j;
                    i7 = i6 - 1;
                    if (i35 >= i7) {
                        break;
                    }
                    while (true) {
                        i8 = this.k + 1;
                        j = i8;
                        long j5 = j * j4;
                        j2 = this.l;
                        if (j5 <= j2 * j3) {
                            break;
                        }
                        this.h = d(this.h, this.i, i2);
                        int i36 = 0;
                        while (true) {
                            int i37 = this.a;
                            if (i36 < i37) {
                                short[] sArr6 = this.h;
                                int i38 = this.i * i37;
                                short[] sArr7 = this.w;
                                int i39 = (i35 * i37) + i36;
                                short s = sArr7[i39];
                                short s2 = sArr7[i39 + i37];
                                long j6 = this.l * j3;
                                long j7 = j3;
                                long j8 = (r13 + 1) * j4;
                                long j9 = j8 - (this.k * j4);
                                long j10 = j8 - j6;
                                sArr6[i38 + i36] = (short) (((j10 * s) + ((j9 - j10) * s2)) / j9);
                                i36++;
                                j3 = j7;
                            }
                        }
                        i2 = 1;
                        this.l++;
                        this.i++;
                        j3 = j3;
                    }
                    long j11 = j3;
                    this.k = i8;
                    if (j == j11) {
                        this.k = 0;
                        lti.c(j2 == j4 ? i2 : 0);
                        this.l = 0;
                    }
                    i35++;
                    j3 = j11;
                }
                if (i7 != 0) {
                    short[] sArr8 = this.w;
                    int i40 = this.a;
                    System.arraycopy(sArr8, i7 * i40, sArr8, 0, (i6 - i7) * i40);
                    this.j -= i7;
                    return;
                }
                return;
            }
        } else {
            f(this.f, 0, this.g);
            this.g = 0;
        }
        i2 = 1;
        f = this.d * this.c;
        if (f != 1.0f) {
        }
    }

    public final short[] d(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.a;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }
}
