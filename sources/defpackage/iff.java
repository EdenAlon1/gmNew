package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iff extends idy {
    private static final iel q = new iel() { // from class: ier
        @Override // defpackage.iel
        public final double a(double d) {
            return d;
        }
    };
    public final ifi d;
    public final float e;
    public final float f;
    public final ifh g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final iel k;
    public final ffji l;
    public final iel m;
    public final iel n;
    public final ffji o;
    public final iel p;
    private final boolean r;

    public iff(String str, float[] fArr, ifi ifiVar, final double d, float f, float f2, int i) {
        this(str, fArr, ifiVar, null, d == 1.0d ? q : new iel() { // from class: ies
            @Override // defpackage.iel
            public final double a(double d2) {
                if (d2 < eobe.a) {
                    d2 = 0.0d;
                }
                return Math.pow(d2, 1.0d / d);
            }
        }, d == 1.0d ? q : new iel() { // from class: iet
            @Override // defpackage.iel
            public final double a(double d2) {
                if (d2 < eobe.a) {
                    d2 = 0.0d;
                }
                return Math.pow(d2, d);
            }
        }, f, f2, new ifh(d, 1.0d, eobe.a, eobe.a, eobe.a), i);
    }

    @Override // defpackage.idy
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.idy
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.idy
    public final float c(float f, float f2, float f3) {
        float a = (float) this.p.a(f);
        float a2 = (float) this.p.a(f2);
        float a3 = (float) this.p.a(f3);
        float[] fArr = this.i;
        return (fArr[2] * a) + (fArr[5] * a2) + (fArr[8] * a3);
    }

    @Override // defpackage.idy
    public final long d(float f, float f2, float f3) {
        float a = (float) this.p.a(f);
        float a2 = (float) this.p.a(f2);
        float a3 = (float) this.p.a(f3);
        float[] fArr = this.i;
        int length = fArr.length;
        float f4 = fArr[0] * a;
        float f5 = fArr[3] * a2;
        float f6 = fArr[6] * a3;
        float f7 = fArr[1] * a;
        float f8 = fArr[4] * a2;
        float f9 = fArr[7] * a3;
        return (Float.floatToRawIntBits(f7 + f8 + f9) & 4294967295L) | (Float.floatToRawIntBits((f4 + f5) + f6) << 32);
    }

    @Override // defpackage.idy
    public final long e(float f, float f2, float f3, float f4, idy idyVar) {
        float[] fArr = this.j;
        float f5 = fArr[0] * f;
        float f6 = fArr[3] * f2;
        float f7 = fArr[6] * f3;
        float f8 = fArr[1] * f;
        float f9 = fArr[4] * f2;
        float f10 = fArr[7] * f3;
        float f11 = fArr[2] * f;
        float f12 = fArr[5] * f2;
        return iby.f((float) this.m.a(f5 + f6 + f7), (float) this.m.a(f8 + f9 + f10), (float) this.m.a(f11 + f12 + (fArr[8] * f3)), f4, idyVar);
    }

    @Override // defpackage.idy
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        iff iffVar = (iff) obj;
        if (Float.compare(iffVar.e, this.e) != 0 || Float.compare(iffVar.f, this.f) != 0 || !ffkj.e(this.d, iffVar.d) || !Arrays.equals(this.h, iffVar.h)) {
            return false;
        }
        ifh ifhVar = this.g;
        if (ifhVar != null) {
            return ffkj.e(ifhVar, iffVar.g);
        }
        if (iffVar.g == null) {
            return true;
        }
        if (ffkj.e(this.k, iffVar.k)) {
            return ffkj.e(this.n, iffVar.n);
        }
        return false;
    }

    @Override // defpackage.idy
    public final boolean f() {
        return this.r;
    }

    @Override // defpackage.idy
    public final int hashCode() {
        int hashCode = (((super.hashCode() * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.h);
        float f = this.e;
        int floatToIntBits = ((hashCode * 31) + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        ifh ifhVar = this.g;
        int hashCode2 = floatToIntBits2 + (ifhVar != null ? ifhVar.hashCode() : 0);
        return this.g == null ? (((hashCode2 * 31) + this.k.hashCode()) * 31) + this.n.hashCode() : hashCode2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public iff(java.lang.String r12, float[] r13, defpackage.ifi r14, final defpackage.ifh r15, int r16) {
        /*
            r11 = this;
            boolean r0 = r15.a()
            r1 = 0
            if (r0 == 0) goto Lf
            iey r0 = new iey
            r0.<init>()
        Ld:
            r5 = r0
            goto L33
        Lf:
            boolean r0 = r15.b()
            if (r0 == 0) goto L1b
            iez r0 = new iez
            r0.<init>()
            goto Ld
        L1b:
            double r3 = r15.f
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2d
            double r3 = r15.g
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2d
            ifa r0 = new ifa
            r0.<init>()
            goto Ld
        L2d:
            ifb r0 = new ifb
            r0.<init>()
            goto Ld
        L33:
            boolean r0 = r15.a()
            if (r0 == 0) goto L40
            ieu r0 = new ieu
            r0.<init>()
        L3e:
            r6 = r0
            goto L64
        L40:
            boolean r0 = r15.b()
            if (r0 == 0) goto L4c
            iev r0 = new iev
            r0.<init>()
            goto L3e
        L4c:
            double r3 = r15.f
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L5e
            double r3 = r15.g
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L5e
            iew r0 = new iew
            r0.<init>()
            goto L3e
        L5e:
            iex r0 = new iex
            r0.<init>()
            goto L3e
        L64:
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iff.<init>(java.lang.String, float[], ifi, ifh, int):void");
    }

    public iff(String str, float[] fArr, ifi ifiVar, float[] fArr2, iel ielVar, iel ielVar2, float f, float f2, ifh ifhVar, int i) {
        super(str, 12884901888L, i);
        char c;
        char c2;
        char c3;
        this.d = ifiVar;
        this.e = f;
        this.f = f2;
        this.g = ifhVar;
        this.k = ielVar;
        this.l = new ife(this);
        this.m = new iel() { // from class: iep
            @Override // defpackage.iel
            public final double a(double d) {
                return ffmk.b(iff.this.k.a(d), r0.e, r0.f);
            }
        };
        this.n = ielVar2;
        this.o = new ifd(this);
        this.p = new iel() { // from class: ieq
            @Override // defpackage.iel
            public final double a(double d) {
                return iff.this.n.a(ffmk.b(d, r0.e, r0.f));
            }
        };
        int length = fArr.length;
        if (f < f2) {
            float[] fArr3 = new float[6];
            ffdo.k(fArr, fArr3, 6);
            this.h = fArr3;
            boolean z = true;
            if (fArr2 == null) {
                float f3 = fArr3[0];
                float f4 = fArr3[1];
                float f5 = fArr3[2];
                float f6 = fArr3[3];
                float f7 = fArr3[4];
                float f8 = fArr3[5];
                c = 5;
                float f9 = ifiVar.a;
                c2 = 4;
                float f10 = ifiVar.b;
                float f11 = 1.0f - f3;
                float f12 = f11 / f4;
                float f13 = 1.0f - f5;
                float f14 = 1.0f - f7;
                float f15 = (1.0f - f9) / f10;
                float f16 = f3 / f4;
                float f17 = (f7 / f8) - f16;
                float f18 = (f5 / f6) - f16;
                float f19 = (f9 / f10) - f16;
                float f20 = (f13 / f6) - f12;
                float f21 = (((f15 - f12) * f18) - (f20 * f19)) / ((((f14 / f8) - f12) * f18) - (f17 * f20));
                float f22 = (f19 - (f17 * f21)) / f18;
                float f23 = (1.0f - f22) - f21;
                float f24 = f23 / f4;
                float f25 = f22 / f6;
                float f26 = f21 / f8;
                c3 = 3;
                this.i = new float[]{f3 * f24, f23, f24 * (f11 - f4), f5 * f25, f22, f25 * (f13 - f6), f7 * f26, f21, f26 * (f14 - f8)};
            } else {
                c = 5;
                c2 = 4;
                c3 = 3;
                this.i = fArr2;
            }
            this.j = idz.e(this.i);
            float a = ifc.a(fArr3);
            float[] fArr4 = ieg.a;
            if (a / ifc.a(ieg.b) > 0.9f) {
                float f27 = fArr3[0];
                float f28 = fArr3[1];
                float f29 = fArr3[2];
                float f30 = fArr3[c3];
                float f31 = fArr3[c2];
                float f32 = fArr3[c];
            }
            if (i != 0) {
                float[] fArr5 = ieg.a;
                if (fArr3 != fArr5) {
                    for (int i2 = 0; i2 < 6; i2++) {
                        if (Float.compare(fArr3[i2], fArr5[i2]) != 0 && Math.abs(fArr3[i2] - fArr5[i2]) > 0.001f) {
                            break;
                        }
                    }
                }
                ifi ifiVar2 = iem.a;
                if (idz.c(ifiVar, iem.d) && f == 0.0f && f2 == 1.0f) {
                    iff iffVar = ieg.e;
                    for (double d = eobe.a; d <= 1.0d; d += 0.00392156862745098d) {
                        if (ifc.b(d, ielVar, iffVar.k) && ifc.b(d, ielVar2, iffVar.n)) {
                        }
                    }
                }
                z = false;
            }
            this.r = z;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
    }
}
