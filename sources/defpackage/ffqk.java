package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffqk {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(ffqk.class, "c");
    public final ffqp b;
    public volatile int c;

    public ffqk(boolean z, ffqp ffqpVar) {
        this.b = ffqpVar;
        this.c = z ? 1 : 0;
    }

    public final boolean a() {
        return this.c != 0;
    }

    public final boolean b() {
        boolean compareAndSet = a.compareAndSet(this, 0, 1);
        if (!compareAndSet || this.b == ffqo.a) {
            return compareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(a());
    }
}
