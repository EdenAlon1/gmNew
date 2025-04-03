package defpackage;

import defpackage.ernr;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class erof extends ernr.i {
    public static final eroc a;
    private static final erri sS = new erri(erof.class);
    public volatile int remaining;
    public volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        eroc eroeVar;
        try {
            eroeVar = new erod();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            eroeVar = new eroe();
        }
        Throwable th3 = th;
        a = eroeVar;
        if (th3 != null) {
            sS.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }

    public erof(int i) {
        this.remaining = i;
    }

    public abstract void d(Set set);
}
