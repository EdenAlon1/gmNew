package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owo {
    public static final String a(Collection collection) {
        String l;
        if (collection.isEmpty()) {
            return " }";
        }
        l = ffno.l(ffno.i(ffpc.H(ffdx.aA(collection, ",\n", "\n", "\n", null, 56)), new ffpg()), "\n", 62);
        return l.concat("},");
    }

    public static final String b(owl owlVar) {
        String c;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(owlVar.a);
        sb.append("',\n            |    columns = {");
        sb.append(a(ffdx.ah(owlVar.b.values(), new owm())));
        sb.append("\n            |    foreignKeys = {");
        sb.append(a(owlVar.c));
        sb.append("\n            |    indices = {");
        Set set = owlVar.d;
        sb.append(a(set != null ? ffdx.ah(set, new own()) : ffel.a));
        sb.append("\n            |}\n        ");
        c = ffpc.c(sb.toString(), "|");
        return c;
    }

    public static final void c(Collection collection) {
        ffno.l(ffno.i(ffpc.H(ffdx.aA(collection, ",", null, null, null, 62)), new ffpg()), "\n", 62);
        ffno.l(ffno.i(ffpc.H(" }"), new ffpg()), "\n", 62);
    }

    public static final void d(Collection collection) {
        ffno.l(ffno.i(ffpc.H(ffdx.aA(collection, ",", null, null, null, 62)), new ffpg()), "\n", 62);
        ffno.l(ffno.i(ffpc.H("},"), new ffpg()), "\n", 62);
    }

    public static final boolean e(String str, String str2) {
        if (ffkj.e(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0) {
                        if (charAt != '(') {
                            break;
                        }
                        i3 = 0;
                        charAt = '(';
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    substring.getClass();
                    return ffkj.e(ffpc.x(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final boolean f(owl owlVar, Object obj) {
        Set set;
        if (owlVar == obj) {
            return true;
        }
        if (!(obj instanceof owl)) {
            return false;
        }
        owl owlVar2 = (owl) obj;
        if (!ffkj.e(owlVar.a, owlVar2.a) || !ffkj.e(owlVar.b, owlVar2.b) || !ffkj.e(owlVar.c, owlVar2.c)) {
            return false;
        }
        Set set2 = owlVar.d;
        if (set2 == null || (set = owlVar2.d) == null) {
            return true;
        }
        return ffkj.e(set2, set);
    }
}
