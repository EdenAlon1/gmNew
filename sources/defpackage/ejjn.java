package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejjn extends ffsd implements ffsu {
    private final ffsd a;
    private final ffsu b;

    public ejjn(ffsd ffsdVar, ffsu ffsuVar) {
        this.a = ffsdVar;
        this.b = ffsuVar;
    }

    @Override // defpackage.ffsd
    public final void a(ffhd ffhdVar, Runnable runnable) {
        ffhdVar.getClass();
        runnable.getClass();
        long j = eldl.a;
        if (eldl.s()) {
            runnable = eldl.k(runnable);
        }
        this.a.a(ffhdVar, runnable);
    }

    @Override // defpackage.ffsu
    public final ffte c(long j, Runnable runnable, ffhd ffhdVar) {
        ffhdVar.getClass();
        return this.b.c(j, runnable, ffhdVar);
    }

    @Override // defpackage.ffsu
    public final void d(long j, ffrf ffrfVar) {
        this.b.d(j, ffrfVar);
    }
}
