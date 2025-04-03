package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class dbus implements ejlr<Integer, Integer> {
    final /* synthetic */ dbuw a;

    public dbus(dbuw dbuwVar) {
        this.a = dbuwVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ensk h = dbuw.a.h();
        h.Y(ente.a, "BugleGDitto");
        enrr enrrVar = (enrr) ((enrr) h).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer$3", "onSuccess", 517, "GaiaPairingSettingsFragmentPeer.java");
        enrrVar.D("Successfully deleted %d out of %d Gaia pairing records from the Desktop table", (Integer) obj2, (Integer) obj);
        ((akzt) this.a.l.b()).c("Bugle.Gaia.Unpair.Desktops.Success");
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        ensk j = dbuw.a.j();
        j.Y(ente.a, "BugleGDitto");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer$3", "onFailure", 525, "GaiaPairingSettingsFragmentPeer.java")).t("Failed to delete %d Gaia pairing records from the Desktop table", (Integer) obj);
        ((akzt) this.a.l.b()).c("Bugle.Gaia.Unpair.Desktops.Failure");
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
