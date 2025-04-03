package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aikb implements ljv {
    public final ffji a;
    private final ffsk b;
    private ffud c;

    public aikb(ffsk ffskVar, ffji ffjiVar) {
        this.b = ffskVar;
        this.a = ffjiVar;
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        this.c = axol.k(this.b, null, new aika(this, null), 3);
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        ffud ffudVar = this.c;
        if (ffudVar != null) {
            ffudVar.t(null);
            lkrVar.P().d(this);
        }
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }
}
