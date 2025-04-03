package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.bfr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExtraSupportedQualityQuirk implements bfr {
    public static boolean a() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }
}
