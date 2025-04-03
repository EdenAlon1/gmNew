package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoy extends apa {
    public aoy(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // defpackage.apa
    public final void a(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        this.a.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // defpackage.apa
    public final void b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        this.a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
