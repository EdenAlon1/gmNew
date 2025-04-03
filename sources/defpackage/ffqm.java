package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffqm {
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(ffqm.class, "c");
    public final ffqp b;
    public volatile long c;

    public ffqm(long j, ffqp ffqpVar) {
        this.b = ffqpVar;
        this.c = j;
    }

    public final long a(long j) {
        return a.addAndGet(this, j);
    }

    public final long b() {
        return a.getAndIncrement(this);
    }

    public final boolean c(long j, long j2) {
        boolean compareAndSet = a.compareAndSet(this, j, j2);
        if (!compareAndSet || this.b == ffqo.a) {
            return compareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.c);
    }
}
