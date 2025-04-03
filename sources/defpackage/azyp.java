package defpackage;

import java.io.Closeable;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azyp implements Closeable {
    Lock a;

    public azyp(Lock lock) {
        if (lock.tryLock()) {
            this.a = lock;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Lock lock = this.a;
        if (lock != null) {
            this.a = null;
            lock.unlock();
        }
    }
}
