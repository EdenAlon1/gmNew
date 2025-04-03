package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atl {
    public static final atl a;
    public static final atl b;
    public final LinkedHashSet c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        atk.a(0, linkedHashSet);
        a = new atl(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        atk.a(1, linkedHashSet2);
        b = new atl(linkedHashSet2);
    }

    public atl(LinkedHashSet linkedHashSet) {
        this.c = linkedHashSet;
    }

    public final bct a(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((bct) it.next()).c());
        }
        List c = c(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            bct bctVar = (bct) it2.next();
            if (c.contains(bctVar.c())) {
                linkedHashSet2.add(bctVar);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (bct) it3.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            bcq f = ((bct) it4.next()).f();
            sb.append(String.format(" Id:%s  Lens:%s", f.k(), Integer.valueOf(f.a())));
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(String.format("PhyId:%s  Filters:%s", null, Integer.valueOf(this.c.size())));
        Iterator it5 = this.c.iterator();
        while (it5.hasNext()) {
            ath athVar = (ath) it5.next();
            sb3.append(" Id:");
            sb3.append(athVar.a());
            if (athVar instanceof bex) {
                sb3.append(" LensFilter:");
                sb3.append(((bex) athVar).b);
            }
        }
        throw new IllegalArgumentException(String.format("No available camera can be found. %s %s", sb2, sb3.toString()));
    }

    public final Integer b() {
        Iterator it = this.c.iterator();
        Integer num = null;
        while (it.hasNext()) {
            ath athVar = (ath) it.next();
            if (athVar instanceof bex) {
                Integer valueOf = Integer.valueOf(((bex) athVar).b);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final List c(List list) {
        List arrayList = new ArrayList(list);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            arrayList = ((ath) it.next()).b(DesugarCollections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }
}
