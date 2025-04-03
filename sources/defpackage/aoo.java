package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoo extends CameraCaptureSession.CaptureCallback {
    final CameraCaptureSession.CaptureCallback a;
    private final Executor b;

    public aoo(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        this.b = executor;
        this.a = captureCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j) {
        this.b.execute(new Runnable() { // from class: aom
            @Override // java.lang.Runnable
            public final void run() {
                aoo.this.a.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
        this.b.execute(new Runnable() { // from class: aoi
            @Override // java.lang.Runnable
            public final void run() {
                aoo.this.a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
        this.b.execute(new Runnable() { // from class: aol
            @Override // java.lang.Runnable
            public final void run() {
                aoo.this.a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
        this.b.execute(new Runnable() { // from class: aoj
            @Override // java.lang.Runnable
            public final void run() {
                aoo.this.a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i) {
        this.b.execute(new Runnable() { // from class: aon
            @Override // java.lang.Runnable
            public final void run() {
                aoo.this.a.onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i, final long j) {
        this.b.execute(new Runnable() { // from class: aok
            @Override // java.lang.Runnable
            public final void run() {
                aoo.this.a.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j, final long j2) {
        this.b.execute(new Runnable() { // from class: aoh
            @Override // java.lang.Runnable
            public final void run() {
                aoo.this.a.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
            }
        });
    }
}
