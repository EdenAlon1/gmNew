package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apfg implements ctbj {
    final /* synthetic */ apfj a;

    public apfg(apfj apfjVar) {
        this.a = apfjVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final apfj apfjVar = this.a;
        apfjVar.g = ctbt.b(apfjVar.b.a(apfjVar.d(), "ClassificationObservableSupplier#suggestionsQuery").f(new ctbf() { // from class: apew
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                elfl c;
                apfj apfjVar2 = apfj.this;
                c = axol.c(apfjVar2.a, ffhe.a, ffsm.a, new apfi(apfjVar2, null));
                return c;
            }
        }, "ClassificationObservableSupplier::register", "ClassificationObservableSupplier::callback", "ClassificationObservableSupplier::unregister"));
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.a.g;
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        this.a.g = null;
    }
}
