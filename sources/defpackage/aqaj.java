package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqaj implements ctbj {
    final /* synthetic */ aqam a;

    public aqaj(aqam aqamVar) {
        this.a = aqamVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final aqam aqamVar = this.a;
        aqamVar.d = ctbt.b(aqamVar.b.a(aqamVar.f, "MessageReplyCountObservableSupplier#repliesQuery").f(new ctbf() { // from class: aqac
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                elfl c;
                aqam aqamVar2 = aqam.this;
                c = axol.c(aqamVar2.a, ffhe.a, ffsm.a, new aqal(aqamVar2, null));
                return c;
            }
        }, "MessageReplyCountObservableSupplier::register", "MessageReplyCountObservableSupplier::callback", "MessageReplyCountObservableSupplier::unregister"));
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
