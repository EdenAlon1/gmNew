package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhra implements dhrf, dhqy, dhqv, dhqp {
    public final dhrd a;
    private final Executor b;
    private final dhrm c;

    public dhra(Executor executor, dhrd dhrdVar, dhrm dhrmVar) {
        this.b = executor;
        this.a = dhrdVar;
        this.c = dhrmVar;
    }

    @Override // defpackage.dhqp
    public final void a() {
        this.c.x();
    }

    @Override // defpackage.dhrf
    public final void c(dhre dhreVar) {
        this.b.execute(new dhqz(this, dhreVar));
    }

    @Override // defpackage.dhqv
    public final void d(Exception exc) {
        this.c.u(exc);
    }

    @Override // defpackage.dhqy
    public final void e(Object obj) {
        this.c.v(obj);
    }
}
