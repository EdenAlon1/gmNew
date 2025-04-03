package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djm extends isz implements isu, iwn {
    private dwn A;
    public dik a;
    public dec b;
    private dsg c;
    private dqs d;
    private boolean e;
    private boolean f;
    private dpq g;
    private dmk h;
    private boolean i;
    private dik j;
    private dse k;
    private isw l;
    private boolean o;

    public djm(dsg dsgVar, dqs dqsVar, boolean z, boolean z2, dpq dpqVar, dwn dwnVar, dmk dmkVar, boolean z3, dik dikVar) {
        this.c = dsgVar;
        this.d = dqsVar;
        this.e = z;
        this.f = z2;
        this.g = dpqVar;
        this.A = dwnVar;
        this.h = dmkVar;
        this.i = z3;
        this.j = dikVar;
    }

    private final void h() {
        isw iswVar = this.l;
        if (iswVar != null) {
            if (iswVar.C().z) {
                return;
            }
            M(iswVar);
            return;
        }
        if (this.i) {
            iwo.a(this, new djl(this));
        }
        dik b = b();
        if (b != null) {
            isw c = b.c();
            if (c.C().z) {
                return;
            }
            M(c);
            this.l = c;
        }
    }

    @Override // defpackage.iwn
    public final void a() {
        dec decVar = (dec) isv.a(this, dim.a);
        if (ffkj.e(decVar, this.b)) {
            return;
        }
        this.b = decVar;
        this.a = null;
        isw iswVar = this.l;
        if (iswVar != null) {
            L(iswVar);
        }
        this.l = null;
        h();
        dse dseVar = this.k;
        if (dseVar != null) {
            dseVar.f(this.c, this.d, b(), this.e, this.o, this.g, this.A, this.h);
        }
    }

    public final dik b() {
        return this.i ? this.a : this.j;
    }

    @Override // defpackage.hvh
    public final void dK() {
        boolean f = f();
        if (this.o != f) {
            this.o = f;
            g(this.c, this.d, this.i, b(), this.e, this.f, this.g, this.A, this.h);
        }
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    @Override // defpackage.hvh
    public final void dT() {
        this.o = f();
        h();
        if (this.k == null) {
            dse dseVar = new dse(this.c, b(), this.g, this.d, this.e, this.o, this.A, this.h);
            M(dseVar);
            this.k = dseVar;
        }
    }

    public final boolean f() {
        kah kahVar = kah.a;
        if (this.z) {
            kahVar = isx.h(this);
        }
        dqs dqsVar = this.d;
        boolean z = this.f;
        return (kahVar != kah.b || dqsVar == dqs.a) ? !z : z;
    }

    public final void g(dsg dsgVar, dqs dqsVar, boolean z, dik dikVar, boolean z2, boolean z3, dpq dpqVar, dwn dwnVar, dmk dmkVar) {
        boolean z4;
        this.c = dsgVar;
        this.d = dqsVar;
        boolean z5 = true;
        if (this.i != z) {
            this.i = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (ffkj.e(this.j, dikVar)) {
            z5 = false;
        } else {
            this.j = dikVar;
        }
        if (z4 || (z5 && !z)) {
            isw iswVar = this.l;
            if (iswVar != null) {
                L(iswVar);
            }
            this.l = null;
            h();
        }
        this.e = z2;
        this.f = z3;
        this.g = dpqVar;
        this.A = dwnVar;
        this.h = dmkVar;
        boolean f = f();
        this.o = f;
        dse dseVar = this.k;
        if (dseVar != null) {
            dseVar.f(dsgVar, dqsVar, b(), z2, f, dpqVar, dwnVar, dmkVar);
        }
    }

    @Override // defpackage.hvh
    public final void t() {
        isw iswVar = this.l;
        if (iswVar != null) {
            L(iswVar);
        }
    }
}
