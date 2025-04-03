package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fenv implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ feoi b;

    public fenv(feoi feoiVar, Status status) {
        this.a = status;
        this.b = feoiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.r.a == fdyc.SHUTDOWN) {
            return;
        }
        feoi feoiVar = this.b;
        feoiVar.s = this.a;
        feqr feqrVar = feoiVar.q;
        fekh fekhVar = feoiVar.p;
        feoiVar.q = null;
        this.b.p = null;
        this.b.b(fdyc.SHUTDOWN);
        this.b.h.c();
        if (this.b.n.isEmpty()) {
            this.b.e();
        }
        feoi feoiVar2 = this.b;
        feoiVar2.g.d();
        fedr fedrVar = feoiVar2.k;
        if (fedrVar != null) {
            fedrVar.a();
            feoiVar2.k = null;
            feoiVar2.u = null;
        }
        fedr fedrVar2 = this.b.l;
        if (fedrVar2 != null) {
            fedrVar2.a();
            feoi feoiVar3 = this.b;
            feoiVar3.m.n(this.a);
            feoi feoiVar4 = this.b;
            feoiVar4.l = null;
            feoiVar4.m = null;
        }
        if (feqrVar != null) {
            feqrVar.n(this.a);
        }
        if (fekhVar != null) {
            fekhVar.n(this.a);
        }
    }
}
