package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eikw implements fbba {
    public static void a(Set set) {
        set.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((eikv) it.next()).b);
        }
        if (ffdx.X(arrayList).size() != set.size()) {
            throw new IllegalStateException("duplicate configuration entry of content-type found.");
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((eikv) it2.next()).a);
        }
        if (ffdx.X(arrayList2).size() != set.size()) {
            throw new IllegalStateException("duplicate configuration entry of proto type found.");
        }
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
