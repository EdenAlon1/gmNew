package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgiq extends ffhv implements ffjm {
    final /* synthetic */ cgis a;
    final /* synthetic */ Exception b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgiq(cgis cgisVar, Exception exc, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cgisVar;
        this.b = exc;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgiq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk j = cgis.a.j();
        j.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) ((enrr) j).g(this.b);
        enrrVar.Y(csux.O, "TrustedContactsSyncManager");
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/kids/sync/TrustedContactsSyncManager", "logListenerNotRegistered", 118, "TrustedContactsSyncManager.kt")).q("Failed to register the listener.");
        ((akzt) this.a.i.b()).c("Bugle.Kids.AllowlistUpdate.Listener.FailedToBeRegistered");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgiq(this.a, this.b, ffguVar);
    }
}
