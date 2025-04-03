package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxep extends abo {
    final /* synthetic */ cxeq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxep(cxeq cxeqVar) {
        super(true);
        this.a = cxeqVar;
    }

    @Override // defpackage.abo
    public final void b() {
        cxeq cxeqVar = this.a;
        if (!cxeqVar.a.W().isPresent()) {
            cxeqVar.d.h(false);
            cxeqVar.a.gE().d();
            return;
        }
        cxeq.a(cxeqVar.a);
        ea h = cxeqVar.a.a().h("messages");
        if (h instanceof cxfj) {
            ((cxfj) h).H().b(-1);
        }
    }
}
