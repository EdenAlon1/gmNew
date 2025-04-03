package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csny {
    final /* synthetic */ csoa a;

    public csny(final csoa csoaVar) {
        this.a = csoaVar;
        ((ConnectivityManager) csoaVar.f.b()).registerDefaultNetworkCallback(new csnw(this));
        if (ctid.h) {
            ensk h = csoa.c.h();
            h.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer", "<init>", 1127, "ConnectivityUtilImpl.java")).q("Registering BugleCarrierRoamingNtnModeListenerWrapper");
            final csnx csnxVar = new csnx(this);
            ((ctwb) csoaVar.m.b()).o(new ctwa() { // from class: csnu
                @Override // defpackage.ctwa
                public final boolean a(int i) {
                    ensk e = csoa.c.e();
                    e.Y(ente.a, "BugleConnectivity");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer", "<init>", 1200, "ConnectivityUtilImpl.java")).r("Registering CarrierRoamingNtnModeChangedListener for subId %d", i);
                    ((cnoc) csoa.this.l.b()).a(i, csnxVar);
                    return true;
                }
            });
            if (((ausa) csoaVar.w.b()).a()) {
                ensk h2 = csoa.c.h();
                h2.Y(ente.a, "BugleConnectivity");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer", "<init>", 1209, "ConnectivityUtilImpl.java")).q("Registering listener for satellite modem state changes.");
                ((cnoc) csoaVar.l.b()).e(new csnv(csoaVar));
            }
        }
    }
}
