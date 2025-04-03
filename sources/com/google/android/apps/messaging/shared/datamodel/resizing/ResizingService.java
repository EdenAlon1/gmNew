package com.google.android.apps.messaging.shared.datamodel.resizing;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingService;
import defpackage.a;
import defpackage.axos;
import defpackage.cbhm;
import defpackage.cbid;
import defpackage.cbif;
import defpackage.cinj;
import defpackage.cins;
import defpackage.csix;
import defpackage.csjy;
import defpackage.efbd;
import defpackage.ekzm;
import defpackage.ekzz;
import defpackage.elbx;
import defpackage.eleg;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ResizingService extends cbhm implements Runnable {
    public static final AtomicInteger a = new AtomicInteger();
    public cins b;
    public cbif c;
    public elbx d;
    private ThreadPoolExecutor e;
    private PowerManager.WakeLock f;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // defpackage.cbhm, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.e = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MICROSECONDS, new ArrayBlockingQueue(1), new RejectedExecutionHandler() { // from class: cbig
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                ResizingService.a.decrementAndGet();
            }
        });
        this.f = ((PowerManager) getSystemService("power")).newWakeLock(1, "image_video_resizing_service");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
        this.e = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ekzm b = this.d.b("ResizingService#onStartCommand");
        try {
            if (!this.f.isHeld()) {
                this.f.acquire();
            }
            int intExtra = intent.getIntExtra("op", 0);
            if (csjy.q("Bugle", 3)) {
                csjy.c("Bugle", "ResizingService: op=" + intExtra + ", count=" + a.get());
            }
            if (intExtra == 0) {
                a.incrementAndGet();
                ThreadPoolExecutor threadPoolExecutor = this.e;
                if (threadPoolExecutor != null) {
                    axos.a(this, threadPoolExecutor);
                } else if (csjy.q("Bugle", 5)) {
                    csjy.n("Bugle", "Cannot start resizing service, executor is null");
                }
            } else if (intExtra != 1) {
                csix.c(a.h(intExtra, "ResizingService.onStartCommand illegal opcode"));
            } else if (a.get() == 0) {
                if (csjy.q("Bugle", 3)) {
                    csjy.c("Bugle", "ResizingService.stopSelf()");
                }
                if (this.f.isHeld()) {
                    this.f.release();
                }
                stopSelfResult(i2);
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
        ekzz f = eleg.f("ResizingService#run");
        try {
            efbd.b();
            while (true) {
                try {
                    cbid b = this.c.b();
                    if (b == null) {
                        break;
                    }
                    Notification d = this.b.d();
                    if (d != null) {
                        startForeground(cinj.MEDIA_RESIZING.G, d);
                    }
                    b.c();
                } finally {
                    if (a.decrementAndGet() == 0) {
                        Intent intent = new Intent(this, (Class<?>) ResizingService.class);
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
