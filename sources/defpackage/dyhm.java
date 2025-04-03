package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhm {
    public static String a(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        String[] split = lowerCase.split("@", 2);
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            if (TextUtils.equals(str3, "gmail.com") || TextUtils.equals(str3, "googlemail.com")) {
                return str2.replace(".", "").concat("@gmail.com");
            }
        }
        return lowerCase;
    }
}
