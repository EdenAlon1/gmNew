package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apj {
    public final apo a;

    public apj(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new apm(cameraDevice);
        } else {
            this.a = new apl(cameraDevice, new apn(handler));
        }
    }
}
