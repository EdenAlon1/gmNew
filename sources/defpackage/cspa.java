package defpackage;

import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cspa implements csof {
    public static final entd a = entd.c("BugleConnectivity");
    public final Consumer b;
    public final csph c;
    public final int d;
    private final errl h;
    private final ejlk i;
    private csoz j;
    private final TelephonyManager k;
    public final Object e = new Object();
    private int l = 1;
    public final AtomicReference f = new AtomicReference(csoe.UNKNOWN);
    public final AtomicReference g = new AtomicReference(csoe.UNKNOWN);

    public cspa(ctwx ctwxVar, errl errlVar, ejlk ejlkVar, csph csphVar, Consumer consumer, int i) {
        this.k = ctwxVar.a(i);
        this.h = errlVar;
        this.i = ejlkVar;
        this.c = csphVar;
        this.b = consumer;
        this.d = i;
    }

    private final void e() {
        this.k.registerTelephonyCallback(this.h, this.j);
        this.l = 3;
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "registerTelephonyCallback", 143, "NetworkStateMonitorSPlusServiceState.java")).r("NetworkStateMonitorSPlusServiceState registered for subId %d.", this.d);
    }

    @Override // defpackage.csof
    public final csoe a() {
        return (csoe) this.f.get();
    }

    @Override // defpackage.csof
    public final void b() {
        synchronized (this.e) {
            int i = this.l;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                this.l = 2;
                this.j = new csoz(new Consumer() { // from class: csox
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        cspa cspaVar = cspa.this;
                        csoe a2 = cspaVar.c.a((ServiceState) obj, cspaVar.d);
                        csoe csoeVar = (csoe) cspaVar.f.getAndSet(a2);
                        cspaVar.g.set(csoeVar);
                        ((ensz) cspa.a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "onNetworkStateChanged", 161, "NetworkStateMonitorSPlusServiceState.java")).J("NetworkStateMonitorSPlusServiceState onNetworkStateChanged for subId %d: %s to %s", Integer.valueOf(cspaVar.d), csoeVar, a2);
                        cspaVar.b.accept(Integer.valueOf(cspaVar.d));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                e();
            } else if (i2 == 1) {
                ((ensz) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "startMonitoring", 87, "NetworkStateMonitorSPlusServiceState.java")).r("NetworkStateMonitorSPlusServiceState is being registered asynchronously for subId %d.", this.d);
            } else if (i2 == 2) {
                ((ensz) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "startMonitoring", 93, "NetworkStateMonitorSPlusServiceState.java")).r("NetworkStateMonitorSPlusServiceState has already been registered for subId %d.", this.d);
            } else if (i2 == 3) {
                e();
            }
        }
    }

    @Override // defpackage.csof
    public final void c() {
        synchronized (this.e) {
            int i = this.l;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    this.i.post(new Runnable() { // from class: csoy
                        @Override // java.lang.Runnable
                        public final void run() {
                            cspa cspaVar = cspa.this;
                            synchronized (cspaVar.e) {
                                cspaVar.d();
                            }
                        }
                    });
                } else if (i2 == 2) {
                    d();
                } else if (i2 != 3) {
                }
            }
            ((ensz) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "stopMonitoring", 116, "NetworkStateMonitorSPlusServiceState.java")).r("NetworkStateMonitorSPlusServiceState isn't registered for subId %d.", this.d);
        }
    }

    public final void d() {
        this.k.unregisterTelephonyCallback(this.j);
        this.l = 4;
        this.f.set(csoe.UNKNOWN);
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "unregisterTelephonyCallback", 153, "NetworkStateMonitorSPlusServiceState.java")).r("NetworkStateMonitorSPlusServiceState unregistered for subId %d.", this.d);
    }
}
