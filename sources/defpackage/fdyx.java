package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdyx extends feaw {
    protected fdyx() {
    }

    @Override // defpackage.feaw
    public feau a() {
        return b().a();
    }

    protected abstract feaw b();

    @Override // defpackage.feaw
    public void c(fdxz fdxzVar) {
        b().c(fdxzVar);
    }

    @Override // defpackage.feaw
    public void d(fdyv fdyvVar) {
        b().d(fdyvVar);
    }

    @Override // defpackage.feaw
    public void e(Map map) {
        b().e(map);
    }

    @Override // defpackage.feaw
    public void f() {
        b().f();
    }

    @Override // defpackage.feaw
    public void g(Executor executor) {
        b().g(executor);
    }

    @Override // defpackage.feaw
    public void h(long j, TimeUnit timeUnit) {
        b().h(j, timeUnit);
    }

    @Override // defpackage.feaw
    public void i(fdxp... fdxpVarArr) {
        b().i(fdxpVarArr);
    }

    @Override // defpackage.feaw
    public void j(Executor executor) {
        b().j(executor);
    }

    @Override // defpackage.feaw
    public void k(String str) {
        b().k(str);
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("delegate", b());
        return b.toString();
    }
}
