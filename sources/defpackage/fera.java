package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fera extends fdxf {
    public final fejv a;
    public final febs b;
    public final febo c;
    public final fdxj d;
    public final fdxt[] f;
    public fejs h;
    public boolean i;
    fema j;
    private final fejc k;
    public final Object g = new Object();
    public final fdyn e = fdyn.k();

    public fera(fejv fejvVar, febs febsVar, febo feboVar, fdxj fdxjVar, fejc fejcVar, fdxt[] fdxtVarArr) {
        this.a = fejvVar;
        this.b = febsVar;
        this.c = feboVar;
        this.d = fdxjVar;
        this.k = fejcVar;
        this.f = fdxtVarArr;
    }

    @Override // defpackage.fdxf
    public final void a(Status status) {
        emxf.b(!status.f(), "Cannot fail with OK status");
        emxf.m(!this.i, "apply() or fail() already called");
        b(new femm(fend.b(status), this.f));
    }

    public final void b(fejs fejsVar) {
        boolean z;
        emxf.m(!this.i, "already finalized");
        this.i = true;
        synchronized (this.g) {
            if (this.h == null) {
                this.h = fejsVar;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.k.a();
            return;
        }
        emxf.m(this.j != null, "delayedStream is null");
        Runnable q = this.j.q(fejsVar);
        if (q != null) {
            q.run();
        }
        this.k.a();
    }
}
