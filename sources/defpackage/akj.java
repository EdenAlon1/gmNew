package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akj extends bbt {
    public final CameraCaptureSession.CaptureCallback a;

    public akj(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.a = captureCallback;
    }
}
