package com.google.android.apps.messaging.shared.datamodel.resizing;

import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingServiceAndroidV;
import defpackage.axos;
import defpackage.cbhn;
import defpackage.cbid;
import defpackage.cbif;
import defpackage.cinj;
import defpackage.cins;
import defpackage.efbd;
import defpackage.ekzm;
import defpackage.ekzz;
import defpackage.elbx;
import defpackage.eleg;
import defpackage.emxf;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.ffbr;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ResizingServiceAndroidV extends cbhn implements Runnable {
    public ffbr b;
    public ffbr c;
    public ffbr d;
    private ThreadPoolExecutor f;
    private PowerManager.WakeLock g;
    private static final enru e = enru.c("com/google/android/apps/messaging/shared/datamodel/resizing/ResizingServiceAndroidV");
    public static final AtomicInteger a = new AtomicInteger();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // defpackage.cbhn, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MICROSECONDS, new ArrayBlockingQueue(1), new RejectedExecutionHandler() { // from class: cbih
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                ResizingServiceAndroidV.a.decrementAndGet();
            }
        });
        this.g = ((PowerManager) getSystemService("power")).newWakeLock(1, "image_video_resizing_service");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ThreadPoolExecutor threadPoolExecutor = this.f;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
        this.f = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ekzm b = ((elbx) this.d.b()).b("ResizingServiceAndroidV#onStartCommand");
        try {
            if (!this.g.isHeld()) {
                this.g.acquire();
            }
            int intExtra = intent.getIntExtra("op", 0);
            enru enruVar = e;
            ensk h = enruVar.h();
            h.Y(ente.a, "BugleResizing");
            enrr enrrVar = (enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/resizing/ResizingServiceAndroidV", "onStartCommand", 154, "ResizingServiceAndroidV.java");
            AtomicInteger atomicInteger = a;
            enrrVar.u("ResizingServiceAndroidV: op= %s , count= %s", intExtra, atomicInteger.get());
            if (intExtra == 0) {
                atomicInteger.incrementAndGet();
                ThreadPoolExecutor threadPoolExecutor = this.f;
                if (threadPoolExecutor != null) {
                    axos.a(this, threadPoolExecutor);
                } else {
                    ensk j = enruVar.j();
                    j.Y(ente.a, "BugleResizing");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/resizing/ResizingServiceAndroidV", "onStartCommand", 161, "ResizingServiceAndroidV.java")).q("Cannot start resizing service, executor is null");
                }
            } else {
                if (intExtra != 1) {
                    throw new IllegalStateException(String.format("ResizingServiceAndroidV.onStartCommand illegal opcode %s", Integer.valueOf(intExtra)));
                }
                if (atomicInteger.get() == 0) {
                    ensk h2 = enruVar.h();
                    h2.Y(ente.a, "BugleResizing");
                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/resizing/ResizingServiceAndroidV", "onStartCommand", 168, "ResizingServiceAndroidV.java")).q("ResizingServiceAndroidV.stopSelf()");
                    if (this.g.isHeld()) {
                        this.g.release();
                    }
                    stopSelfResult(i2);
                }
            }
            b.close();
            return 2;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ekzz f = eleg.f("ResizingServiceAndroidV#run");
        try {
            efbd.b();
            while (true) {
                try {
                    cbid b = ((cbif) this.c.b()).b();
                    if (b == null) {
                        break;
                    }
                    Notification d = ((cins) this.b.b()).d();
                    if (d != null) {
                        emxf.a(Build.VERSION.SDK_INT >= 35);
                        startForeground(cinj.MEDIA_RESIZING.G, d, 8192);
                    }
                    b.c();
                } finally {
                    if (a.decrementAndGet() == 0) {
                        Intent intent = new Intent(this, (Class<?>) ResizingServiceAndroidV.class);
                        intent.putExtra("op", 1);
                        startService(intent);
                    }
                }
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
