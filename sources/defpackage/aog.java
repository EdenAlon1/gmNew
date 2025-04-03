package defpackage;

import android.hardware.camera2.CameraAccessException;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aog extends Exception {
    static final Set a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));
    public final int b;

    static {
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));
    }

    public aog(String str, Throwable th) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str), th);
        this.b = 10002;
        if (a.contains(10002)) {
            new CameraAccessException(10002, str, th);
        }
    }

    public aog(Throwable th) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", th);
        this.b = 10001;
        if (a.contains(10001)) {
            new CameraAccessException(10001, null, th);
        }
    }

    public aog(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.b = cameraAccessException.getReason();
    }
}
