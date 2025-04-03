package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akk {
    static void a(bbt bbtVar, List list) {
        if (bbtVar instanceof bbu) {
            Iterator it = ((bbu) bbtVar).a.iterator();
            while (it.hasNext()) {
                a((bbt) it.next(), list);
            }
        } else if (bbtVar instanceof akj) {
            list.add(((akj) bbtVar).a);
        } else {
            list.add(new aki(bbtVar));
        }
    }
}
