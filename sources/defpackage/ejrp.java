package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejrp extends ffsd implements ffsu {
    private final /* synthetic */ ffsu a;
    private final ffsd b;

    /* JADX WARN: Multi-variable type inference failed */
    public ejrp(ffsd ffsdVar) {
        this.a = (ffsu) ffsdVar;
        this.b = ffsdVar;
    }

    @Override // defpackage.ffsd
    public final void a(ffhd ffhdVar, Runnable runnable) {
        ffhdVar.getClass();
        runnable.getClass();
        this.b.a(ffhdVar, runnable);
    }

    @Override // defpackage.ffsu
    public final ffte c(long j, Runnable runnable, ffhd ffhdVar) {
        ffhdVar.getClass();
        return this.a.c(j, runnable, ffhdVar);
    }

    @Override // defpackage.ffsu
    public final void d(long j, ffrf ffrfVar) {
        this.a.d(j, ffrfVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ejrp) && ffkj.e(((ejrp) obj).b, this.b);
    }

    @Override // defpackage.ffsd
    public final boolean ex(ffhd ffhdVar) {
        ffhdVar.getClass();
        return !efbd.g();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
