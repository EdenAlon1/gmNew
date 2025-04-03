package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoxs implements ctbx {
    final /* synthetic */ aoyd a;
    private final ctbx b;

    public aoxs(aoyd aoydVar, ctbx ctbxVar) {
        this.a = aoydVar;
        this.b = ctbxVar;
    }

    @Override // defpackage.ctbx
    public final void a() {
        this.b.a();
        ensk h = aoyd.a.h();
        h.Y(ente.a, "BugleMapi");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.q, this.a.j);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$LogOnUnsubscribeToken", "unsubscribe", 2025, "CoreBugleMessageRepository.java")).q("Unsubscribed from message callbacks.");
    }

    @Override // defpackage.ctbx, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ctbw.a(this);
    }
}
