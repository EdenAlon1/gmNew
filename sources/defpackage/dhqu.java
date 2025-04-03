package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhqu implements dhrf {
    public final Object a = new Object();
    public final dhqv b;
    private final Executor c;

    public dhqu(Executor executor, dhqv dhqvVar) {
        this.c = executor;
        this.b = dhqvVar;
    }

    @Override // defpackage.dhrf
    public final void c(dhre dhreVar) {
        if (dhreVar.m() || ((dhrm) dhreVar).d) {
            return;
        }
        synchronized (this.a) {
        }
        this.c.execute(new dhqt(this, dhreVar));
    }
}
