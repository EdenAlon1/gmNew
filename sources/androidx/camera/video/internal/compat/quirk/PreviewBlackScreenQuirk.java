package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import defpackage.ffpc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreviewBlackScreenQuirk implements SurfaceProcessingQuirk {
    public static final boolean a;

    static {
        a = ffpc.j(Build.BRAND, "motorola", true) && ffpc.j(Build.MODEL, "motorola edge 20 fusion", true);
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final /* synthetic */ boolean i() {
        return true;
    }
}
