package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhqj implements dhrf {
    public final dhqh a;
    public final dhrm b;
    private final Executor c;

    public dhqj(Executor executor, dhqh dhqhVar, dhrm dhrmVar) {
        this.c = executor;
        this.a = dhqhVar;
        this.b = dhrmVar;
    }

    @Override // defpackage.dhrf
    public final void c(dhre dhreVar) {
        this.c.execute(new dhqi(this, dhreVar));
    }
}
