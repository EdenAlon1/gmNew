package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdsq {
    public static /* synthetic */ bdsr a(String str, String str2, String str3, String str4, ctvf ctvfVar, ctvf ctvfVar2, List list, List list2, ffly fflyVar, int i) {
        List list3 = (i & 4096) != 0 ? ffel.a : list;
        List list4 = (i & 8192) != 0 ? ffel.a : list2;
        list3.getClass();
        list4.getClass();
        List list5 = bdsr.b;
        list5.getClass();
        List al = ffdx.al(list5);
        for (int e = ffdx.e(al); e > 0; e--) {
            int f = fflyVar.f(e + 1);
            al.set(f, al.set(e, al.get(f)));
        }
        int i2 = i & 256;
        int i3 = i & 8;
        int i4 = i & 4;
        int i5 = i & 2;
        int i6 = i & 1;
        ctvf ctvfVar3 = (i & 1024) != 0 ? null : ctvfVar2;
        ctvf ctvfVar4 = i2 != 0 ? null : ctvfVar;
        String str5 = i3 != 0 ? null : str4;
        String str6 = i4 != 0 ? null : str3;
        String str7 = i5 != 0 ? null : str2;
        String str8 = 1 == i6 ? null : str;
        List ai = ffdx.ai(al, 10);
        return new bdsr(b(str8, ai), b(str7, ai), b(str6, ai), b(str5, ai), b(null, ai), b(null, ai), b(null, ai), b(null, ai), d(ctvfVar4, ai), d(null, ai), d(ctvfVar3, ai), d(null, ai), c(list3, ai), c(list4, ai));
    }

    private static final String b(String str, List list) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (bdsr.c.contains(Character.valueOf(charAt))) {
                sb.append(charAt);
            } else if (Character.isDigit(charAt)) {
                sb.append(((Character) list.get(ffol.d(charAt))).charValue());
            } else {
                sb.append('x');
            }
        }
        return sb.toString();
    }

    private static final List c(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ctvf ctvfVar = (ctvf) it.next();
            bdsq bdsqVar = bdsr.a;
            String d = d(ctvfVar, list2);
            if (d != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    private static final String d(ctvf ctvfVar, List list) {
        return b(String.valueOf(ctvfVar), list);
    }
}
