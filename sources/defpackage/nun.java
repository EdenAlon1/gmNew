package defpackage;

import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nun implements View.OnClickListener, PopupWindow.OnDismissListener, lrm, nwi {
    final /* synthetic */ nva a;

    public nun(nva nvaVar) {
        this.a = nvaVar;
    }

    @Override // defpackage.lrm
    public final void D(lrl lrlVar) {
        if (lrlVar.b(4, 5, 13)) {
            this.a.g();
        }
        if (lrlVar.b(4, 5, 7, 13)) {
            this.a.i();
        }
        if (lrlVar.b(8, 13)) {
            this.a.j();
        }
        if (lrlVar.b(9, 13)) {
            this.a.l();
        }
        if (lrlVar.b(8, 9, 11, 0, 16, 17, 13)) {
            this.a.f();
        }
        if (lrlVar.b(11, 0, 13)) {
            this.a.m();
        }
        if (lrlVar.b(12, 13)) {
            this.a.h();
        }
        if (lrlVar.b(2, 13)) {
            this.a.n();
        }
    }

    @Override // defpackage.nwi
    public final void E(long j) {
        nva nvaVar = this.a;
        TextView textView = nvaVar.v;
        if (textView != null) {
            textView.setText(lvf.J(nvaVar.w, nvaVar.x, j));
        }
    }

    @Override // defpackage.nwi
    public final void F(long j) {
        nva nvaVar = this.a;
        nvaVar.G = true;
        TextView textView = nvaVar.v;
        if (textView != null) {
            textView.setText(lvf.J(nvaVar.w, nvaVar.x, j));
        }
        this.a.a.h();
    }

    @Override // defpackage.nwi
    public final void G(long j, boolean z) {
        lro lroVar;
        nva nvaVar = this.a;
        nvaVar.G = false;
        if (!z && (lroVar = nvaVar.D) != null) {
            if (lroVar.n(5)) {
                ((lpm) lroVar).t(j);
            }
            nvaVar.i();
        }
        this.a.a.i();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nva nvaVar = this.a;
        lro lroVar = nvaVar.D;
        if (lroVar == null) {
            return;
        }
        nvaVar.a.i();
        nva nvaVar2 = this.a;
        if (nvaVar2.j == view) {
            if (lroVar.n(9)) {
                lroVar.j();
                return;
            }
            return;
        }
        if (nvaVar2.i == view) {
            if (lroVar.n(7)) {
                lroVar.k();
                return;
            }
            return;
        }
        if (nvaVar2.l == view) {
            if (lroVar.u() == 4 || !lroVar.n(12)) {
                return;
            }
            lroVar.g();
            return;
        }
        if (nvaVar2.m == view) {
            if (lroVar.n(11)) {
                lroVar.f();
                return;
            }
            return;
        }
        if (nvaVar2.k == view) {
            lvf.al(lroVar, nvaVar2.F);
            return;
        }
        if (nvaVar2.n == view) {
            if (lroVar.n(15)) {
                lroVar.T(luw.a(lroVar.w(), 0));
                return;
            }
            return;
        }
        if (nvaVar2.o == view) {
            if (lroVar.n(14)) {
                lroVar.U(!lroVar.Z());
                return;
            }
            return;
        }
        if (nvaVar2.s == view) {
            nvaVar2.a.h();
            nva nvaVar3 = this.a;
            nvaVar3.a(nvaVar3.c, nvaVar3.s);
            return;
        }
        if (nvaVar2.t == view) {
            nvaVar2.a.h();
            nva nvaVar4 = this.a;
            nvaVar4.a(nvaVar4.d, nvaVar4.t);
        } else if (nvaVar2.u == view) {
            nvaVar2.a.h();
            nva nvaVar5 = this.a;
            nvaVar5.a(nvaVar5.f, nvaVar5.u);
        } else if (nvaVar2.p == view) {
            nvaVar2.a.h();
            nva nvaVar6 = this.a;
            nvaVar6.a(nvaVar6.e, nvaVar6.p);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        nva nvaVar = this.a;
        if (nvaVar.I) {
            nvaVar.a.i();
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
