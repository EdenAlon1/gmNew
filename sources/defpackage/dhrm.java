package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhrm extends dhre {
    public final Object a = new Object();
    public final dhrg b = new dhrg();
    public boolean c;
    public volatile boolean d;
    public Exception e;
    private Object f;

    private final void A() {
        if (this.c) {
            if (!l()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception h = h();
        }
    }

    private final void B() {
        synchronized (this.a) {
            if (this.c) {
                this.b.b(this);
            }
        }
    }

    private final void y() {
        dfwv.j(this.c, "Task is not yet complete");
    }

    private final void z() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @Override // defpackage.dhre
    public final dhre a(dhqy dhqyVar) {
        q(dhrl.a, dhqyVar);
        return this;
    }

    @Override // defpackage.dhre
    public final dhre b(dhqh dhqhVar) {
        return c(dhrl.a, dhqhVar);
    }

    @Override // defpackage.dhre
    public final dhre c(Executor executor, dhqh dhqhVar) {
        dhrm dhrmVar = new dhrm();
        this.b.a(new dhqj(executor, dhqhVar, dhrmVar));
        B();
        return dhrmVar;
    }

    @Override // defpackage.dhre
    public final dhre d(dhqh dhqhVar) {
        return e(dhrl.a, dhqhVar);
    }

    @Override // defpackage.dhre
    public final dhre e(Executor executor, dhqh dhqhVar) {
        dhrm dhrmVar = new dhrm();
        this.b.a(new dhql(executor, dhqhVar, dhrmVar));
        B();
        return dhrmVar;
    }

    @Override // defpackage.dhre
    public final dhre f(dhrd dhrdVar) {
        return g(dhrl.a, dhrdVar);
    }

    @Override // defpackage.dhre
    public final dhre g(Executor executor, dhrd dhrdVar) {
        dhrm dhrmVar = new dhrm();
        this.b.a(new dhra(executor, dhrdVar, dhrmVar));
        B();
        return dhrmVar;
    }

    @Override // defpackage.dhre
    public final Exception h() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    @Override // defpackage.dhre
    public final Object i() {
        Object obj;
        synchronized (this.a) {
            y();
            z();
            Exception exc = this.e;
            if (exc != null) {
                throw new dhrc(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.dhre
    public final Object j(Class cls) {
        Object obj;
        synchronized (this.a) {
            y();
            z();
            if (cls.isInstance(this.e)) {
                throw ((Throwable) cls.cast(this.e));
            }
            Exception exc = this.e;
            if (exc != null) {
                throw new dhrc(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.dhre
    public final boolean k() {
        return this.d;
    }

    @Override // defpackage.dhre
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.dhre
    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && !this.d && this.e == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dhre
    public final void n(Executor executor, dhqp dhqpVar) {
        this.b.a(new dhqo(executor, dhqpVar));
        B();
    }

    @Override // defpackage.dhre
    public final void o(Executor executor, dhqs dhqsVar) {
        this.b.a(new dhqr(executor, dhqsVar));
        B();
    }

    @Override // defpackage.dhre
    public final void p(Executor executor, dhqv dhqvVar) {
        this.b.a(new dhqu(executor, dhqvVar));
        B();
    }

    @Override // defpackage.dhre
    public final void q(Executor executor, dhqy dhqyVar) {
        this.b.a(new dhqx(executor, dhqyVar));
        B();
    }

    @Override // defpackage.dhre
    public final void r(dhqp dhqpVar) {
        n(dhrl.a, dhqpVar);
    }

    @Override // defpackage.dhre
    public final void s(dhqs dhqsVar) {
        o(dhrl.a, dhqsVar);
    }

    @Override // defpackage.dhre
    public final void t(dhqv dhqvVar) {
        p(dhrl.a, dhqvVar);
    }

    public final void u(Exception exc) {
        dfwv.o(exc, "Exception must not be null");
        synchronized (this.a) {
            A();
            this.c = true;
            this.e = exc;
        }
        this.b.b(this);
    }

    public final void v(Object obj) {
        synchronized (this.a) {
            A();
            this.c = true;
            this.f = obj;
        }
        this.b.b(this);
    }

    public final boolean w(Object obj) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f = obj;
            this.b.b(this);
            return true;
        }
    }

    public final void x() {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            this.c = true;
            this.d = true;
            this.b.b(this);
        }
    }
}
