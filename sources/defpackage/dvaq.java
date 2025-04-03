package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvaq {
    public static final Map b;
    public static final String c;
    public static final entd a = duwi.a;
    private static final emye d = emye.b(':');

    static {
        cmh cmhVar = new cmh();
        b = cmhVar;
        cmhVar.put("HARDWARE", Build.HARDWARE);
        cmhVar.put("MODEL", Build.MODEL);
        cmhVar.put("BRAND", Build.BRAND);
        cmhVar.put("MANUFACTURER", Build.MANUFACTURER);
        StringBuilder sb = new StringBuilder();
        for (String str : cmhVar.keySet()) {
            if (sb.length() == 0) {
                sb.append("[");
            } else {
                sb.append(" ");
            }
            sb.append(str);
            sb.append(" = ");
            sb.append((String) b.get(str));
        }
        sb.append("]");
        c = sb.toString();
    }

    public static String a(Context context, int i) {
        if (dvad.a) {
            return "#0x".concat(String.valueOf(Integer.toHexString(i)));
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Resources.NotFoundException unused) {
            return "#0x".concat(String.valueOf(Integer.toHexString(i)));
        }
    }

    public static boolean b(Map map, String str) {
        boolean z = true;
        for (String str2 : d.g(str)) {
            int indexOf = str2.indexOf(61);
            if (indexOf < 0) {
                throw new dvap("Pattern has no '='", str);
            }
            String str3 = (String) map.get(str2.substring(0, indexOf));
            if (str3 == null) {
                throw new dvap("Unknown key", str);
            }
            try {
                if (!str3.matches(str2.substring(indexOf + 1))) {
                    if (!duzy.a) {
                        return false;
                    }
                    z = false;
                }
            } catch (PatternSyntaxException e) {
                throw new dvap("Syntax error", str, e);
            }
        }
        return z;
    }
}
