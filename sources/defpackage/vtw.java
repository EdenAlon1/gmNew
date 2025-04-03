package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vtw extends txv<tzd> {
    final /* synthetic */ vvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtw(vvn vvnVar) {
        super("Conversation recipients");
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ensk e = vvn.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$20", "onNewData", 2772, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Conversation recipients");
        vvn vvnVar = this.a;
        vvnVar.bs.b(vvnVar.cd, vvnVar.N.G());
        vvn vvnVar2 = this.a;
        vvnVar2.ce = (tzd) obj;
        vvnVar2.ce.getClass();
        vvnVar2.cJ = true;
    }
}
