package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cson implements csof {
    public static final entd a = entd.c("BugleConnectivity");
    public final errl b;
    public final elbx c;
    public final Consumer d;
    public final csph e;
    public final int f;
    public PhoneStateListener h;
    private final ejlk k;
    private final TelephonyManager l;
    public final Object g = new Object();
    private int m = 1;
    public final AtomicReference i = new AtomicReference(csoe.UNKNOWN);
    public final AtomicReference j = new AtomicReference(csoe.UNKNOWN);

    public cson(ctwx ctwxVar, errl errlVar, ejlk ejlkVar, elbx elbxVar, csph csphVar, Consumer consumer, int i) {
        this.l = ctwxVar.a(i);
        this.b = errlVar;
        this.k = ejlkVar;
        this.c = elbxVar;
        this.e = csphVar;
        this.d = consumer;
        this.f = i;
    }

    @Override // defpackage.csof
    public final csoe a() {
        return (csoe) this.i.get();
    }

    @Override // defpackage.csof
    public final void b() {
        synchronized (this.g) {
            int i = this.m;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                this.m = 2;
                if (ctid.c) {
                    this.h = new csok(this, this.b, new csoi(this));
                    d();
                } else {
                    this.k.post(new Runnable() { // from class: csoj
                        @Override // java.lang.Runnable
                        public final void run() {
                            cson csonVar = cson.this;
                            synchronized (csonVar.g) {
                                csonVar.h = new csom(csonVar, new csoi(csonVar));
                                csonVar.d();
                            }
                        }
                    });
                }
            } else if (i2 == 1) {
                ((ensz) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "startMonitoring", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "NetworkStateMonitorLThroughRServiceState.java")).r("NetworkStateMonitorLThroughRServiceState is being registered asynchronously for subId %d.", this.f);
            } else if (i2 == 2) {
                ((ensz) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "startMonitoring", 107, "NetworkStateMonitorLThroughRServiceState.java")).r("NetworkStateMonitorLThroughRServiceState has already been registered for subId %d.", this.f);
            } else if (i2 == 3) {
                d();
            }
        }
    }

    @Override // defpackage.csof
    public final void c() {
        synchronized (this.g) {
            int i = this.m;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    this.k.post(new Runnable() { // from class: csoh
                        @Override // java.lang.Runnable
                        public final void run() {
                            cson csonVar = cson.this;
                            synchronized (csonVar.g) {
                                csonVar.e();
                            }
                        }
                    });
                } else if (i2 == 2) {
                    e();
                } else if (i2 != 3) {
                }
            }
            ((ensz) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "stopMonitoring", 172, "NetworkStateMonitorLThroughRServiceState.java")).r("NetworkStateMonitorLThroughRServiceState isn't registered for subId %d.", this.f);
        }
    }

    public final void d() {
        this.l.listen(this.h, 1);
        this.m = 3;
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "registerPhoneStateListener", 194, "NetworkStateMonitorLThroughRServiceState.java")).r("NetworkStateMonitorLThroughRServiceState registered for subId %d.", this.f);
    }

    public final void e() {
        this.l.listen(this.h, 0);
        this.m = 4;
        this.i.set(csoe.UNKNOWN);
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "unregisterPhoneStateListener", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "NetworkStateMonitorLThroughRServiceState.java")).r("NetworkStateMonitorLThroughRServiceState unregistered for subId %d.", this.f);
    }
}
