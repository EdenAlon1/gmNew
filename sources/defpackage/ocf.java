package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ocf implements Runnable {
    public final AtomicReference a = new AtomicReference(null);
    final /* synthetic */ oco b;

    public ocf(oco ocoVar) {
        this.b = ocoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        odk odkVar = (odk) this.a.get();
        if (odkVar != null) {
            Iterator it = this.b.l.iterator();
            while (it.hasNext()) {
                ((ffji) it.next()).invoke(odkVar);
            }
        }
    }
}
