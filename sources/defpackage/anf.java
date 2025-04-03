package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anf extends ams {
    private final CameraCaptureSession.StateCallback a;

    public anf(CameraCaptureSession.StateCallback stateCallback) {
        this.a = stateCallback;
    }

    @Override // defpackage.ams
    public final void a(amt amtVar) {
        this.a.onConfigureFailed(amtVar.l().a());
    }

    @Override // defpackage.ams
    public final void b(amt amtVar) {
        this.a.onConfigured(amtVar.l().a());
    }

    @Override // defpackage.ams
    public final void c(amt amtVar) {
        this.a.onReady(amtVar.l().a());
    }

    @Override // defpackage.ams
    public final void f(amt amtVar) {
        this.a.onActive(amtVar.l().a());
    }

    @Override // defpackage.ams
    public final void g(amt amtVar) {
        this.a.onCaptureQueueEmpty(amtVar.l().a());
    }

    @Override // defpackage.ams
    public final void h(amt amtVar) {
        this.a.onClosed(amtVar.l().a());
    }

    @Override // defpackage.ams
    public final void i(amt amtVar, Surface surface) {
        this.a.onSurfacePrepared(amtVar.l().a(), surface);
    }

    @Override // defpackage.ams
    public final void d(amt amtVar) {
    }
}
