package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anvi implements ctbj {
    final /* synthetic */ anvl a;

    public anvi(anvl anvlVar) {
        this.a = anvlVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final anvl anvlVar = this.a;
        anvlVar.d = anvlVar.b.a(anvl.d(anvlVar.c.a), "MessageAnnotationSuggestionObservableSupplier#suggestionsQueryMessageAnnotations").f(new ctbf() { // from class: anvg
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                elfl c;
                anvl anvlVar2 = anvl.this;
                c = axol.c(anvlVar2.a, ffhe.a, ffsm.a, new anvk(anvlVar2, null));
                return c;
            }
        }, "MessageAnnotationSuggestionObservableSupplier::register", "MessageAnnotationSuggestionObservableSupplier::callback", "MessageAnnotationSuggestionObservableSupplier::unregister");
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
