package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class apa {
    final CameraCaptureSession a;
    final Object b;

    public apa(CameraCaptureSession cameraCaptureSession, Object obj) {
        ksw.h(cameraCaptureSession);
        this.a = cameraCaptureSession;
        this.b = obj;
    }

    public void a(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        this.a.captureBurst(list, new aoo(executor, captureCallback), ((aoz) this.b).a);
    }

    public void b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        this.a.setRepeatingRequest(captureRequest, new aoo(executor, captureCallback), ((aoz) this.b).a);
    }
}
