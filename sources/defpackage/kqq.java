package defpackage;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqq {
    public static final /* synthetic */ int a = 0;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(30);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(31);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(33);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public static final boolean a(String str, String str2) {
        if (ffkj.e("REL", str2)) {
            return false;
        }
        Integer c = c(str2);
        Integer c2 = c(str);
        if (c != null && c2 != null) {
            c.intValue();
            c2.intValue();
            return true;
        }
        if (c != null || c2 != null) {
            return c != null;
        }
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        String upperCase2 = str.toUpperCase(Locale.ROOT);
        upperCase2.getClass();
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @ffbs
    public static final boolean b() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 32) {
            String str = Build.VERSION.CODENAME;
            str.getClass();
            if (a("Tiramisu", str)) {
                return true;
            }
        }
        return false;
    }

    private static final Integer c(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return ffkj.e(upperCase, "BAKLAVA") ? 0 : null;
    }
}
