package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnpp implements cnoz {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PPSatelliteConnectionChangeListener");
    private final ffbr b;
    private final attf c;

    public cnpp(ffbr ffbrVar, attf attfVar) {
        this.b = ffbrVar;
        this.c = attfVar;
    }

    @Override // defpackage.cnoz
    public final void b(azsu azsuVar) {
        if (this.c.a()) {
            ensk h = a.h();
            h.Y(ente.a, "BugleSatellite");
            ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PPSatelliteConnectionChangeListener", "onNewInServiceSatelliteInternetConnection", 45, "PPSatelliteConnectionChangeListener.kt")).t("Connected to Satellite connection, schedule period pull messages work for %s", azsuVar);
            ((cnpq) this.b.b()).b();
        }
    }

    @Override // defpackage.cnoz
    public final void c(azsu azsuVar) {
        if (this.c.a()) {
            ensk h = a.h();
            h.Y(ente.a, "BugleSatellite");
            ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PPSatelliteConnectionChangeListener", "onNewInServiceTerrestrialInternetConnection", 54, "PPSatelliteConnectionChangeListener.kt")).t("Connected to Terrestrial connection, cancel period pull messages work for %s", azsuVar);
            ((cnpq) this.b.b()).a();
        }
    }

    @Override // defpackage.cnoz
    public final void a(azsu azsuVar) {
    }

    @Override // defpackage.cnoz
    public final void d(azsu azsuVar) {
    }

    @Override // defpackage.cnoz
    public final void e() {
    }

    @Override // defpackage.cnoz
    public final void f() {
    }

    @Override // defpackage.cnoz
    public final void g() {
    }
}
