package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhqx implements dhrf {
    public final Object a = new Object();
    public final dhqy b;
    private final Executor c;

    public dhqx(Executor executor, dhqy dhqyVar) {
        this.c = executor;
        this.b = dhqyVar;
    }

    @Override // defpackage.dhrf
    public final void c(dhre dhreVar) {
        if (dhreVar.m()) {
            synchronized (this.a) {
            }
            this.c.execute(new dhqw(this, dhreVar));
        }
    }
}
