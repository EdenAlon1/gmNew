package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cspm implements cnoz {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/connectivity/SatelliteNetworkStateUpdaterListener");
    private final cspp b;

    public cspm(cspp csppVar) {
        this.b = csppVar;
    }

    private final void h(cspo cspoVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) h.h("com/google/android/apps/messaging/shared/util/connectivity/SatelliteNetworkStateUpdaterListener", "queueWorkInPWQ", 56, "SatelliteNetworkStateUpdaterListener.kt")).t("PWQ schedule work with params: %s .. ", cspoVar);
        ((cevh) this.b.a.b()).a(ceyr.g("satellite_network_state_updater", cspoVar));
    }

    @Override // defpackage.cnoz
    public final void b(azsu azsuVar) {
        cspn cspnVar = (cspn) cspo.a.createBuilder();
        String b = azsuVar.b();
        cspnVar.copyOnWrite();
        cspo cspoVar = (cspo) cspnVar.instance;
        b.getClass();
        cspoVar.b = b;
        eyfy build = cspnVar.build();
        build.getClass();
        h((cspo) build);
    }

    @Override // defpackage.cnoz
    public final void c(azsu azsuVar) {
        cspn cspnVar = (cspn) cspo.a.createBuilder();
        String b = azsuVar.b();
        cspnVar.copyOnWrite();
        cspo cspoVar = (cspo) cspnVar.instance;
        b.getClass();
        cspoVar.b = b;
        eyfy build = cspnVar.build();
        build.getClass();
        h((cspo) build);
    }

    @Override // defpackage.cnoz
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.cnoz
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.cnoz
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.cnoz
    public final /* synthetic */ void a(azsu azsuVar) {
    }

    @Override // defpackage.cnoz
    public final /* synthetic */ void d(azsu azsuVar) {
    }
}
