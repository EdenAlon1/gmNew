package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class out {
    private final AtomicInteger a = new AtomicInteger(0);
    private final AtomicBoolean b = new AtomicBoolean(false);

    public final void a() {
        synchronized (this) {
            this.a.decrementAndGet();
            if (this.a.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public final boolean b() {
        synchronized (this) {
            if (this.b.get()) {
                return false;
            }
            this.a.incrementAndGet();
            return true;
        }
    }
}
