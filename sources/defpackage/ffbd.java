package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffbd extends feai {
    @Override // defpackage.feai
    public final fean b(feaf feafVar) {
        return g().b(feafVar);
    }

    @Override // defpackage.feai
    public final feds c() {
        return g().c();
    }

    @Override // defpackage.feai
    public final ScheduledExecutorService d() {
        return g().d();
    }

    @Override // defpackage.feai
    public final void e() {
        g().e();
    }

    @Override // defpackage.feai
    public void f(fdyc fdycVar, feao feaoVar) {
        throw null;
    }

    protected abstract feai g();

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("delegate", g());
        return b.toString();
    }
}
