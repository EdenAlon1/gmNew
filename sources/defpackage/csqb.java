package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csqb implements cnoa {
    final /* synthetic */ csqc a;

    public csqb(csqc csqcVar) {
        this.a = csqcVar;
    }

    @Override // defpackage.cnoa
    public final void a(boolean z, int i) {
        csqc csqcVar = this.a;
        csqcVar.c("SubID = " + i + " onCarrierRoamingNtnEligibleStateChanged (" + z + ")");
        csqcVar.e.put(Integer.valueOf(i), Boolean.valueOf(z));
        if (!z) {
            if (csqcVar.d()) {
                return;
            }
            ensk h = csqc.a.h();
            h.Y(ente.a, "BugleConnectivity");
            ((enrr) h.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl", "processCarrierRoamingNtnEligibleChanged", 223, "ManualSatelliteEligibilityTrackerImpl.kt")).q("Lost eligibility for manual satellite.");
            csqcVar.e(false);
            return;
        }
        if (((cnok) csqcVar.b.get()).equals(cnok.c) && !csqcVar.c.get()) {
            ensk h2 = csqc.a.h();
            h2.Y(ente.a, "BugleConnectivity");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl", "processCarrierRoamingNtnEligibleChanged", 206, "ManualSatelliteEligibilityTrackerImpl.kt")).q("Eligible for manual satellite. Ignoring active CELLULAR network and notifying listeners about eligibility");
            csqcVar.e(true);
            return;
        }
        if (((cnok) csqcVar.b.get()).a() || csqcVar.b.get() == cnok.b || csqcVar.c.get()) {
            ensk h3 = csqc.a.h();
            h3.Y(ente.a, "BugleConnectivity");
            ((enrr) h3.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl", "processCarrierRoamingNtnEligibleChanged", 219, "ManualSatelliteEligibilityTrackerImpl.kt")).q("Active data network is available. Not eligible for manual connection.");
            csqcVar.e(false);
            return;
        }
        ensk h4 = csqc.a.h();
        h4.Y(ente.a, "BugleConnectivity");
        ((enrr) h4.h("com/google/android/apps/messaging/shared/util/connectivity/satellite/ManualSatelliteEligibilityTrackerImpl", "processCarrierRoamingNtnEligibleChanged", 216, "ManualSatelliteEligibilityTrackerImpl.kt")).q("No active data network. Eligible for manual connection.");
        csqcVar.e(true);
    }

    @Override // defpackage.cnoa
    public final void b(boolean z, int i) {
        csqc csqcVar = this.a;
        csqcVar.c("SubID = " + i + " onCarrierRoamingNtnModeChanged (" + z + ")");
        csqcVar.c.set(z);
        csqcVar.d.put(Integer.valueOf(i), Boolean.valueOf(z));
        if (z) {
            csqcVar.e(false);
        } else if (csqcVar.d()) {
            csqcVar.e(true);
        } else {
            csqcVar.e(false);
        }
    }
}
