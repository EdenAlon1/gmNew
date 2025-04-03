package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekai {
    public static final ekai a;
    public final enhk b;
    private final enhk c;

    static {
        enpd enpdVar = enpd.a;
        a = new ekai(enpdVar, enpdVar);
    }

    public ekai(Set set, Set set2) {
        enhd enhdVar = new enhd();
        enqu listIterator = ((enpd) set2).listIterator();
        while (listIterator.hasNext()) {
            ((ejzv) listIterator.next()).a(enhdVar);
        }
        this.c = enhdVar.c();
        enhd enhdVar2 = new enhd();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ejzv) it.next()).a(enhdVar2);
        }
        this.b = enhdVar2.c();
    }

    public final ekah a(String str) {
        ekah ekahVar = (ekah) this.c.get(str);
        return ekahVar != null ? ekahVar : (ekah) this.b.get(str);
    }

    public final enip b() {
        return this.b.keySet();
    }
}
