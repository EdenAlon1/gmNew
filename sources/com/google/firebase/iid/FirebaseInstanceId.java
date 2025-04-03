package com.google.firebase.iid;

import android.os.Looper;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import defpackage.dfop;
import defpackage.dfwv;
import defpackage.dfze;
import defpackage.dhqh;
import defpackage.dhqs;
import defpackage.dhre;
import defpackage.dhrm;
import defpackage.dhrt;
import defpackage.eumr;
import defpackage.eutl;
import defpackage.eutr;
import defpackage.euts;
import defpackage.eutt;
import defpackage.eutz;
import defpackage.euub;
import defpackage.euuc;
import defpackage.euue;
import defpackage.euug;
import defpackage.euuo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public class FirebaseInstanceId {
    public static euuc a;
    static ScheduledExecutorService b;
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    private static final Pattern j = Pattern.compile("\\AA[\\w-]{38}\\z");
    public final Executor c;
    public final eumr d;
    public final eutt e;
    public final eutr f;
    public final eutz g;
    private final euuo k;
    private boolean l = false;
    public final List h = new ArrayList();

    public FirebaseInstanceId(eumr eumrVar, eutt euttVar, Executor executor, Executor executor2, euug euugVar, euug euugVar2, euuo euuoVar) {
        if (eutt.e(eumrVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (a == null) {
                a = new euuc(eumrVar.a());
            }
        }
        this.d = eumrVar;
        this.e = euttVar;
        this.f = new eutr(eumrVar, euttVar, new dfop(eumrVar.a()), euugVar, euugVar2, euuoVar);
        this.c = executor2;
        this.g = new eutz(executor);
        this.k = euuoVar;
    }

    public static FirebaseInstanceId b() {
        return getInstance(eumr.b());
    }

    public static FirebaseInstanceId getInstance(eumr eumrVar) {
        k(eumrVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) eumrVar.f(FirebaseInstanceId.class);
        dfwv.o(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public static String j(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    public static void k(eumr eumrVar) {
        dfwv.m(eumrVar.e().d, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        dfwv.m(eumrVar.e().b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        dfwv.m(eumrVar.e().a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        dfwv.b(eumrVar.e().b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        dfwv.b(j.matcher(eumrVar.e().a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static boolean p() {
        return Log.isLoggable("FirebaseInstanceId", 3);
    }

    public static final void r(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1, new dfze("FirebaseInstanceId"));
            }
            b.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public final dhre a(final String str, String str2) {
        final String j2 = j(str2);
        return dhrt.c(null).e(this.c, new dhqh() { // from class: eutk
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.this;
                String f = firebaseInstanceId.f();
                String str3 = str;
                String str4 = j2;
                euub d = firebaseInstanceId.d(str3, str4);
                return !firebaseInstanceId.q(d) ? dhrt.c(new euts(d.b)) : firebaseInstanceId.g.a(str3, str4, new eutn(firebaseInstanceId, f, str3, str4, d));
            }
        });
    }

    public final euub c() {
        return d(eutt.e(this.d), "*");
    }

    public final euub d(String str, String str2) {
        return a.a(g(), str, str2);
    }

    public final Object e(dhre dhreVar) {
        try {
            return dhrt.g(dhreVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    l();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e);
        }
    }

    public final String f() {
        try {
            a.g(this.d.h());
            dhre a2 = this.k.a();
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            a2.o(new eutl(), new dhqs() { // from class: eutm
                @Override // defpackage.dhqs
                public final void a(dhre dhreVar) {
                    euuc euucVar = FirebaseInstanceId.a;
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            if (a2.m()) {
                return (String) a2.i();
            }
            if (((dhrm) a2).d) {
                throw new CancellationException("Task is already canceled");
            }
            if (a2.l()) {
                throw new IllegalStateException(a2.h());
            }
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String g() {
        return "[DEFAULT]".equals(this.d.g()) ? "" : this.d.h();
    }

    @Deprecated
    public final String h() {
        k(this.d);
        euub c = c();
        if (q(c)) {
            n();
        }
        long j2 = euub.a;
        if (c == null) {
            return null;
        }
        return c.b;
    }

    @Deprecated
    public final String i(String str, String str2) {
        k(this.d);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((euts) e(a(str, str2))).a;
        }
        throw new IOException("MAIN_THREAD");
    }

    final synchronized void l() {
        a.b();
    }

    public final synchronized void m(boolean z) {
        this.l = z;
    }

    public final synchronized void n() {
        if (this.l) {
            return;
        }
        o(0L);
    }

    public final synchronized void o(long j2) {
        r(new euue(this, Math.min(Math.max(30L, j2 + j2), i)), j2);
        this.l = true;
    }

    public final boolean q(euub euubVar) {
        if (euubVar == null) {
            return true;
        }
        return System.currentTimeMillis() > euubVar.d + euub.a || !this.e.c().equals(euubVar.c);
    }
}
