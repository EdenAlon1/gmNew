package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crte {
    public static final Pattern a = Pattern.compile("^(D|W|M[DP]|Y[DM])([0-9]*)((?:\\s+(?:MO|TU|WE|TH|FR|SA|SU|LD|(?:[0-9]{1,3}[+-]?)))*)(?:\\s+(?:#([0-9]+)|([0-9]{8,}(?:T[0-9]{6}Z?)?)))?$", 2);
    public static final Pattern b = Pattern.compile("\\s+");

    public static void a(StringBuilder sb, String[] strArr) {
        if (strArr.length != 0) {
            sb.append(strArr[0]);
            for (int i = 1; i < strArr.length; i++) {
                sb.append(",");
                sb.append(strArr[i]);
            }
        }
    }
}
