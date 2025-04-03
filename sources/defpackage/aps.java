package defpackage;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aps extends CameraManager.AvailabilityCallback {
    final CameraManager.AvailabilityCallback a;
    public final Object b = new Object();
    public boolean c = false;
    private final Executor d;

    public aps(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.d = executor;
        this.a = availabilityCallback;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.b) {
            if (!this.c) {
                this.d.execute(new Runnable() { // from class: apq
                    @Override // java.lang.Runnable
                    public final void run() {
                        aps.this.a.onCameraAccessPrioritiesChanged();
                    }
                });
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(final String str) {
        synchronized (this.b) {
            if (!this.c) {
                this.d.execute(new Runnable() { // from class: app
                    @Override // java.lang.Runnable
                    public final void run() {
                        aps.this.a.onCameraAvailable(str);
                    }
                });
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(final String str) {
        synchronized (this.b) {
            if (!this.c) {
                this.d.execute(new Runnable() { // from class: apr
                    @Override // java.lang.Runnable
                    public final void run() {
                        aps.this.a.onCameraUnavailable(str);
                    }
                });
            }
        }
    }
}
