package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class dbtl implements ejlr<Void, Boolean> {
    final /* synthetic */ dbtn a;

    public dbtl(dbtn dbtnVar) {
        this.a = dbtnVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (!adhu.b()) {
            dbtn.a.r("No need to launch Gaia pairing page as the isGaiaPairingUiEnabled flag is off");
            return;
        }
        eg fe = this.a.b.fe();
        fe.finish();
        if (bool.booleanValue()) {
            ((dbtr) this.a.d.b()).a(fe, true);
        } else {
            fe.getIntent().putExtra("EXPRESS_SIGN_IN_FLOW_KEY", admj.c.j);
            ((admk) this.a.f.b()).b((eito) this.a.g.b());
        }
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        dbtn.a.s("Failed to check if any Gaia account has signed in", th);
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
