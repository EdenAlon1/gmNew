package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class dbtk implements ejlr<Void, String> {
    final /* synthetic */ dbtn a;

    public dbtk(dbtn dbtnVar) {
        this.a = dbtnVar;
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void c(Object obj, Object obj2) {
        String str = (String) obj2;
        if (!adhu.b()) {
            dbtn.a.r("No need to launch Device pairing page as the isGaiaPairingUiEnabled flag is off");
            return;
        }
        eg fe = this.a.b.fe();
        if (str.equals("QR_PAIRING")) {
            ((akvg) this.a.e.b()).J(fe, this.a.c);
            return;
        }
        if (str.equals("GAIA_PAIRING_SETTINGS")) {
            ((dbtr) this.a.d.b()).a(fe, false);
            return;
        }
        if (str.equals("EXPRESS_SIGN_IN")) {
            fe.getIntent().putExtra("EXPRESS_SIGN_IN_FLOW_KEY", admj.c.j);
            ((admk) this.a.f.b()).b((eito) this.a.g.b());
        } else {
            csjb b = dbtn.a.b();
            b.I("Unsupported device pairing page: ".concat(String.valueOf(str)));
            b.r();
        }
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        dbtn.a.s("Failed to get device pairing page", th);
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
