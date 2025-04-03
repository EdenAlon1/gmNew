package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Build;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aox {
    public final apa a;

    public aox(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new aoy(cameraCaptureSession);
        } else {
            this.a = new apa(cameraCaptureSession, new aoz(handler));
        }
    }

    public final CameraCaptureSession a() {
        return this.a.a;
    }
}
