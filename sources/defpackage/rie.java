package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rie implements ria, rif {
    private final int a;
    private final int b;
    private Object c;
    private rib d;
    private boolean e;
    private boolean f;
    private boolean g;
    private qwp h;

    public rie(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private final synchronized Object j(Long l) {
        if (!isDone()) {
            rkh.i();
        }
        if (this.e) {
            throw new CancellationException();
        }
        if (this.g) {
            throw new ExecutionException(this.h);
        }
        if (!this.f) {
            if (l == null) {
                wait(0L);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    wait(longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.g) {
                throw new ExecutionException(this.h);
            }
            if (this.e) {
                throw new CancellationException();
            }
            if (!this.f) {
                throw new TimeoutException();
            }
        }
        return this.c;
    }

    @Override // defpackage.rix
    public final synchronized void a(Drawable drawable) {
    }

    @Override // defpackage.rif
    public final synchronized boolean b(Object obj, Object obj2, rix rixVar, qsy qsyVar, boolean z) {
        this.f = true;
        this.c = obj;
        notifyAll();
        return false;
    }

    @Override // defpackage.rix
    public final synchronized void c(Object obj, rjh rjhVar) {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.e = true;
            notifyAll();
            rib ribVar = null;
            if (z) {
                rib ribVar2 = this.d;
                this.d = null;
                ribVar = ribVar2;
            }
            if (ribVar != null) {
                ribVar.c();
            }
            return true;
        }
    }

    @Override // defpackage.rix
    public final synchronized rib d() {
        return this.d;
    }

    @Override // defpackage.rix
    public final void e(riw riwVar) {
        riwVar.g(this.a, this.b);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return j(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.rix
    public final synchronized void i(rib ribVar) {
        this.d = ribVar;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.e;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        if (!this.e && !this.f) {
            if (!this.g) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        rib ribVar;
        String str;
        String valueOf = String.valueOf(super.toString());
        synchronized (this) {
            ribVar = null;
            if (this.e) {
                str = "CANCELLED";
            } else if (this.g) {
                str = "FAILURE";
            } else if (this.f) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                ribVar = this.d;
            }
        }
        String concat = valueOf.concat("[status=");
        if (ribVar == null) {
            return concat + str + "]";
        }
        return concat + str + ", request=[" + ribVar.toString() + "]]";
    }

    @Override // defpackage.rif
    public final synchronized boolean a(qwp qwpVar, Object obj, rix rixVar, boolean z) {
        this.g = true;
        this.h = qwpVar;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return j(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.rgu
    public final void m() {
    }

    @Override // defpackage.rgu
    public final void n() {
    }

    @Override // defpackage.rgu
    public final void o() {
    }

    @Override // defpackage.rix
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.rix
    public final void g(Drawable drawable) {
    }

    @Override // defpackage.rix
    public final void h(riw riwVar) {
    }
}
