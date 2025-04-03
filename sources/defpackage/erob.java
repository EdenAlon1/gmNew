package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class erob extends erof {
    private static final erri b = new erri(erob.class);
    private engi c;
    private final boolean d;
    private final boolean e;

    public erob(engi engiVar, boolean z, boolean z2) {
        super(engiVar.size());
        engiVar.getClass();
        this.c = engiVar;
        this.d = z;
        this.e = z2;
    }

    private final void r(int i, Future future) {
        try {
            e(i, ersn.a(future));
        } catch (ExecutionException e) {
            s(e.getCause());
        } catch (Throwable th) {
            s(th);
        }
    }

    private final void s(Throwable th) {
        th.getClass();
        if (this.d && !setException(th)) {
            Set<Throwable> set = this.seenExceptions;
            if (set == null) {
                Set i = enpw.i();
                d(i);
                erof.a.b(this, i);
                set = this.seenExceptions;
                set.getClass();
            }
            if (u(set, th)) {
                t(th);
                return;
            }
        }
        if (th instanceof Error) {
            t(th);
        }
    }

    private static void t(Throwable th) {
        b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean u(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // defpackage.erof
    public final void d(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable i = i();
        i.getClass();
        u(set, i);
    }

    public abstract void e(int i, Object obj);

    public final void f(engi engiVar) {
        int a = erof.a.a(this);
        int i = 0;
        emxf.m(a >= 0, "Less than 0 remaining futures");
        if (a == 0) {
            if (engiVar != null) {
                enqu listIterator = engiVar.listIterator();
                while (listIterator.hasNext()) {
                    Future future = (Future) listIterator.next();
                    if (!future.isCancelled()) {
                        r(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptions = null;
            g();
            q(2);
        }
    }

    public abstract void g();

    @Override // defpackage.ernr
    protected final String gP() {
        engi engiVar = this.c;
        return engiVar != null ? "futures=".concat(engiVar.toString()) : super.gP();
    }

    @Override // defpackage.ernr
    protected final void gQ() {
        engi engiVar = this.c;
        q(1);
        if ((engiVar != null) && isCancelled()) {
            boolean n = n();
            enqu listIterator = engiVar.listIterator();
            while (listIterator.hasNext()) {
                ((Future) listIterator.next()).cancel(n);
            }
        }
    }

    final void o() {
        engi engiVar = this.c;
        engiVar.getClass();
        if (engiVar.isEmpty()) {
            g();
            return;
        }
        if (this.d) {
            enqu listIterator = this.c.listIterator();
            final int i = 0;
            while (listIterator.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) listIterator.next();
                int i2 = i + 1;
                if (listenableFuture.isDone()) {
                    p(i, listenableFuture);
                } else {
                    listenableFuture.b(new Runnable() { // from class: ernz
                        @Override // java.lang.Runnable
                        public final void run() {
                            erob.this.p(i, listenableFuture);
                        }
                    }, erpp.a);
                }
                i = i2;
            }
            return;
        }
        engi engiVar2 = this.c;
        final engi engiVar3 = true != this.e ? null : engiVar2;
        Runnable runnable = new Runnable() { // from class: eroa
            @Override // java.lang.Runnable
            public final void run() {
                erob.this.f(engiVar3);
            }
        };
        enqu listIterator2 = engiVar2.listIterator();
        while (listIterator2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) listIterator2.next();
            if (listenableFuture2.isDone()) {
                f(engiVar3);
            } else {
                listenableFuture2.b(runnable, erpp.a);
            }
        }
    }

    public final void p(int i, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.c = null;
                cancel(false);
            } else {
                r(i, listenableFuture);
            }
        } finally {
            f((engi) null);
        }
    }

    public void q(int i) {
        this.c = null;
    }
}
