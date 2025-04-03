package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzhp implements dzhq {
    private static dzhp d;
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    private dzhp() {
    }

    public static synchronized dzhp a() {
        synchronized (dzhp.class) {
            dzhp dzhpVar = d;
            if (dzhpVar != null) {
                return dzhpVar;
            }
            dzhp dzhpVar2 = new dzhp();
            d = dzhpVar2;
            return dzhpVar2;
        }
    }

    @Override // defpackage.dzhq
    public final void b(ecda ecdaVar, dzqs dzqsVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dzhq) it.next()).b(ecdaVar, dzqsVar);
        }
    }
}
