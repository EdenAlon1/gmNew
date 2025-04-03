package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class erny extends erqb implements Runnable {
    ListenableFuture a;
    Object b;

    public erny(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.a = listenableFuture;
        obj.getClass();
        this.b = obj;
    }

    public static ListenableFuture f(ListenableFuture listenableFuture, emwl emwlVar, Executor executor) {
        ernx ernxVar = new ernx(listenableFuture, emwlVar);
        listenableFuture.b(ernxVar, errs.c(executor, ernxVar));
        return ernxVar;
    }

    public static ListenableFuture g(ListenableFuture listenableFuture, eroh erohVar, Executor executor) {
        executor.getClass();
        ernw ernwVar = new ernw(listenableFuture, erohVar);
        listenableFuture.b(ernwVar, errs.c(executor, ernwVar));
        return ernwVar;
    }

    public abstract Object d(Object obj, Object obj2);

    public abstract void e(Object obj);

    @Override // defpackage.ernr
    protected final String gP() {
        ListenableFuture listenableFuture = this.a;
        Object obj = this.b;
        String gP = super.gP();
        String b = listenableFuture != null ? a.b(listenableFuture, "inputFuture=[", "], ") : "";
        if (obj == null) {
            if (gP != null) {
                return b.concat(gP);
            }
            return null;
        }
        return b + "function=[" + obj.toString() + "]";
    }

    @Override // defpackage.ernr
    protected final void gQ() {
        l(this.a);
        this.a = null;
        this.b = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.a;
        Object obj = this.b;
        if ((isCancelled() | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.a = null;
        if (listenableFuture.isCancelled()) {
            m(listenableFuture);
            return;
        }
        try {
            try {
                Object d = d(obj, erqt.q(listenableFuture));
                this.b = null;
                e(d);
            } catch (Throwable th) {
                try {
                    errt.a(th);
                    setException(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e) {
            setException(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            setException(e2.getCause());
        } catch (Exception e3) {
            setException(e3);
        }
    }
}
