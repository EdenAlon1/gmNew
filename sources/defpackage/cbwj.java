package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwj {
    public final dtuu a;
    private final ffbr b;

    public cbwj(ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = ffbrVar;
        this.a = (dtuu) ffbrVar2.b();
    }

    public final elfl a(final String str, final emyl emylVar) {
        ekzz f = eleg.f("AsyncTransactionManagerImpl#executeInTransaction");
        try {
            elfl g = elfo.g(new Callable() { // from class: cbwi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return cbwj.this.a.c(str, emylVar);
                }
            }, (Executor) this.b.b());
            f.b(g);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final elfl b(final String str, final Runnable runnable) {
        ekzz f = eleg.f("AsyncTransactionManagerImpl#executeInTransaction");
        try {
            elfl g = elfo.g(new Callable() { // from class: cbwh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    cbwj.this.a.d(str, runnable);
                    return null;
                }
            }, (Executor) this.b.b());
            f.b(g);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
