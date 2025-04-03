package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhql implements dhrf, dhqy, dhqv, dhqp {
    public final dhqh a;
    public final dhrm b;
    private final Executor c;

    public dhql(Executor executor, dhqh dhqhVar, dhrm dhrmVar) {
        this.c = executor;
        this.a = dhqhVar;
        this.b = dhrmVar;
    }

    @Override // defpackage.dhqp
    public final void a() {
        this.b.x();
    }

    @Override // defpackage.dhrf
    public final void c(dhre dhreVar) {
        this.c.execute(new dhqk(this, dhreVar));
    }

    @Override // defpackage.dhqv
    public final void d(Exception exc) {
        this.b.u(exc);
    }

    @Override // defpackage.dhqy
    public final void e(Object obj) {
        this.b.v(obj);
    }
}
