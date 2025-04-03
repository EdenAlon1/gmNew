package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbf implements evy {
    final /* synthetic */ ffix a;
    final /* synthetic */ fgd b;
    final /* synthetic */ long c;
    private long d = 0;
    private long e = 0;

    public fbf(ffix ffixVar, fgd fgdVar, long j) {
        this.a = ffixVar;
        this.b = fgdVar;
        this.c = j;
    }

    @Override // defpackage.evy
    public final void a() {
        if (fgk.a(this.b, this.c)) {
            this.b.e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ioc, java.lang.Object] */
    @Override // defpackage.evy
    public final void b(long j) {
        ?? invoke = this.a.invoke();
        if (invoke != 0) {
            fgd fgdVar = this.b;
            long j2 = this.c;
            if (invoke.t() && fgk.a(fgdVar, j2)) {
                long f = iak.f(this.e, j);
                this.e = f;
                long f2 = iak.f(this.d, f);
                long j3 = this.d;
                int i = fdh.b;
                if (fgdVar.h(invoke, f2, j3, fdg.b, true)) {
                    this.d = f2;
                    this.e = 0L;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ioc, java.lang.Object] */
    @Override // defpackage.evy
    public final void c(long j) {
        ?? invoke = this.a.invoke();
        if (invoke != 0) {
            fgd fgdVar = this.b;
            if (!invoke.t()) {
                return;
            }
            int i = fdh.b;
            fgdVar.f(invoke, j, fdg.b, true);
            this.d = j;
        }
        if (fgk.a(this.b, this.c)) {
            this.e = 0L;
        }
    }

    @Override // defpackage.evy
    public final void d() {
        if (fgk.a(this.b, this.c)) {
            this.b.e();
        }
    }

    @Override // defpackage.evy
    public final void e() {
    }

    @Override // defpackage.evy
    public final void f() {
    }
}
