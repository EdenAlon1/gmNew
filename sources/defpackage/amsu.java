package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amsu implements ctbj {
    final /* synthetic */ amta a;

    public amsu(amta amtaVar) {
        this.a = amtaVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final amta amtaVar = this.a;
        final amta amtaVar2 = this.a;
        amtaVar.e = ctbt.b(amtaVar.b.a(amta.j(amtaVar.c.a), "PenpalObservableSupplier#penpalQuery").f(new ctbf() { // from class: amso
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return amta.this.d();
            }
        }, "PenpalObservableSupplier::register", "PenpalObservableSupplier::callback", "PenpalObservableSupplier::unregister"), amtaVar2.d.a(new aqgd() { // from class: amst
            @Override // defpackage.aqgd
            public final elfl a() {
                return amta.this.d();
            }
        }));
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.a.e;
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        this.a.e = null;
    }
}
