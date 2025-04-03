package defpackage;

import android.hardware.camera2.CameraManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahi extends CameraManager.AvailabilityCallback {
    public boolean a = true;
    public final /* synthetic */ ahu b;
    private final String c;

    public ahi(ahu ahuVar, String str) {
        this.b = ahuVar;
        this.c = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (this.c.equals(str)) {
            this.a = true;
            if (this.b.A == 4 || this.b.A == 5) {
                this.b.D(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (this.c.equals(str)) {
            this.a = false;
        }
    }
}
