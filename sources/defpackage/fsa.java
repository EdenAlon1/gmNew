package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fsa extends hvh implements isu, itg, its {
    private final float a;
    public final boolean b;
    public final ffix c;
    public fsg d;
    public float e;
    public boolean g;
    public final dwn i;
    private final ibz j;
    public long f = 0;
    public final cok h = new cok((byte[]) null);

    public fsa(dwn dwnVar, boolean z, float f, ibz ibzVar, ffix ffixVar) {
        this.i = dwnVar;
        this.b = z;
        this.a = f;
        this.j = ibzVar;
        this.c = ffixVar;
    }

    public abstract void a(dwp dwpVar, long j, float f);

    public abstract void b(ifr ifrVar);

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    @Override // defpackage.hvh
    public final void dT() {
        ffqy.d(D(), null, null, new frz(this, null), 3);
    }

    public abstract void g(dwp dwpVar);

    @Override // defpackage.its
    public final void i(long j) {
        float em;
        this.g = true;
        jzn g = isx.g(this);
        this.f = kag.d(j);
        if (Float.isNaN(this.a)) {
            boolean z = this.b;
            long j2 = this.f;
            em = iak.a(ial.a(iar.c(j2), iar.a(j2))) / 2.0f;
            if (z) {
                em += g.em(10.0f);
            }
        } else {
            em = g.em(this.a);
        }
        this.e = em;
        cok cokVar = this.h;
        Object[] objArr = cokVar.b;
        int i = cokVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            k((dwr) objArr[i2]);
        }
        this.h.c();
    }

    public final long j() {
        return this.j.a();
    }

    public final void k(dwr dwrVar) {
        if (dwrVar instanceof dwp) {
            a((dwp) dwrVar, this.f, this.e);
        } else if (dwrVar instanceof dwq) {
            g(((dwq) dwrVar).a);
        } else if (dwrVar instanceof dwo) {
            g(((dwo) dwrVar).a);
        }
    }

    @Override // defpackage.itg
    public final void s(ifo ifoVar) {
        ifo ifoVar2;
        long f;
        ifoVar.p();
        fsg fsgVar = this.d;
        if (fsgVar != null) {
            float f2 = this.e;
            long j = j();
            float floatValue = ((Number) fsgVar.c.d()).floatValue();
            if (floatValue > 0.0f) {
                f = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), floatValue, ibw.f(j));
                if (fsgVar.a) {
                    float c = iar.c(ifoVar.b());
                    float a = iar.a(ifoVar.b());
                    ifl t = ifoVar.t();
                    long a2 = t.a();
                    t.b().l();
                    try {
                        t.c.b(0.0f, 0.0f, c, a, 1);
                        ifoVar2 = ifoVar;
                        ifq.e(ifoVar2, f, f2, 0L, null, 0, 124);
                    } finally {
                        t.b().j();
                        t.h(a2);
                    }
                } else {
                    ifoVar2 = ifoVar;
                    ifq.e(ifoVar2, f, f2, 0L, null, 0, 124);
                }
                b(ifoVar2);
            }
        }
        ifoVar2 = ifoVar;
        b(ifoVar2);
    }

    @Override // defpackage.itg
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.its
    public final /* synthetic */ void dY(ioc iocVar) {
    }
}
