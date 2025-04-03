package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablm {
    public final String a;
    public final List b;
    public final Map c;
    public final Map d;

    public ablm(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                ffdx.l();
            }
            arrayList.add(new ffcf(((cbnd) obj).a, Integer.valueOf(i)));
            i = i2;
        }
        this.c = ffew.k(arrayList);
        List list2 = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(list2, 10)), 16));
        for (Object obj2 : list2) {
            linkedHashMap.put(((cbnd) obj2).a, obj2);
        }
        this.d = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ablm)) {
            return false;
        }
        ablm ablmVar = (ablm) obj;
        return ffkj.e(this.a, ablmVar.a) && ffkj.e(this.b, ablmVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MessageSearchResults(searchQuery=" + this.a + ", hits=" + this.b + ")";
    }
}
