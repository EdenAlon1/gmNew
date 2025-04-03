package defpackage;

import io.grpc.Status;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class femp implements fejs {
    @Override // defpackage.fejs
    public final fdxd a() {
        throw null;
    }

    @Override // defpackage.fejs
    public final void b(fenl fenlVar) {
        p().b(fenlVar);
    }

    @Override // defpackage.fejs
    public final void c(Status status) {
        p().c(status);
    }

    @Override // defpackage.fevp
    public final void d() {
        p().d();
    }

    @Override // defpackage.fejs
    public final void e() {
        p().e();
    }

    @Override // defpackage.fevp
    public final void f() {
        p().f();
    }

    @Override // defpackage.fevp
    public final void g(int i) {
        p().g(i);
    }

    @Override // defpackage.fevp
    public final void h(fdxy fdxyVar) {
        p().h(fdxyVar);
    }

    @Override // defpackage.fejs
    public final void i(fdys fdysVar) {
        p().i(fdysVar);
    }

    @Override // defpackage.fejs
    public final void j(fdyv fdyvVar) {
        p().j(fdyvVar);
    }

    @Override // defpackage.fejs
    public final void k(int i) {
        p().k(i);
    }

    @Override // defpackage.fejs
    public final void l(int i) {
        p().l(i);
    }

    @Override // defpackage.fejs
    public void m(feju fejuVar) {
        throw null;
    }

    @Override // defpackage.fevp
    public final void n(InputStream inputStream) {
        p().n(inputStream);
    }

    @Override // defpackage.fevp
    public final boolean o() {
        return p().o();
    }

    protected abstract fejs p();

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("delegate", p());
        return b.toString();
    }
}
