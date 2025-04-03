package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bc {
    private static int h = 1000;
    public az[] c;
    public final ba g;
    int a = 0;
    public final bb b = new bb();
    private int i = 32;
    private int j = 32;
    public boolean[] d = new boolean[32];
    public int e = 1;
    public int f = 0;
    private int k = 32;
    private be[] l = new be[h];
    private int m = 0;
    private az[] n = new az[32];

    public bc() {
        this.c = null;
        this.c = new az[32];
        r();
        this.g = new ba();
    }

    public static az b(bc bcVar, be beVar, be beVar2, int i, float f, be beVar3, be beVar4, int i2, boolean z) {
        az a = bcVar.a();
        a.d(beVar, beVar2, i, f, beVar3, beVar4, i2);
        if (z) {
            be d = bcVar.d();
            be d2 = bcVar.d();
            d.c = 4;
            d2.c = 4;
            a.c(d, d2);
        }
        return a;
    }

    public static az c(bc bcVar, be beVar, be beVar2, int i, boolean z) {
        az a = bcVar.a();
        a.h(beVar, beVar2, i);
        if (z) {
            bcVar.k(a, 1);
        }
        return a;
    }

    public static final int p(Object obj) {
        be beVar = ((bg) obj).f;
        if (beVar != null) {
            return (int) (beVar.d + 0.5f);
        }
        return 0;
    }

    private final void q() {
        int i = this.i;
        int i2 = i + i;
        this.i = i2;
        this.c = (az[]) Arrays.copyOf(this.c, i2);
        this.g.a = (be[]) Arrays.copyOf(this.g.a, this.i);
        int i3 = this.i;
        this.d = new boolean[i3];
        this.j = i3;
        this.k = i3;
        this.b.a.clear();
    }

    private final void r() {
        int i = 0;
        while (true) {
            az[] azVarArr = this.c;
            if (i >= azVarArr.length) {
                return;
            }
            az azVar = azVarArr[i];
            if (azVar != null) {
                this.g.b.b(azVar);
            }
            this.c[i] = null;
            i++;
        }
    }

    private final be s(int i) {
        be beVar = (be) this.g.c.a();
        if (beVar == null) {
            beVar = new be(i);
        } else {
            beVar.b();
            beVar.h = i;
        }
        int i2 = this.m;
        int i3 = h;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            h = i4;
            this.l = (be[]) Arrays.copyOf(this.l, i4);
        }
        be[] beVarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        beVarArr[i5] = beVar;
        return beVar;
    }

    public final az a() {
        az azVar = (az) this.g.b.a();
        if (azVar == null) {
            return new az(this.g);
        }
        azVar.a = null;
        ay ayVar = azVar.d;
        ayVar.f = -1;
        ayVar.g = -1;
        ayVar.h = false;
        ayVar.a = 0;
        azVar.b = 0.0f;
        azVar.e = false;
        return azVar;
    }

    public final be d() {
        if (this.e + 1 >= this.j) {
            q();
        }
        be s = s(4);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        s.a = i;
        this.g.a[i] = s;
        return s;
    }

    public final be e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            q();
        }
        bg bgVar = (bg) obj;
        be beVar = bgVar.f;
        if (beVar == null) {
            bgVar.e();
            beVar = bgVar.f;
        }
        int i = beVar.a;
        if (i != -1) {
            if (i <= this.a && this.g.a[i] != null) {
                return beVar;
            }
            if (i != -1) {
                beVar.b();
            }
        }
        int i2 = this.a + 1;
        this.a = i2;
        this.e++;
        beVar.a = i2;
        beVar.h = 1;
        this.g.a[i2] = beVar;
        return beVar;
    }

    public final be f() {
        if (this.e + 1 >= this.j) {
            q();
        }
        be s = s(3);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        s.a = i;
        this.g.a[i] = s;
        return s;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.az r13) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc.g(az):void");
    }

    public final void h(be beVar, int i) {
        int i2 = beVar.b;
        if (i2 != -1) {
            az azVar = this.c[i2];
            if (azVar.e) {
                azVar.b = i;
                return;
            }
            az a = a();
            a.g(beVar, i);
            g(a);
            return;
        }
        float f = i;
        az a2 = a();
        a2.a = beVar;
        beVar.d = f;
        a2.b = f;
        a2.e = true;
        g(a2);
    }

    public final void i(be beVar, be beVar2, int i, int i2) {
        az a = a();
        be f = f();
        f.c = i2;
        a.i(beVar, beVar2, f, i);
        g(a);
    }

    public final void j(be beVar, be beVar2, int i, int i2) {
        az a = a();
        be f = f();
        f.c = i2;
        a.j(beVar, beVar2, f, i);
        g(a);
    }

    public final void k(az azVar, int i) {
        azVar.d.f(d(), i);
    }

    public final void l() {
        ba baVar;
        int i = 0;
        while (true) {
            baVar = this.g;
            be[] beVarArr = baVar.a;
            if (i >= beVarArr.length) {
                break;
            }
            be beVar = beVarArr[i];
            if (beVar != null) {
                beVar.b();
            }
            i++;
        }
        bd bdVar = baVar.c;
        be[] beVarArr2 = this.l;
        int i2 = this.m;
        int length = beVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            be beVar2 = beVarArr2[i3];
            int i4 = bdVar.b;
            if (i4 < 256) {
                bdVar.a[i4] = beVar2;
                bdVar.b = i4 + 1;
            }
        }
        this.m = 0;
        Arrays.fill(this.g.a, (Object) null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (int i5 = 0; i5 < this.f; i5++) {
            this.c[i5].c = false;
        }
        r();
        this.f = 0;
    }

    public final void m(be beVar, be beVar2, int i, float f, be beVar3, be beVar4, int i2) {
        az a = a();
        a.d(beVar, beVar2, i, f, beVar3, beVar4, i2);
        be d = d();
        be d2 = d();
        d.c = 4;
        d2.c = 4;
        a.c(d, d2);
        g(a);
    }

    public final void n(be beVar, be beVar2, int i, int i2) {
        az a = a();
        a.h(beVar, beVar2, i);
        be d = d();
        be d2 = d();
        d.c = i2;
        d2.c = i2;
        a.c(d, d2);
        g(a);
    }

    public final void o(bb bbVar) {
        int i = 0;
        while (true) {
            if (i >= this.f) {
                break;
            }
            az azVar = this.c[i];
            if (azVar.a.h != 1 && azVar.b < 0.0f) {
                while (true) {
                    float f = Float.MAX_VALUE;
                    int i2 = -1;
                    int i3 = -1;
                    int i4 = 0;
                    for (int i5 = 0; i5 < this.f; i5++) {
                        az azVar2 = this.c[i5];
                        if (azVar2.a.h != 1 && azVar2.b < 0.0f) {
                            for (int i6 = 1; i6 < this.e; i6++) {
                                be beVar = this.g.a[i6];
                                float a = azVar2.d.a(beVar);
                                if (a > 0.0f) {
                                    for (int i7 = 0; i7 < 6; i7++) {
                                        float f2 = beVar.e[i7] / a;
                                        if ((f2 < f && i7 == i4) || i7 > i4) {
                                            f = f2;
                                            i2 = i5;
                                            i3 = i6;
                                            i4 = i7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i2 == -1) {
                        break;
                    }
                    az azVar3 = this.c[i2];
                    azVar3.a.b = -1;
                    azVar3.a(this.g.a[i3]);
                    azVar3.a.b = i2;
                    for (int i8 = 0; i8 < this.f; i8++) {
                        this.c[i8].k(azVar3);
                    }
                    bbVar.a(this);
                }
            } else {
                i++;
            }
        }
        for (int i9 = 0; i9 < this.f; i9++) {
            az azVar4 = this.c[i9];
            if (azVar4.a.h != 1 && azVar4.b < 0.0f) {
                return;
            }
        }
    }
}
