package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aid implements ais {
    public final agj a;
    public final arm b;
    private final int c;
    private boolean d = false;

    public aid(agj agjVar, int i, arm armVar) {
        this.a = agjVar;
        this.c = i;
        this.b = armVar;
    }

    @Override // defpackage.ais
    public final ListenableFuture a(TotalCaptureResult totalCaptureResult) {
        boolean z = this.a.k;
        if (!ajr.e(this.c, totalCaptureResult)) {
            return bkj.b(false);
        }
        avw.a("Camera2CapturePipeline", "Trigger AE");
        this.d = true;
        return bkj.f(bjv.a(kfg.a(new kfd() { // from class: aib
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                aid aidVar = aid.this;
                aidVar.a.d.j(kfbVar);
                aidVar.b.b = true;
                return "AePreCapture";
            }
        })), new afd() { // from class: aic
            @Override // defpackage.afd
            public final Object a(Object obj) {
                return true;
            }
        }, bjb.a());
    }

    @Override // defpackage.ais
    public final void b() {
        if (this.d) {
            avw.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
            this.a.d.d(false, true);
            this.b.b = false;
        }
    }

    @Override // defpackage.ais
    public final boolean c() {
        return this.c == 0;
    }
}
