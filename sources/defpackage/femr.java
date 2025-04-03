package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class femr implements fekh {
    protected abstract fekh a();

    @Override // defpackage.feab
    public final fdzv c() {
        return a().c();
    }

    @Override // defpackage.fejv
    public fejs d(febs febsVar, febo feboVar, fdxj fdxjVar, fdxt[] fdxtVarArr) {
        throw null;
    }

    @Override // defpackage.feqr
    public final Runnable e(feqq feqqVar) {
        return a().e(feqqVar);
    }

    @Override // defpackage.feqr
    public void n(Status status) {
        a().n(status);
    }

    @Override // defpackage.feqr
    public final void o(Status status) {
        throw null;
    }

    @Override // defpackage.fekh
    public final fdxd q() {
        return a().q();
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("delegate", a());
        return b.toString();
    }
}
