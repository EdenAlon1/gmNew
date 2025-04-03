package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyw extends isz implements ixl, hyk, hzl {
    public ffix a;
    public boolean b;
    private final ilx c;

    public eyw(ffix ffixVar) {
        this.a = ffixVar;
        eyv eyvVar = new eyv(this);
        iki ikiVar = ilv.a;
        imf imfVar = new imf(null, null, null, eyvVar);
        M(imfVar);
        this.c = imfVar;
    }

    @Override // defpackage.ixl
    public final long a() {
        return itf.a(isx.g(this));
    }

    @Override // defpackage.hvh
    public final /* synthetic */ void dL() {
        ixk.a(this);
    }

    @Override // defpackage.hyk
    public final void dP(hzo hzoVar) {
        this.b = hzoVar.b();
    }

    @Override // defpackage.ixl
    public final void dU() {
        this.c.dU();
    }

    @Override // defpackage.ixl
    public final void dV(iki ikiVar, ikk ikkVar, long j) {
        this.c.dV(ikiVar, ikkVar, j);
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void dW() {
        ixk.b(this);
    }

    @Override // defpackage.ixl
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void y() {
    }
}
