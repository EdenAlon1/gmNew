package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
class ffph extends ffpd {
    public static final String b(String str) {
        int i;
        Comparable comparable;
        List G = ffpc.G(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : G) {
            if (!ffpc.J((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (!ffol.a(str2.charAt(i))) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        G.size();
        ffji f = f();
        int e = ffdx.e(G);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : G) {
            int i2 = i + 1;
            if (i < 0) {
                ffdx.l();
            }
            String str3 = (String) obj2;
            if ((i == 0 || i == e) && ffpc.J(str3)) {
                str3 = null;
            } else {
                String str4 = (String) f.invoke(ffpc.ab(str3, intValue));
                if (str4 != null) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length2);
        ffdx.aD(arrayList3, sb, null, 124);
        return sb.toString();
    }

    public static final String c(String str, String str2) {
        boolean m;
        if (ffpc.J(str2)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List G = ffpc.G(str);
        G.size();
        ffji f = f();
        int e = ffdx.e(G);
        ArrayList arrayList = new ArrayList();
        Iterator it = G.iterator();
        int i = 0;
        while (true) {
            String str3 = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(str.length());
                ffdx.aD(arrayList, sb, null, 124);
                return sb.toString();
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                ffdx.l();
            }
            String str4 = (String) next;
            if ((i != 0 && i != e) || !ffpc.J(str4)) {
                int length = str4.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (!ffol.a(str4.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    m = ffpc.m(str4, str2, i3, false);
                    if (m) {
                        int length2 = i3 + str2.length();
                        str4.getClass();
                        str3 = str4.substring(length2);
                        str3.getClass();
                    }
                }
                if (str3 == null || (str3 = (String) f.invoke(str3)) == null) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i = i2;
        }
    }

    private static final ffji f() {
        return "".length() == 0 ? ffpe.a : new ffpf();
    }
}
