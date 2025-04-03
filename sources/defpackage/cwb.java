package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwb implements cvo, ipe {
    public static final ffbz a = ffca.b(3, cvq.a);
    public final ffsk b;
    public boolean c;
    public ioc f;
    public ioc g;
    private final /* synthetic */ ipe j;
    public final hho d = new hic(false, hla.a);
    private final ffix k = new cvt(this);
    public final ffji e = new cwa(this);
    public final hss h = new hss();
    public final cop i = new cop((byte[]) null);

    public cwb(ipe ipeVar, ffsk ffskVar) {
        this.b = ffskVar;
        this.j = ipeVar;
    }

    @Override // defpackage.cvo
    public final boolean a() {
        return ((Boolean) this.d.a()).booleanValue();
    }

    @Override // defpackage.cvo
    public final cvn b(Object obj, hfd hfdVar) {
        hfdVar.v(799702514);
        boolean D = hfdVar.D(obj);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (D || R == hfc.a) {
            R = new cvn(obj);
            hfmVar.ad(R);
        }
        cvn cvnVar = (cvn) R;
        hfmVar.Z();
        return cvnVar;
    }

    @Override // defpackage.cvo
    public final hvi c(hvi hviVar, cvn cvnVar, crw crwVar, cue cueVar, cug cugVar, cwc cwcVar, cvm cvmVar, cvk cvkVar, cwd cwdVar) {
        hvi g;
        hvi g2;
        g = huz.g(hviVar, new cvz(cvnVar, crwVar.a(), cvv.a, this, cvkVar, cwdVar, cwcVar));
        g2 = huz.g(g, new cvy(crwVar, cueVar, cugVar, cvnVar, cvmVar));
        return g2;
    }

    public final ioc d() {
        ioc iocVar = this.g;
        if (iocVar != null) {
            return iocVar;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    @Override // defpackage.ipe
    public final ioc dX(ioc iocVar) {
        return this.j.dX(iocVar);
    }

    public final void f() {
        if (this.c) {
            return;
        }
        cvr.a().c(this, this.e, this.k);
    }

    public final void g(cvd cvdVar, ffji ffjiVar, ffix ffixVar) {
        if (this.c) {
            return;
        }
        cvr.a().c(cvdVar, ffjiVar, ffixVar);
    }
}
