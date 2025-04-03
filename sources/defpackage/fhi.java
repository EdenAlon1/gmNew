package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhi {
    public final eyo a;
    public jvj b;
    public ffji c;
    public eva d;
    public final hho e;
    public jwn f;
    public ffix g;
    public ffsk h;
    public iir i;
    public hzi j;
    public final hho k;
    public final hho l;
    public long m;
    public Integer n;
    public long o;
    public jvu p;
    public final evy q;
    public final fcp r;
    public iyj s;
    public jbw t;
    private final hho u;
    private final hho v;
    private int w;
    private fen x;

    public fhi() {
        this(null);
    }

    public final void A() {
        ffsk ffskVar = this.h;
        if (ffskVar != null) {
            ffqy.d(ffskVar, null, ffsm.d, new fhg(this, null), 1);
        }
    }

    public final void B(boolean z) {
        ffsk ffskVar = this.h;
        if (ffskVar != null) {
            ffqy.d(ffskVar, null, ffsm.d, new fgr(this, z, null), 1);
        }
    }

    public final long a(boolean z) {
        exq d;
        jpg jpgVar;
        jlm e;
        eva evaVar = this.d;
        if (evaVar == null || (d = evaVar.d()) == null || (jpgVar = d.a) == null || (e = e()) == null) {
            return 9205357640488583168L;
        }
        if (ffkj.e(e.b, jpgVar.a.a.b)) {
            return fic.a(jpgVar, this.b.a(z ? jpm.e(f().c) : jpm.a(f().c)), z, jpm.j(f().c));
        }
        return 9205357640488583168L;
    }

    public final long b(jvu jvuVar, long j, boolean z, boolean z2, fdh fdhVar, boolean z3) {
        exq d;
        int i;
        jpg jpgVar;
        fcy fcyVar;
        boolean z4;
        boolean z5;
        iir iirVar;
        int i2;
        eva evaVar = this.d;
        if (evaVar == null || (d = evaVar.d()) == null) {
            return jpm.a;
        }
        long a = jpn.a(this.b.a(jpm.e(jvuVar.c)), this.b.a(jpm.a(jvuVar.c)));
        int a2 = d.a(j, false);
        int e = (z2 || z) ? a2 : jpm.e(a);
        int a3 = (!z2 || z) ? a2 : jpm.a(a);
        fen fenVar = this.x;
        int i3 = (z || fenVar == null || (i2 = this.w) == -1) ? -1 : i2;
        jpg jpgVar2 = d.a;
        if (z) {
            jpgVar = jpgVar2;
            fcyVar = null;
            i = a2;
        } else {
            i = a2;
            jpgVar = jpgVar2;
            fcyVar = new fcy(new fcx(feq.a(jpgVar2, jpm.e(a)), jpm.e(a), 1L), new fcx(feq.a(jpgVar2, jpm.a(a)), jpm.a(a), 1L), jpm.j(a));
        }
        fgp fgpVar = new fgp(z2, 1, 1, fcyVar, new fcw(1L, 1, e, a3, i3, jpgVar));
        if (!fgpVar.m(fenVar)) {
            return jvuVar.c;
        }
        this.x = fgpVar;
        this.w = i;
        fcy a4 = fdhVar.a(fgpVar);
        long a5 = jpn.a(this.b.b(a4.a.b), this.b.b(a4.b.b));
        long j2 = jvuVar.c;
        if (jpm.h(a5, j2)) {
            return j2;
        }
        boolean z6 = jpm.j(a5) != jpm.j(j2) && jpm.h(jpn.a(jpm.a(a5), jpm.e(a5)), j2);
        boolean z7 = jpm.i(a5) && jpm.i(jvuVar.c);
        if (z3 && jvuVar.a().length() > 0 && !z6 && !z7 && (iirVar = this.i) != null) {
            iirVar.a(9);
        }
        this.c.invoke(new jvu(jvuVar.b, a5));
        if (!z3) {
            r(!jpm.i(a5));
        }
        eva evaVar2 = this.d;
        if (evaVar2 != null) {
            evaVar2.i(z3);
        }
        eva evaVar3 = this.d;
        if (evaVar3 != null) {
            evaVar3.o(!jpm.i(a5) && fhm.b(this, true));
        }
        eva evaVar4 = this.d;
        if (evaVar4 == null) {
            z4 = false;
        } else {
            if (jpm.i(a5)) {
                z4 = false;
            } else {
                z4 = false;
                if (fhm.b(this, false)) {
                    z5 = true;
                    evaVar4.n(z5);
                }
            }
            z5 = z4;
            evaVar4.n(z5);
        }
        eva evaVar5 = this.d;
        if (evaVar5 == null) {
            return a5;
        }
        evaVar5.l((jpm.i(a5) && fhm.b(this, true)) ? true : z4);
        return a5;
    }

    public final euf c() {
        return (euf) this.u.a();
    }

    public final iak d() {
        return (iak) this.v.a();
    }

    public final jlm e() {
        evw evwVar;
        eva evaVar = this.d;
        if (evaVar == null || (evwVar = evaVar.a) == null) {
            return null;
        }
        return evwVar.a;
    }

    public final jvu f() {
        return (jvu) this.e.a();
    }

    public final void g() {
        ffix ffixVar = this.g;
        if (ffixVar != null) {
            ffixVar.invoke();
        }
    }

    public final void h(iak iakVar) {
        int c;
        int a;
        if (!jpm.i(f().c)) {
            eva evaVar = this.d;
            exq d = evaVar != null ? evaVar.d() : null;
            if (iakVar == null || d == null) {
                c = jpm.c(f().c);
            } else {
                jvj jvjVar = this.b;
                a = d.a(iakVar.a, true);
                c = jvjVar.b(a);
            }
            this.c.invoke(jvu.b(f(), null, jpn.a(c, c), 5));
        }
        p((iakVar == null || f().a().length() <= 0) ? eug.a : eug.c);
        r(false);
    }

    public final void i(boolean z) {
        hzi hziVar;
        eva evaVar = this.d;
        if (evaVar != null && !evaVar.p() && (hziVar = this.j) != null) {
            hziVar.b();
        }
        this.p = f();
        r(z);
        p(eug.b);
    }

    public final void j() {
        r(false);
        p(eug.a);
    }

    public final void k() {
        jbw jbwVar = this.t;
        if (jbwVar == null || jbwVar.b != 1) {
            return;
        }
        jbwVar.a();
    }

    public final void l() {
        jlm jlmVar = f().b;
        long a = jpn.a(0, f().a().length());
        long j = jpm.a;
        jvu jvuVar = new jvu(jlmVar, a);
        this.c.invoke(jvuVar);
        this.p = jvu.b(this.p, null, jvuVar.c, 5);
        i(true);
    }

    public final void m(iak iakVar) {
        this.v.b(iakVar);
    }

    public final void n(long j) {
        eva evaVar = this.d;
        if (evaVar != null) {
            evaVar.g(j);
        }
        eva evaVar2 = this.d;
        if (evaVar2 != null) {
            evaVar2.k(jpm.a);
        }
        if (jpm.i(j)) {
            return;
        }
        j();
    }

    public final void o(euf eufVar) {
        this.u.b(eufVar);
    }

    public final void p(eug eugVar) {
        eva evaVar = this.d;
        if (evaVar != null) {
            if (evaVar.c() == eugVar) {
                evaVar = null;
            }
            if (evaVar != null) {
                evaVar.h(eugVar);
            }
        }
    }

    public final void q(long j) {
        eva evaVar = this.d;
        if (evaVar != null) {
            evaVar.k(j);
        }
        eva evaVar2 = this.d;
        if (evaVar2 != null) {
            evaVar2.g(jpm.a);
        }
        if (jpm.i(j)) {
            return;
        }
        j();
    }

    public final void r(boolean z) {
        eva evaVar = this.d;
        if (evaVar != null) {
            evaVar.m(z);
        }
        if (z) {
            A();
        } else {
            k();
        }
    }

    public final boolean s() {
        return ((Boolean) this.k.a()).booleanValue();
    }

    public final boolean t() {
        return ((Boolean) this.l.a()).booleanValue();
    }

    public final void w() {
        ffsk ffskVar = this.h;
        if (ffskVar != null) {
            ffqy.d(ffskVar, null, ffsm.d, new fgt(this, null), 1);
        }
    }

    public final void z() {
        ffsk ffskVar = this.h;
        if (ffskVar != null) {
            ffqy.d(ffskVar, null, ffsm.d, new fgx(this, null), 1);
        }
    }

    public fhi(eyo eyoVar) {
        this.a = eyoVar;
        this.b = eyq.a;
        this.c = fgw.a;
        this.e = new hic(new jvu((String) null, 0L, 7), hla.a);
        int i = jwn.d;
        this.f = jwm.a;
        this.k = new hic(true, hla.a);
        this.l = new hic(true, hla.a);
        this.m = 0L;
        this.o = 0L;
        this.u = new hic(null, hla.a);
        this.v = new hic(null, hla.a);
        this.w = -1;
        this.p = new jvu((String) null, 0L, 7);
        this.q = new fhh(this);
        this.r = new fgv(this);
    }
}
