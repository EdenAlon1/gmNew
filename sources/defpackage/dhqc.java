package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhqc {
    public final Object a;
    public int b;
    public boolean c;
    dgxr d;
    public final String e;
    public final Map f;
    public AtomicInteger g;
    private final PowerManager.WakeLock l;
    private Future m;
    private long n;
    private final Set o;
    private int p;
    private WorkSource q;
    private final ScheduledExecutorService r;
    private static final long i = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService j = null;
    private static final Object k = new Object();
    public static volatile dhpz h = new dhpz();

    public dhqc(Context context) {
        String packageName = context.getPackageName();
        this.a = new Object();
        this.b = 0;
        this.o = new HashSet();
        this.c = true;
        this.f = new HashMap();
        this.g = new AtomicInteger(0);
        dfwv.o(context, "WakeLock: context must not be null");
        dfwv.m("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.d = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.e = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.e = "*gcore*:wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        emyw.e(powerManager);
        this.l = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (dfzc.b(context)) {
            packageName = dfyz.a(packageName) ? context.getPackageName() : packageName;
            if (context != null && context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo a = dfzj.b(context).a(packageName, 0);
                    if (a == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = a.uid;
                        workSource = new WorkSource();
                        dfzc.a(workSource, i2, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            this.q = workSource;
            if (workSource != null) {
                f(this.l, workSource);
            }
        }
        ScheduledExecutorService scheduledExecutorService = j;
        if (scheduledExecutorService == null) {
            synchronized (k) {
                scheduledExecutorService = j;
                if (scheduledExecutorService == null) {
                    dgxv dgxvVar = dgxw.a;
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    j = scheduledExecutorService;
                }
            }
        }
        this.r = scheduledExecutorService;
    }

    private static void f(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    public final void a(long j2) {
        this.g.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, i), 1L);
        if (j2 > 0) {
            max = Math.min(j2, max);
        }
        synchronized (this.a) {
            if (!c()) {
                this.d = dgxr.a;
                this.l.acquire();
                SystemClock.elapsedRealtime();
            }
            this.b++;
            this.p++;
            d();
            dhqa dhqaVar = (dhqa) this.f.get(null);
            if (dhqaVar == null) {
                dhqaVar = new dhqa();
                this.f.put(null, dhqaVar);
            }
            dhqaVar.a++;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
            if (j3 > this.n) {
                this.n = j3;
                Future future = this.m;
                if (future != null) {
                    future.cancel(false);
                }
                this.m = this.r.schedule(new Runnable() { // from class: dhpy
                    @Override // java.lang.Runnable
                    public final void run() {
                        dhqc dhqcVar = dhqc.this;
                        synchronized (dhqcVar.a) {
                            if (dhqcVar.c()) {
                                dhpz dhpzVar = dhqc.h;
                                dhpz.a("%s ** IS FORCE-RELEASED ON TIMEOUT **", dhqcVar.e);
                                dhqcVar.b();
                                if (dhqcVar.c()) {
                                    dhqcVar.b = 1;
                                    dhqcVar.e();
                                }
                            }
                        }
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void b() {
        if (this.o.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.o);
        this.o.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.b > 0;
        }
        return z;
    }

    public final void d() {
        if (this.c) {
            TextUtils.isEmpty(null);
        }
    }

    public final void e() {
        synchronized (this.a) {
            if (c()) {
                if (this.c) {
                    int i2 = this.b - 1;
                    this.b = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.b = 0;
                }
                b();
                Iterator it = this.f.values().iterator();
                while (it.hasNext()) {
                    ((dhqa) it.next()).a = 0;
                }
                this.f.clear();
                Future future = this.m;
                if (future != null) {
                    future.cancel(false);
                    this.m = null;
                    this.n = 0L;
                }
                this.p = 0;
                try {
                    if (this.l.isHeld()) {
                        try {
                            this.l.release();
                            if (this.d != null) {
                                this.d = null;
                            }
                        } catch (RuntimeException e) {
                            if (!e.getClass().equals(RuntimeException.class)) {
                                throw e;
                            }
                            Log.e("WakeLock", String.format("%s failed to release!", this.e), e);
                            if (this.d != null) {
                                this.d = null;
                            }
                        }
                    } else {
                        dhpz.a("%s should be held!", this.e);
                    }
                } catch (Throwable th) {
                    if (this.d != null) {
                        this.d = null;
                    }
                    throw th;
                }
            }
        }
    }
}
