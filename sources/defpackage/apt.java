package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface apt {
    CameraCharacteristics a(String str);

    Set b();

    void c(String str, Executor executor, CameraDevice.StateCallback stateCallback);

    void d(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

    void e(CameraManager.AvailabilityCallback availabilityCallback);

    String[] f();
}
