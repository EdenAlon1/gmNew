package defpackage;

import android.content.Context;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpv implements bjt {
    final /* synthetic */ bpx a;
    final /* synthetic */ atu b;
    final /* synthetic */ Context c;

    public bpv(bpx bpxVar, atu atuVar, Context context) {
        this.a = bpxVar;
        this.b = atuVar;
        this.c = context;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        ListenableFuture b;
        final bpx bpxVar = this.a;
        final Runnable runnable = new Runnable() { // from class: bpt
            @Override // java.lang.Runnable
            public final void run() {
                bpx bpxVar2 = bpx.this;
                bpxVar2.c();
                LifecycleCameraRepository lifecycleCameraRepository = bpxVar2.d;
                synchronized (lifecycleCameraRepository.c) {
                    Iterator it = new HashSet(lifecycleCameraRepository.e.keySet()).iterator();
                    while (it.hasNext()) {
                        lifecycleCameraRepository.e(((LifecycleCameraRepository.LifecycleCameraRepositoryObserver) it.next()).a);
                    }
                }
            }
        };
        if (biw.d()) {
            runnable.run();
        } else {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            ksw.d(biw.a().post(new Runnable() { // from class: biv
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable2 = runnable;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    try {
                        runnable2.run();
                    } finally {
                        countDownLatch2.countDown();
                    }
                }
            }), "Unable to post to main thread");
            try {
                if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            } catch (InterruptedException e) {
                throw new bij(e);
            }
        }
        atu atuVar = bpxVar.e;
        if (atuVar != null) {
            asb asbVar = (asb) ((agk) atuVar.a()).b;
            asbVar.a.clear();
            asbVar.b.clear();
            asbVar.c.clear();
            asbVar.d.clear();
            asbVar.e = 0;
        }
        final atu atuVar2 = bpxVar.e;
        if (atuVar2 != null) {
            synchronized (atuVar2.d) {
                atuVar2.g.removeCallbacksAndMessages("retry_token");
                int i = atuVar2.o;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    atuVar2.o = 5;
                    b = bkj.b(null);
                } else {
                    if (i2 == 1) {
                        throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                    }
                    if (i2 == 2 || i2 == 3) {
                        atuVar2.o = 5;
                        Integer num = atuVar2.n;
                        synchronized (atu.a) {
                            if (num != null) {
                                int intValue = ((Integer) atu.b.get(num.intValue())).intValue() - 1;
                                if (intValue == 0) {
                                    atu.b.remove(num.intValue());
                                } else {
                                    atu.b.put(num.intValue(), Integer.valueOf(intValue));
                                }
                                atu.d();
                            }
                        }
                        atuVar2.m = kfg.a(new kfd() { // from class: att
                            @Override // defpackage.kfd
                            public final Object a(final kfb kfbVar) {
                                ListenableFuture listenableFuture;
                                final atu atuVar3 = atu.this;
                                final bda bdaVar = atuVar3.c;
                                synchronized (bdaVar.a) {
                                    if (bdaVar.b.isEmpty()) {
                                        listenableFuture = bdaVar.d;
                                        if (listenableFuture == null) {
                                            listenableFuture = bkj.b(null);
                                        }
                                    } else {
                                        ListenableFuture listenableFuture2 = bdaVar.d;
                                        if (listenableFuture2 == null) {
                                            listenableFuture2 = kfg.a(new kfd() { // from class: bcy
                                                @Override // defpackage.kfd
                                                public final Object a(kfb kfbVar2) {
                                                    bda bdaVar2 = bda.this;
                                                    synchronized (bdaVar2.a) {
                                                        bdaVar2.e = kfbVar2;
                                                    }
                                                    return "CameraRepository-deinit";
                                                }
                                            });
                                            bdaVar.d = listenableFuture2;
                                        }
                                        bdaVar.c.addAll(bdaVar.b.values());
                                        for (final bct bctVar : bdaVar.b.values()) {
                                            bctVar.h().b(new Runnable() { // from class: bcz
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    bda bdaVar2 = bda.this;
                                                    Object obj = bdaVar2.a;
                                                    bct bctVar2 = bctVar;
                                                    synchronized (obj) {
                                                        bdaVar2.c.remove(bctVar2);
                                                        if (bdaVar2.c.isEmpty()) {
                                                            ksw.h(bdaVar2.e);
                                                            bdaVar2.e.b(null);
                                                            bdaVar2.e = null;
                                                            bdaVar2.d = null;
                                                        }
                                                    }
                                                }
                                            }, bjb.a());
                                        }
                                        bdaVar.b.clear();
                                        listenableFuture = listenableFuture2;
                                    }
                                }
                                listenableFuture.b(new Runnable() { // from class: atp
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        atu atuVar4 = atu.this;
                                        if (atuVar4.h != null) {
                                            Executor executor = atuVar4.f;
                                            if (executor instanceof atg) {
                                                atg atgVar = (atg) executor;
                                                synchronized (atgVar.a) {
                                                    if (!atgVar.b.isShutdown()) {
                                                        atgVar.b.shutdown();
                                                    }
                                                }
                                            }
                                            atuVar4.h.quit();
                                        }
                                        kfbVar.b(null);
                                    }
                                }, atuVar3.f);
                                return "CameraX shutdownInternal";
                            }
                        });
                    }
                    b = atuVar2.m;
                }
            }
        } else {
            b = bkj.b(null);
        }
        b.getClass();
        synchronized (bpxVar.a) {
            bpxVar.b = null;
            bpxVar.c = b;
            bpxVar.g.clear();
        }
        bpxVar.e = null;
        bpxVar.f = null;
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bpx bpxVar = this.a;
        bpxVar.e = this.b;
        bpxVar.f = bhv.a(this.c);
    }
}
