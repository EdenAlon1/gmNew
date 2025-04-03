package androidx.camera.camera2.internal.compat.quirk;

import android.util.Pair;
import defpackage.bfr;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements bfr {
    public static final Set a = new HashSet();

    static {
        a("lemp");
        a("DM20C");
    }

    private static void a(String str) {
        a.add(new Pair("sprd".toLowerCase(Locale.US), str.toLowerCase(Locale.US)));
    }
}
