package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eikx implements fbba {
    public static Set a(Set set) {
        set.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((eikv) it.next()).b.toString());
        }
        return ffdx.ar(arrayList);
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
