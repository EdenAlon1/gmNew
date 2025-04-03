package defpackage;

import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cspf implements csof {
    public static final entd a = entd.c("BugleConnectivity");
    public final Consumer b;
    public final int c;
    private final errl g;
    private final ejlk h;
    private cspe i;
    private final TelephonyManager j;
    public final Object d = new Object();
    private int k = 1;
    public final AtomicReference e = new AtomicReference(csoe.UNKNOWN);
    public final AtomicReference f = new AtomicReference(csoe.UNKNOWN);

    public cspf(ctwx ctwxVar, errl errlVar, ejlk ejlkVar, Consumer consumer, int i) {
        this.j = ctwxVar.a(i);
        this.g = errlVar;
        this.h = ejlkVar;
        this.b = consumer;
        this.c = i;
    }

    private final void e() {
        this.j.registerTelephonyCallback(this.g, this.i);
        this.k = 3;
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "registerTelephonyCallback", 138, "NetworkStateMonitorSSignalStrength.java")).r("NetworkStateMonitorSSignalStrength registered for subId %d.", this.c);
    }

    @Override // defpackage.csof
    public final csoe a() {
        return (csoe) this.e.get();
    }

    @Override // defpackage.csof
    public final void b() {
        synchronized (this.d) {
            int i = this.k;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                this.k = 2;
                this.i = new cspe(new Consumer() { // from class: cspd
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int level = ((SignalStrength) obj).getLevel();
                        csoe csoeVar = (level == 1 || level == 2 || level == 3 || level == 4) ? csoe.AVAILABLE : csoe.UNKNOWN;
                        cspf cspfVar = cspf.this;
                        csoe csoeVar2 = (csoe) cspfVar.e.getAndSet(csoeVar);
                        cspfVar.f.set(csoeVar2);
                        ((ensz) cspf.a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "onNetworkStateChanged", 156, "NetworkStateMonitorSSignalStrength.java")).J("NetworkStateMonitorSSignalStrength onNetworkStateChanged for subId %d: %s to %s", Integer.valueOf(cspfVar.c), csoeVar2, csoeVar);
                        cspfVar.b.accept(Integer.valueOf(cspfVar.c));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                e();
            } else if (i2 == 1) {
                ((ensz) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "startMonitoring", 83, "NetworkStateMonitorSSignalStrength.java")).r("NetworkStateMonitorSSignalStrength is being registered asynchronously for subId %d.", this.c);
            } else if (i2 == 2) {
                ((ensz) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "startMonitoring", 88, "NetworkStateMonitorSSignalStrength.java")).r("NetworkStateMonitorSSignalStrength has already been registered for subId %d.", this.c);
            } else if (i2 == 3) {
                e();
            }
        }
    }

    @Override // defpackage.csof
    public final void c() {
        synchronized (this.d) {
            int i = this.k;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    this.h.post(new Runnable() { // from class: cspc
                        @Override // java.lang.Runnable
                        public final void run() {
                            cspf cspfVar = cspf.this;
                            synchronized (cspfVar.d) {
                                cspfVar.d();
                            }
                        }
                    });
                } else if (i2 == 2) {
                    d();
                } else if (i2 != 3) {
                }
            }
            ((ensz) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "stopMonitoring", 112, "NetworkStateMonitorSSignalStrength.java")).r("NetworkStateMonitorSSignalStrength isn't registered for subId %d.", this.c);
        }
    }

    public final void d() {
        this.j.unregisterTelephonyCallback(this.i);
        this.k = 4;
        this.e.set(csoe.UNKNOWN);
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "unregisterTelephonyCallback", 148, "NetworkStateMonitorSSignalStrength.java")).r("NetworkStateMonitorSSignalStrength unregistered for subId %d.", this.c);
    }
}
