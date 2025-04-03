package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhqo implements dhrf {
    public final Object a = new Object();
    public final dhqp b;
    private final Executor c;

    public dhqo(Executor executor, dhqp dhqpVar) {
        this.c = executor;
        this.b = dhqpVar;
    }

    @Override // defpackage.dhrf
    public final void c(dhre dhreVar) {
        if (((dhrm) dhreVar).d) {
            synchronized (this.a) {
            }
            this.c.execute(new dhqn(this));
        }
    }
}
