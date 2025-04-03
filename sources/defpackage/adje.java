package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adje implements ejxk {
    final /* synthetic */ adjf a;

    public adje(adjf adjfVar) {
        this.a = adjfVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        if (csgj.a()) {
            ensk j = adjf.c.j();
            j.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragmentPeer$AccountMenuCardEntryPointUiDataCallback", "onLoadError", (char) 385, "BugleNonAccountScopedOGParticleDiscActionFragmentPeer.java")).q("No linked account or failed to get linked account. Backup sync card will unconditionally refresh.");
            this.a.r = false;
        }
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        if (csgj.a()) {
            ensk e = adjf.c.e();
            e.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragmentPeer$AccountMenuCardEntryPointUiDataCallback", "onLoaded", 377, "BugleNonAccountScopedOGParticleDiscActionFragmentPeer.java")).q("retrieved linked account for backup sync card refresh.");
            this.a.r = bool;
        }
    }
}
