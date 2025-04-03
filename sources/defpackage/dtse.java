package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtse {
    protected final Map a = new HashMap();

    private static List d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf < 0) {
                break;
            }
            arrayList.add(str.substring(i, indexOf));
            i = str2.length() + indexOf;
        }
        if (i != 0) {
            str = str.substring(i);
        }
        arrayList.add(str);
        return arrayList;
    }

    public final void a(String str, String str2) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, new HashSet());
        }
        ((Set) this.a.get(str)).add(str2);
    }

    public final void b(String str, String str2) {
        List d = d(str, " AS ");
        if (d.size() > 1) {
            str = (String) d.get(d.size() - 1);
        }
        List d2 = d(str, ".");
        int size = d2.size();
        if (size != 1) {
            if (size != 2) {
                throw new IllegalArgumentException(a.m(str, str2, "invalid column reference: ", "."));
            }
            a((String) d2.get(0), (String) d2.get(1));
        } else {
            if (str2 == null) {
                throw new IllegalStateException("found unqualified column reference: ".concat(String.valueOf(str)));
            }
            a(str2, (String) d2.get(0));
        }
    }

    public final boolean c(String str, String[] strArr) {
        Set set = (Set) this.a.get(str);
        if (set == null) {
            return false;
        }
        return strArr == null || !Collections.disjoint(set, Arrays.asList(strArr));
    }
}
