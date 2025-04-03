package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class envw extends enwb {
    final /* synthetic */ envy a;

    public envw(envy envyVar) {
        this.a = envyVar;
    }

    @Override // defpackage.enwb
    public final enwd a() {
        if (this.a.a.compareAndSet(false, true)) {
            enrm enrmVar = (enrm) envx.a.j();
            enrmVar.aa(ensy.SMALL);
            ((enrm) enrmVar.h("com/google/common/flogger/context/NoOpContextDataProvider$NoOpScopedLoggingContext", "logWarningOnceOnly", 55, "NoOpContextDataProvider.java")).q("Scoped logging contexts are disabled; no context data provider was installed.\nTo enable scoped logging contexts in your application, see the site-specific Platform class used to configure logging behaviour.\nDefault Platform: com.google.common.flogger.backend.system.DefaultPlatform");
        }
        return this.a;
    }
}
