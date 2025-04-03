package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejkn {
    public static final enru a = enru.c("com/google/apps/tiktok/concurrent/ForegroundServiceTracker");
    public final ejkc e;
    public Service h;
    public int i;
    public ejkk j;
    private final Context k;
    private final Executor l;
    private final NotificationManager m;
    private final ejkf n;
    private final Class o;
    private final Runnable p;
    public final Object b = new Object();
    public final IdentityHashMap c = new IdentityHashMap(10);
    public final enfz d = new enfz();
    public final enny f = new engb();
    public ejkm g = ejkm.STOPPED;

    public ejkn(Context context, ejkc ejkcVar, final errm errmVar, NotificationManager notificationManager, ejkf ejkfVar, Class cls) {
        this.k = context;
        this.e = ejkcVar;
        this.l = new ersb(errmVar);
        this.n = ejkfVar;
        this.m = notificationManager;
        this.o = cls;
        this.p = new Runnable() { // from class: ejkh
            @Override // java.lang.Runnable
            public final void run() {
                final ejkn ejknVar = ejkn.this;
                errmVar.execute(new Runnable() { // from class: ejkj
                    @Override // java.lang.Runnable
                    public final void run() {
                        ejkn ejknVar2 = ejkn.this;
                        Object obj = ejknVar2.b;
                        boolean b = ejknVar2.e.b();
                        synchronized (obj) {
                            boolean z = false;
                            if (!b) {
                                try {
                                    if (!ejknVar2.c.isEmpty()) {
                                        z = true;
                                    }
                                } finally {
                                }
                            }
                            int ordinal = ejknVar2.g.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 2 && !z) {
                                    ejknVar2.d();
                                }
                            } else if (z) {
                                ejknVar2.b(ejknVar2.a(null).a);
                            }
                        }
                    }
                });
            }
        };
    }

    private final int g() {
        if (this.f.isEmpty()) {
            return this.n.a();
        }
        Iterator it = this.f.i().iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((Integer) it.next()).intValue();
        }
        return i;
    }

    public final ejkk a(ejkk ejkkVar) {
        emxf.m(!this.c.isEmpty(), "Can't select a best notification if thare are none");
        ejkk ejkkVar2 = null;
        for (ejkk ejkkVar3 : this.c.values()) {
            if (ejkkVar2 != null) {
                int i = ejkkVar3.b;
                int i2 = ejkkVar2.b;
                if (i2 >= i) {
                    if (ejkkVar == ejkkVar3 && i2 == ejkkVar.b) {
                    }
                }
            }
            ejkkVar2 = ejkkVar3;
        }
        return ejkkVar2;
    }

    public final void b(Notification notification) {
        emxf.l(this.g == ejkm.STOPPED);
        Intent intent = new Intent(this.k, (Class<?>) this.o);
        intent.putExtra("fallback_notification", notification);
        this.g = ejkm.STARTING;
        this.k.startForegroundService(intent);
    }

    public final void c(Service service, Notification notification) {
        if (Build.VERSION.SDK_INT < 29) {
            service.startForeground(174344743, notification);
            return;
        }
        int g = g();
        if (g == 0) {
            ((enrr) ((enrr) a.h()).h("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "startShortService", 370, "ForegroundServiceTracker.java")).q("starting foregroundService with type=none");
            g = 0;
        }
        service.startForeground(174344743, notification, g);
    }

    public final void d() {
        ejkm ejkmVar = this.g;
        emxf.p(ejkmVar == ejkm.STARTED, "Destroyed in wrong state %s", ejkmVar);
        this.g = ejkm.STOPPED;
        this.h.stopForeground(true);
        this.j = null;
        this.h.stopSelf(this.i);
        this.h = null;
    }

    public final void e(ejkk ejkkVar) {
        Service service;
        int foregroundServiceType;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && (service = this.h) != null) {
            foregroundServiceType = service.getForegroundServiceType();
            if (foregroundServiceType != g()) {
                z = true;
            }
        }
        ejkk ejkkVar2 = this.j;
        ejkk a2 = a(ejkkVar);
        this.j = a2;
        if (z || ejkkVar2 != a2) {
            c(this.h, a2.a);
        }
    }

    public final void f(final ListenableFuture listenableFuture, Notification notification, final int i) {
        boolean areNotificationsEnabled;
        String channelId;
        NotificationChannel notificationChannel;
        int importance;
        int importance2;
        if (listenableFuture.isDone()) {
            return;
        }
        areNotificationsEnabled = this.m.areNotificationsEnabled();
        if (!areNotificationsEnabled) {
            ((enrr) ((enrr) a.j()).h("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "attachForegroundService", 182, "ForegroundServiceTracker.java")).q("User disabled notifications for app");
        }
        NotificationManager notificationManager = this.m;
        channelId = notification.getChannelId();
        notificationChannel = notificationManager.getNotificationChannel(channelId);
        importance = notificationChannel.getImportance();
        importance2 = notificationChannel.getImportance();
        if (importance2 < 2) {
            ((enrr) ((enrr) a.j()).h("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "attachForegroundService", 190, "ForegroundServiceTracker.java")).q("User blocked notification channel");
        }
        notification.category = "service";
        notification.flags |= 256;
        notification.flags |= 34;
        ejkk ejkkVar = new ejkk(notification, importance, eleg.c());
        synchronized (this.b) {
            this.f.add(Integer.valueOf(i));
            this.d.t(listenableFuture, elds.b());
            ejkk ejkkVar2 = (ejkk) this.c.get(listenableFuture);
            if (ejkkVar2 == null) {
                listenableFuture.b(new Runnable() { // from class: ejki
                    @Override // java.lang.Runnable
                    public final void run() {
                        ListenableFuture listenableFuture2 = listenableFuture;
                        int i2 = i;
                        ejkn ejknVar = ejkn.this;
                        synchronized (ejknVar.b) {
                            ejkk ejkkVar3 = (ejkk) ejknVar.c.remove(listenableFuture2);
                            ejknVar.d.d(listenableFuture2);
                            if (ejknVar.g.ordinal() == 2 && ejkkVar3 == ejknVar.j) {
                                if (ejknVar.c.isEmpty()) {
                                    ejknVar.d();
                                } else {
                                    ejknVar.f.remove(Integer.valueOf(i2));
                                    ejknVar.e(null);
                                }
                            }
                        }
                    }
                }, this.l);
                this.c.put(listenableFuture, ejkkVar);
            } else if (ejkkVar2.b <= ejkkVar.b) {
                this.c.put(listenableFuture, ejkkVar);
            }
            ejkc ejkcVar = this.e;
            Runnable runnable = this.p;
            synchronized (ejkcVar.a) {
                ejkcVar.b.add(runnable);
            }
            if (!this.e.b()) {
                int ordinal = this.g.ordinal();
                if (ordinal == 0) {
                    b(ejkkVar.a);
                } else if (ordinal == 2) {
                    e(this.j);
                }
            }
        }
    }
}
