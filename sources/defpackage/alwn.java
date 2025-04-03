package defpackage;

import android.os.Build;
import com.android.vcard.VCardConstants;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alwn {
    private final ctvb a;

    public alwn(ctvb ctvbVar) {
        this.a = ctvbVar;
    }

    public static final String b() {
        Optional ofNullable = Optional.ofNullable(Build.MANUFACTURER);
        if (ofNullable.isEmpty()) {
            return "UNKNOWN";
        }
        String str = (String) ofNullable.get();
        if (!fhpd.a(str)) {
            int length = str.length();
            char[] cArr = new char[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (!Character.isWhitespace(str.charAt(i2))) {
                    cArr[i] = str.charAt(i2);
                    i++;
                }
            }
            if (i != length) {
                str = i == 0 ? "" : new String(cArr, 0, i);
            }
        }
        return c(str.toUpperCase(Locale.US), enip.o(((ezgw) alwj.h.e()).b));
    }

    private static String c(String str, enip enipVar) {
        return enipVar.contains(str) ? str : VCardConstants.PARAM_PHONE_EXTRA_TYPE_OTHER;
    }

    public final String a() {
        Optional ofNullable = Optional.ofNullable(this.a.A());
        return ofNullable.isEmpty() ? "UNKNOWN" : c((String) ofNullable.get(), enip.o(((ezgw) alwj.g.e()).b));
    }
}
