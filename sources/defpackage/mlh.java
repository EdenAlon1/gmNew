package defpackage;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mlh implements mir {
    public final ltn a;
    public final mlg b;
    public final SparseArray c;
    public lug d;
    public lro e;
    public lua f;
    public boolean g;
    private final lrs h;
    private final lrt i;

    public mlh(ltn ltnVar) {
        lti.f(ltnVar);
        this.a = ltnVar;
        this.d = new lug(lvf.E(), ltnVar, new lue() { // from class: mjy
            @Override // defpackage.lue
            public final void a(Object obj, lpz lpzVar) {
            }
        });
        lrs lrsVar = new lrs();
        this.h = lrsVar;
        this.i = new lrt();
        this.b = new mlg(lrsVar);
        this.c = new SparseArray();
    }

    private final mis K(int i, mtl mtlVar) {
        lti.f(this.e);
        if (mtlVar != null) {
            return this.b.a(mtlVar) != null ? F(mtlVar) : G(lru.a, i, mtlVar);
        }
        lru I = this.e.I();
        if (i >= I.c()) {
            I = lru.a;
        }
        return G(I, i, null);
    }

    private final mis L(lrh lrhVar) {
        mtl mtlVar;
        return (!(lrhVar instanceof mel) || (mtlVar = ((mel) lrhVar).h) == null) ? E() : F(mtlVar);
    }

    @Override // defpackage.lrm
    public final void A(lrz lrzVar) {
        J(E(), 19, new lud() { // from class: miw
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void B(lsb lsbVar) {
        J(E(), 2, new lud() { // from class: mjp
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void C(final lsl lslVar) {
        J(I(), 25, new lud() { // from class: mkn
            @Override // defpackage.lud
            public final void a(Object obj) {
                lsl lslVar2 = lsl.this;
                ((miu) obj).h(lslVar2);
                int i = lslVar2.b;
                int i2 = lslVar2.c;
                float f = lslVar2.d;
            }
        });
    }

    public final mis E() {
        return F(this.b.c);
    }

    public final mis F(mtl mtlVar) {
        lti.f(this.e);
        lru a = mtlVar == null ? null : this.b.a(mtlVar);
        if (mtlVar != null && a != null) {
            return G(a, a.o(mtlVar.a, this.h).c, mtlVar);
        }
        int aI = this.e.aI();
        lru I = this.e.I();
        if (aI >= I.c()) {
            I = lru.a;
        }
        return G(I, aI, null);
    }

    protected final mis G(lru lruVar, int i, mtl mtlVar) {
        mtl mtlVar2 = true == lruVar.q() ? null : mtlVar;
        long a = this.a.a();
        boolean z = lruVar.equals(this.e.I()) && i == this.e.aI();
        long j = 0;
        if (mtlVar2 == null || !mtlVar2.b()) {
            if (z) {
                j = this.e.y();
            } else if (!lruVar.q()) {
                j = lruVar.p(i, this.i).a();
            }
        } else if (z && this.e.aG() == mtlVar2.b && this.e.aH() == mtlVar2.c) {
            j = this.e.z();
        }
        mtl mtlVar3 = this.b.c;
        lru I = this.e.I();
        int aI = this.e.aI();
        long z2 = this.e.z();
        mgl mglVar = (mgl) this.e;
        mglVar.au();
        return new mis(a, lruVar, i, mtlVar2, j, I, aI, mtlVar3, z2, lvf.z(mglVar.A.s));
    }

    public final mis H() {
        return F(this.b.d);
    }

    public final mis I() {
        return F(this.b.e);
    }

    public final void J(mis misVar, int i, lud ludVar) {
        this.c.put(i, misVar);
        this.d.f(i, ludVar);
    }

    @Override // defpackage.lrm
    public final void a(lpk lpkVar) {
        J(I(), 20, new lud() { // from class: mjl
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void b(int i) {
        J(I(), 21, new lud() { // from class: mkm
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void c(lrk lrkVar) {
        J(E(), 13, new lud() { // from class: mjb
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void d(lta ltaVar) {
        J(E(), 27, new lud() { // from class: mks
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void e(List list) {
        J(E(), 27, new lud() { // from class: mjx
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mtw
    public final void eA(int i, mtl mtlVar, final mth mthVar) {
        final mis K = K(i, mtlVar);
        J(K, 1004, new lud() { // from class: mjz
            @Override // defpackage.lud
            public final void a(Object obj) {
                ((miu) obj).a(mis.this, mthVar);
            }
        });
    }

    @Override // defpackage.mtw
    public final void eB(int i, mtl mtlVar, mtc mtcVar, mth mthVar) {
        J(K(i, mtlVar), 1002, new lud() { // from class: mkb
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mtw
    public final void eC(int i, mtl mtlVar, mtc mtcVar, mth mthVar) {
        J(K(i, mtlVar), 1001, new lud() { // from class: mkh
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mtw
    public final void eD(int i, mtl mtlVar, mtc mtcVar, final mth mthVar, IOException iOException, final boolean z) {
        J(K(i, mtlVar), 1003, new lud() { // from class: mji
            @Override // defpackage.lud
            public final void a(Object obj) {
                ((miu) obj).i(z);
            }
        });
    }

    @Override // defpackage.mtw
    public final void eE(int i, mtl mtlVar, mtc mtcVar, mth mthVar, int i2) {
        J(K(i, mtlVar), 1000, new lud() { // from class: mlf
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mpi
    public final void eF(int i, mtl mtlVar) {
        J(K(i, mtlVar), 1023, new lud() { // from class: mky
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mpi
    public final void eG(int i, mtl mtlVar) {
        J(K(i, mtlVar), 1025, new lud() { // from class: mkl
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mpi
    public final void eH(int i, mtl mtlVar, int i2) {
        J(K(i, mtlVar), 1022, new lud() { // from class: mkf
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mpi
    public final void eI(int i, mtl mtlVar, Exception exc) {
        J(K(i, mtlVar), 1024, new lud() { // from class: mkg
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mpi
    public final void eJ(int i, mtl mtlVar) {
        J(K(i, mtlVar), 1027, new lud() { // from class: mla
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void f(boolean z) {
        J(E(), 3, new lud() { // from class: miz
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void g(final boolean z) {
        final mis E = E();
        J(E, 7, new lud() { // from class: mjo
            @Override // defpackage.lud
            public final void a(Object obj) {
                ((miu) obj).c(mis.this, z);
            }
        });
    }

    @Override // defpackage.lrm
    public final void i(lqw lqwVar, int i) {
        J(E(), 1, new lud() { // from class: mjd
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void j(lqz lqzVar) {
        J(E(), 14, new lud() { // from class: mlc
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void k(lrb lrbVar) {
        J(E(), 28, new lud() { // from class: mjm
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void l(boolean z, int i) {
        J(E(), 5, new lud() { // from class: mjv
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void m(lri lriVar) {
        J(E(), 12, new lud() { // from class: miv
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void n(int i) {
        J(E(), 4, new lud() { // from class: mke
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void o(int i) {
        J(E(), 6, new lud() { // from class: mjr
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void p(final lrh lrhVar) {
        J(L(lrhVar), 10, new lud() { // from class: mkc
            @Override // defpackage.lud
            public final void a(Object obj) {
                ((miu) obj).e(lrh.this);
            }
        });
    }

    @Override // defpackage.lrm
    public final void q(lrh lrhVar) {
        J(L(lrhVar), 10, new lud() { // from class: mju
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void r(boolean z, int i) {
        J(E(), -1, new lud() { // from class: mjk
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void t(lrn lrnVar, lrn lrnVar2, final int i) {
        if (i == 1) {
            this.g = false;
            i = 1;
        }
        mlg mlgVar = this.b;
        lro lroVar = this.e;
        lti.f(lroVar);
        mlgVar.c = mlg.b(lroVar, mlgVar.b, mlgVar.d, mlgVar.a);
        J(E(), 11, new lud() { // from class: mkq
            @Override // defpackage.lud
            public final void a(Object obj) {
                ((miu) obj).f(i);
            }
        });
    }

    @Override // defpackage.lrm
    public final void v(int i) {
        J(E(), 8, new lud() { // from class: mku
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void w(boolean z) {
        J(E(), 9, new lud() { // from class: mld
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void x(boolean z) {
        J(I(), 23, new lud() { // from class: mje
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void y(int i, int i2) {
        J(I(), 24, new lud() { // from class: mle
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void z(lru lruVar, int i) {
        lro lroVar = this.e;
        lti.f(lroVar);
        mlg mlgVar = this.b;
        mlgVar.c = mlg.b(lroVar, mlgVar.b, mlgVar.d, mlgVar.a);
        mlgVar.c(lroVar.I());
        J(E(), 0, new lud() { // from class: mjc
            @Override // defpackage.lud
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.lrm
    public final void u() {
    }

    @Override // defpackage.lrm
    public final void D(lrl lrlVar) {
    }

    @Override // defpackage.lrm
    public final void h(boolean z) {
    }

    @Override // defpackage.lrm
    public final void s(int i) {
    }
}
