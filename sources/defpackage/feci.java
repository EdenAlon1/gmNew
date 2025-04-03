package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class feci extends fecu {
    @Override // defpackage.fecu
    public void a(Status status, febo feboVar) {
        c().a(status, feboVar);
    }

    @Override // defpackage.fecu
    public void b(febo feboVar) {
        c().b(feboVar);
    }

    protected abstract fecu c();

    @Override // defpackage.fecu
    public final fdxd f() {
        return c().f();
    }

    @Override // defpackage.fecu
    public final void g(int i) {
        c().g(i);
    }

    @Override // defpackage.fecu
    public final boolean h() {
        return c().h();
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("delegate", c());
        return b.toString();
    }
}
