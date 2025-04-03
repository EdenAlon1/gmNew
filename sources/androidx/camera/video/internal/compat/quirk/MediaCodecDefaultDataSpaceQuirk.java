package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.bfr;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaCodecDefaultDataSpaceQuirk implements bfr {
    private static final List a = Collections.singletonList("cph2449");
    private static final List b = Arrays.asList("cph2437", "pht110");
    private static final List c = Arrays.asList("pixel 3", "pixel 3a xl", "pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a");
    private static final List d = Arrays.asList("pixel fold", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7a", "pixel 7 pro", "pixel 8", "pixel 8a", "pixel 8 pro", "pixel 9", "pixel 9 pro", "pixel 9 pro xl", "pixel 9 pro fold");
    private static final List e = Collections.singletonList("m2101k7ag");
    private static final List f = Collections.singletonList("2307pnd5g");

    public static boolean a() {
        return a.contains(Build.MODEL.toLowerCase(Locale.ROOT)) || b.contains(Build.MODEL.toLowerCase(Locale.ROOT)) || c.contains(Build.MODEL.toLowerCase(Locale.ROOT)) || e.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    public static boolean b() {
        return d.contains(Build.MODEL.toLowerCase(Locale.ROOT)) || f.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }
}
