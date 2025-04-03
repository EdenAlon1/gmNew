package defpackage;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acqm implements Closeable {
    private final acql a;
    private final AtomicBoolean b;

    public acqm(acql acqlVar, AtomicBoolean atomicBoolean) {
        this.a = acqlVar;
        this.b = atomicBoolean;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b.get()) {
            return;
        }
        this.a.d();
    }
}
