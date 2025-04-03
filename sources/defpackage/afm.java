package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afm extends asm {
    public static final bdn a = new bbf("camera2.captureRequest.templateType", Integer.TYPE, null);
    public static final bdn b = new bbf("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);
    public static final bdn c = new bbf("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
    public static final bdn d = new bbf("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
    public static final bdn e = new bbf("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
    public static final bdn f;

    static {
        new bbf("camera2.captureRequest.tag", Object.class, null);
        f = new bbf("camera2.cameraCaptureSession.physicalCameraId", String.class, null);
    }

    public afm(bdp bdpVar) {
        super(bdpVar);
    }

    public static bdn d(CaptureRequest.Key key) {
        return new bbf("camera2.captureRequest.option.".concat(String.valueOf(key.getName())), Object.class, key);
    }

    public final int a(int i) {
        return ((Integer) this.g.m(a, Integer.valueOf(i))).intValue();
    }

    public final CameraCaptureSession.CaptureCallback b(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) this.g.m(e, captureCallback);
    }

    public final asm c() {
        return asl.a(this.g).b();
    }

    public final String e() {
        return (String) this.g.m(f, null);
    }
}
