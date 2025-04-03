package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndp implements nco {
    private final int a;
    private final int b;
    private final String c;
    private int d;
    private int e;
    private ncr f;
    private ndu g;

    public ndp(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.nco
    public final int a(ncp ncpVar, ndk ndkVar) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        ndu nduVar = this.g;
        lti.f(nduVar);
        int e = nduVar.e(ncpVar, 1024, true);
        if (e == -1) {
            this.e = 2;
            this.g.o(0L, 1, this.d, 0, null);
            this.d = 0;
        } else {
            this.d += e;
        }
        return 0;
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        this.f = ncrVar;
        ndu p = ncrVar.p(1024, 4);
        this.g = p;
        lqb lqbVar = new lqb();
        String str = this.c;
        lqbVar.a(str);
        lqbVar.c(str);
        p.i(new lqc(lqbVar));
        this.f.r();
        this.f.w(new ndq());
        this.e = 1;
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        lti.c((this.a == -1 || this.b == -1) ? false : true);
        luv luvVar = new luv(this.b);
        ncpVar.i(luvVar.a, 0, this.b);
        return luvVar.n() == this.a;
    }

    @Override // defpackage.nco
    public final /* synthetic */ List x() {
        int i = engw.d;
        return enou.a;
    }

    @Override // defpackage.nco
    public final void d() {
    }

    @Override // defpackage.nco
    public final /* synthetic */ void g() {
    }
}
