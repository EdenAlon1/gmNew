package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnpc implements cnoz {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener");
    private final ffbr b;

    public cnpc(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    @Override // defpackage.cnoz
    public final void a(azsu azsuVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener", "offSatellite", 57, "SatelliteConnectionLoggerListener.kt")).t("Lost satellite connection for %s", azsuVar);
    }

    @Override // defpackage.cnoz
    public final void b(azsu azsuVar) {
        cnoj cnojVar = (cnoj) this.b.b();
        eqzr eqzrVar = (eqzr) eqzw.a.createBuilder();
        eqzrVar.getClass();
        eqzv eqzvVar = eqzv.a;
        eqzvVar.getClass();
        eqzrVar.copyOnWrite();
        eqzw eqzwVar = (eqzw) eqzrVar.instance;
        eqzwVar.c = eqzvVar;
        eqzwVar.b = 100;
        cnojVar.a(eqzq.a(eqzrVar));
    }

    @Override // defpackage.cnoz
    public final void c(azsu azsuVar) {
        cnoj cnojVar = (cnoj) this.b.b();
        eqzr eqzrVar = (eqzr) eqzw.a.createBuilder();
        eqzrVar.getClass();
        eqzt eqztVar = eqzt.a;
        eqztVar.getClass();
        eqzrVar.copyOnWrite();
        eqzw eqzwVar = (eqzw) eqzrVar.instance;
        eqzwVar.c = eqztVar;
        eqzwVar.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        cnojVar.a(eqzq.a(eqzrVar));
    }

    @Override // defpackage.cnoz
    public final void d(azsu azsuVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener", "onSatelliteManualConnectEligible", 61, "SatelliteConnectionLoggerListener.kt")).H("Satellite manual connection eligible: %b for %s", true, azsuVar);
    }

    @Override // defpackage.cnoz
    public final void e() {
        ensk h = a.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener", "offDefaultDataSatelliteToTerrestrial", 53, "SatelliteConnectionLoggerListener.kt")).q("Default data is newly terrestrial");
    }

    @Override // defpackage.cnoz
    public final void f() {
        ensk h = a.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener", "onDefaultDataSatelliteEvent", 45, "SatelliteConnectionLoggerListener.kt")).q("Default data is newly satellite");
    }

    @Override // defpackage.cnoz
    public final void g() {
        ensk h = a.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener", "onSmsSatelliteEvent", 49, "SatelliteConnectionLoggerListener.kt")).q("On sms satellite event");
    }
}
