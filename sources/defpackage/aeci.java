package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeci extends vm {
    final /* synthetic */ ecri a;
    final /* synthetic */ aedh b;

    public aeci(aedh aedhVar, ecri ecriVar) {
        this.a = ecriVar;
        this.b = aedhVar;
    }

    @Override // defpackage.vm
    public final void d(int i, int i2) {
        if (this.b.a() > 0) {
            aedh aedhVar = this.b;
            aedhVar.Y.f(this.a, new ecda("HomeRenderedFirstConversationLatency"), null, ecrh.SUCCESS);
            ((aehw) this.b.p.b()).C(this);
        }
    }
}
