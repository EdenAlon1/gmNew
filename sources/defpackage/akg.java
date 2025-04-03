package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akg {
    public static boolean a(apu apuVar, String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) apuVar.a(str).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (aog e) {
            throw new avv(new ato(e));
        }
    }
}
