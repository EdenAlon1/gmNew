package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.bfr;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaCodecInfoReportIncorrectInfoQuirk implements bfr {
    public static final List a = Arrays.asList("lg-k430", "redmi note 4", "m2003j15sc", "m2004j19c", "rmx3231", "v2117", "sm-a032f", "moto g(20)", "sm-a035m", "v2204", "23078pnd5g", "pht110", "23053rn02l", "rmx3710", "rmx3511", "v2207", "moto e20");

    public static boolean a() {
        return a.contains(Build.MODEL.toLowerCase(Locale.US));
    }
}
