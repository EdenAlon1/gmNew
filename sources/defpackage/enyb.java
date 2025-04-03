package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyb {
    public enyr a;
    int b;
    private enyr c;
    private enyr d;
    private enyr e;
    private int f;
    private boolean g;
    private enyr h;
    private enyr i;

    public enyb() {
    }

    private static int e(enyr enyrVar, enyr enyrVar2, enyr enyrVar3, enyr enyrVar4) {
        int a = enyx.a(enyrVar4, enyrVar3);
        return a == 0 ? enyx.b(enyrVar, enyrVar2, enyrVar3) : a;
    }

    public final int a(enyr enyrVar) {
        int a = enyx.a(this.e, enyrVar);
        int i = -a;
        int i2 = -1;
        if (this.f == i && a != 0) {
            this.a = enyrVar;
            this.f = i;
            return -1;
        }
        this.b = a;
        if (!this.g) {
            enyr m = enyr.m(enzw.b(this.c, this.d));
            this.h = enyr.j(this.c, m);
            this.i = enyr.j(m, this.d);
            this.g = true;
        }
        double sqrt = ((1.0d / Math.sqrt(3.0d)) + 1.5d) * 2.220446049250313E-16d;
        if ((this.a.a(this.h) <= sqrt || enyrVar.a(this.h) <= sqrt) && (this.a.a(this.i) <= sqrt || enyrVar.a(this.i) <= sqrt)) {
            if (this.c.p(this.a) || this.c.p(enyrVar) || this.d.p(this.a) || this.d.p(enyrVar)) {
                i2 = 0;
            } else if (!this.c.p(this.d) && !this.a.p(enyrVar)) {
                if (this.f == 0) {
                    this.f = -enyx.b(this.c, this.d, this.a);
                }
                int i3 = this.b;
                if (i3 == 0) {
                    i3 = enyx.b(this.c, this.d, enyrVar);
                    this.b = i3;
                }
                if (i3 == this.f) {
                    enyr j = enyr.j(this.a, enyrVar);
                    if ((-e(this.a, enyrVar, this.d, j)) == this.f && e(this.a, enyrVar, this.c, j) == this.f) {
                        i2 = 1;
                    }
                }
            }
        }
        this.a = enyrVar;
        this.f = -this.b;
        return i2;
    }

    public final void b(enyr enyrVar, enyr enyrVar2) {
        this.c = enyrVar;
        this.d = enyrVar2;
        this.a = null;
        this.e = enyr.j(enyrVar, enyrVar2);
        this.g = false;
    }

    public final void c(enyr enyrVar) {
        this.a = enyrVar;
        this.f = -enyx.a(this.e, enyrVar);
    }

    public final boolean d(enyr enyrVar) {
        enyr enyrVar2 = this.a;
        int a = a(enyrVar);
        if (a < 0) {
            return false;
        }
        if (a > 0) {
            return true;
        }
        enyr enyrVar3 = this.c;
        enyr enyrVar4 = this.d;
        double d = enyd.a;
        if (enyrVar3.p(enyrVar4) || enyrVar2.p(enyrVar)) {
            return false;
        }
        if (enyrVar3.p(enyrVar)) {
            return enyy.b(enxw.c(enyrVar3), enyrVar2, enyrVar4, enyrVar3);
        }
        if (enyrVar4.p(enyrVar2)) {
            return enyy.b(enxw.c(enyrVar4), enyrVar, enyrVar3, enyrVar4);
        }
        if (enyrVar3.p(enyrVar2)) {
            return enyy.b(enxw.c(enyrVar3), enyrVar, enyrVar4, enyrVar3);
        }
        if (enyrVar4.p(enyrVar)) {
            return enyy.b(enxw.c(enyrVar4), enyrVar2, enyrVar3, enyrVar4);
        }
        return false;
    }

    public enyb(enyr enyrVar, enyr enyrVar2) {
        b(enyrVar, enyrVar2);
    }

    public enyb(enyr enyrVar, enyr enyrVar2, enyr enyrVar3) {
        this(enyrVar, enyrVar2);
        c(enyrVar3);
    }
}
