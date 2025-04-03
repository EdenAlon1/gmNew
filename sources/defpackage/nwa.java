package defpackage;

import android.view.View;
import androidx.media3.ui.SubtitleView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nwa implements View.OnClickListener, lrm, nuz {
    final /* synthetic */ nwb a;
    private final lrs b = new lrs();
    private Object c;

    public nwa(nwb nwbVar) {
        this.a = nwbVar;
    }

    @Override // defpackage.lrm
    public final void B(lsb lsbVar) {
        lro lroVar = this.a.g;
        lti.f(lroVar);
        lru I = lroVar.n(17) ? lroVar.I() : lru.a;
        if (I.q()) {
            this.c = null;
        } else if (!lroVar.n(30) || lroVar.K().a()) {
            Object obj = this.c;
            if (obj != null) {
                int a = I.a(obj);
                if (a != -1) {
                    if (lroVar.aI() == I.n(a, this.b).c) {
                        return;
                    }
                }
                this.c = null;
            }
        } else {
            this.c = I.d(lroVar.aJ(), this.b, true).b;
        }
        this.a.m(false);
    }

    @Override // defpackage.lrm
    public final void C(lsl lslVar) {
        lro lroVar;
        if (lslVar.equals(lsl.a) || (lroVar = this.a.g) == null || lroVar.u() == 1) {
            return;
        }
        this.a.h();
    }

    @Override // defpackage.nuz
    public final void E() {
        this.a.j();
    }

    @Override // defpackage.lrm
    public final void d(lta ltaVar) {
        SubtitleView subtitleView = this.a.d;
        if (subtitleView != null) {
            subtitleView.a(ltaVar.b);
        }
    }

    @Override // defpackage.lrm
    public final void l(boolean z, int i) {
        this.a.i();
        this.a.k();
    }

    @Override // defpackage.lrm
    public final void n(int i) {
        this.a.i();
        this.a.l();
        this.a.k();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g();
    }

    @Override // defpackage.lrm
    public final void t(lrn lrnVar, lrn lrnVar2, int i) {
        if (this.a.q()) {
            nwb nwbVar = this.a;
            if (nwbVar.i) {
                nwbVar.c();
            }
        }
    }

    @Override // defpackage.lrm
    public final void u() {
        View view = this.a.b;
        if (view != null) {
            view.setVisibility(4);
            if (this.a.o()) {
                this.a.d();
            } else {
                this.a.b();
            }
        }
    }

    @Override // defpackage.lrm
    public final void y(int i, int i2) {
        int i3 = lvf.a;
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void A(lrz lrzVar) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void D(lrl lrlVar) {
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
    public final /* synthetic */ void r(boolean z, int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void z(lru lruVar, int i) {
    }
}
