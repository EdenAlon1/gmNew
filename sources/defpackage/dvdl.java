package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvdl {
    private static final entd a = entd.c("GnpSdk");

    public static String a(Context context) {
        return kqt.a(context.getResources().getConfiguration()).f(0).toLanguageTag();
    }

    public static boolean b(Context context) {
        if (context == null) {
            ((ensz) ((ensz) a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/common/DeviceUtils", "isTalkBackEnabled", 64, "DeviceUtils.java")).q("Null context passed to isTalkBackEnabled");
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService(AccessibilityManager.class);
        return (accessibilityManager == null || !accessibilityManager.isEnabled() || accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty()) ? false : true;
    }
}
