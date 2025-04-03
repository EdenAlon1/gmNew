package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.bfr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExtraSupportedOutputSizeQuirk implements bfr {
    public static boolean a() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }
}
