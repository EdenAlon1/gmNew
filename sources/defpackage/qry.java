package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qry extends igq implements hjk {
    public final qqo a;
    public final qsu b;
    public final hho c;
    public final hho d;
    public final hho e;
    private final hho f;
    private final hho g;
    private final ffsk h;
    private ffud i;

    public qry(qqo qqoVar, qsu qsuVar, ffsk ffskVar) {
        qqoVar.getClass();
        ffskVar.getClass();
        this.a = qqoVar;
        this.b = qsuVar;
        this.c = new hic(qsx.a, hla.a);
        this.d = new hic(null, hla.a);
        this.f = new hic(Float.valueOf(1.0f), hla.a);
        this.g = new hic(null, hla.a);
        this.e = new hic(null, hla.a);
        ffsk d = ffsl.d(ffskVar, new ffvf(ffui.c(ffskVar.hT())));
        ffsd ffsdVar = fftc.a;
        this.h = ffsl.d(d, fghh.a.j());
    }

    @Override // defpackage.igq
    public final long a() {
        igq j = j();
        if (j != null) {
            return j.a();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.igq
    protected final void b(ifr ifrVar) {
        igq j = j();
        if (j != null) {
            j.e(ifrVar, ifrVar.b(), ((Number) this.f.a()).floatValue(), (ibx) this.g.a());
        }
    }

    @Override // defpackage.igq
    protected final void c(float f) {
        this.f.b(Float.valueOf(f));
    }

    @Override // defpackage.igq
    protected final void d(ibx ibxVar) {
        this.g.b(ibxVar);
    }

    @Override // defpackage.hjk
    public final void g() {
        Object j = j();
        hjk hjkVar = j instanceof hjk ? (hjk) j : null;
        if (hjkVar != null) {
            hjkVar.g();
        }
    }

    @Override // defpackage.hjk
    public final void h() {
        Object j = j();
        hjk hjkVar = j instanceof hjk ? (hjk) j : null;
        if (hjkVar != null) {
            hjkVar.h();
        }
        ffud ffudVar = this.i;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.i = null;
    }

    @Override // defpackage.hjk
    public final void i() {
        Object j = j();
        hjk hjkVar = j instanceof hjk ? (hjk) j : null;
        if (hjkVar != null) {
            hjkVar.i();
        }
        if (this.i == null) {
            this.i = ffqy.d(this.h, null, null, new qrx(this, null), 3);
        }
    }

    public final igq j() {
        return (igq) this.e.a();
    }

    public final qsx k() {
        return (qsx) this.c.a();
    }
}
