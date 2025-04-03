package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import defpackage.bfr;
import defpackage.ffpc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreviewGreenTintQuirk implements bfr {
    public static final PreviewGreenTintQuirk a = new PreviewGreenTintQuirk();

    private PreviewGreenTintQuirk() {
    }

    public static final boolean a() {
        return ffpc.j("motorola", Build.BRAND, true) && ffpc.j("moto e20", Build.MODEL, true);
    }
}
