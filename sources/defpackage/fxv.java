package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxv extends isz implements ixl, isu, its {
    public ftb a;
    public boolean b;
    public int c;
    public cxt d;
    public float e;
    public float f;
    private final hho g = new hic(new kaa(0), hla.a);
    private final ilx h;
    private final ilx i;

    public fxv(ftb ftbVar, boolean z, int i, cxt cxtVar) {
        this.a = ftbVar;
        this.b = z;
        this.c = i;
        this.d = cxtVar;
        fxt fxtVar = new fxt(this, null);
        iki ikiVar = ilv.a;
        imf imfVar = new imf(fxtVar);
        M(imfVar);
        this.h = imfVar;
        imf imfVar2 = new imf(new fxp(this, null));
        M(imfVar2);
        this.i = imfVar2;
    }

    @Override // defpackage.ixl
    public final /* synthetic */ long a() {
        return ixt.a;
    }

    public final float b() {
        jzn g = isx.g(this);
        float f = guj.a;
        return (g.em(74.0f) * g.eo(this.a.c())) / g.eo(256.0f);
    }

    @Override // defpackage.hvh
    public final /* synthetic */ void dL() {
        ixk.a(this);
    }

    @Override // defpackage.ixl
    public final void dU() {
        this.h.dU();
        this.i.dU();
    }

    @Override // defpackage.ixl
    public final void dV(iki ikiVar, ikk ikkVar, long j) {
        this.h.dV(ikiVar, ikkVar, j);
        this.i.dV(ikiVar, ikkVar, j);
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void dW() {
        ixk.b(this);
    }

    public final long f() {
        return ((kaa) this.g.a()).a;
    }

    @Override // defpackage.its
    public final void i(long j) {
        this.g.b(new kaa(kag.b(j)));
        this.a.b.b(new jzq(isx.g(this).ek(kaf.b(j))));
    }

    @Override // defpackage.ixl
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.its
    public final /* synthetic */ void dY(ioc iocVar) {
    }
}
