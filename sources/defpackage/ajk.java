package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajk implements ais {
    public static final long a = TimeUnit.SECONDS.toNanos(2);
    public final agj b;
    public final ScheduledExecutorService c;
    public final avi d;
    public final arz e;
    private final Executor f;

    public ajk(agj agjVar, Executor executor, ScheduledExecutorService scheduledExecutorService, arz arzVar) {
        this.b = agjVar;
        this.f = executor;
        this.c = scheduledExecutorService;
        this.e = arzVar;
        avi aviVar = agjVar.j;
        aviVar.getClass();
        this.d = aviVar;
    }

    @Override // defpackage.ais
    public final ListenableFuture a(TotalCaptureResult totalCaptureResult) {
        avw.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
        final AtomicReference atomicReference = new AtomicReference();
        final ListenableFuture a2 = kfg.a(new kfd() { // from class: aje
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                long j = ajk.a;
                atomicReference.set(new avj() { // from class: ajd
                    @Override // defpackage.avj
                    public final void a() {
                        long j2 = ajk.a;
                        avw.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
                        kfb.this.b(null);
                    }
                });
                return "OnScreenFlashUiApplied";
            }
        });
        return bkj.f(bkj.g(bkj.g(bkj.g(bkj.g(bkj.g(bjv.a(kfg.a(new kfd() { // from class: ajf
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                ScheduledExecutorService a3 = bjm.a();
                final ajk ajkVar = ajk.this;
                final AtomicReference atomicReference2 = atomicReference;
                a3.execute(new Runnable() { // from class: ajb
                    @Override // java.lang.Runnable
                    public final void run() {
                        avw.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
                        ajk.this.d.a(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (avj) atomicReference2.get());
                        kfbVar.b(null);
                    }
                });
                return "OnScreenFlashStart";
            }
        })), new bjq() { // from class: ajg
            @Override // defpackage.bjq
            public final ListenableFuture a(Object obj) {
                return ajk.this.b.d.a(true);
            }
        }, this.f), new bjq() { // from class: ajh
            @Override // defpackage.bjq
            public final ListenableFuture a(Object obj) {
                final ajk ajkVar = ajk.this;
                return kfg.a(new kfd() { // from class: aiw
                    @Override // defpackage.kfd
                    public final Object a(kfb kfbVar) {
                        ajk ajkVar2 = ajk.this;
                        if (!ajkVar2.e.a()) {
                            kfbVar.b(null);
                            return "EnableTorchInternal";
                        }
                        avw.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
                        ajkVar2.b.w(2);
                        kfbVar.b(null);
                        return "EnableTorchInternal";
                    }
                });
            }
        }, this.f), new bjq() { // from class: aji
            @Override // defpackage.bjq
            public final ListenableFuture a(Object obj) {
                return bkj.k(TimeUnit.SECONDS.toMillis(3L), ajk.this.c, a2);
            }
        }, this.f), new bjq() { // from class: ajj
            @Override // defpackage.bjq
            public final ListenableFuture a(Object obj) {
                return ajk.this.b.d.b();
            }
        }, this.f), new bjq() { // from class: aix
            @Override // defpackage.bjq
            public final ListenableFuture a(Object obj) {
                long j = ajk.a;
                aiu aiuVar = new aiu() { // from class: ajc
                    @Override // defpackage.aiu
                    public final boolean a(TotalCaptureResult totalCaptureResult2) {
                        long j2 = ajk.a;
                        return ajr.d(totalCaptureResult2, false);
                    }
                };
                ajk ajkVar = ajk.this;
                return ajr.c(j, ajkVar.c, ajkVar.b, aiuVar);
            }
        }, this.f), new afd() { // from class: aiy
            @Override // defpackage.afd
            public final Object a(Object obj) {
                long j = ajk.a;
                return false;
            }
        }, bjb.a());
    }

    @Override // defpackage.ais
    public final void b() {
        avw.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
        if (this.e.a()) {
            this.b.w(0);
        }
        this.b.d.a(false).b(new Runnable() { // from class: aiz
            @Override // java.lang.Runnable
            public final void run() {
                long j = ajk.a;
                Log.d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
            }
        }, this.f);
        this.b.d.d(false, true);
        final avi aviVar = this.d;
        bjm.a().execute(new Runnable() { // from class: aja
            @Override // java.lang.Runnable
            public final void run() {
                ((ble) avi.this).c();
            }
        });
    }

    @Override // defpackage.ais
    public final boolean c() {
        return false;
    }
}
