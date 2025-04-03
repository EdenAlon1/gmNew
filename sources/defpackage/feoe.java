package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feoe implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ feog b;

    public feoe(feog feogVar, Status status) {
        this.a = status;
        this.b = feogVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.c.r.a == fdyc.SHUTDOWN) {
            return;
        }
        feog feogVar = this.b;
        feqr feqrVar = feogVar.c.q;
        fekh fekhVar = feogVar.a;
        if (feqrVar == fekhVar) {
            feogVar.c.q = null;
            this.b.c.h.c();
            this.b.c.b(fdyc.IDLE);
            return;
        }
        feoi feoiVar = feogVar.c;
        if (feoiVar.p == fekhVar) {
            emxf.p(feoiVar.r.a == fdyc.CONNECTING, "Expected state is CONNECTING, actual state is %s", this.b.c.r.a);
            feoc feocVar = this.b.c.h;
            fdyw fdywVar = (fdyw) feocVar.a.get(feocVar.b);
            int i = feocVar.c + 1;
            feocVar.c = i;
            if (i >= fdywVar.b.size()) {
                feocVar.b++;
                feocVar.c = 0;
            }
            feoc feocVar2 = this.b.c.h;
            if (feocVar2.b < feocVar2.a.size()) {
                this.b.c.h();
                return;
            }
            this.b.c.p = null;
            this.b.c.h.c();
            feog feogVar2 = this.b;
            Status status = this.a;
            feoi feoiVar2 = feogVar2.c;
            feoiVar2.g.d();
            emxf.b(!status.f(), "The error status must not be OK");
            feoiVar2.d(new fdyd(fdyc.TRANSIENT_FAILURE, status));
            if (feoiVar2.e) {
                return;
            }
            if (feoiVar2.u == null) {
                feoiVar2.u = new feml();
            }
            long a = feoiVar2.u.a() - feoiVar2.j.a(TimeUnit.NANOSECONDS);
            feoiVar2.d.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", feoi.k(status), Long.valueOf(a));
            emxf.m(feoiVar2.k == null, "previous reconnectTask is not done");
            feoiVar2.k = feoiVar2.g.a(new fenr(feoiVar2), a, TimeUnit.NANOSECONDS, feoiVar2.b);
        }
    }
}
