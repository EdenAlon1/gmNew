package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iil extends igq {
    public final hho a;
    public final hho b;
    public final iif c;
    public int d;
    public final hjz e;
    private float f;
    private ibx g;

    public iil() {
        this(new igv());
    }

    @Override // defpackage.igq
    public final long a() {
        return ((iar) this.a.a()).a;
    }

    @Override // defpackage.igq
    protected final void b(ifr ifrVar) {
        iif iifVar = this.c;
        ibx ibxVar = this.g;
        if (ibxVar == null) {
            ibxVar = iifVar.d();
        }
        if (((Boolean) this.b.a()).booleanValue() && ifrVar.q() == kah.b) {
            long a = ifrVar.a();
            ifl t = ifrVar.t();
            long a2 = t.a();
            t.b().l();
            try {
                t.c.d(-1.0f, 1.0f, a);
                iifVar.g(ifrVar, this.f, ibxVar);
            } finally {
                t.b().j();
                t.h(a2);
            }
        } else {
            iifVar.g(ifrVar, this.f, ibxVar);
        }
        this.d = g();
    }

    @Override // defpackage.igq
    protected final void c(float f) {
        this.f = f;
    }

    @Override // defpackage.igq
    protected final void d(ibx ibxVar) {
        this.g = ibxVar;
    }

    public final int g() {
        return this.e.c();
    }

    public iil(igv igvVar) {
        this.a = new hic(new iar(0L), hla.a);
        this.b = new hic(false, hla.a);
        iif iifVar = new iif(igvVar);
        iifVar.d = new iik(this);
        this.c = iifVar;
        this.e = new hhy(0);
        this.f = 1.0f;
        this.d = -1;
    }
}
