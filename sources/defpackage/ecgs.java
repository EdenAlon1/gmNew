package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecgs extends ecgl {
    public final List b = new CopyOnWriteArrayList();

    @Override // defpackage.ecgl
    public final void i(ecda ecdaVar) {
        ((enrr) ((enrr) ecdj.a.g()).h("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitBackgroundSignal", 148, "ForegroundTracker.java")).q("App transition to background");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ecgn) it.next()).i(ecdaVar);
        }
    }

    @Override // defpackage.ecgl
    public final void j(ecda ecdaVar) {
        ((enrr) ((enrr) ecdj.a.g()).h("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitForegroundSignal", 140, "ForegroundTracker.java")).q("App transition to foreground");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ecgn) it.next()).j(ecdaVar);
        }
    }
}
