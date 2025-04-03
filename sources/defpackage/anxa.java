package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anxa implements ctbj {
    final /* synthetic */ anxd a;

    public anxa(anxd anxdVar) {
        this.a = anxdVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        bvhc c;
        final anxd anxdVar = this.a;
        becj becjVar = anxdVar.b;
        c = ctrt.c(anxdVar.d.a, null, null);
        anxdVar.e = ctbt.b(becjVar.a(c, "ScreenEffectSuggestionObservableSupplier#suggestionsQuery").f(new ctbf() { // from class: anwx
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                elfl c2;
                anxd anxdVar2 = anxd.this;
                c2 = axol.c(anxdVar2.a, ffhe.a, ffsm.a, new anxc(anxdVar2, null));
                return c2;
            }
        }, "ScreenEffectSuggestionObservableSupplier::register", "ScreenEffectSuggestionObservableSupplier::callback", "ScreenEffectSuggestionObservableSupplier::unregister"));
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
