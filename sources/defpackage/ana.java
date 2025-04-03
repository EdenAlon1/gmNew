package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ana extends CameraCaptureSession.StateCallback {
    final /* synthetic */ anb a;

    public ana(anb anbVar) {
        this.a = anbVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.a.r(cameraCaptureSession);
        anb anbVar = this.a;
        anbVar.f(anbVar);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        this.a.r(cameraCaptureSession);
        anb anbVar = this.a;
        anbVar.g(anbVar);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.a.r(cameraCaptureSession);
        anb anbVar = this.a;
        anbVar.h(anbVar);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        kfb kfbVar;
        try {
            this.a.r(cameraCaptureSession);
            anb anbVar = this.a;
            anbVar.a(anbVar);
            synchronized (this.a.a) {
                ksw.i(this.a.i, "OpenCaptureSession completer should not null");
                anb anbVar2 = this.a;
                kfbVar = anbVar2.i;
                anbVar2.i = null;
            }
            kfbVar.c(new IllegalStateException("onConfigureFailed"));
        } catch (Throwable th) {
            synchronized (this.a.a) {
                ksw.i(this.a.i, "OpenCaptureSession completer should not null");
                anb anbVar3 = this.a;
                kfb kfbVar2 = anbVar3.i;
                anbVar3.i = null;
                kfbVar2.c(new IllegalStateException("onConfigureFailed"));
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        kfb kfbVar;
        try {
            this.a.r(cameraCaptureSession);
            anb anbVar = this.a;
            anbVar.b(anbVar);
            synchronized (this.a.a) {
                ksw.i(this.a.i, "OpenCaptureSession completer should not null");
                anb anbVar2 = this.a;
                kfbVar = anbVar2.i;
                anbVar2.i = null;
            }
            kfbVar.b(null);
        } catch (Throwable th) {
            synchronized (this.a.a) {
                ksw.i(this.a.i, "OpenCaptureSession completer should not null");
                anb anbVar3 = this.a;
                kfb kfbVar2 = anbVar3.i;
                anbVar3.i = null;
                kfbVar2.b(null);
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.a.r(cameraCaptureSession);
        anb anbVar = this.a;
        anbVar.c(anbVar);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.a.r(cameraCaptureSession);
        anb anbVar = this.a;
        anbVar.i(anbVar, surface);
    }
}
