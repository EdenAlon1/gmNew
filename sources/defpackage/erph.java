package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erph {
    public static final erri a = new erri(erph.class);
    public final erou b;
    public final erqc c;
    private final AtomicReference d;

    public erph(ListenableFuture listenableFuture) {
        this(listenableFuture, new erou());
    }

    @Deprecated
    public static erph b(ListenableFuture listenableFuture, Executor executor) {
        executor.getClass();
        erph erphVar = new erph(erqt.j(listenableFuture));
        erqt.r(listenableFuture, new eroo(erphVar, executor), erpp.a);
        return erphVar;
    }

    public static erph c(erov erovVar, Executor executor) {
        erou erouVar = new erou();
        ersl erslVar = new ersl(new erom(erovVar, erouVar));
        executor.execute(erslVar);
        return new erph(erslVar, erouVar);
    }

    public static erph d(eros erosVar, Executor executor) {
        erou erouVar = new erou();
        ersl erslVar = new ersl(new eron(erosVar, erouVar));
        executor.execute(erslVar);
        return new erph(erslVar, erouVar);
    }

    public static void l(final AutoCloseable autoCloseable, Executor executor) {
        if (autoCloseable != null) {
            try {
                executor.execute(new Runnable() { // from class: eroj
                    @Override // java.lang.Runnable
                    public final void run() {
                        erri erriVar = erph.a;
                        try {
                            autoCloseable.close();
                        } catch (Exception e) {
                            errt.a(e);
                            erph.a.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", "thrown by close()", (Throwable) e);
                        }
                    }
                });
            } catch (RejectedExecutionException e) {
                erri erriVar = a;
                if (erriVar.a().isLoggable(Level.WARNING)) {
                    erriVar.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
                }
                l(autoCloseable, erpp.a);
            }
        }
    }

    private final erph o(erqc erqcVar) {
        erph erphVar = new erph(erqcVar);
        i(erphVar.b);
        return erphVar;
    }

    private final boolean p(erpe erpeVar, erpe erpeVar2) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.d;
            if (atomicReference.compareAndSet(erpeVar, erpeVar2)) {
                return true;
            }
        } while (atomicReference.get() == erpeVar);
        return false;
    }

    public final erph a(Class cls, erow erowVar, Executor executor) {
        return o((erqc) ernq.g(this.c, cls, new eror(this, erowVar), executor));
    }

    public final erph e(erow erowVar, Executor executor) {
        return o((erqc) erny.g(this.c, new erop(this, erowVar), executor));
    }

    public final erph f(erot erotVar, Executor executor) {
        return o((erqc) erny.g(this.c, new eroq(this, erotVar), executor));
    }

    protected final void finalize() {
        if (((erpe) this.d.get()).equals(erpe.OPEN)) {
            a.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture", "finalize", "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            g();
        }
    }

    public final erqc g() {
        erph erphVar;
        if (p(erpe.OPEN, erpe.WILL_CLOSE)) {
            erphVar = this;
            a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "finishToFuture", "will close {0}", erphVar);
            erphVar.c.b(new Runnable() { // from class: erol
                @Override // java.lang.Runnable
                public final void run() {
                    erph erphVar2 = erph.this;
                    erphVar2.j(erpe.WILL_CLOSE, erpe.CLOSING);
                    erphVar2.k();
                    erphVar2.j(erpe.CLOSING, erpe.CLOSED);
                }
            }, erpp.a);
        } else {
            erphVar = this;
            int ordinal = ((erpe) erphVar.d.get()).ordinal();
            if (ordinal == 0) {
                throw new AssertionError();
            }
            if (ordinal == 1) {
                throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
            }
            if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                throw new IllegalStateException("Cannot call finishToFuture() twice");
            }
            if (ordinal == 5) {
                throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
        return erphVar.c;
    }

    public final ListenableFuture h() {
        return erqt.j(erny.f(this.c, new emwn(null), erpp.a));
    }

    public final void i(erou erouVar) {
        j(erpe.OPEN, erpe.SUBSUMED);
        erouVar.b(this.b, erpp.a);
    }

    public final void j(erpe erpeVar, erpe erpeVar2) {
        emxf.r(p(erpeVar, erpeVar2), "Expected state to be %s, but it was %s", erpeVar, erpeVar2);
    }

    public final void k() {
        a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "close", "closing {0}", this);
        this.b.close();
    }

    public final void m(final erpg erpgVar, Executor executor) {
        if (p(erpe.OPEN, erpe.WILL_CREATE_VALUE_AND_CLOSER)) {
            this.c.b(new Runnable() { // from class: erok
                @Override // java.lang.Runnable
                public final void run() {
                    erpgVar.a(new erpf(erph.this));
                }
            }, executor);
            return;
        }
        int ordinal = ((erpe) this.d.get()).ordinal();
        if (ordinal == 1) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
        }
        if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
        }
        if (ordinal == 5) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
        }
        throw new AssertionError(this.d);
    }

    public final void n() {
        a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "cancel", "cancelling {0}", this);
        if (this.c.cancel(false)) {
            k();
        }
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("state", this.d.get());
        b.a(this.c);
        return b.toString();
    }

    private erph(ListenableFuture listenableFuture, erou erouVar) {
        this.d = new AtomicReference(erpe.OPEN);
        this.c = erqc.o(listenableFuture);
        this.b = erouVar;
    }
}
