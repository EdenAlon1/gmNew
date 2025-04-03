package defpackage;

import android.hardware.camera2.CameraCharacteristics;

/* compiled from: PG */
/* loaded from: classes.dex */
public class apc {
    public final CameraCharacteristics a;

    public apc(CameraCharacteristics cameraCharacteristics) {
        this.a = cameraCharacteristics;
    }

    public final Object a(CameraCharacteristics.Key key) {
        return this.a.get(key);
    }
}
