package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzhs implements dzht {
    private static dzhs b;
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    private dzhs() {
    }

    public static synchronized dzhs a() {
        synchronized (dzhs.class) {
            dzhs dzhsVar = b;
            if (dzhsVar != null) {
                return dzhsVar;
            }
            dzhs dzhsVar2 = new dzhs();
            b = dzhsVar2;
            return dzhsVar2;
        }
    }

    @Override // defpackage.dzht
    public final void b(String str, dzqs dzqsVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dzht) it.next()).b(str, dzqsVar);
        }
    }

    @Override // defpackage.dzht
    public final void c(String str, String str2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dzht) it.next()).c(str, str2);
        }
    }
}
