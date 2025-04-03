package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqt {
    public static final List a(Set set, List list) {
        try {
            ffji ffjiVar = new ffji() { // from class: wqs
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    wqq wqqVar = (wqq) obj;
                    wqqVar.getClass();
                    return wqqVar.getClass();
                }
            };
            list.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(set, 10)), 16));
            for (Object obj : set) {
                linkedHashMap.put(ffjiVar.invoke(obj), obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object obj2 = linkedHashMap.get(it.next());
                if (obj2 == null) {
                    throw new NoSuchElementException("Key in sortedKeys was not found in collection.");
                }
                arrayList.add(obj2);
            }
            return arrayList;
        } catch (NoSuchElementException e) {
            throw new IllegalStateException("Action was included in manifest but was not bound.", e);
        }
    }
}
