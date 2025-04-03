package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhqr implements dhrf {
    public final Object a = new Object();
    public final dhqs b;
    private final Executor c;

    public dhqr(Executor executor, dhqs dhqsVar) {
        this.c = executor;
        this.b = dhqsVar;
    }

    @Override // defpackage.dhrf
    public final void c(dhre dhreVar) {
        synchronized (this.a) {
        }
        this.c.execute(new dhqq(this, dhreVar));
    }
}
