package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class api extends CameraDevice.StateCallback {
    final CameraDevice.StateCallback a;
    private final Executor b;

    public api(Executor executor, CameraDevice.StateCallback stateCallback) {
        this.b = executor;
        this.a = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(final CameraDevice cameraDevice) {
        this.b.execute(new Runnable() { // from class: ape
            @Override // java.lang.Runnable
            public final void run() {
                api.this.a.onClosed(cameraDevice);
            }
        });
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(final CameraDevice cameraDevice) {
        this.b.execute(new Runnable() { // from class: apg
            @Override // java.lang.Runnable
            public final void run() {
                api.this.a.onDisconnected(cameraDevice);
            }
        });
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(final CameraDevice cameraDevice, final int i) {
        this.b.execute(new Runnable() { // from class: apf
            @Override // java.lang.Runnable
            public final void run() {
                api.this.a.onError(cameraDevice, i);
            }
        });
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(final CameraDevice cameraDevice) {
        this.b.execute(new Runnable() { // from class: aph
            @Override // java.lang.Runnable
            public final void run() {
                api.this.a.onOpened(cameraDevice);
            }
        });
    }
}
