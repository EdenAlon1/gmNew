package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eyct {
    public static final emye a;
    public static final emww b;
    public static final emww c;
    private static final emye d;
    private static final emye e;
    private static final emww f;
    private static final engw g;

    static {
        emye a2 = emye.b('=').a();
        emxf.d(true, "must be greater than zero: %s", 2);
        a = new emye(a2.c, a2.b, a2.a, 2);
        d = emye.b('/');
        e = emye.b('-');
        emye.b(':');
        b = new emww("/");
        f = new emww("-");
        c = new emww("=");
        g = engw.C(new eycs("s", false), new eycs("w", false), new eycs("c", true), new eycs("d", true), new eycs("h", false), new eycs("s", true), new eycs("h", true), new eycs("p", true), new eycs("pp", true), new eycs("pf", true), new eycs("n", true), new eycs("r", false), new eycs("r", true), new eycs("o", true), new eycs("o", false), new eycs("j", false), new eycs("x", false), new eycs("y", false), new eycs("z", false), new eycs("g", true), new eycs("e", false), new eycs("f", false), new eycs("k", true), new eycs("u", true), new eycs("ut", true), new eycs("i", true), new eycs("a", true), new eycs("b", true), new eycs("b", false), new eycs("c", false), new eycs("t", false), new eycs("nt0", false), new eycs("v", true), new eycs("q", false), new eycs("fh", true), new eycs("fv", true), new eycs("fg", true), new eycs("ci", true), new eycs("rw", true), new eycs("rwu", true), new eycs("rwa", true), new eycs("nw", true), new eycs("rh", true), new eycs("no", true), new eycs("ns", true), new eycs("k", false), new eycs("p", false), new eycs("l", false), new eycs("v", false), new eycs("nu", true), new eycs("ft", true), new eycs("cc", true), new eycs("nd", true), new eycs("ip", true), new eycs("nc", true), new eycs("a", false), new eycs("rj", true), new eycs("rp", true), new eycs("rg", true), new eycs("pd", true), new eycs("pa", true), new eycs("m", false), new eycs("vb", false), new eycs("vl", false), new eycs("lf", true), new eycs("mv", true), new eycs("id", true), new eycs("al", true), new eycs("ic", false), new eycs("pg", true), new eycs("mo", true), new eycs("iv", false), new eycs("il", false), new eycs("ba", false), new eycs("vm", false), new eycs("vf", false));
    }

    protected eyct() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String c(String str, String str2, boolean z) {
        emxf.b(str != null, "oldOptions is null");
        emxf.b(true, "newOptions is null");
        if (!str.isEmpty()) {
            List<String> d2 = d(str, !z);
            if (!d2.isEmpty()) {
                d2.addAll(d(str2, false));
                emxf.b(true, "options is null");
                enct enctVar = new enct();
                ArrayList arrayList = new ArrayList();
                for (String str3 : d2) {
                    engw engwVar = g;
                    int i = ((enou) engwVar).c;
                    eycs eycsVar = null;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= i) {
                            break;
                        }
                        eycs eycsVar2 = (eycs) engwVar.get(i2);
                        if (str3.toLowerCase(Locale.getDefault()).startsWith(eycsVar2.a)) {
                            if (eycsVar2.b) {
                                if (str3.length() == eycsVar2.a.length()) {
                                    eycsVar = eycsVar2;
                                    break;
                                }
                            } else {
                                eycsVar = eycsVar2;
                            }
                        }
                        i2++;
                    }
                    if (eycsVar != null) {
                        enctVar.t(eycsVar, str3);
                    } else {
                        arrayList.add(str3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                engw engwVar2 = g;
                int i3 = ((enou) engwVar2).c;
                for (int i4 = 0; i4 < i3; i4++) {
                    String str4 = "";
                    for (String str5 : enctVar.c((eycs) engwVar2.get(i4))) {
                        if (Character.isUpperCase(str5.charAt(0))) {
                            arrayList2.add(str5);
                        } else {
                            str4 = str5;
                        }
                    }
                    if (!str4.isEmpty()) {
                        arrayList2.add(str4);
                    }
                }
                arrayList2.addAll(arrayList);
                return f.b(arrayList2);
            }
        }
        return str2;
    }

    public static List d(String str, boolean z) {
        emxf.b(str != null, "options is null");
        ArrayList arrayList = new ArrayList();
        Iterator it = e.g(str).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!str2.isEmpty()) {
                if (str2.startsWith("O") || str2.startsWith("J")) {
                    while (str2.length() < 12) {
                        str2 = f.g(str2, it.hasNext() ? it.next() : "", new Object[0]);
                    }
                }
                if (str2.equals("pi") || str2.equals("ya") || str2.equals("ro")) {
                    str2 = f.g(str2, it.hasNext() ? it.next() : "", new Object[0]);
                }
                if (!z || Character.isUpperCase(str2.charAt(0))) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    public static final String e(dulm dulmVar) {
        ArrayList a2 = enkr.a(a.g(dulmVar.a()));
        return a2.size() == 2 ? (String) a2.get(1) : "";
    }

    public static final String f(List list) {
        if (list.size() == 4) {
            list.add("");
        } else if (list.size() == 5) {
            list.add(4, "");
        }
        return (String) list.get(4);
    }

    public static final List g(dulm dulmVar) {
        ArrayList a2 = enkr.a(d.g(dulmVar.a()));
        return (a2.size() <= 0 || !((String) a2.get(0)).isEmpty()) ? a2 : a2.subList(1, a2.size());
    }

    public static final boolean h(List list) {
        int size = list.size();
        return size > 0 && size <= 1 && !((String) list.get(0)).isEmpty();
    }

    public static final boolean i(List list) {
        int size = list.size();
        if (size < 4) {
            return false;
        }
        return size == 4 ? !((String) list.get(3)).isEmpty() : size <= 6;
    }

    public static final List j(dulm dulmVar) {
        if (dulmVar.a() == null) {
            throw new eycr("url path is null");
        }
        List g2 = g(dulmVar);
        if (!g2.isEmpty() && "u".equals(g2.get(0))) {
            g2.remove(1);
            g2.remove(0);
        } else if (!g2.isEmpty() && "image".equals(g2.get(0))) {
            g2.remove(0);
        }
        if (g2.size() == 2) {
            g2.remove(0);
        }
        return g2;
    }
}
