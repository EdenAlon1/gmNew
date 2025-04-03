package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;

/* compiled from: PG */
/* loaded from: classes.dex */
final class apm extends apl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apm(CameraDevice cameraDevice) {
        super(cameraDevice, null);
        ksw.h(cameraDevice);
    }

    @Override // defpackage.apl, defpackage.apo
    public final void a(aqx aqxVar) {
        Object d = aqxVar.a.d();
        ksw.h(d);
        try {
            this.a.createCaptureSession(abj$$ExternalSyntheticApiModelOutline0.m32m(d));
        } catch (CameraAccessException e) {
            throw new aog(e);
        }
    }
}
