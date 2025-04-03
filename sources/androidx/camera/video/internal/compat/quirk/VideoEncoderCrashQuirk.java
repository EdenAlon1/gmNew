package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.bcq;
import defpackage.brk;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    public static boolean b() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean a(bcq bcqVar, brk brkVar) {
        return b() && bcqVar.a() == 0 && brkVar == brk.b;
    }
}
