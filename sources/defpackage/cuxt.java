package defpackage;

import android.content.res.Resources;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuxt {
    public static final Pattern a = Pattern.compile("^\\+?[0-9\\s\\(\\)\\-x]+$");

    public static String a(int i) {
        StringBuilder sb = new StringBuilder(i);
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("abcdefghijklmnopqrstuvxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt(61)));
        }
        return sb.toString();
    }

    public static String b(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static String c(Resources resources, List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? size != 2 ? resources.getString(R.string.listify_many, list.get(0), Integer.valueOf(list.size() - 1)) : resources.getString(R.string.listify_two, list.get(0), list.get(1)) : resources.getString(R.string.listify_one, list.get(0)) : "";
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            int digit = Character.digit(c, 10);
            if (digit != -1) {
                sb.append(digit);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static List e(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (String str2 : str.split(",", -1)) {
            arrayList.add(str2.trim());
        }
        arrayList.removeAll(engw.r(""));
        return arrayList;
    }

    public static void f(StringBuilder sb, String str, String str2) {
        g(sb, null, str, str2);
    }

    public static void g(StringBuilder sb, String str, String str2, String str3) {
        if (sb.length() > 0) {
            sb.append(str3);
        }
        if (!emxe.c(str)) {
            sb.append(str);
        }
        sb.append(str2);
    }

    public static boolean h(String str, String str2) {
        if (emxe.c(str) || emxe.c(str2)) {
            return false;
        }
        return str.toLowerCase(Locale.US).equals(str2.toLowerCase(Locale.US));
    }

    public static boolean i(String str) {
        if (!emxe.c(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean j(String str, Pattern pattern) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (pattern == null || !pattern.matcher(str).find()) {
            return PhoneNumberUtils.isGlobalPhoneNumber(str);
        }
        return true;
    }

    public static String k(String str) {
        return URLEncoder.encode(str, "UTF-8");
    }
}
