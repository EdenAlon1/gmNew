package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vtl implements ejwd<czuk> {
    final /* synthetic */ vvn a;

    public vtl(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        ensk j = vvn.a.j();
        j.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) ((enrr) j).g(th);
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$15", "onError", 2445, "ConversationFragmentPeer.java")).q("ConversationFragment: Error on Magic Compose settings");
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        czuk czukVar = (czuk) obj;
        ensk e = vvn.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$15", "onNewData", 2434, "ConversationFragmentPeer.java")).t("ConversationFragment: onNewData: Magic Compose settings result: %s", czukVar);
        this.a.L.set(czukVar);
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
