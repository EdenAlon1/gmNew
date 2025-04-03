package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class olu {
    public final olt a;
    public final hho b;
    public final hho c;
    private final ffxx d;
    private final ffhd e;

    public olu(ffxx ffxxVar) {
        this.d = ffxxVar;
        ffbz ffbzVar = jcc.a;
        ffhd a = jca.a();
        this.e = a;
        olt oltVar = new olt(this, a, ffxxVar instanceof fgcq ? (ojf) ffdx.M(((fgcq) ffxxVar).d()) : null);
        this.a = oltVar;
        this.b = new hic(oltVar.b(), hla.a);
        odk odkVar = (odk) oltVar.j.c();
        if (odkVar == null) {
            ofx ofxVar = olz.a.b;
            ofy ofyVar = olz.a;
            odkVar = new odk(ofxVar, ofyVar.c, ofyVar.d, ofyVar);
        }
        this.c = new hic(odkVar, hla.a);
    }

    public final int a() {
        return c().a();
    }

    public final odk b() {
        return (odk) this.c.a();
    }

    public final off c() {
        return (off) this.b.a();
    }

    public final Object d(ffgu ffguVar) {
        Object a = new fgbq(this.a.j).a(new olr(this), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    public final Object e(ffgu ffguVar) {
        Object b = ffyk.b(this.d, new ols(this, null), ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }

    public final Object f(int i) {
        this.a.d(i);
        return c().get(i);
    }

    public final Object g(int i) {
        return c().get(i);
    }
}
