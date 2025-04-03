package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbg implements fcp {
    final /* synthetic */ ffix a;
    final /* synthetic */ fgd b;
    final /* synthetic */ long c;
    private long d = 0;

    public fbg(ffix ffixVar, fgd fgdVar, long j) {
        this.a = ffixVar;
        this.b = fgdVar;
        this.c = j;
    }

    @Override // defpackage.fcp
    public final void a() {
        this.b.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ioc, java.lang.Object] */
    @Override // defpackage.fcp
    public final boolean b(long j, fdh fdhVar) {
        ?? invoke = this.a.invoke();
        if (invoke == 0) {
            return true;
        }
        fgd fgdVar = this.b;
        long j2 = this.c;
        if (!invoke.t() || !fgk.a(fgdVar, j2)) {
            return false;
        }
        if (!fgdVar.h(invoke, j, this.d, fdhVar, false)) {
            return true;
        }
        this.d = j;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ioc, java.lang.Object] */
    @Override // defpackage.fcp
    public final boolean c(long j, fdh fdhVar) {
        ?? invoke = this.a.invoke();
        if (invoke == 0) {
            return false;
        }
        fgd fgdVar = this.b;
        long j2 = this.c;
        if (!invoke.t()) {
            return false;
        }
        fgdVar.f(invoke, j, fdhVar, false);
        this.d = j;
        return fgk.a(fgdVar, j2);
    }
}
