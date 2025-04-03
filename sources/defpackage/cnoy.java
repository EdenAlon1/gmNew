package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnoy implements cnjs, cnjx {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener");
    private final cnom b;

    public cnoy(cnom cnomVar) {
        this.b = cnomVar;
    }

    private final void c() {
        enru enruVar = a;
        ensk e = enruVar.e();
        e.Y(ente.a, "BugleSatellite");
        ((enrr) e.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener", "registerForSatelliteConnection", 62, "SatelliteBootAndPackageReplacedListener.kt")).q("registerNetworkCallbacksForNewSatelliteConnection executing...");
        if (!ctid.h) {
            ensk e2 = enruVar.e();
            e2.Y(ente.a, "BugleSatellite");
            ((enrr) e2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener", "registerForSatelliteConnection", 67, "SatelliteBootAndPackageReplacedListener.kt")).t("Satellite Flag disabled. Os.isAtLeastU: %s", Boolean.valueOf(ctid.h));
        } else {
            this.b.b();
            ensk e3 = enruVar.e();
            e3.Y(ente.a, "BugleSatellite");
            ((enrr) e3.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener", "registerForSatelliteConnection", 65, "SatelliteBootAndPackageReplacedListener.kt")).q("registerNetworkCallbacksForNewSatelliteConnection executed.");
        }
    }

    @Override // defpackage.cnjs
    public final void a() {
        ensk e = a.e();
        e.Y(ente.a, "BugleSatellite");
        ((enrr) e.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener", "onBootComplete", 49, "SatelliteBootAndPackageReplacedListener.kt")).q("onBootComplete executing...");
        c();
    }

    @Override // defpackage.cnjx
    public final void b() {
        ensk e = a.e();
        e.Y(ente.a, "BugleSatellite");
        ((enrr) e.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener", "onPackageReplaced", 57, "SatelliteBootAndPackageReplacedListener.kt")).q("onPackageReplaced executing...");
        c();
    }
}
