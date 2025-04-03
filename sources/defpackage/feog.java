package defpackage;

import io.grpc.Status;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feog implements feqq {
    final fekh a;
    boolean b = false;
    final /* synthetic */ feoi c;

    public feog(feoi feoiVar, fekh fekhVar) {
        this.c = feoiVar;
        this.a = fekhVar;
    }

    @Override // defpackage.feqq
    public final void a(boolean z) {
        this.c.f(this.a, z);
    }

    @Override // defpackage.feqq
    public final void b() {
        this.c.d.a(2, "READY");
        this.c.g.execute(new feod(this));
    }

    @Override // defpackage.feqq
    public final void c(Status status) {
        this.c.d.b(2, "{0} SHUTDOWN with {1}", this.a.c(), feoi.k(status));
        this.b = true;
        this.c.g.execute(new feoe(this, status));
    }

    @Override // defpackage.feqq
    public final void d() {
        emxf.m(this.b, "transportShutdown() must be called before transportTerminated().");
        this.c.d.b(2, "{0} Terminated", this.a.c());
        fdzq.c(this.c.c.f, this.a);
        this.c.f(this.a, false);
        Iterator it = this.c.f.iterator();
        if (it.hasNext()) {
            this.a.q();
            throw null;
        }
        this.c.g.execute(new feof(this));
    }

    @Override // defpackage.feqq
    public final void e() {
        Iterator it = this.c.f.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }
}
