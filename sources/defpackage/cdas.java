package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdas {
    public static final List a(Collection collection, Collection collection2, Collection collection3, ffji ffjiVar) {
        if (collection.size() != collection2.size() || collection2.size() != collection3.size()) {
            throw new ccww();
        }
        List an = ffdx.an(collection2, collection3);
        Iterator it = an.iterator();
        Iterator it2 = collection.iterator();
        ArrayList arrayList = new ArrayList(Math.min(ffdx.n(an, 10), ffdx.n(collection, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            String str = (String) it2.next();
            ffcf ffcfVar = (ffcf) next;
            Object obj = ffcfVar.a;
            fagm fagmVar = (fagm) ffcfVar.b;
            String str2 = obj != null ? (String) ffjiVar.invoke(obj) : null;
            Status fromCodeValue = Status.fromCodeValue(fagmVar.b);
            fromCodeValue.getClass();
            arrayList.add(new cdai(obj, str, str2, fromCodeValue));
        }
        return arrayList;
    }

    public static final Map b(List list, Map map) {
        Object a;
        list.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cdai cdaiVar = (cdai) it.next();
            String str = cdaiVar.a;
            try {
                Status status = cdaiVar.c;
                if (ffkj.e(status, Status.b)) {
                    String str2 = cdaiVar.b;
                    str2.getClass();
                    a = new ccvo(str2, false);
                } else {
                    if (!ffkj.e(status, Status.h)) {
                        throw new fedn(cdaiVar.c);
                    }
                    Object obj = map.get(cdaiVar.a);
                    obj.getClass();
                    Object obj2 = ((ffch) obj).a;
                    ffci.b(obj2);
                    a = new ccvo((String) obj2, true);
                }
            } catch (Throwable th) {
                a = ffci.a(th);
            }
            ffcf ffcfVar = new ffcf(str, new ffch(a));
            linkedHashMap.put(ffcfVar.a, ffcfVar.b);
        }
        return linkedHashMap;
    }
}
