package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avsx implements erqj {
    private final awui a;

    public avsx(awui awuiVar) {
        this.a = awuiVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String b = cskt.b(this.a.d);
        ensk h = avsy.a.h();
        h.Y(ente.a, "BugleRcsCapabilities");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/onlinestatus/OnlineStatusLoggingInterceptor$LoggingCallback", "onSuccess", 58, "OnlineStatusLoggingInterceptor.java")).D("OnlineStatus %s returned for endpoint %s", ((avtb) obj).name(), b);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
    }
}
