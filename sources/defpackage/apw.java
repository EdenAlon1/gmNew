package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class apw extends apv {
    public apw(Context context) {
        super(context);
    }

    @Override // defpackage.apv, defpackage.apz, defpackage.apt
    public final CameraCharacteristics a(String str) {
        try {
            return this.a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new aog(e);
        }
    }

    @Override // defpackage.apv, defpackage.apz, defpackage.apt
    public final void c(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw new aog(e);
        }
    }
}
