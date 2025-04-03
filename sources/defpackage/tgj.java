package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tgj implements ejlr<Void, Void> {
    final /* synthetic */ tgk a;

    public tgj(tgk tgkVar) {
        this.a = tgkVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        this.a.k.getClass();
        ensk h = tgk.a.h();
        h.Y(ente.a, "BugleCms");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/cloudstore/fi/FiAccountFragmentPeer$1", "onSuccess", 371, "FiAccountFragmentPeer.java")).q("Disabling RCS global toggle");
        ((ckaj) this.a.k.b()).h(false);
        this.a.a();
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        ensk j = tgk.a.j();
        j.Y(ente.a, "BugleCms");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/cloudstore/fi/FiAccountFragmentPeer$1", "onFailure", (char) 378, "FiAccountFragmentPeer.java")).q("Failed to disable RCS global toggle");
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
