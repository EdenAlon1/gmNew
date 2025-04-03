package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aiv implements agi {
    public kfb a;
    public final ListenableFuture b = kfg.a(new kfd() { // from class: ait
        @Override // defpackage.kfd
        public final Object a(kfb kfbVar) {
            aiv.this.a = kfbVar;
            return "waitFor3AResult";
        }
    });
    private final aiu c;

    public aiv(aiu aiuVar) {
        this.c = aiuVar;
    }

    @Override // defpackage.agi
    public final boolean a(TotalCaptureResult totalCaptureResult) {
        aiu aiuVar = this.c;
        if (aiuVar != null && !aiuVar.a(totalCaptureResult)) {
            return false;
        }
        this.a.b(totalCaptureResult);
        return true;
    }
}
