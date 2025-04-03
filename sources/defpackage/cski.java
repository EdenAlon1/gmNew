package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cski {
    public static String a(String str) {
        cskc cskcVar = cpdg.a;
        if (aoqw.h(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        for (int length = str.length() - 1; length >= 0; length--) {
            if (Character.isDigit(sb.charAt(length))) {
                sb.setCharAt(length, 'x');
                i++;
            }
            if (i == 7) {
                break;
            }
        }
        return sb.toString();
    }
}
