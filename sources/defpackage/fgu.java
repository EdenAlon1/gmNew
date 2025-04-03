package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgu implements evy {
    final /* synthetic */ fhi a;
    final /* synthetic */ boolean b;

    public fgu(fhi fhiVar, boolean z) {
        this.a = fhiVar;
        this.b = z;
    }

    @Override // defpackage.evy
    public final void b(long j) {
        fhi fhiVar = this.a;
        fhiVar.o = iak.f(fhiVar.o, j);
        fhi fhiVar2 = this.a;
        fhiVar2.m(new iak(iak.f(fhiVar2.m, fhiVar2.o)));
        fhi fhiVar3 = this.a;
        jvu f = fhiVar3.f();
        iak d = fhiVar3.d();
        d.getClass();
        int i = fdh.b;
        fhiVar3.b(f, d.a, false, this.b, fdg.d, true);
        this.a.r(false);
    }

    @Override // defpackage.evy
    public final void d() {
        this.a.o(null);
        this.a.m(null);
        this.a.r(true);
    }

    @Override // defpackage.evy
    public final void e() {
        this.a.o(null);
        this.a.m(null);
        this.a.r(true);
    }

    @Override // defpackage.evy
    public final void f() {
        exq d;
        this.a.o(this.b ? euf.b : euf.c);
        long a = fem.a(this.a.a(this.b));
        eva evaVar = this.a.d;
        if (evaVar == null || (d = evaVar.d()) == null) {
            return;
        }
        long c = d.c(a);
        fhi fhiVar = this.a;
        fhiVar.m = c;
        fhiVar.m(new iak(c));
        fhi fhiVar2 = this.a;
        fhiVar2.o = 0L;
        fhiVar2.w = -1;
        eva evaVar2 = this.a.d;
        if (evaVar2 != null) {
            evaVar2.i(true);
        }
        this.a.r(false);
    }

    @Override // defpackage.evy
    public final void a() {
    }

    @Override // defpackage.evy
    public final void c(long j) {
    }
}
