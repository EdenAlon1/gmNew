package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aie implements ais {
    private final agj a;
    private boolean b = false;

    public aie(agj agjVar) {
        this.a = agjVar;
    }

    @Override // defpackage.ais
    public final ListenableFuture a(TotalCaptureResult totalCaptureResult) {
        Integer num;
        int intValue;
        ListenableFuture b = bkj.b(true);
        if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((intValue = num.intValue()) == 1 || intValue == 2)) {
            avw.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num2 != null && num2.intValue() == 0) {
                avw.a("Camera2CapturePipeline", "Trigger AF");
                this.b = true;
                this.a.d.m(false);
            }
        }
        return b;
    }

    @Override // defpackage.ais
    public final void b() {
        if (this.b) {
            avw.a("Camera2CapturePipeline", "cancel TriggerAF");
            this.a.d.d(true, false);
        }
    }

    @Override // defpackage.ais
    public final boolean c() {
        return true;
    }
}
