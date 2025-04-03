package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class dbut implements ejlr<Void, Void> {
    final /* synthetic */ dbuw a;

    public dbut(dbuw dbuwVar) {
        this.a = dbuwVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ensk h = dbuw.a.h();
        h.Y(ente.a, "BugleGDitto");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer$4", "onSuccess", 537, "GaiaPairingSettingsFragmentPeer.java")).q("Successfully disabled Gaia device pairing if Qr pairing exists");
        this.a.c();
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        ensk j = dbuw.a.j();
        j.Y(ente.a, "BugleGDitto");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer$4", "onFailure", (char) 543, "GaiaPairingSettingsFragmentPeer.java")).q("Failed to check if Qr pairing exists and disable Gaia device pairing");
        this.a.c();
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
