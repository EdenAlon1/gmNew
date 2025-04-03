package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.Process;
import com.google.apps.tiktok.concurrent.InternalForegroundService;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejjz {
    public static final enru a = enru.c("com/google/apps/tiktok/concurrent/AndroidFutures");
    public final ejka b;
    public final Context c;
    public final ejko d;
    public final Map e;
    public final Map f;
    private final PowerManager g;
    private final errl h;
    private final ejkf i;
    private final errm j;
    private final errm k;
    private final edyp n;
    private final emyl l = emys.a(new emyl() { // from class: ejjw
        @Override // defpackage.emyl
        public final Object get() {
            ejjz ejjzVar = ejjz.this;
            Map map = ejjzVar.e;
            String a2 = ejjzVar.a();
            emxf.p(map.containsKey(a2), "If you are using AndroidFutures on %s process, please load and call the generated_android_futures_services macro and name those processes.", a2);
            return new Intent(ejjzVar.c, (Class<?>) ((ffbr) ejjzVar.e.get(a2)).b());
        }
    });
    private final emyl m = emys.a(new emyl() { // from class: ejjx
        @Override // defpackage.emyl
        public final Object get() {
            ejjz ejjzVar = ejjz.this;
            ffbr ffbrVar = (ffbr) ejjzVar.f.get(ejjzVar.a());
            if (ffbrVar != null) {
                return (Class) ffbrVar.b();
            }
            ((enrr) ((enrr) ejjz.a.j()).h("com/google/apps/tiktok/concurrent/AndroidFutures", "getForegroundService", 322, "AndroidFutures.java")).q("Calling attachForegroundService from non-main-process opens the main process which might be unintentional. Instead load and call the generated_android_futures_services macro for this process.");
            return InternalForegroundService.class;
        }
    });
    private boolean o = false;

    public ejjz(Context context, PowerManager powerManager, ejka ejkaVar, errl errlVar, Map map, Map map2, ejko ejkoVar, ejkf ejkfVar, errm errmVar, errm errmVar2, edyp edypVar) {
        this.c = context;
        this.g = powerManager;
        this.h = errlVar;
        this.d = ejkoVar;
        this.i = ejkfVar;
        this.j = errmVar;
        this.k = errmVar2;
        this.b = ejkaVar;
        this.e = map;
        this.f = map2;
        this.n = edypVar;
    }

    static /* synthetic */ void b(ListenableFuture listenableFuture, String str, Object[] objArr) {
        try {
            erqt.q(listenableFuture);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((enrr) ((enrr) ((enrr) a.i()).g(e.getCause())).h("com/google/apps/tiktok/concurrent/AndroidFutures", "logOnFailure", 407, "AndroidFutures.java")).Q(str, objArr);
        }
    }

    public static void c(final ListenableFuture listenableFuture, final String str, final Object... objArr) {
        listenableFuture.b(eldl.l(new Runnable() { // from class: ejju
            @Override // java.lang.Runnable
            public final void run() {
                ejjz.b(ListenableFuture.this, str, objArr);
            }
        }), erpp.a);
    }

    private final void i(ListenableFuture listenableFuture, String str) {
        if (listenableFuture.isDone()) {
            return;
        }
        try {
            final PowerManager.WakeLock newWakeLock = this.g.newWakeLock(1, str);
            newWakeLock.acquire();
            erqt.r(eldx.a(erqt.j(listenableFuture), 45L, TimeUnit.SECONDS, this.j), eldl.i(new ejjy(str)), erpp.a);
            ListenableFuture p = erqt.p(erqt.j(listenableFuture), 3600L, TimeUnit.SECONDS, this.k);
            newWakeLock.getClass();
            p.b(new Runnable() { // from class: ejjv
                @Override // java.lang.Runnable
                public final void run() {
                    newWakeLock.release();
                }
            }, erpp.a);
        } catch (SecurityException e) {
            if (this.o) {
                return;
            }
            try {
                PackageInfo packageInfo = this.c.getPackageManager().getPackageInfo(this.c.getPackageName(), 4096);
                if (packageInfo.requestedPermissions == null) {
                    throw e;
                }
                for (String str2 : packageInfo.requestedPermissions) {
                    if ("android.permission.WAKE_LOCK".equals(str2)) {
                        this.o = true;
                        ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/apps/tiktok/concurrent/AndroidFutures", "checkPermissionRequested", (char) 166, "AndroidFutures.java")).q("Failed to acquire wakelock");
                        return;
                    }
                }
                throw e;
            } catch (PackageManager.NameNotFoundException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    public final String a() {
        edyp edypVar = this.n;
        String a2 = edyn.a(this.c);
        return edypVar.a() ? "main_process_service_key" : a2.substring(a2.lastIndexOf(":") + 1);
    }

    public final void d(final ListenableFuture listenableFuture, String str) {
        long j;
        Intent intent = (Intent) this.l.get();
        if (listenableFuture.isDone()) {
            return;
        }
        ejka ejkaVar = this.b;
        ejkaVar.e.put(listenableFuture, str);
        while (true) {
            long j2 = ejkaVar.c.get();
            int a2 = ejka.a(j2);
            if (a2 == 0) {
                int b = ejka.b(j2) + 1;
                j = b | 4294967296L;
                if (ejkaVar.c.compareAndSet(j2, j)) {
                    synchronized (ejkaVar.d) {
                        ejkaVar.f.put(b, SettableFuture.create());
                    }
                    if (ejkaVar.i.startService(intent.cloneFilter().putExtra("EXTRA_FUTURE_INDEX", b).putExtra("EXTRA_PROCESS_UUID", ejkaVar.h.getMostSignificantBits()).putExtra("EXTRA_PROCESS_UUID2", ejkaVar.h.getLeastSignificantBits()).putExtra("EXTRA_PROCESS_PID", Process.myPid())) == null) {
                        ((enrr) ((enrr) ejka.a.h()).h("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter", "increment", 135, "AndroidFuturesServiceCounter.java")).q("startService() returned null");
                    }
                }
            } else {
                j = ejka.c(a2 + 1, j2);
                if (ejkaVar.c.compareAndSet(j2, j)) {
                    break;
                }
            }
        }
        final int b2 = ejka.b(j);
        listenableFuture.b(new Runnable() { // from class: ejjr
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture;
                ejka ejkaVar2 = ejjz.this.b;
                ejkaVar2.e.remove(listenableFuture);
                while (true) {
                    int i = b2;
                    long j3 = ejkaVar2.c.get();
                    int a3 = ejka.a(j3);
                    int b3 = ejka.b(j3);
                    if (b3 != i) {
                        synchronized (ejkaVar2.d) {
                            ejkaVar2.g.remove(i);
                        }
                        return;
                    }
                    if (a3 == 1) {
                        if (ejkaVar2.c.compareAndSet(j3, b3)) {
                            synchronized (ejkaVar2.d) {
                                settableFuture = (SettableFuture) ejkaVar2.g.get(b3);
                                if (settableFuture == null) {
                                    settableFuture = (SettableFuture) ejkaVar2.f.get(b3);
                                    settableFuture.getClass();
                                    ejkaVar2.f.put(b3, ejka.b);
                                } else {
                                    ejkaVar2.g.remove(b3);
                                }
                            }
                            settableFuture.set(null);
                            return;
                        }
                    } else {
                        if (a3 <= 0) {
                            throw new IllegalStateException(a.h(a3, "Can't decrement at zero or less refcount: "));
                        }
                        if (ejkaVar2.c.compareAndSet(j3, ejka.c(a3 - 1, j3))) {
                            return;
                        }
                    }
                }
            }
        }, erpp.a);
    }

    public final void e(final ListenableFuture listenableFuture, final long j, final TimeUnit timeUnit) {
        final errk schedule = this.j.schedule(eldl.l(new Runnable() { // from class: ejjs
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFuture listenableFuture2 = ListenableFuture.this;
                if (listenableFuture2.isDone()) {
                    return;
                }
                ((enrr) ((enrr) ((enrr) ejjz.a.i()).g(eldx.c())).h("com/google/apps/tiktok/concurrent/AndroidFutures", "crashApplicationOnFailure", 359, "AndroidFutures.java")).J("Timeout exceeded waiting on crashApplicationOnFailure future. Waited %s %s. Allowing future %s to continue anyway.", Long.valueOf(j), timeUnit, listenableFuture2);
            }
        }), j, timeUnit);
        listenableFuture.b(eldl.l(new Runnable() { // from class: ejjt
            @Override // java.lang.Runnable
            public final void run() {
                schedule.cancel(true);
                ListenableFuture listenableFuture2 = listenableFuture;
                if (listenableFuture2.isCancelled()) {
                    return;
                }
                try {
                    erqt.q(listenableFuture2);
                } catch (ExecutionException e) {
                    eldx.k(e.getCause());
                }
            }
        }), this.h);
    }

    public final void f(ListenableFuture listenableFuture) {
        String c = eleg.c();
        d(listenableFuture, c);
        i(listenableFuture, c);
    }

    public final void g(ListenableFuture listenableFuture) {
        i(listenableFuture, eleg.c());
    }

    public final void h(ListenableFuture listenableFuture, Notification notification) {
        this.d.a((Class) this.m.get()).f(listenableFuture, notification, this.i.a());
    }
}
