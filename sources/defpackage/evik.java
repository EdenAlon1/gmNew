package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evik implements enus {
    private static final ento a;
    private final fazb b;

    static {
        int i = engw.d;
        a = new evig("", enou.a);
    }

    public evik(fazb fazbVar) {
        this.b = fazbVar;
    }

    @Override // defpackage.enus
    public final ento a(String str) {
        Set set = (Set) this.b.b();
        int size = set.size();
        if (size == 0) {
            return a;
        }
        if (size == 1) {
            return ((enus) set.iterator().next()).a(str);
        }
        engr d = engw.d(size);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d.h(((enus) it.next()).a(str));
        }
        return new evig(str, d.g());
    }
}
