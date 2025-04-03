package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nue implements View.OnClickListener, lrm, nwi {
    final /* synthetic */ nug a;

    public nue(nug nugVar) {
        this.a = nugVar;
    }

    @Override // defpackage.lrm
    public final void D(lrl lrlVar) {
        if (lrlVar.b(4, 5)) {
            this.a.i();
        }
        if (lrlVar.b(4, 5, 7)) {
            this.a.j();
        }
        if (lrlVar.a(8)) {
            this.a.k();
        }
        if (lrlVar.a(9)) {
            this.a.l();
        }
        if (lrlVar.b(8, 9, 11, 0, 13)) {
            this.a.h();
        }
        if (lrlVar.b(11, 0)) {
            this.a.m();
        }
    }

    @Override // defpackage.nwi
    public final void E(long j) {
        nug nugVar = this.a;
        TextView textView = nugVar.j;
        if (textView != null) {
            textView.setText(lvf.J(nugVar.k, nugVar.l, j));
        }
    }

    @Override // defpackage.nwi
    public final void F(long j) {
        nug nugVar = this.a;
        nugVar.o = true;
        TextView textView = nugVar.j;
        if (textView != null) {
            textView.setText(lvf.J(nugVar.k, nugVar.l, j));
        }
    }

    @Override // defpackage.nwi
    public final void G(long j, boolean z) {
        lro lroVar;
        nug nugVar = this.a;
        nugVar.o = false;
        if (z || (lroVar = nugVar.n) == null) {
            return;
        }
        lroVar.I();
        lroVar.h(lroVar.aI(), j);
        nugVar.j();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nug nugVar = this.a;
        lro lroVar = nugVar.n;
        if (lroVar == null) {
            return;
        }
        if (nugVar.c == view) {
            lroVar.j();
            return;
        }
        if (nugVar.b == view) {
            lroVar.k();
            return;
        }
        if (nugVar.f == view) {
            if (lroVar.u() != 4) {
                lroVar.g();
                return;
            }
            return;
        }
        if (nugVar.g == view) {
            lroVar.f();
            return;
        }
        if (nugVar.d == view) {
            lvf.ap(lroVar);
            return;
        }
        if (nugVar.e == view) {
            lvf.ao(lroVar);
        } else if (nugVar.h == view) {
            lroVar.T(luw.a(lroVar.w(), this.a.q));
        } else if (nugVar.i == view) {
            lroVar.U(!lroVar.Z());
        }
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void A(lrz lrzVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void B(lsb lsbVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void C(lsl lslVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void a(lpk lpkVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void c(lrk lrkVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void d(lta ltaVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void e(List list) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void f(boolean z) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void h(boolean z) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void j(lqz lqzVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void k(lrb lrbVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void m(lri lriVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void n(int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void o(int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void p(lrh lrhVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void q(lrh lrhVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void s(int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void w(boolean z) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void x(boolean z) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void i(lqw lqwVar, int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void l(boolean z, int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void r(boolean z, int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void y(int i, int i2) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void z(lru lruVar, int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void t(lrn lrnVar, lrn lrnVar2, int i) {
    }
}
