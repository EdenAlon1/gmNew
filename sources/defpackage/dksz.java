package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dksz {
    public static String a(String str) {
        int lastIndexOf;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf(64);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        int indexOf2 = str.indexOf(59);
        if (indexOf2 > 0) {
            str = str.substring(0, indexOf2);
        } else {
            int indexOf3 = str.indexOf(63);
            if (indexOf3 > 0) {
                str = str.substring(0, indexOf3);
            }
        }
        String trim = str.trim();
        return (trim.charAt(trim.length() + (-1)) != ']' && (lastIndexOf = trim.lastIndexOf(58)) > 0) ? trim.substring(0, lastIndexOf).trim() : trim;
    }
}
