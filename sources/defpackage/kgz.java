package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgz {
    public static boolean a = false;
    public static long b;
    public final kgy j;
    private final kgx r;
    private kgx s;
    private int k = 1000;
    public boolean c = false;
    int d = 0;
    private int l = 32;
    private int m = 32;
    public boolean f = false;
    public boolean g = false;
    private boolean[] n = new boolean[32];
    int h = 1;
    int i = 0;
    private int o = 32;
    private khe[] p = new khe[1000];
    private int q = 0;
    kgx[] e = new kgx[32];

    public kgz() {
        t();
        kgy kgyVar = new kgy();
        this.j = kgyVar;
        this.r = new khd(kgyVar);
        this.s = new kgx(kgyVar);
    }

    public static final int o(Object obj) {
        khe kheVar = ((kit) obj).h;
        if (kheVar != null) {
            return (int) (kheVar.f + 0.5f);
        }
        return 0;
    }

    private final void q(kgx kgxVar) {
        int i;
        if (kgxVar.d) {
            kgxVar.a.d(this, kgxVar.b);
        } else {
            kgx[] kgxVarArr = this.e;
            int i2 = this.i;
            kgxVarArr[i2] = kgxVar;
            khe kheVar = kgxVar.a;
            kheVar.d = i2;
            this.i = i2 + 1;
            kheVar.e(this, kgxVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    System.out.println("WTF");
                }
                kgx kgxVar2 = this.e[i3];
                if (kgxVar2 != null && kgxVar2.d) {
                    kgxVar2.a.d(this, kgxVar2.b);
                    this.j.b.b(kgxVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        kgx[] kgxVarArr2 = this.e;
                        int i6 = i4 - 1;
                        kgx kgxVar3 = kgxVarArr2[i4];
                        kgxVarArr2[i6] = kgxVar3;
                        khe kheVar2 = kgxVar3.a;
                        if (kheVar2.d == i4) {
                            kheVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.e[i5] = null;
                    }
                    this.i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.c = false;
        }
    }

    private final void r() {
        for (int i = 0; i < this.i; i++) {
            kgx kgxVar = this.e[i];
            kgxVar.a.f = kgxVar.b;
        }
    }

    private final void s() {
        int i = this.l;
        int i2 = i + i;
        this.l = i2;
        this.e = (kgx[]) Arrays.copyOf(this.e, i2);
        this.j.a = (khe[]) Arrays.copyOf(this.j.a, this.l);
        int i3 = this.l;
        this.n = new boolean[i3];
        this.m = i3;
        this.o = i3;
    }

    private final void t() {
        for (int i = 0; i < this.i; i++) {
            kgx kgxVar = this.e[i];
            if (kgxVar != null) {
                this.j.b.b(kgxVar);
            }
            this.e[i] = null;
        }
    }

    private final void u(kgx kgxVar) {
        kgw kgwVar;
        int i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.n[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            z = true;
            i3++;
            int i4 = this.h;
            if (i3 >= i4 + i4) {
                return;
            }
            khe kheVar = kgxVar.a;
            if (kheVar != null) {
                this.n[kheVar.c] = true;
            }
            khe k = kgxVar.k(this.n);
            if (k != null) {
                boolean[] zArr = this.n;
                int i5 = k.c;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (k != null) {
                float f = Float.MAX_VALUE;
                int i6 = -1;
                for (int i7 = 0; i7 < this.i; i7++) {
                    kgx kgxVar2 = this.e[i7];
                    if (kgxVar2.a.n != 1 && !kgxVar2.d && (i = (kgwVar = kgxVar2.e).f) != -1) {
                        int i8 = 0;
                        while (true) {
                            if (i != -1 && i8 < kgwVar.a) {
                                if (kgwVar.c[i] == k.c) {
                                    float a2 = kgxVar2.e.a(k);
                                    if (a2 < 0.0f) {
                                        float f2 = (-kgxVar2.b) / a2;
                                        if (f2 < f) {
                                            i6 = i7;
                                            f = f2;
                                        }
                                    }
                                } else {
                                    i = kgwVar.d[i];
                                    i8++;
                                }
                            }
                        }
                    }
                }
                if (i6 >= 0) {
                    kgx kgxVar3 = this.e[i6];
                    kgxVar3.a.d = -1;
                    kgxVar3.b(k);
                    khe kheVar2 = kgxVar3.a;
                    kheVar2.d = i6;
                    kheVar2.e(this, kgxVar3);
                }
                z = false;
            }
        }
    }

    private final khe v(int i) {
        khe kheVar = (khe) this.j.c.a();
        if (kheVar == null) {
            kheVar = new khe(i);
            kheVar.n = i;
        } else {
            kheVar.c();
            kheVar.n = i;
        }
        int i2 = this.q;
        int i3 = this.k;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            this.k = i4;
            this.p = (khe[]) Arrays.copyOf(this.p, i4);
        }
        khe[] kheVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        kheVarArr[i5] = kheVar;
        return kheVar;
    }

    public final kgx a() {
        kgx kgxVar = (kgx) this.j.b.a();
        if (kgxVar == null) {
            kgx kgxVar2 = new kgx(this.j);
            b++;
            kgxVar = kgxVar2;
        } else {
            kgxVar.a = null;
            kgxVar.e.f();
            kgxVar.b = 0.0f;
            kgxVar.d = false;
        }
        khe.a++;
        return kgxVar;
    }

    public final khe b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            s();
        }
        kit kitVar = (kit) obj;
        khe kheVar = kitVar.h;
        if (kheVar == null) {
            kitVar.m();
            kheVar = kitVar.h;
        }
        int i = kheVar.c;
        if (i != -1) {
            if (i <= this.d && this.j.a[i] != null) {
                return kheVar;
            }
            if (i != -1) {
                kheVar.c();
            }
        }
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        kheVar.c = i2;
        kheVar.n = 1;
        this.j.a[i2] = kheVar;
        return kheVar;
    }

    public final khe c() {
        if (this.h + 1 >= this.m) {
            s();
        }
        khe v = v(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        v.c = i;
        this.j.a[i] = v;
        return v;
    }

    public final void d(khe kheVar, khe kheVar2, int i, float f, khe kheVar3, khe kheVar4, int i2, int i3) {
        kgx a2 = a();
        if (kheVar2 == kheVar3) {
            a2.e.g(kheVar, 1.0f);
            a2.e.g(kheVar4, 1.0f);
            a2.e.g(kheVar2, -2.0f);
        } else if (f == 0.5f) {
            a2.e.g(kheVar, 1.0f);
            a2.e.g(kheVar2, -1.0f);
            a2.e.g(kheVar3, -1.0f);
            a2.e.g(kheVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                a2.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            a2.e.g(kheVar, -1.0f);
            a2.e.g(kheVar2, 1.0f);
            a2.b = i;
        } else if (f >= 1.0f) {
            a2.e.g(kheVar4, -1.0f);
            a2.e.g(kheVar3, 1.0f);
            a2.b = -i2;
        } else {
            float f2 = 1.0f - f;
            a2.e.g(kheVar, f2);
            a2.e.g(kheVar2, -f2);
            a2.e.g(kheVar3, -f);
            a2.e.g(kheVar4, f);
            if (i > 0 || i2 > 0) {
                a2.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            a2.f(this, i3);
        }
        e(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b8 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.kgx r18) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgz.e(kgx):void");
    }

    public final void f(khe kheVar, int i) {
        int i2 = kheVar.d;
        if (i2 == -1) {
            kheVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                khe kheVar2 = this.j.a[i3];
            }
            return;
        }
        if (i2 == -1) {
            float f = i;
            kgx a2 = a();
            a2.a = kheVar;
            kheVar.f = f;
            a2.b = f;
            a2.d = true;
            e(a2);
            return;
        }
        kgx kgxVar = this.e[i2];
        if (kgxVar.d) {
            kgxVar.b = i;
            return;
        }
        if (kgxVar.e.a == 0) {
            kgxVar.d = true;
            kgxVar.b = i;
            return;
        }
        kgx a3 = a();
        if (i < 0) {
            a3.b = -i;
            a3.e.g(kheVar, 1.0f);
        } else {
            a3.b = i;
            a3.e.g(kheVar, -1.0f);
        }
        e(a3);
    }

    public final void g(khe kheVar, khe kheVar2, int i, int i2) {
        kgx a2 = a();
        khe c = c();
        c.e = 0;
        a2.h(kheVar, kheVar2, c, i);
        if (i2 != 8) {
            i(a2, (int) (-a2.e.a(c)), i2);
        }
        e(a2);
    }

    public final void h(khe kheVar, khe kheVar2, int i, int i2) {
        kgx a2 = a();
        khe c = c();
        c.e = 0;
        a2.i(kheVar, kheVar2, c, i);
        if (i2 != 8) {
            i(a2, (int) (-a2.e.a(c)), i2);
        }
        e(a2);
    }

    final void i(kgx kgxVar, int i, int i2) {
        kgxVar.e.g(p(i2), i);
    }

    public final void j() {
        kgx kgxVar = this.r;
        if (kgxVar.e()) {
            r();
            return;
        }
        if (!this.g) {
            l(kgxVar);
            return;
        }
        for (int i = 0; i < this.i; i++) {
            if (!this.e[i].d) {
                l(this.r);
                return;
            }
        }
        r();
    }

    public final void k() {
        kgy kgyVar;
        int i = 0;
        while (true) {
            kgyVar = this.j;
            khe[] kheVarArr = kgyVar.a;
            if (i >= kheVarArr.length) {
                break;
            }
            khe kheVar = kheVarArr[i];
            if (kheVar != null) {
                kheVar.c();
            }
            i++;
        }
        kha khaVar = kgyVar.c;
        khe[] kheVarArr2 = this.p;
        int i2 = this.q;
        int length = kheVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            khe kheVar2 = kheVarArr2[i3];
            int i4 = khaVar.b;
            if (i4 < 256) {
                khaVar.a[i4] = kheVar2;
                khaVar.b = i4 + 1;
            }
        }
        this.q = 0;
        Arrays.fill(this.j.a, (Object) null);
        this.d = 0;
        khd khdVar = (khd) this.r;
        khdVar.f = 0;
        khdVar.b = 0.0f;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            kgx kgxVar = this.e[i5];
        }
        t();
        this.i = 0;
        this.s = new kgx(this.j);
    }

    final void l(kgx kgxVar) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.i) {
                break;
            }
            kgx kgxVar2 = this.e[i];
            if (kgxVar2.a.n != 1) {
                float f = 0.0f;
                if (kgxVar2.b < 0.0f) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.i) {
                            kgx kgxVar3 = this.e[i5];
                            if (kgxVar3.a.n != 1 && !kgxVar3.d && kgxVar3.b < f) {
                                int i7 = kgxVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    khe d = kgxVar3.e.d(i8);
                                    float a2 = kgxVar3.e.a(d);
                                    if (a2 > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = d.h[i9] / a2;
                                            if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                                i4 = d.c;
                                                i6 = i9;
                                                f2 = f3;
                                                i3 = i5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                        }
                        if (i3 != -1) {
                            kgx kgxVar4 = this.e[i3];
                            kgxVar4.a.d = -1;
                            kgxVar4.b(this.j.a[i4]);
                            khe kheVar = kgxVar4.a;
                            kheVar.d = i3;
                            kheVar.e(this, kgxVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = (!(i2 <= this.h / 2)) | z;
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        u(kgxVar);
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.khe r6, defpackage.khe r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L17
            boolean r9 = r7.g
            if (r9 == 0) goto L16
            int r9 = r6.d
            r1 = -1
            if (r9 == r1) goto Le
            goto L16
        Le:
            float r7 = r7.f
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.d(r5, r7)
            return
        L16:
            r9 = r0
        L17:
            kgx r1 = r5.a()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L38
            if (r8 >= 0) goto L26
            int r8 = -r8
            r4 = 1
            goto L27
        L26:
            r4 = 0
        L27:
            float r8 = (float) r8
            r1.b = r8
            if (r4 != 0) goto L2d
            goto L38
        L2d:
            kgw r8 = r1.e
            r8.g(r6, r2)
            kgw r6 = r1.e
            r6.g(r7, r3)
            goto L42
        L38:
            kgw r8 = r1.e
            r8.g(r6, r3)
            kgw r6 = r1.e
            r6.g(r7, r2)
        L42:
            if (r9 == r0) goto L47
            r1.f(r5, r9)
        L47:
            r5.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgz.m(khe, khe, int, int):void");
    }

    public final void n(khe kheVar, khe kheVar2, khe kheVar3, khe kheVar4, float f) {
        kgx a2 = a();
        a2.g(kheVar, kheVar2, kheVar3, kheVar4, f);
        e(a2);
    }

    public final khe p(int i) {
        if (this.h + 1 >= this.m) {
            s();
        }
        khe v = v(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        v.c = i2;
        v.e = i;
        this.j.a[i2] = v;
        khd khdVar = (khd) this.r;
        khc khcVar = khdVar.g;
        khcVar.a = v;
        Arrays.fill(khcVar.a.i, 0.0f);
        v.i[v.e] = 1.0f;
        khdVar.m(v);
        return v;
    }
}
