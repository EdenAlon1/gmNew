package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgfs implements ListenableFuture {
    private final ffud a;
    private final SettableFuture b = SettableFuture.create();
    private boolean c;

    public fgfs(ffud ffudVar) {
        this.a = ffudVar;
    }

    private static final void d(Object obj) {
        if (obj instanceof fgfr) {
            throw new CancellationException().initCause(((fgfr) obj).a);
        }
    }

    public final void a(Object obj) {
        this.b.set(obj);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    public final void c(Throwable th) {
        if (th instanceof CancellationException) {
            this.b.set(new fgfr((CancellationException) th));
        } else if (this.b.setException(th)) {
            this.c = true;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!this.b.cancel(z)) {
            return false;
        }
        this.a.t(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj = this.b.get();
        d(obj);
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        if (this.b.isCancelled()) {
            return true;
        }
        if (!isDone() || this.c) {
            return false;
        }
        try {
        } catch (CancellationException unused) {
            return true;
        } catch (ExecutionException unused2) {
            this.c = true;
        }
        return ersn.a(this.b) instanceof fgfr;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isDone()) {
            try {
                Object a = ersn.a(this.b);
                if (a instanceof fgfr) {
                    sb.append("CANCELLED, cause=[" + ((fgfr) a).a + "]");
                } else {
                    sb.append(a.i(a, "SUCCESS, result=[", "]"));
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + "]");
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + this.b + "]");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj = this.b.get(j, timeUnit);
        d(obj);
        return obj;
    }
}
