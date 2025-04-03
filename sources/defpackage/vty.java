package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vty extends txv<engw<aqux>> {
    final /* synthetic */ vvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vty(vvn vvnVar) {
        super("SelfIdentity");
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        engw engwVar = (engw) obj;
        if (((Boolean) bdsz.a.e()).booleanValue()) {
            ensk e = vvn.a.e();
            e.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.p, this.a.M);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$22", "onNewData", 2809, "ConversationFragmentPeer.java")).r("onNewData: SelfIdentity NumberOfActiveSelfIdentities: %d", engwVar.size());
            bcqs bcqsVar = (bcqs) this.a.cA.a();
            bcqsVar.j = bcqsVar.c.b(engwVar);
            this.a.an();
        }
    }
}
