package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.bfr;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InvalidVideoProfilesQuirk implements bfr {
    public static final List a = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");
    public static final List b = Arrays.asList("cph2417", "cph2451");
    public static final List c = Arrays.asList("cph2437", "cph2525", "pht110");

    public static boolean a() {
        return Build.VERSION.SDK_INT == 33;
    }

    public static boolean b() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }
}
