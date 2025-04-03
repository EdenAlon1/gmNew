package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhh implements evy {
    final /* synthetic */ fhi a;

    public fhh(fhi fhiVar) {
        this.a = fhiVar;
    }

    private final void g() {
        this.a.o(null);
        this.a.m(null);
        this.a.r(true);
        fhi fhiVar = this.a;
        fhiVar.n = null;
        boolean i = jpm.i(fhiVar.f().c);
        this.a.p(i ? eug.c : eug.b);
        fhi fhiVar2 = this.a;
        eva evaVar = fhiVar2.d;
        if (evaVar != null) {
            evaVar.o(!i && fhm.b(fhiVar2, true));
        }
        fhi fhiVar3 = this.a;
        eva evaVar2 = fhiVar3.d;
        if (evaVar2 != null) {
            evaVar2.n(!i && fhm.b(fhiVar3, false));
        }
        fhi fhiVar4 = this.a;
        eva evaVar3 = fhiVar4.d;
        if (evaVar3 == null) {
            return;
        }
        evaVar3.l(i && fhm.b(fhiVar4, true));
    }

    @Override // defpackage.evy
    public final void a() {
        g();
    }

    @Override // defpackage.evy
    public final void b(long j) {
        exq d;
        int a;
        int a2;
        fdh fdhVar;
        if (!this.a.t() || this.a.f().a().length() == 0) {
            return;
        }
        fhi fhiVar = this.a;
        fhiVar.o = iak.f(fhiVar.o, j);
        eva evaVar = this.a.d;
        if (evaVar != null && (d = evaVar.d()) != null) {
            fhi fhiVar2 = this.a;
            fhiVar2.m(new iak(iak.f(fhiVar2.m, fhiVar2.o)));
            if (fhiVar2.n == null) {
                iak d2 = fhiVar2.d();
                d2.getClass();
                if (!d.d(d2.a)) {
                    jvj jvjVar = fhiVar2.b;
                    a = d.a(fhiVar2.m, true);
                    int b = jvjVar.b(a);
                    jvj jvjVar2 = fhiVar2.b;
                    iak d3 = fhiVar2.d();
                    d3.getClass();
                    a2 = d.a(d3.a, true);
                    if (b == jvjVar2.b(a2)) {
                        int i = fdh.b;
                        fdhVar = fdg.a;
                    } else {
                        int i2 = fdh.b;
                        fdhVar = fdg.b;
                    }
                    fdh fdhVar2 = fdhVar;
                    jvu f = fhiVar2.f();
                    iak d4 = fhiVar2.d();
                    d4.getClass();
                    fhiVar2.b(f, d4.a, false, false, fdhVar2, true);
                    long j2 = jpm.a;
                }
            }
            Integer num = fhiVar2.n;
            int intValue = num != null ? num.intValue() : d.a(fhiVar2.m, false);
            iak d5 = fhiVar2.d();
            d5.getClass();
            int a3 = d.a(d5.a, false);
            if (fhiVar2.n == null && intValue == a3) {
                return;
            }
            jvu f2 = fhiVar2.f();
            iak d6 = fhiVar2.d();
            d6.getClass();
            int i3 = fdh.b;
            fhiVar2.b(f2, d6.a, false, false, fdg.b, true);
            long j22 = jpm.a;
        }
        this.a.r(false);
    }

    @Override // defpackage.evy
    public final void c(long j) {
        long j2;
        exq d;
        int a;
        exq d2;
        if (this.a.t() && this.a.c() == null) {
            this.a.o(euf.c);
            this.a.w = -1;
            this.a.k();
            eva evaVar = this.a.d;
            if (evaVar == null || (d2 = evaVar.d()) == null || !d2.d(j)) {
                j2 = j;
                eva evaVar2 = this.a.d;
                if (evaVar2 != null && (d = evaVar2.d()) != null) {
                    fhi fhiVar = this.a;
                    a = d.a(j2, true);
                    int b = fhiVar.b.b(a);
                    jlm jlmVar = fhiVar.f().b;
                    long a2 = jpn.a(b, b);
                    long j3 = jpm.a;
                    jvu jvuVar = new jvu(jlmVar, a2);
                    fhiVar.i(false);
                    iir iirVar = fhiVar.i;
                    if (iirVar != null) {
                        iirVar.a(9);
                    }
                    fhiVar.c.invoke(jvuVar);
                }
            } else {
                if (this.a.f().a().length() == 0) {
                    return;
                }
                this.a.i(false);
                fhi fhiVar2 = this.a;
                jvu b2 = jvu.b(fhiVar2.f(), null, jpm.a, 5);
                int i = fdh.b;
                j2 = j;
                this.a.n = Integer.valueOf(jpm.e(fhiVar2.b(b2, j2, true, false, fdg.b, true)));
            }
            this.a.p(eug.a);
            fhi fhiVar3 = this.a;
            fhiVar3.m = j2;
            fhiVar3.m(new iak(j2));
            this.a.o = 0L;
        }
    }

    @Override // defpackage.evy
    public final void d() {
        g();
    }

    @Override // defpackage.evy
    public final void e() {
    }

    @Override // defpackage.evy
    public final void f() {
    }
}
