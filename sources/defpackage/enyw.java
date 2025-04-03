package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyw implements Comparable, Serializable, enzo {
    public final List a;
    public enyl b;
    public transient eobe c;
    public int d;
    private final AtomicInteger e;

    public enyw() {
        this.a = new ArrayList();
        this.e = new AtomicInteger();
        this.d = 0;
        this.b = enyl.d();
        enyl.d();
        c();
    }

    public static boolean f(enyp enypVar) {
        return enypVar.c == 1 && enypVar.d(0).p(enyp.a);
    }

    private final void g(enyp enypVar, int i, Map map) {
        if (enypVar != null) {
            enypVar.f = i;
            this.a.add(enypVar);
        }
        List list = (List) map.get(enypVar);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g((enyp) it.next(), i + 1, map);
            }
        }
    }

    private static void h(enyp enypVar, enyp enypVar2, Map map) {
        List<enyp> list = (List) map.get(enypVar2);
        if (list == null) {
            list = new ArrayList();
            map.put(enypVar2, list);
        }
        for (enyp enypVar3 : list) {
            if (enypVar3.i(enypVar)) {
                h(enypVar, enypVar3, map);
                return;
            }
        }
        List list2 = (List) map.get(enypVar);
        int i = 0;
        while (i < list.size()) {
            enyp enypVar4 = (enyp) list.get(i);
            if (enypVar.i(enypVar4)) {
                if (list2 == null) {
                    list2 = new ArrayList();
                    map.put(enypVar, list2);
                }
                list2.add(enypVar4);
                list.remove(i);
            } else {
                i++;
            }
        }
        list.add(enypVar);
    }

    private Object readResolve() {
        c();
        return this;
    }

    public final int a() {
        return this.a.size();
    }

    public final enyp b(int i) {
        return (enyp) this.a.get(i);
    }

    public final void c() {
        int i = this.d;
        int i2 = 10;
        if (i > 8) {
            if (i <= 8192) {
                i2 = 50;
            } else if (i > 50000) {
                i2 = 2;
            }
        }
        this.e.set(i2);
        if (this.c == null) {
            this.c = new eobe();
        }
        for (int i3 = 0; i3 < a(); i3++) {
            this.c.c(b(i3));
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        enyw enywVar = (enyw) obj;
        if (a() != enywVar.a()) {
            return a() - enywVar.a();
        }
        for (int i = 0; i < a(); i++) {
            int compareTo = ((enyp) this.a.get(i)).compareTo((enyp) enywVar.a.get(i));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final void d() {
        this.d = 0;
        enyk c = enyk.c();
        for (enyp enypVar : this.a) {
            if ((enypVar.f & 1) == 0) {
                c.e(enypVar.d);
            }
            this.d += enypVar.c;
        }
        enyl d = c.d();
        this.b = d;
        enyc.a(d);
        c();
    }

    public final boolean e(enyr enyrVar) {
        if (!this.c.d && !this.b.h(enyrVar)) {
            return false;
        }
        if (this.d <= 32 || (!this.c.d && this.e.decrementAndGet() > 0)) {
            boolean z = false;
            for (int i = 0; i < a(); i++) {
                z ^= b(i).g(enyrVar);
            }
            return z;
        }
        enyi a = this.c.a();
        if (!enyf.d(a, enyrVar)) {
            return false;
        }
        eoac eoacVar = (eoac) a.a();
        enyb enybVar = new enyb(enyf.c(a), enyrVar);
        boolean z2 = false;
        for (int i2 = 0; i2 < eoacVar.a(); i2++) {
            eobb b = eoacVar.b(i2);
            z2 ^= b.f();
            int d = b.d();
            if (d > 0) {
                enyp enypVar = (enyp) this.a.get(b.e());
                int i3 = -2;
                int i4 = 0;
                while (i4 < d) {
                    int c = b.c(i4);
                    if (c != i3 + 1) {
                        enybVar.c(enypVar.d(c));
                    }
                    z2 ^= enybVar.d(enypVar.d(c + 1));
                    i4++;
                    i3 = c;
                }
            }
        }
        return z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enyw) {
            enyw enywVar = (enyw) obj;
            if (this.d == enywVar.d && this.b.equals(enywVar.b) && this.a.equals(enywVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Polygon: (");
        sb.append(a());
        sb.append(") loops:\n");
        for (int i = 0; i < a(); i++) {
            enyp b = b(i);
            sb.append("loop <\n");
            for (int i2 = 0; i2 < b.c; i2++) {
                sb.append(b.d(i2).o());
                sb.append("\n");
            }
            sb.append(">\n");
        }
        return sb.toString();
    }

    public enyw(List list) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.e = new AtomicInteger();
        this.d = 0;
        arrayList.clear();
        eobe eobeVar = this.c;
        if (eobeVar != null) {
            eobeVar.d();
        }
        this.b = enyl.d();
        enyl.d();
        this.d = 0;
        if (list.size() == 1) {
            arrayList.clear();
            enyp enypVar = (enyp) list.remove(0);
            if (f(enypVar)) {
                d();
                return;
            }
            arrayList.add(enypVar);
            enyp enypVar2 = (enyp) arrayList.get(0);
            enypVar2.f = 0;
            this.d = enypVar2.c;
            this.b = enypVar2.d;
            enyl enylVar = enypVar2.e;
            c();
            return;
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        identityHashMap.put(null, new ArrayList());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            enyp enypVar3 = (enyp) it.next();
            if (!f(enypVar3)) {
                h(enypVar3, null, identityHashMap);
            }
        }
        list.clear();
        Iterator it2 = identityHashMap.values().iterator();
        while (it2.hasNext()) {
            Collections.sort((List) it2.next());
        }
        g(null, -1, identityHashMap);
        d();
    }
}
