package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahf extends CameraDevice.StateCallback {
    final /* synthetic */ kfb a;
    final /* synthetic */ ahu b;

    public ahf(ahu ahuVar, kfb kfbVar) {
        this.b = ahuVar;
        this.a = kfbVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.b.q("openCameraConfigAndClose camera closed");
        this.a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.b.q("openCameraConfigAndClose camera disconnected");
        this.a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        this.b.q(a.h(i, "openCameraConfigAndClose camera error "));
        this.a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(final CameraDevice cameraDevice) {
        this.b.q("openCameraConfigAndClose camera opened");
        ahu ahuVar = this.b;
        final akt aktVar = new akt(ahuVar.y, false);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final bew bewVar = new bew(surface);
        bewVar.c().b(new Runnable() { // from class: agt
            @Override // java.lang.Runnable
            public final void run() {
                surface.release();
                surfaceTexture.release();
            }
        }, bjb.a());
        bgc bgcVar = new bgc();
        bgcVar.i(bewVar);
        bgcVar.t(1);
        ahuVar.q("Start configAndClose.");
        final ListenableFuture b = aktVar.b(bgcVar.b(), cameraDevice, ahuVar.v.a());
        ListenableFuture g = bkj.g(bjv.a(kfg.a(new kfd() { // from class: bjx
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                Runnable runnable = new Runnable() { // from class: bjy
                    @Override // java.lang.Runnable
                    public final void run() {
                        kfb.this.b(null);
                    }
                };
                ListenableFuture listenableFuture = ListenableFuture.this;
                listenableFuture.b(runnable, bjb.a());
                return "transformVoidFuture [" + listenableFuture + "]";
            }
        })), new bjq() { // from class: agu
            @Override // defpackage.bjq
            public final ListenableFuture a(Object obj) {
                akt aktVar2 = akt.this;
                aktVar2.f();
                bewVar.d();
                return aktVar2.p();
            }
        }, ahuVar.c);
        cameraDevice.getClass();
        g.b(new Runnable() { // from class: ahe
            @Override // java.lang.Runnable
            public final void run() {
                cameraDevice.close();
            }
        }, this.b.c);
    }
}
