package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqdn implements fbba {
    public static enhk a(Set set, Map map) {
        enhk j = enhk.j(map);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            j = ((aqdm) it.next()).a(j);
        }
        j.getClass();
        return j;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
