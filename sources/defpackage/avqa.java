package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avqa implements erqj {
    private final awui a;

    public avqa(awui awuiVar) {
        this.a = awuiVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        avmz avmzVar = (avmz) obj;
        ensk h = avqb.a.h();
        h.Y(ente.a, "BugleRcsCapabilities");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CapabilitiesLoggingInterceptor$LoggingCallback", "onSuccess", 73, "CapabilitiesLoggingInterceptor.java")).J("Returned %d capabilities for endpoint %s with timestamp %d", Integer.valueOf(avmzVar.a().b.size()), cskt.b(this.a.d), Long.valueOf(avmzVar.b().toEpochMilli()));
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
    }
}
