package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffql {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(ffql.class, "c");
    public final ffqp b;
    public volatile int c;

    public ffql(int i, ffqp ffqpVar) {
        this.b = ffqpVar;
        this.c = i;
    }

    public final int a() {
        return a.decrementAndGet(this);
    }

    public final int b() {
        return a.incrementAndGet(this);
    }

    public final boolean c(int i, int i2) {
        boolean compareAndSet = a.compareAndSet(this, i, i2);
        if (!compareAndSet || this.b == ffqo.a) {
            return compareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.c);
    }
}
