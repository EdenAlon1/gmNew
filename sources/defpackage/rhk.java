package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhk implements rgu {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.rgu
    public final void m() {
        Iterator it = rkh.h(this.a).iterator();
        while (it.hasNext()) {
            ((rix) it.next()).m();
        }
    }

    @Override // defpackage.rgu
    public final void n() {
        Iterator it = rkh.h(this.a).iterator();
        while (it.hasNext()) {
            ((rix) it.next()).n();
        }
    }

    @Override // defpackage.rgu
    public final void o() {
        Iterator it = rkh.h(this.a).iterator();
        while (it.hasNext()) {
            ((rix) it.next()).o();
        }
    }
}
