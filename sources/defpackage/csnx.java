package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csnx implements cnoa {
    final /* synthetic */ csny a;

    public csnx(csny csnyVar) {
        this.a = csnyVar;
    }

    @Override // defpackage.cnoa
    public final void a(boolean z, int i) {
        this.a.a.D("SubID = " + i + " onCarrierRoamingNtnEligibleStateChanged (" + z + ")");
        csoa csoaVar = this.a.a;
        Map map = csoaVar.v;
        boolean H = csoaVar.H();
        map.put(Integer.valueOf(i), Boolean.valueOf(z));
        if (!z) {
            if (!H || this.a.a.H()) {
                return;
            }
            ensk h = csoa.c.h();
            h.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer$2", "onCarrierRoamingNtnEligibleStateChanged", 1187, "ConnectivityUtilImpl.java")).q("Eligibility switched from true to false. Notify the listeners.");
            this.a.a.E(cnol.e, "onCarrierRoamingNtnEligibleStateChanged");
            return;
        }
        if (((ausa) this.a.a.w.b()).a() && ((cnok) this.a.a.q.get()).equals(cnok.c) && !this.a.a.s.get()) {
            ensk h2 = csoa.c.h();
            h2.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer$2", "onCarrierRoamingNtnEligibleStateChanged", 1166, "ConnectivityUtilImpl.java")).q("Eligible for manual satellite. Ignoring active CELLULAR network and notifying listeners about eligibility");
            this.a.a.E(cnol.a, "onCarrierRoamingNtnEligibleStateChanged");
            return;
        }
        if (((cnok) this.a.a.q.get()).a() || this.a.a.q.get() == cnok.b || this.a.a.s.get()) {
            ensk h3 = csoa.c.h();
            h3.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer$2", "onCarrierRoamingNtnEligibleStateChanged", 1181, "ConnectivityUtilImpl.java")).q("Active data network is available, not notifying listeners");
        } else {
            ensk h4 = csoa.c.h();
            h4.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer$2", "onCarrierRoamingNtnEligibleStateChanged", 1175, "ConnectivityUtilImpl.java")).q("No active data network, notifying listeners about eligibility");
            this.a.a.E(cnol.a, "onCarrierRoamingNtnEligibleStateChanged");
        }
    }

    @Override // defpackage.cnoa
    public final void b(boolean z, int i) {
        this.a.a.D("SubID = " + i + " onCarrierRoamingNtnModeChanged (" + z + ")");
        this.a.a.s.set(z);
        this.a.a.u.put(Integer.valueOf(i), Boolean.valueOf(z));
        if (z) {
            this.a.a.E(cnol.c, "onCarrierRoamingNtnModeChanged");
        } else if (((ausa) this.a.a.w.b()).a() && this.a.a.H()) {
            this.a.a.E(cnol.a, "onCarrierRoamingNtnModeChanged");
        } else {
            this.a.a.E(cnol.e, "onCarrierRoamingNtnModeChanged");
        }
    }
}
