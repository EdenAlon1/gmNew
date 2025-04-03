package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anxi implements ctbj {
    final /* synthetic */ anxm a;

    public anxi(anxm anxmVar) {
        this.a = anxmVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        bvhc c;
        final anxm anxmVar = this.a;
        becj becjVar = anxmVar.b;
        c = ctrt.c(anxmVar.d.a, null, null);
        anxmVar.e = ctbt.b(becjVar.a(c, "ScreenEffectSuggestionObservableSupplierV2#suggestionsQuery").f(new ctbf() { // from class: anxg
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                elfl c2;
                anxm anxmVar2 = anxm.this;
                c2 = axol.c(anxmVar2.a, ffhe.a, ffsm.a, new anxk(anxmVar2, null));
                return c2;
            }
        }, "ScreenEffectSuggestionObservableSupplierV2::register", "ScreenEffectSuggestionObservableSupplierV2::callback", "ScreenEffectSuggestionObservableSupplierV2::unregister"));
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
