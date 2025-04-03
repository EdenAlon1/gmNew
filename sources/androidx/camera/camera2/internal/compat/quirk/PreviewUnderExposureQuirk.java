package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.bfr;
import defpackage.ffpc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreviewUnderExposureQuirk implements bfr {
    public static final PreviewUnderExposureQuirk a = new PreviewUnderExposureQuirk();
    public static final boolean b = ffpc.j(Build.BRAND, "TCL", true);

    private PreviewUnderExposureQuirk() {
    }
}
