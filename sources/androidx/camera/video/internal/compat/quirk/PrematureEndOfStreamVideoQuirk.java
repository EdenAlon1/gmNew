package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.bfr;
import defpackage.ffpc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PrematureEndOfStreamVideoQuirk implements bfr {
    public static final PrematureEndOfStreamVideoQuirk a = new PrematureEndOfStreamVideoQuirk();
    public static final boolean b;

    static {
        b = ffpc.j("OPPO", Build.BRAND, true) && ffpc.j("CPH1931", Build.MODEL, true);
    }

    private PrematureEndOfStreamVideoQuirk() {
    }
}
