package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.google.android.apps.messaging.shared.net.DittoForegroundService;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgxa implements chhm {
    public final Context e;
    private PowerManager.WakeLock i;
    private final csiy k;
    private static final cfup f = cfvl.f(cfvl.b, "ditto_foreground_service_duration_milliseconds", TimeUnit.MINUTES.toMillis(2));
    private static final cfup g = cfvl.f(cfvl.b, "ditto_foreground_service_min_duration_milliseconds", TimeUnit.SECONDS.toMillis(8));
    public static final cskc a = cskc.g("BugleNetwork", "DittoForegroundServiceSchedulerImpl");
    private final Set h = new HashSet();
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public cgww c = null;
    final cgwz d = new cgwz(this);
    private final Runnable j = new Runnable() { // from class: cgwx
        @Override // java.lang.Runnable
        public final void run() {
            cgxa cgxaVar = cgxa.this;
            synchronized (cgxaVar.b) {
                if (cgxaVar.b.isEmpty()) {
                    cgxaVar.d();
                } else {
                    cgxa.a.m("Still waiting for services to complete, not stopping the service.");
                    cgxaVar.c();
                }
            }
        }
    };

    public cgxa(Context context, csiy csiyVar) {
        this.e = context;
        this.k = csiyVar;
    }

    private final void h() {
        PowerManager.WakeLock wakeLock = this.i;
        if (wakeLock == null || !wakeLock.isHeld()) {
            a.m("Ditto lock already released.");
        } else {
            a.m("Releasing Ditto lock.");
            this.i.release();
        }
    }

    private final void i(long j) {
        cskc cskcVar = a;
        csjb a2 = cskcVar.a();
        a2.z("Extending Ditto foreground notification by (s)", j / 1000);
        a2.r();
        if (this.i == null) {
            PowerManager.WakeLock newWakeLock = ((PowerManager) this.e.getSystemService("power")).newWakeLock(1, "ditto_foreground_service_scheduler_impl");
            this.i = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        cskcVar.q("Acquiring Ditto lock.");
        this.i.acquire(j);
        cslq.d(this.j, j);
    }

    @Override // defpackage.chhm
    public final void a() {
        if (this.c != null) {
            DittoForegroundService.a.r("Cannot hide the foreground notification on Android O and above!");
        } else {
            a.r("ServiceScheduler is not bound to the foreground service.");
        }
    }

    @Override // defpackage.chhm
    public final void b(Object obj) {
        synchronized (this.b) {
            this.b.remove(obj);
        }
        synchronized (this.h) {
            this.h.remove(obj);
            if (this.h.isEmpty()) {
                e();
            }
        }
    }

    @Override // defpackage.chhm
    public final void c() {
        i(((Long) f.e()).longValue());
    }

    @Override // defpackage.chhm
    public final void d() {
        int size;
        int size2;
        try {
            synchronized (this.h) {
                size = this.h.size();
                this.h.clear();
            }
            synchronized (this.b) {
                size2 = this.b.size();
            }
            cskc cskcVar = a;
            csjb a2 = cskcVar.a();
            a2.y("monitorSet size", size);
            a2.r();
            csjb a3 = cskcVar.a();
            a3.y("waitForMonitorSet size", size2);
            a3.r();
            cslq.a(this.j);
            if (this.c != null) {
                Context context = this.e;
                try {
                    context.unbindService(this.d);
                } catch (IllegalArgumentException e) {
                    csjb b = DittoForegroundService.a.b();
                    b.I("Unexpected unbindService error");
                    b.A("msg", e.getMessage());
                    b.s(e);
                }
                try {
                    context.stopService(DittoForegroundService.a(context));
                } catch (NullPointerException e2) {
                    csjb b2 = DittoForegroundService.a.b();
                    b2.I("Unexpected stopService error. Likely due to vendor-specific firmware issue.");
                    b2.s(e2);
                }
                a.m("Stopping foreground service.");
                this.c = null;
            } else {
                cskcVar.r("Foreground service is already stopped.");
            }
        } finally {
            h();
        }
    }

    final void e() {
        i(((Long) g.e()).longValue());
    }

    @Override // defpackage.chhm
    public final void f(Object obj) {
        synchronized (this.b) {
            this.b.add(obj);
        }
    }

    @Override // defpackage.chhm
    public final void g(Object obj) {
        Set set = this.h;
        cgww cgwwVar = this.c;
        synchronized (set) {
            if (obj != null) {
                this.h.add(obj);
            }
            if (this.k.a) {
                return;
            }
            if (cgwwVar == null) {
                a.m("Starting Ditto foreground notification...");
                cgcs.a(new cgcr() { // from class: cgwy
                    @Override // defpackage.cgcr
                    public final void a() {
                        cgxa cgxaVar = cgxa.this;
                        Context context = cgxaVar.e;
                        Intent a2 = DittoForegroundService.a(context);
                        context.startForegroundService(a2);
                        context.bindService(a2, cgxaVar.d, 1);
                    }
                });
            }
            if (obj == null) {
                e();
            } else {
                c();
            }
        }
    }
}
