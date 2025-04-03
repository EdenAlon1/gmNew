package defpackage;

import io.grpc.Status;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fejr extends fdxo {
    public static final double a;
    private static final Logger l = Logger.getLogger(fejr.class.getName());
    public final febs b;
    public final Executor c;
    public final fejg d;
    public final fdyn e;
    public fejl f;
    public fdxj g;
    public fejs h;
    public final ScheduledExecutorService i;
    public fdyv j = fdyv.b;
    public fdxz k = fdxz.a;
    private final boolean m;
    private final boolean n;
    private boolean o;
    private boolean p;
    private final fepc q;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        a = TimeUnit.SECONDS.toNanos(1L);
    }

    public fejr(febs febsVar, Executor executor, fdxj fdxjVar, fepc fepcVar, ScheduledExecutorService scheduledExecutorService, fejg fejgVar) {
        this.b = febsVar;
        String str = febsVar.b;
        System.identityHashCode(this);
        int i = ffbo.a;
        if (executor == erpp.a) {
            this.c = new feub();
            this.m = true;
        } else {
            this.c = new feuf(executor);
            this.m = false;
        }
        this.d = fejgVar;
        this.e = fdyn.k();
        febr febrVar = febsVar.a;
        this.n = febrVar == febr.UNARY || febrVar == febr.SERVER_STREAMING;
        this.g = fdxjVar;
        this.q = fepcVar;
        this.i = scheduledExecutorService;
    }

    public static final void g(fdxn fdxnVar, Status status, febo feboVar) {
        try {
            fdxnVar.a(status, feboVar);
        } catch (RuntimeException e) {
            l.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (Throwable) e);
        }
    }

    private final void h(Object obj) {
        emxf.m(this.h != null, "Not started");
        emxf.m(!this.o, "call was cancelled");
        emxf.m(!this.p, "call was half-closed");
        try {
            fejs fejsVar = this.h;
            if (fejsVar instanceof fetu) {
                fetu fetuVar = (fetu) fejsVar;
                fetj fetjVar = fetuVar.w;
                if (fetjVar.a) {
                    fetjVar.f.a.n(fetuVar.j.b(obj));
                } else {
                    fetuVar.v(new fesx(fetuVar, obj));
                }
            } else {
                fejsVar.n(this.b.b(obj));
            }
            if (this.n) {
                return;
            }
            this.h.d();
        } catch (Error e) {
            this.h.c(Status.c.withDescription("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.h.c(Status.c.d(e2).withDescription("Failed to stream message"));
        }
    }

    @Override // defpackage.fdxo
    public final void a(fdxn fdxnVar, febo feboVar) {
        fdxy fdxyVar;
        fejs fepbVar;
        ScheduledExecutorService scheduledExecutorService;
        fdxj fdxjVar;
        int i = ffbo.a;
        emxf.m(this.h == null, "Already started");
        emxf.m(!this.o, "call was cancelled");
        fdxnVar.getClass();
        feboVar.getClass();
        if (this.e.i()) {
            this.h = ferc.a;
            this.c.execute(new fejj(this, fdxnVar));
            return;
        }
        feqn feqnVar = (feqn) this.g.h(feqn.a);
        if (feqnVar != null) {
            Long l2 = feqnVar.b;
            if (l2 != null) {
                fdys c = fdys.c(l2.longValue(), TimeUnit.NANOSECONDS);
                fdys fdysVar = this.g.b;
                if (fdysVar == null || c.compareTo(fdysVar) < 0) {
                    this.g = this.g.b(c);
                }
            }
            Boolean bool = feqnVar.c;
            if (bool != null) {
                if (bool.booleanValue()) {
                    fdxh a2 = fdxj.a(this.g);
                    a2.g = Boolean.TRUE;
                    fdxjVar = new fdxj(a2);
                } else {
                    fdxh a3 = fdxj.a(this.g);
                    a3.g = Boolean.FALSE;
                    fdxjVar = new fdxj(a3);
                }
                this.g = fdxjVar;
            }
            Integer num = feqnVar.d;
            if (num != null) {
                fdxj fdxjVar2 = this.g;
                Integer num2 = fdxjVar2.h;
                if (num2 != null) {
                    this.g = fdxjVar2.d(Math.min(num2.intValue(), feqnVar.d.intValue()));
                } else {
                    this.g = fdxjVar2.d(num.intValue());
                }
            }
            Integer num3 = feqnVar.e;
            if (num3 != null) {
                fdxj fdxjVar3 = this.g;
                Integer num4 = fdxjVar3.i;
                if (num4 != null) {
                    this.g = fdxjVar3.e(Math.min(num4.intValue(), feqnVar.e.intValue()));
                } else {
                    this.g = fdxjVar3.e(num3.intValue());
                }
            }
        }
        String str = this.g.f;
        if (str != null) {
            fdxyVar = (fdxy) this.k.b.get(str);
            if (fdxyVar == null) {
                this.h = ferc.a;
                this.c.execute(new fejk(this, fdxnVar, str));
                return;
            }
        } else {
            fdxyVar = fdxw.a;
        }
        fdyv fdyvVar = this.j;
        feboVar.e(fend.g);
        feboVar.e(fend.c);
        if (fdxyVar != fdxw.a) {
            feboVar.g(fend.c, fdxyVar.c());
        }
        feboVar.e(fend.d);
        byte[] bArr = fdyvVar.c;
        if (bArr.length != 0) {
            feboVar.g(fend.d, bArr);
        }
        feboVar.e(fend.e);
        feboVar.e(fend.f);
        fdys b = b();
        boolean z = b != null && b.equals(this.e.b());
        fejl fejlVar = new fejl(this, b, z);
        this.f = fejlVar;
        if (b == null || fejlVar.c > 0) {
            fepc fepcVar = this.q;
            febs febsVar = this.b;
            fdxj fdxjVar4 = this.g;
            fdyn fdynVar = this.e;
            if (fepcVar.b.R) {
                feqn feqnVar2 = (feqn) fdxjVar4.h(feqn.a);
                fepbVar = new fepb(fepcVar, febsVar, feboVar, fdxjVar4, feqnVar2 == null ? null : feqnVar2.f, feqnVar2 != null ? feqnVar2.g : null, fdynVar);
            } else {
                fdxt[] l3 = fend.l(fdxjVar4);
                fdyn a4 = fdynVar.a();
                try {
                    fepbVar = fepcVar.b.z.d(febsVar, feboVar, fdxjVar4, l3);
                } finally {
                    fdynVar.f(a4);
                }
            }
            this.h = fepbVar;
        } else {
            fdxt[] l4 = fend.l(this.g);
            String str2 = true != z ? "CallOptions" : "Context";
            Long l5 = (Long) this.g.h(fdxt.f);
            double d = this.f.c;
            double d2 = a;
            this.h = new femm(Status.f.withDescription(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str2, Double.valueOf(d / d2), Double.valueOf(l5 == null ? eobe.a : l5.longValue() / d2))), l4);
        }
        if (this.m) {
            this.h.f();
        }
        fdxj fdxjVar5 = this.g;
        String str3 = fdxjVar5.d;
        Integer num5 = fdxjVar5.h;
        if (num5 != null) {
            this.h.k(num5.intValue());
        }
        Integer num6 = this.g.i;
        if (num6 != null) {
            this.h.l(num6.intValue());
        }
        if (b != null) {
            this.h.i(b);
        }
        this.h.h(fdxyVar);
        this.h.j(this.j);
        this.d.b();
        this.h.m(new fejq(this, fdxnVar));
        fejl fejlVar2 = this.f;
        if (fejlVar2.e) {
            return;
        }
        if (fejlVar2.b && !fejlVar2.a && (scheduledExecutorService = fejlVar2.f.i) != null) {
            fejlVar2.d = scheduledExecutorService.schedule(new feoq(fejlVar2), fejlVar2.c, TimeUnit.NANOSECONDS);
        }
        fejlVar2.f.e.d(fejlVar2, erpp.a);
        if (fejlVar2.e) {
            fejlVar2.c();
        }
    }

    public final fdys b() {
        fdys fdysVar = this.g.b;
        fdys b = this.e.b();
        if (fdysVar != null) {
            if (b != null) {
                fdysVar.e(b);
                if (true != fdysVar.f(b)) {
                }
            }
            return fdysVar;
        }
        return b;
    }

    @Override // defpackage.fdxo
    public final void c(String str, Throwable th) {
        int i = ffbo.a;
        if (str == null && th == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            l.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th = cancellationException;
        }
        if (this.o) {
            return;
        }
        this.o = true;
        try {
            if (this.h != null) {
                Status status = Status.c;
                Status withDescription = str != null ? status.withDescription(str) : status.withDescription("Call cancelled without message");
                if (th != null) {
                    withDescription = withDescription.d(th);
                }
                this.h.c(withDescription);
            }
            fejl fejlVar = this.f;
            if (fejlVar != null) {
                fejlVar.c();
            }
        } finally {
        }
    }

    @Override // defpackage.fdxo
    public final void d() {
        int i = ffbo.a;
        emxf.m(this.h != null, "Not started");
        emxf.m(!this.o, "call was cancelled");
        emxf.m(!this.p, "call already half-closed");
        this.p = true;
        this.h.e();
    }

    @Override // defpackage.fdxo
    public final void e(int i) {
        int i2 = ffbo.a;
        emxf.m(this.h != null, "Not started");
        emxf.b(i >= 0, "Number requested must be non-negative");
        this.h.g(i);
    }

    @Override // defpackage.fdxo
    public final void f(Object obj) {
        int i = ffbo.a;
        h(obj);
    }

    @Override // defpackage.fdxo
    public final boolean k() {
        if (this.p) {
            return false;
        }
        return this.h.o();
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("method", this.b);
        return b.toString();
    }
}
