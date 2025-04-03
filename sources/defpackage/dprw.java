package defpackage;

import android.hardware.Camera;
import android.media.MediaActionSound;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dprw {
    private static final enru c = enru.c("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraSoundController");
    public final ffsk a;
    public final MediaActionSound b;

    public dprw(ffsk ffskVar) {
        ffskVar.getClass();
        this.a = ffskVar;
        this.b = new MediaActionSound();
    }

    public static final boolean a() {
        boolean mustPlayShutterSound;
        if (Build.VERSION.SDK_INT >= 33) {
            mustPlayShutterSound = MediaActionSound.mustPlayShutterSound();
            return mustPlayShutterSound;
        }
        ffev it = ffmk.q(0, Camera.getNumberOfCameras()).iterator();
        while (((ffmi) it).a) {
            int a = it.a();
            try {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(a, cameraInfo);
                if (!cameraInfo.canDisableShutterSound) {
                    return true;
                }
            } catch (RuntimeException e) {
                ((enrr) ((enrr) c.i()).g(e).h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraSoundController", "mustPlayShutterSound", 31, "CameraSoundController.kt")).q("Error getting camera info from legacy Camera API");
                return true;
            }
        }
        return false;
    }
}
