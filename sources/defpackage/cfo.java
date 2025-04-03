package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cfo implements ljv {
    final /* synthetic */ cfp a;

    public cfo(cfp cfpVar) {
        this.a = cfpVar;
    }

    @Override // defpackage.ljv
    public final void c(lkr lkrVar) {
        this.a.a.e(lki.ON_PAUSE);
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        this.a.a.e(lki.ON_RESUME);
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        this.a.a.e(lki.ON_STOP);
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        this.a.a.e(lki.ON_DESTROY);
        lkrVar.P().d(this);
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        this.a.a.e(lki.ON_CREATE);
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        this.a.a.e(lki.ON_START);
    }
}
