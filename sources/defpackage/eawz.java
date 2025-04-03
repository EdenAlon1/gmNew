package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eawz {
    public eaww a;
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public eawz() {
    }

    public final void a(eawy eawyVar) {
        this.b.add(eawyVar);
    }

    public final void b(eawy eawyVar) {
        this.b.remove(eawyVar);
    }

    public final void c(eaww eawwVar) {
        if (efaz.a(eawwVar, this.a)) {
            return;
        }
        this.a = eawwVar;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((eawy) it.next()).a();
        }
    }

    public eawz(eaww eawwVar) {
        this.a = eawwVar;
    }
}
