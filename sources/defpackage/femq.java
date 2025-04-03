package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class femq implements feju {
    @Override // defpackage.feju
    public void a(Status status, fejt fejtVar, febo feboVar) {
        throw null;
    }

    protected abstract feju b();

    @Override // defpackage.feju
    public final void c(febo feboVar) {
        b().c(feboVar);
    }

    @Override // defpackage.fevr
    public final void d(fevq fevqVar) {
        b().d(fevqVar);
    }

    @Override // defpackage.fevr
    public final void e() {
        b().e();
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("delegate", b());
        return b.toString();
    }
}
