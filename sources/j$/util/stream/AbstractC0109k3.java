package j$.util.stream;

import j$.util.C0042f;
import j$.util.stream.Collector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collector;

/* renamed from: j$.util.stream.k3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0109k3 {
    public static Set a(Set set) {
        Collector.Characteristics characteristics;
        Collector.Characteristics characteristics2;
        Collector.Characteristics characteristics3;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof Collector.Characteristics) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    Collector.Characteristics characteristics4 = (Collector.Characteristics) it.next();
                    hashSet.add(characteristics4 == null ? null : characteristics4 == Collector.Characteristics.CONCURRENT ? Collector.Characteristics.CONCURRENT : characteristics4 == Collector.Characteristics.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                } catch (ClassCastException e) {
                    C0042f.a("java.util.stream.Collector.Characteristics", e);
                    throw null;
                }
            }
        } else {
            if (!AbstractC0099i3.u(next)) {
                C0042f.a("java.util.stream.Collector.Characteristics", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    Collector.Characteristics h = AbstractC0099i3.h(it2.next());
                    if (h == null) {
                        characteristics3 = null;
                    } else {
                        characteristics = Collector.Characteristics.CONCURRENT;
                        if (h == characteristics) {
                            characteristics3 = Collector.Characteristics.CONCURRENT;
                        } else {
                            characteristics2 = Collector.Characteristics.UNORDERED;
                            characteristics3 = h == characteristics2 ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                        }
                    }
                    hashSet.add(characteristics3);
                } catch (ClassCastException e2) {
                    C0042f.a("java.util.stream.Collector.Characteristics", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }
}
