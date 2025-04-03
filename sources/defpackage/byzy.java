package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class byzy implements ljv {
    final /* synthetic */ aqge a;
    final /* synthetic */ ejvp b;
    final /* synthetic */ Object c;
    private aqge d;
    private ctbx e;

    public byzy(aqge aqgeVar, ejvp ejvpVar, Object obj) {
        this.a = aqgeVar;
        this.b = ejvpVar;
        this.c = obj;
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        this.d = null;
        ctbx ctbxVar = this.e;
        if (ctbxVar != null) {
            ctbxVar.a();
            this.e = null;
        }
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        aqge aqgeVar = this.a;
        this.d = aqgeVar;
        final ejvp ejvpVar = this.b;
        final Object obj = this.c;
        ctbx a = aqgeVar.a(new aqgd() { // from class: byzx
            @Override // defpackage.aqgd
            public final elfl a() {
                ejvp.this.a(elfo.e(null), obj);
                return elfo.e(null);
            }
        });
        this.e = a;
        if (a != null) {
            this.b.a(elfo.e(null), this.c);
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
