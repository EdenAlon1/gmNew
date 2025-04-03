package defpackage;

import android.text.TextUtils;
import android.util.Patterns;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dktk {
    public static boolean a(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean b(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    public static boolean d(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean e(String str, String str2) {
        if (str != null && str2.length() <= str.length()) {
            return str.substring(0, str2.length()).equalsIgnoreCase(str2);
        }
        return false;
    }
}
