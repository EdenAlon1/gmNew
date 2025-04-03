package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffaq extends ffap {
    private final ffbc a;
    private final ffan b;

    public ffaq(ffbc ffbcVar, ffan ffanVar) {
        this.a = ffbcVar;
        this.b = ffanVar;
        if (ffbcVar instanceof ffau) {
            ((ffau) ffbcVar).d(ffanVar);
        }
    }

    @Override // defpackage.fdxn
    public final void a(Status status, febo feboVar) {
        if (status.f()) {
            this.a.a();
        } else {
            this.a.b(new fedn(status, feboVar));
        }
    }

    @Override // defpackage.fdxn
    public final void c(Object obj) {
        this.a.c(obj);
        this.b.e();
    }

    @Override // defpackage.ffap
    public final void e() {
        this.b.e();
    }

    @Override // defpackage.fdxn
    public final void d() {
    }

    @Override // defpackage.fdxn
    public final void b(febo feboVar) {
    }
}
