package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vtk implements ejwd<aixr> {
    final /* synthetic */ vvn a;

    public vtk(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        ensk j = vvn.a.j();
        j.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) ((enrr) j).g(th);
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$14", "onError", 2405, "ConversationFragmentPeer.java")).q("ConversationFragment: Error on Magic Compose availability");
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        aixr aixrVar = (aixr) obj;
        ensk e = vvn.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$14", "onNewData", 2387, "ConversationFragmentPeer.java")).t("ConversationFragment: onNewData: Penpal availability result: %s", aixrVar);
        this.a.K.set(aixrVar);
        ensk e2 = vvn.a.e();
        e2.Y(ente.a, "Bugle");
        enrr enrrVar2 = (enrr) e2;
        enrrVar2.Y(csux.p, this.a.M);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$14", "onNewData", 2393, "ConversationFragmentPeer.java")).q("ConversationFragment: Updating Magic Compose visibility on penpal availability new data");
        this.a.aN();
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
