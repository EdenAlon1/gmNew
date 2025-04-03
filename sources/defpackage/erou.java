package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erou extends IdentityHashMap implements Closeable {
    public final erpc a = new erpc(this);
    private volatile boolean b;
    private volatile CountDownLatch c;

    final ListenableFuture a(erow erowVar, Object obj) {
        erou erouVar = new erou();
        try {
            return erqt.i(erowVar.a(erouVar.a, obj));
        } finally {
            b(erouVar, erpp.a);
        }
    }

    final void b(AutoCloseable autoCloseable, Executor executor) {
        executor.getClass();
        if (autoCloseable == null) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                erph.l(autoCloseable, executor);
            } else {
                put(autoCloseable, executor);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            for (Map.Entry entry : entrySet()) {
                erph.l((AutoCloseable) entry.getKey(), (Executor) entry.getValue());
            }
            clear();
        }
    }
}
