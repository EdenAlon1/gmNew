package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxqc extends vm {
    final /* synthetic */ cxqd a;
    private final cxqb b;

    public cxqc(cxqd cxqdVar, cxqb cxqbVar) {
        this.a = cxqdVar;
        this.b = cxqbVar;
    }

    @Override // defpackage.vm
    public final void a() {
        this.a.p();
    }

    @Override // defpackage.vm
    public final void b(int i, int i2) {
        this.a.u(i + this.a.F(this.b), i2);
    }

    @Override // defpackage.vm
    public final void c(int i, int i2, Object obj) {
        this.a.v(i + this.a.F(this.b), i2, obj);
    }

    @Override // defpackage.vm
    public final void d(int i, int i2) {
        this.a.w(i + this.a.F(this.b), i2);
    }

    @Override // defpackage.vm
    public final void e(int i, int i2) {
        this.a.x(i + this.a.F(this.b), i2);
    }

    @Override // defpackage.vm
    public final void g(int i, int i2) {
        int F = this.a.F(this.b);
        this.a.t(i + F, i2 + F);
    }
}
