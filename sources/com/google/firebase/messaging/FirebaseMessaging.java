package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.a;
import defpackage.detv;
import defpackage.dfop;
import defpackage.dfwv;
import defpackage.dfze;
import defpackage.dhqy;
import defpackage.dhre;
import defpackage.dhrt;
import defpackage.eumr;
import defpackage.eusu;
import defpackage.euuf;
import defpackage.euug;
import defpackage.euuo;
import defpackage.euwe;
import defpackage.euwj;
import defpackage.euwk;
import defpackage.euwm;
import defpackage.euwq;
import defpackage.euws;
import defpackage.euww;
import defpackage.euxb;
import defpackage.euxj;
import defpackage.euxo;
import defpackage.euxp;
import defpackage.euxr;
import defpackage.euxv;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FirebaseMessaging {
    static detv a;
    static ScheduledExecutorService b;
    private static final long h = TimeUnit.HOURS.toSeconds(8);
    private static euxp i;
    public final eumr c;
    public final Context d;
    public final euww e;
    public final Executor f;
    public final euxb g;
    private final euuf j;
    private final euxj k;
    private final euws l;
    private final Executor m;
    private final dhre n;
    private boolean o;
    private final Application.ActivityLifecycleCallbacks p;

    public FirebaseMessaging(eumr eumrVar, euuf euufVar, euug euugVar, euug euugVar2, euuo euuoVar, detv detvVar, eusu eusuVar) {
        final euxb euxbVar = new euxb(eumrVar.a());
        final euww euwwVar = new euww(eumrVar, euxbVar, new dfop(eumrVar.a()), euugVar, euugVar2, euuoVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new dfze("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new dfze("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new dfze("Firebase-Messaging-File-Io"));
        this.o = false;
        a = detvVar;
        this.c = eumrVar;
        this.j = euufVar;
        this.l = new euws(this, eusuVar);
        final Context a2 = eumrVar.a();
        this.d = a2;
        euwk euwkVar = new euwk();
        this.p = euwkVar;
        this.g = euxbVar;
        this.e = euwwVar;
        this.k = new euxj(newSingleThreadExecutor);
        this.m = scheduledThreadPoolExecutor;
        this.f = threadPoolExecutor;
        Context a3 = eumrVar.a();
        if (a3 instanceof Application) {
            ((Application) a3).registerActivityLifecycleCallbacks(euwkVar);
        } else {
            Log.w("FirebaseMessaging", a.b(a3, "Context ", " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result."));
        }
        if (euufVar != null) {
            euufVar.b(new euwm(this));
        }
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: euwn
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                if (firebaseMessaging.i()) {
                    firebaseMessaging.g();
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new dfze("Firebase-Messaging-Topics-Io"));
        int i2 = euxv.e;
        dhre a4 = dhrt.a(scheduledThreadPoolExecutor2, new Callable() { // from class: euxu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i3 = euxv.e;
                Context context = a2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                return new euxv(this, euxbVar, euxt.b(context, scheduledExecutorService), euwwVar, context, scheduledExecutorService);
            }
        });
        this.n = a4;
        a4.q(scheduledThreadPoolExecutor, new dhqy() { // from class: euwo
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                euxv euxvVar = (euxv) obj;
                if (!FirebaseMessaging.this.i() || euxvVar.d.a() == null || euxvVar.f()) {
                    return;
                }
                euxvVar.d(0L);
            }
        });
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: euwp
            @Override // java.lang.Runnable
            public final void run() {
                ApplicationInfo applicationInfo;
                final Context context = FirebaseMessaging.this.d;
                if (euxf.a(context).getBoolean("proxy_notification_initialized", false)) {
                    return;
                }
                Executor executor = new Executor() { // from class: euxd
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                };
                final boolean z = true;
                try {
                    Context applicationContext = context.getApplicationContext();
                    PackageManager packageManager = applicationContext.getPackageManager();
                    if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                        z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (!dfyw.b()) {
                    dhrt.c(null);
                } else {
                    final dhri dhriVar = new dhri();
                    executor.execute(new Runnable() { // from class: euxe
                        @Override // java.lang.Runnable
                        public final void run() {
                            String notificationDelegate;
                            Context context2 = context;
                            dhri dhriVar2 = dhriVar;
                            try {
                                if (Binder.getCallingUid() == context2.getApplicationInfo().uid) {
                                    SharedPreferences.Editor edit = euxf.a(context2).edit();
                                    edit.putBoolean("proxy_notification_initialized", true);
                                    edit.apply();
                                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                                    if (z) {
                                        notificationManager.setNotificationDelegate("com.google.android.gms");
                                    } else {
                                        notificationDelegate = notificationManager.getNotificationDelegate();
                                        if ("com.google.android.gms".equals(notificationDelegate)) {
                                            notificationManager.setNotificationDelegate(null);
                                        }
                                    }
                                } else {
                                    Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                                }
                            } finally {
                                dhriVar2.d(null);
                            }
                        }
                    });
                }
            }
        });
    }

    public static synchronized euxp b(Context context) {
        euxp euxpVar;
        synchronized (FirebaseMessaging.class) {
            if (i == null) {
                i = new euxp(context);
            }
            euxpVar = i;
        }
        return euxpVar;
    }

    static synchronized FirebaseMessaging getInstance(eumr eumrVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) eumrVar.f(FirebaseMessaging.class);
            dfwv.o(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static final void k(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1, new dfze("TAG"));
            }
            b.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    private final synchronized void l() {
        if (this.o) {
            return;
        }
        h(0L);
    }

    final euxo a() {
        return b(this.d).a(d(), euxb.e(this.c));
    }

    public final String c() {
        euuf euufVar = this.j;
        if (euufVar != null) {
            try {
                return (String) dhrt.f(euufVar.a());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        euxo a2 = a();
        if (!j(a2)) {
            return a2.b;
        }
        eumr eumrVar = this.c;
        euxj euxjVar = this.k;
        String e2 = euxb.e(eumrVar);
        try {
            return (String) dhrt.f(euxjVar.a(e2, new euwq(this, e2, a2)));
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    public final String d() {
        return "[DEFAULT]".equals(this.c.g()) ? "" : this.c.h();
    }

    public final void e(String str) {
        if ("[DEFAULT]".equals(this.c.g())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: ".concat(String.valueOf(this.c.g())));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            euwj.b(intent, this.d, new euwe());
        }
    }

    public final synchronized void f(boolean z) {
        this.o = z;
    }

    public final void g() {
        euuf euufVar = this.j;
        if (euufVar != null) {
            euufVar.c();
        } else if (j(a())) {
            l();
        }
    }

    public final synchronized void h(long j) {
        k(new euxr(this, Math.min(Math.max(30L, j + j), h)), j);
        this.o = true;
    }

    public final boolean i() {
        return this.l.b();
    }

    final boolean j(euxo euxoVar) {
        if (euxoVar == null) {
            return true;
        }
        return System.currentTimeMillis() > euxoVar.d + euxo.a || !this.g.c().equals(euxoVar.c);
    }
}
