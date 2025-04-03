package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agh extends CameraCaptureSession.CaptureCallback {
    final Set a = new HashSet();
    private final Executor b;

    public agh(Executor executor) {
        this.b = executor;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
        this.b.execute(new Runnable() { // from class: agg
            @Override // java.lang.Runnable
            public final void run() {
                HashSet hashSet = new HashSet();
                agh aghVar = agh.this;
                for (agi agiVar : aghVar.a) {
                    TotalCaptureResult totalCaptureResult2 = totalCaptureResult;
                    if (agiVar.a(totalCaptureResult2)) {
                        hashSet.add(agiVar);
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                aghVar.a.removeAll(hashSet);
            }
        });
    }
}
