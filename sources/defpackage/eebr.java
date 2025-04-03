package defpackage;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eebr {
    private static final eebp a = new eebq();
    private final errl b;
    private final dkvp c;
    private final dkvt d;
    private final eeby e;
    private final djix f;

    public eebr(errl errlVar, dkvp dkvpVar, dkvt dkvtVar, eeby eebyVar, djix djixVar) {
        this.b = errlVar;
        this.c = dkvpVar;
        this.d = dkvtVar;
        this.e = eebyVar;
        this.f = djixVar;
    }

    public final eebp a(Optional optional, eefy eefyVar) {
        if (!((Boolean) dizg.o().a.w.a()).booleanValue() || dizg.o().L()) {
            dkty.c("Flag enableMsrpOverDedicatedBearer is false, won't establish dedicated bearer.", new Object[0]);
            return a;
        }
        if (!this.f.f()) {
            dkty.c("SIP connection type is Dual Registration, won't establish dedicated bearer.", new Object[0]);
            return a;
        }
        if (optional.isEmpty()) {
            dkty.g("No network present, can't establish dedicated bearer.", new Object[0]);
            return a;
        }
        try {
            NetworkInfo e = this.c.e((Network) optional.get());
            e.getClass();
            dkty.c("Creating QosHandler. Current network: %s", e.getTypeName());
        } catch (dkvd unused) {
        }
        try {
            NetworkCapabilities c = this.c.c((Network) optional.get());
            c.getClass();
            if (!c.hasCapability(4)) {
                dkty.c("Not on IMS network, shouldn't establish dedicated bearer.", new Object[0]);
                return a;
            }
            int a2 = this.d.a();
            if (a2 == 13 || a2 == 20) {
                dkty.c("Current data network type: %s", a2 == 13 ? "LTE" : "5G");
                return new eebv(this.b, this.c, (Network) optional.get(), eefyVar, this.e);
            }
            dkty.c("Not on LTE nor 5G, shouldn't establish dedicated bearer.", new Object[0]);
            return a;
        } catch (dkvd e2) {
            dkty.i(e2, "Can't establish dedicated bearer.", new Object[0]);
            return a;
        }
    }
}
