package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.List;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkhc {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final dkti b = new dkti();
    public final Timer c = new Timer(true);
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    final dkha a(String str, dkha dkhaVar) {
        for (dkha dkhaVar2 : this.a.values()) {
            if (dkhaVar2 != dkhaVar && dkut.A(str, dkhaVar2.y())) {
                return dkhaVar2;
            }
        }
        return null;
    }

    final List b(dkgm dkgmVar) {
        List list = (List) this.b.get(dkgmVar);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final void c(dkha dkhaVar) {
        boolean remove;
        dkgm dkgmVar = dkhaVar.i;
        dkgmVar.getClass();
        dkti dktiVar = this.b;
        List list = (List) dktiVar.get(dkgmVar);
        if (list != null) {
            boolean z = false;
            do {
                remove = list.remove(dkhaVar);
                z |= remove;
            } while (remove);
            if (list.size() == 0) {
                dktiVar.remove(dkgmVar);
            }
            if (z) {
                return;
            }
        }
        dkty.q("Unable to remove session: %s", dkhaVar);
    }
}
