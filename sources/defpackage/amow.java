package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amow implements ctbj {
    final /* synthetic */ amoz a;

    public amow(amoz amozVar) {
        this.a = amozVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final amoz amozVar = this.a;
        amozVar.d = amozVar.b.a(amoz.d(amozVar.c.a), "ConversationClassificationsObservableSupplier#queryMobileBertScamConversationClassification").f(new ctbf() { // from class: amot
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                elfl c;
                amoz amozVar2 = amoz.this;
                c = axol.c(amozVar2.a, ffhe.a, ffsm.a, new amoy(amozVar2, null));
                return c;
            }
        }, "ConversationClassificationsObservableSupplier::register", "ConversationClassificationsObservableSupplier::callback", "ConversationClassificationsObservableSupplier::unregister");
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
