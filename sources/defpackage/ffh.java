package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffh implements evy {
    final /* synthetic */ boolean a;
    final /* synthetic */ fft b;

    public ffh(boolean z, fft fftVar) {
        this.a = z;
        this.b = fftVar;
    }

    private final void g() {
        this.b.u(true);
        this.b.p(null);
        this.b.m(null);
    }

    @Override // defpackage.evy
    public final void a() {
        g();
    }

    @Override // defpackage.evy
    public final void b(long j) {
        if (this.b.d() == null) {
            return;
        }
        fft fftVar = this.b;
        fftVar.o(iak.f(fftVar.c(), j));
        fft fftVar2 = this.b;
        long f = iak.f(fftVar2.b(), fftVar2.c());
        fft fftVar3 = this.b;
        iak iakVar = new iak(f);
        boolean z = this.a;
        long b = fftVar3.b();
        int i = fdh.b;
        if (fftVar3.F(iakVar, b, z, fdg.d)) {
            this.b.n(f);
            this.b.o(0L);
        }
    }

    @Override // defpackage.evy
    public final void c(long j) {
        if (this.b.d() == null) {
            return;
        }
        fcy f = this.b.f();
        f.getClass();
        Object a = this.b.a.c.a((this.a ? f.a : f.b).c);
        if (a == null) {
            dwv.b("SelectionRegistrar should contain the current selection's selectableIds");
            throw new ffbx();
        }
        fcv fcvVar = (fcv) a;
        ioc k = fcvVar.k();
        if (k == null) {
            dwv.b("Current selectable should have layout coordinates.");
            throw new ffbx();
        }
        long f2 = fcvVar.f(f, this.a);
        if ((9223372034707292159L & f2) != 9205357640488583168L) {
            long a2 = fem.a(f2);
            fft fftVar = this.b;
            fftVar.n(fftVar.i().h(k, a2));
            this.b.o(0L);
        }
    }

    @Override // defpackage.evy
    public final void d() {
        g();
    }

    @Override // defpackage.evy
    public final void e() {
        g();
    }

    @Override // defpackage.evy
    public final void f() {
        fcy f;
        ioc k;
        if ((this.a ? this.b.h() : this.b.g()) == null || (f = this.b.f()) == null) {
            return;
        }
        fcv e = this.b.e(this.a ? f.a : f.b);
        if (e == null || (k = e.k()) == null) {
            return;
        }
        long f2 = e.f(f, this.a);
        if ((9223372034707292159L & f2) != 9205357640488583168L) {
            long a = fem.a(f2);
            fft fftVar = this.b;
            fftVar.m(new iak(fftVar.i().h(k, a)));
            this.b.p(this.a ? euf.b : euf.c);
            this.b.u(false);
        }
    }
}
