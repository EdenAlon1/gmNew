package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class felb extends fdxo {
    private static final Logger c = Logger.getLogger(felb.class.getName());
    private static final fdxo d = new feku();
    public final fdyn a;
    public fdxo b;
    private final ScheduledFuture e;
    private final Executor f;
    private volatile boolean g;
    private fdxn h;
    private Status i;
    private List j = new ArrayList();
    private fela k;

    protected felb(Executor executor, ScheduledExecutorService scheduledExecutorService, fdys fdysVar) {
        ScheduledFuture<?> schedule;
        executor.getClass();
        this.f = executor;
        scheduledExecutorService.getClass();
        fdyn k = fdyn.k();
        this.a = k;
        fdys b = k.b();
        if (fdysVar == null && b == null) {
            schedule = null;
        } else {
            long b2 = fdysVar != null ? fdysVar.b(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
            if (b != null && b.b(TimeUnit.NANOSECONDS) < b2) {
                b2 = b.b(TimeUnit.NANOSECONDS);
                Logger logger = c;
                if (logger.isLoggable(Level.FINE)) {
                    StringBuilder sb = new StringBuilder(String.format(Locale.US, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(b2)));
                    if (fdysVar == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(Locale.US, " Explicit call timeout was '%d' ns.", Long.valueOf(fdysVar.b(TimeUnit.NANOSECONDS))));
                    }
                    logger.logp(Level.FINE, "io.grpc.internal.DelayedClientCall", "scheduleDeadlineIfNeeded", sb.toString());
                }
            }
            long abs = Math.abs(b2) / TimeUnit.SECONDS.toNanos(1L);
            long abs2 = Math.abs(b2) % TimeUnit.SECONDS.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            String str = true != (fdysVar == null ? true : b == null ? false : b.f(fdysVar)) ? "CallOptions" : "Context";
            if (b2 < 0) {
                sb2.append("ClientCall started after ");
                sb2.append(str);
                sb2.append(" deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb2.append("Deadline ");
                sb2.append(str);
                sb2.append(" will be exceeded in ");
            }
            sb2.append(abs);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb2.append("s. ");
            schedule = scheduledExecutorService.schedule(new fekn(this, sb2), b2, TimeUnit.NANOSECONDS);
        }
        this.e = schedule;
    }

    private final void j(Runnable runnable) {
        synchronized (this) {
            if (this.g) {
                runnable.run();
            } else {
                this.j.add(runnable);
            }
        }
    }

    @Override // defpackage.fdxo
    public final void a(fdxn fdxnVar, febo feboVar) {
        Status status;
        boolean z;
        emxf.m(this.h == null, "already started");
        synchronized (this) {
            fdxnVar.getClass();
            this.h = fdxnVar;
            status = this.i;
            z = this.g;
            if (!z) {
                fela felaVar = new fela(fdxnVar);
                this.k = felaVar;
                fdxnVar = felaVar;
            }
        }
        if (status != null) {
            this.f.execute(new fekv(this, fdxnVar, status));
        } else if (z) {
            this.b.a(fdxnVar, feboVar);
        } else {
            j(new fekp(this, fdxnVar, feboVar));
        }
    }

    @Override // defpackage.fdxo
    public final void c(String str, Throwable th) {
        Status status = Status.c;
        Status withDescription = str != null ? status.withDescription(str) : status.withDescription("Call cancelled without message");
        if (th != null) {
            withDescription = withDescription.d(th);
        }
        g(withDescription, false);
    }

    @Override // defpackage.fdxo
    public final void d() {
        j(new fekt(this));
    }

    @Override // defpackage.fdxo
    public final void e(int i) {
        if (this.g) {
            this.b.e(i);
        } else {
            j(new feks(this, i));
        }
    }

    @Override // defpackage.fdxo
    public final void f(Object obj) {
        if (this.g) {
            this.b.f(obj);
        } else {
            j(new fekr(this, obj));
        }
    }

    public final void g(Status status, boolean z) {
        fdxn fdxnVar;
        boolean z2;
        synchronized (this) {
            if (this.b == null) {
                i(d);
                fdxnVar = this.h;
                this.i = status;
                z2 = false;
            } else {
                if (z) {
                    return;
                }
                fdxnVar = null;
                z2 = true;
            }
            if (z2) {
                j(new fekq(this, status));
            } else {
                if (fdxnVar != null) {
                    this.f.execute(new fekv(this, fdxnVar, status));
                }
                h();
            }
            b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.j     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.j = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.g = r0     // Catch: java.lang.Throwable -> L42
            fela r0 = r3.k     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f
            feko r2 = new feko
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.j     // Catch: java.lang.Throwable -> L42
            r3.j = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.felb.h():void");
    }

    public final void i(fdxo fdxoVar) {
        fdxo fdxoVar2 = this.b;
        emxf.p(fdxoVar2 == null, "realCall already set to %s", fdxoVar2);
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.b = fdxoVar;
    }

    @Override // defpackage.fdxo
    public final boolean k() {
        if (this.g) {
            return this.b.k();
        }
        return false;
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("realCall", this.b);
        return b.toString();
    }

    protected void b() {
    }
}
