package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anwo implements ctbj {
    final /* synthetic */ anwr a;

    public anwo(anwr anwrVar) {
        this.a = anwrVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final anwr anwrVar = this.a;
        anwrVar.d = anwrVar.b.a(anwr.d(anwrVar.c.a), "RbmSuggestionObservableSupplierV2#suggestionsQueryRbm").f(new ctbf() { // from class: anwm
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                elfl c;
                anwr anwrVar2 = anwr.this;
                c = axol.c(anwrVar2.a, ffhe.a, ffsm.a, new anwq(anwrVar2, null));
                return c;
            }
        }, "RbmSuggestionObservableSupplierV2::register", "RbmSuggestionObservableSupplierV2::callback", "RbmSuggestionObservableSupplierV2::unregister");
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
