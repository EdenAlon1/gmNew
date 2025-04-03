package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgip extends ffhv implements ffjm {
    final /* synthetic */ cgis a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgip(cgis cgisVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cgisVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgip) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = cgis.a.h();
        h.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.O, "TrustedContactsSyncManager");
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/kids/sync/TrustedContactsSyncManager", "logListenerRegistered", 107, "TrustedContactsSyncManager.kt")).q("Successfully registered the listener.");
        ((akzt) this.a.i.b()).c("Bugle.Kids.AllowlistUpdate.Listener.Registered");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgip(this.a, ffguVar);
    }
}
