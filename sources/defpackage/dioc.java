package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.CapabilityConfiguration;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dioc implements dkic {
    public final dioo c;
    public final dipf d;
    public final dkrx e;
    public final dkib f;
    public djjr g;
    public dkie h;
    public volatile boolean i;
    public CapabilityConfiguration j;
    public Thread k;
    public int p;
    public final ditq r;
    private Timer w;
    public static final diyy a = diyv.b("disable_ims_contacts_discovery_in_single_reg");
    private static final diyy t = diyv.b("query_registration_state_to_ims_registration_controller");
    public static final diyy b = diyv.b("disable_address_book_scan");
    private static final int u = a() + 1;
    private int x = 1;
    private final Object v = new Object();
    public final Object l = new Object();
    public final Object m = new Object();
    public final HashMap n = new HashMap(u, 1.0f);
    public final AtomicInteger o = new AtomicInteger();
    public final AtomicLong q = new AtomicLong();
    public final dinv s = new dinv(this);

    public dioc(Context context, dioo diooVar, dipf dipfVar, dkrx dkrxVar, dkib dkibVar) {
        this.r = ditq.a(context, "RCS.imscontacts_discovery");
        this.c = diooVar;
        this.d = dipfVar;
        this.e = dkrxVar;
        this.f = dkibVar;
    }

    public static int a() {
        return Runtime.getRuntime().availableProcessors() > 1 ? 5 : 2;
    }

    private final void m() {
        this.r.b();
        synchronized (this.m) {
            this.m.notifyAll();
        }
        synchronized (this.l) {
            Thread thread = this.k;
            if (thread != null) {
                thread.interrupt();
                this.k = null;
            }
        }
    }

    private final void n(String str, int i, dkht dkhtVar) {
        this.c.e(str, i, dkhtVar);
    }

    private final boolean o(String str) {
        int i;
        if (this.k != null) {
            synchronized (this.v) {
                i = this.x;
            }
            if (i == 3) {
                synchronized (this.m) {
                    if (!this.n.containsKey(str)) {
                        return false;
                    }
                    Long l = (Long) this.n.get(str);
                    long longValue = l.longValue();
                    this.n.remove(str);
                    if (this.q.get() > longValue && !this.n.containsValue(l)) {
                        this.o.incrementAndGet();
                        dkty.c("Discovery progress %d/%d contacts", Integer.valueOf(this.o.get()), Integer.valueOf(this.p));
                    }
                    if (a() > this.n.size()) {
                        this.m.notify();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        g();
        m();
    }

    public final void c() {
        dkty.o("Scheduling immediate discovery", new Object[0]);
        synchronized (this.l) {
            if (this.k != null) {
                m();
            }
            Thread thread = new Thread(new dinw(this), "ImsContactsDiscovery");
            this.k = thread;
            thread.start();
        }
    }

    public final void d() {
        dkty.o("Scheduling discovery according to polling period", new Object[0]);
        if (this.g == null) {
            dkty.o("IMS module not initialized.", new Object[0]);
            return;
        }
        if (!i()) {
            dkty.o("No polling period defined - will wait for the next explicit update", new Object[0]);
            return;
        }
        CapabilityConfiguration capabilityConfiguration = this.j;
        capabilityConfiguration.getClass();
        long j = capabilityConfiguration.mPollingPeriod;
        if (this.k != null) {
            m();
        }
        Thread thread = new Thread(new dioa(this), "ImsContactsDiscovery");
        this.k = thread;
        this.r.d(thread, j);
    }

    public final void e(dinx dinxVar) {
        if (this.w == null) {
            this.w = new Timer("DiscoveryCallbackTimer");
        }
        this.w.schedule(dinxVar, 50L);
    }

    public final void f() {
        dkty.o("IMS discovery shut down request.", new Object[0]);
        if (this.i) {
            dkty.o("IMS discovery already shut down or shutting down, request ignored.", new Object[0]);
            return;
        }
        synchronized (this.l) {
            this.i = true;
            dipf dipfVar = this.d;
            dipfVar.d.remove(this.s);
            this.r.b();
            b();
        }
    }

    public final void g() {
        Timer timer = this.w;
        if (timer != null) {
            timer.cancel();
            this.w = null;
        }
    }

    @Deprecated
    public final boolean h() {
        djjr djjrVar = this.g;
        if (djjrVar == null) {
            return false;
        }
        if (((Boolean) t.a()).booleanValue()) {
            djjw djjwVar = ((djji) djjrVar).b;
            return djjwVar != null && djjwVar.l();
        }
        Optional a2 = djjp.a(djjrVar);
        return a2.isPresent() && ((djjs) a2.get()).c();
    }

    public final boolean i() {
        CapabilityConfiguration capabilityConfiguration = this.j;
        return capabilityConfiguration != null && capabilityConfiguration.mPollingPeriod > 0;
    }

    public final void j(int i) {
        synchronized (this.v) {
            this.x = i;
        }
    }

    @Override // defpackage.dkic
    public final void k(long j, String str, dkht dkhtVar) {
        if (dkhtVar.y()) {
            if (o(str)) {
                n(str, 2, dkhtVar);
            }
        } else if (o(str)) {
            n(str, 1, null);
        }
    }

    @Override // defpackage.dkic
    public final void l(long j, String str) {
        dkty.c("onCapabilitiesUpdateError %s", dktx.PHONE_NUMBER.c(str));
        o(str);
    }
}
