package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anvt implements ctbj {
    final /* synthetic */ anvw a;

    public anvt(anvw anvwVar) {
        this.a = anvwVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final anvw anvwVar = this.a;
        anvwVar.d = anvwVar.b.a(anvw.d(anvwVar.c.a), "MessageAnnotationSuggestionObservableSupplierV2#suggestionsQueryMessageAnnotations").f(new ctbf() { // from class: anvp
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                elfl c;
                anvw anvwVar2 = anvw.this;
                c = axol.c(anvwVar2.a, ffhe.a, ffsm.a, new anvv(anvwVar2, null));
                return c;
            }
        }, "MessageAnnotationSuggestionObservableSupplierV2::register", "MessageAnnotationSuggestionObservableSupplierV2::callback", "MessageAnnotationSuggestionObservableSupplierV2::unregister");
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
