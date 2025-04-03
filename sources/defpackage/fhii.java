package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhii {
    public final long a;
    public final fhhr b;
    public final fhih c;
    public final ConcurrentLinkedQueue d;

    public fhii(fhhu fhhuVar, TimeUnit timeUnit) {
        fhhuVar.getClass();
        this.a = timeUnit.toNanos(5L);
        this.b = fhhuVar.a();
        this.c = new fhih(this, String.valueOf(fhhl.f).concat(" ConnectionPool"));
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(fhey fheyVar, fhid fhidVar, List list, boolean z) {
        Iterator it = this.d.iterator();
        it.getClass();
        while (it.hasNext()) {
            fhig fhigVar = (fhig) it.next();
            fhigVar.getClass();
            synchronized (fhigVar) {
                if (z) {
                    if (!fhigVar.i()) {
                        continue;
                    }
                }
                if (fhigVar.h(fheyVar, list)) {
                    fhidVar.i(fhigVar);
                    return true;
                }
            }
        }
        return false;
    }
}
