package defpackage;

import android.content.Context;
import android.telephony.ServiceState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csph {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorUtils");
    public final Context a;
    private final ffbr c;

    public csph(Context context, ffbr ffbrVar) {
        this.a = context;
        this.c = ffbrVar;
    }

    final csoe a(ServiceState serviceState, int i) {
        boolean d;
        int state = serviceState.getState();
        if (ctid.i) {
            d = serviceState.isUsingNonTerrestrialNetwork();
            ensk e = b.e();
            e.Y(ente.a, "BugleSatellite");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorUtils", "isServiceStateOnSatellite", 92, "NetworkStateMonitorUtils.java")).t("OS isAtLeastV and isSatellite = %s", Boolean.valueOf(d));
        } else {
            d = ((cnoc) this.c.b()).d(i);
        }
        if (d) {
            return csoe.SATELLITE;
        }
        if (state == 0) {
            return csoe.AVAILABLE;
        }
        if (state != 1) {
            if (state == 2) {
                return csoe.EMERGENCY_ONLY;
            }
            if (state != 3) {
                return csoe.UNKNOWN;
            }
        }
        return csoe.UNAVAILABLE;
    }
}
