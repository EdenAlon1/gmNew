package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgs implements evy {
    final /* synthetic */ fhi a;

    public fgs(fhi fhiVar) {
        this.a = fhiVar;
    }

    @Override // defpackage.evy
    public final void b(long j) {
        exq d;
        int a;
        iir iirVar;
        fhi fhiVar = this.a;
        fhiVar.o = iak.f(fhiVar.o, j);
        eva evaVar = this.a.d;
        if (evaVar == null || (d = evaVar.d()) == null) {
            return;
        }
        fhi fhiVar2 = this.a;
        fhiVar2.m(new iak(iak.f(fhiVar2.m, fhiVar2.o)));
        jvj jvjVar = fhiVar2.b;
        iak d2 = fhiVar2.d();
        d2.getClass();
        a = d.a(d2.a, true);
        int b = jvjVar.b(a);
        long a2 = jpn.a(b, b);
        long j2 = jpm.a;
        if (jpm.h(a2, fhiVar2.f().c)) {
            return;
        }
        eva evaVar2 = fhiVar2.d;
        if ((evaVar2 == null || evaVar2.s()) && (iirVar = fhiVar2.i) != null) {
            iirVar.a(9);
        }
        fhiVar2.c.invoke(new jvu(fhiVar2.f().b, a2));
    }

    @Override // defpackage.evy
    public final void c(long j) {
        exq d;
        long a = fem.a(this.a.a(true));
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
        fhiVar2.o(euf.a);
        this.a.r(false);
    }

    @Override // defpackage.evy
    public final void d() {
        this.a.o(null);
        this.a.m(null);
    }

    @Override // defpackage.evy
    public final void e() {
        this.a.o(null);
        this.a.m(null);
    }

    @Override // defpackage.evy
    public final void a() {
    }

    @Override // defpackage.evy
    public final void f() {
    }
}
