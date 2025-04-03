package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anwe implements ctbj {
    final /* synthetic */ anwh a;

    public anwe(anwh anwhVar) {
        this.a = anwhVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final anwh anwhVar = this.a;
        anwhVar.d = anwhVar.b.a(anwh.d(anwhVar.c.a), "RbmSuggestionObservableSupplier#suggestionsQueryRbm").f(new ctbf() { // from class: anvz
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                elfl c;
                anwh anwhVar2 = anwh.this;
                c = axol.c(anwhVar2.a, ffhe.a, ffsm.a, new anwg(anwhVar2, null));
                return c;
            }
        }, "RbmSuggestionObservableSupplier::register", "RbmSuggestionObservableSupplier::callback", "RbmSuggestionObservableSupplier::unregister");
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.a.d;
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        this.a.d = null;
    }
}
