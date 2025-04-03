package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuky {
    public static final cukz a(int i) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ffhx ffhxVar = cukx.m;
        ArrayList<cukx> arrayList = new ArrayList();
        ffdb ffdbVar = new ffdb(ffhxVar);
        while (ffdbVar.hasNext()) {
            Object next = ffdbVar.next();
            if (((cukx) next) != cukx.a) {
                arrayList.add(next);
            }
        }
        for (cukx cukxVar : arrayList) {
            if ((cukxVar.l & i) != 0) {
                linkedHashSet.add(cukxVar);
            }
        }
        return new cukz((Set) linkedHashSet);
    }
}
