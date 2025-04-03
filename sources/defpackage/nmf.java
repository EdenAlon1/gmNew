package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nmf {
    public static final Pattern a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern b = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final luv c = new luv();
    public final StringBuilder d = new StringBuilder();

    public static String a(luv luvVar, StringBuilder sb) {
        sb.setLength(0);
        int i = luvVar.b;
        int i2 = luvVar.c;
        loop0: while (true) {
            for (boolean z = false; i < i2 && !z; z = true) {
                char c = (char) luvVar.a[i];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    sb.append(c);
                    i++;
                }
            }
        }
        luvVar.L(i - luvVar.b);
        return sb.toString();
    }

    static String b(luv luvVar, StringBuilder sb) {
        c(luvVar);
        if (luvVar.b() == 0) {
            return null;
        }
        String a2 = a(luvVar, sb);
        if (!"".equals(a2)) {
            return a2;
        }
        char j = (char) luvVar.j();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j);
        return sb2.toString();
    }

    static void c(luv luvVar) {
        while (true) {
            for (boolean z = true; luvVar.b() > 0 && z; z = false) {
                int i = luvVar.b;
                byte[] bArr = luvVar.a;
                byte b2 = bArr[i];
                char c = (char) b2;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    luvVar.L(1);
                } else {
                    int i2 = luvVar.c;
                    if (i + 2 <= i2) {
                        int i3 = i + 1;
                        if (b2 == 47) {
                            int i4 = i + 2;
                            if (bArr[i3] == 42) {
                                while (true) {
                                    int i5 = i4 + 1;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                        i2 = i4 + 2;
                                        i4 = i2;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                luvVar.L(i2 - luvVar.b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }
}
