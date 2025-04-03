package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmhw implements ljv {
    final /* synthetic */ cmii a;
    final /* synthetic */ csmx b;
    final /* synthetic */ ckgc c;

    public cmhw(cmii cmiiVar, csmx csmxVar, ckgc ckgcVar) {
        this.a = cmiiVar;
        this.b = csmxVar;
        this.c = ckgcVar;
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        csmz csmzVar = (csmz) ((csjk) this.a.p.b()).a();
        csms csmsVar = (csms) csmv.a.createBuilder();
        csmu csmuVar = csmu.ALL_ACTIVE_SUBSCRIPTIONS;
        csmsVar.copyOnWrite();
        csmv csmvVar = (csmv) csmsVar.instance;
        csmvVar.c = csmuVar.e;
        csmvVar.b |= 1;
        csmzVar.n(this.b, (csmv) csmsVar.build());
        ((ckge) ((csjk) this.a.k.b()).a()).l(this.c);
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        csmz csmzVar = (csmz) ((csjk) this.a.p.b()).a();
        csms csmsVar = (csms) csmv.a.createBuilder();
        csmu csmuVar = csmu.ALL_ACTIVE_SUBSCRIPTIONS;
        csmsVar.copyOnWrite();
        csmv csmvVar = (csmv) csmsVar.instance;
        csmvVar.c = csmuVar.e;
        csmvVar.b |= 1;
        csmzVar.m(this.b, (csmv) csmsVar.build());
        ((ckge) ((csjk) this.a.k.b()).a()).i(this.c, this.a.g);
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
