package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqmt implements ctbj {
    final /* synthetic */ aqmw a;

    public aqmt(aqmw aqmwVar) {
        this.a = aqmwVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final aqmw aqmwVar = this.a;
        aqmwVar.e = aqmwVar.b.a(aqmw.d(null), "RecipientBusinessInfoObservableSupplier#businessInfoQuery").f(new ctbf() { // from class: aqmq
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                elfl c;
                aqmw aqmwVar2 = aqmw.this;
                c = axol.c(aqmwVar2.a, ffhe.a, ffsm.a, new aqmv(aqmwVar2, null));
                return c;
            }
        }, "RecipientBusinessInfoObservableSupplier::register", "RecipientBusinessInfoObservableSupplier::callback", "RecipientBusinessInfoObservableSupplier::unregister");
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
