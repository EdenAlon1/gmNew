package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhgm {
    public static final fhgn a(String str) {
        str.getClass();
        Matcher matcher = fhgn.a.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(a.a(str, "No subtype found for: \"", "\""));
        }
        String group = matcher.group(1);
        group.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = group.toLowerCase(locale);
        lowerCase.getClass();
        String group2 = matcher.group(2);
        group2.getClass();
        Locale locale2 = Locale.US;
        locale2.getClass();
        group2.toLowerCase(locale2).getClass();
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = fhgn.b.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                String substring = str.substring(end);
                substring.getClass();
                throw new IllegalArgumentException(a.d(str, substring, "Parameter is not formatted correctly: \"", "\" for: \"", "\""));
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (ffpc.t(group4, "'") && ffpc.n(group4, "'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    group4.getClass();
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new fhgn(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }
}
