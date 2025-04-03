package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgie extends ffts implements Executor {
    public static final fgie a = new fgie();
    private static final ffsd b = fgil.a.i(fghp.a("kotlinx.coroutines.io.parallelism", ffmk.f(64, fghq.a), 0, 0, 12));

    private fgie() {
    }

    @Override // defpackage.ffsd
    public final void a(ffhd ffhdVar, Runnable runnable) {
        b.a(ffhdVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(ffhe.a, runnable);
    }

    @Override // defpackage.ffsd
    public final void h(ffhd ffhdVar, Runnable runnable) {
        b.h(ffhdVar, runnable);
    }

    @Override // defpackage.ffsd
    public final ffsd i(int i) {
        return fgil.a.i(1);
    }

    @Override // defpackage.ffsd
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.ffts
    public final Executor g() {
        return this;
    }
}
