package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aki extends CameraCaptureSession.CaptureCallback {
    private final bbt a;

    public aki(bbt bbtVar) {
        if (bbtVar == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.a = bbtVar;
    }

    private static final int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof bgw) && (num = (Integer) ((bgw) captureRequest.getTag()).c("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        bgw bgwVar;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            ksw.b(tag instanceof bgw, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            bgwVar = (bgw) tag;
        } else {
            bgwVar = bgw.a;
        }
        this.a.b(a(captureRequest), new afr(bgwVar, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.a.c(a(captureRequest), new bbx());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        this.a.d(a(captureRequest));
    }
}
