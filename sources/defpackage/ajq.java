package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajq implements ais {
    public static final long a = TimeUnit.SECONDS.toNanos(2);
    public final agj b;
    public final ScheduledExecutorService c;
    public final boolean d;
    private final int e;
    private boolean f = false;
    private final Executor g;

    public ajq(agj agjVar, int i, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.b = agjVar;
        this.e = i;
        this.g = executor;
        this.c = scheduledExecutorService;
        this.d = z;
    }

    @Override // defpackage.ais
    public final ListenableFuture a(TotalCaptureResult totalCaptureResult) {
        avw.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + ajr.e(this.e, totalCaptureResult));
        if (ajr.e(this.e, totalCaptureResult)) {
            boolean z = this.b.k;
            if (!this.b.J()) {
                avw.a("Camera2CapturePipeline", "Turn on torch");
                this.f = true;
                return bkj.f(bkj.g(bkj.g(bjv.a(kfg.a(new kfd() { // from class: ajm
                    @Override // defpackage.kfd
                    public final Object a(kfb kfbVar) {
                        ajq.this.b.f.a(kfbVar, 2);
                        return "TorchOn";
                    }
                })), new bjq() { // from class: ajn
                    @Override // defpackage.bjq
                    public final ListenableFuture a(Object obj) {
                        ajq ajqVar = ajq.this;
                        return ajqVar.d ? ajqVar.b.d.b() : bkj.b(null);
                    }
                }, this.g), new bjq() { // from class: ajo
                    @Override // defpackage.bjq
                    public final ListenableFuture a(Object obj) {
                        long j = ajq.a;
                        aiu aiuVar = new aiu() { // from class: ajl
                            @Override // defpackage.aiu
                            public final boolean a(TotalCaptureResult totalCaptureResult2) {
                                long j2 = ajq.a;
                                return ajr.d(totalCaptureResult2, true);
                            }
                        };
                        ajq ajqVar = ajq.this;
                        return ajr.c(j, ajqVar.c, ajqVar.b, aiuVar);
                    }
                }, this.g), new afd() { // from class: ajp
                    @Override // defpackage.afd
                    public final Object a(Object obj) {
                        long j = ajq.a;
                        return false;
                    }
                }, bjb.a());
            }
            avw.a("Camera2CapturePipeline", "Torch already on, not turn on");
        }
        return bkj.b(false);
    }

    @Override // defpackage.ais
    public final void b() {
        if (this.f) {
            this.b.f.a(null, 0);
            avw.a("Camera2CapturePipeline", "Turning off torch");
            if (this.d) {
                this.b.d.d(false, true);
            }
        }
    }

    @Override // defpackage.ais
    public final boolean c() {
        return this.e == 0;
    }
}
