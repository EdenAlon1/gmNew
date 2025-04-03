package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aow extends CameraCaptureSession.StateCallback {
    final CameraCaptureSession.StateCallback a;
    private final Executor b;

    public aow(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.b = executor;
        this.a = stateCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(final CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new Runnable() { // from class: aop
            @Override // java.lang.Runnable
            public final void run() {
                aow.this.a.onActive(cameraCaptureSession);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new Runnable() { // from class: aos
            @Override // java.lang.Runnable
            public final void run() {
                aow.this.a.onCaptureQueueEmpty(cameraCaptureSession);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(final CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new Runnable() { // from class: aoq
            @Override // java.lang.Runnable
            public final void run() {
                aow.this.a.onClosed(cameraCaptureSession);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new Runnable() { // from class: aov
            @Override // java.lang.Runnable
            public final void run() {
                aow.this.a.onConfigureFailed(cameraCaptureSession);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(final CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new Runnable() { // from class: aot
            @Override // java.lang.Runnable
            public final void run() {
                aow.this.a.onConfigured(cameraCaptureSession);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(final CameraCaptureSession cameraCaptureSession) {
        this.b.execute(new Runnable() { // from class: aou
            @Override // java.lang.Runnable
            public final void run() {
                aow.this.a.onReady(cameraCaptureSession);
            }
        });
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
        this.b.execute(new Runnable() { // from class: aor
            @Override // java.lang.Runnable
            public final void run() {
                aow.this.a.onSurfacePrepared(cameraCaptureSession, surface);
            }
        });
    }
}
