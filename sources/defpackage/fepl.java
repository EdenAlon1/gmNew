package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fepl extends feai {
    feiu a;
    final /* synthetic */ feqc b;

    public fepl(feqc feqcVar) {
        this.b = feqcVar;
    }

    @Override // defpackage.feai
    public final fdxm a() {
        return this.b.H;
    }

    @Override // defpackage.feai
    public final /* bridge */ /* synthetic */ fean b(feaf feafVar) {
        this.b.m.d();
        emxf.m(!this.b.C, "Channel is being terminated");
        return new feqa(this.b, feafVar);
    }

    @Override // defpackage.feai
    public final feds c() {
        return this.b.m;
    }

    @Override // defpackage.feai
    public final ScheduledExecutorService d() {
        return this.b.j;
    }

    @Override // defpackage.feai
    public final void e() {
        this.b.m.d();
        this.b.m.execute(new fepj(this));
    }

    @Override // defpackage.feai
    public final void f(fdyc fdycVar, feao feaoVar) {
        this.b.m.d();
        fdycVar.getClass();
        this.b.m.execute(new fepk(this, feaoVar, fdycVar));
    }
}
