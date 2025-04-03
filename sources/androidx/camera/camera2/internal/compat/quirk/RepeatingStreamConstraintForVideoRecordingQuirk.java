package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.bfr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RepeatingStreamConstraintForVideoRecordingQuirk implements bfr {
    public static boolean a() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL);
    }
}
