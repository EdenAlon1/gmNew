package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdv extends peh {
    public final List a = new ArrayList(3);

    private static final void e(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // defpackage.peh
    public final void a(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((peh) it.next()).a(i);
            }
        } catch (ConcurrentModificationException e) {
            e(e);
        }
    }

    @Override // defpackage.peh
    public final void b(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((peh) it.next()).b(i);
            }
        } catch (ConcurrentModificationException e) {
            e(e);
        }
    }

    public final void c(peh pehVar) {
        this.a.add(pehVar);
    }

    @Override // defpackage.peh
    public final void d(int i, float f, int i2) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((peh) it.next()).d(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            e(e);
        }
    }
}
