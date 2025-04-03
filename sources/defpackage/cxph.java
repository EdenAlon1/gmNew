package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxph implements lrm {
    final /* synthetic */ cxpi a;

    public cxph(cxpi cxpiVar) {
        this.a = cxpiVar;
    }

    @Override // defpackage.lrm
    public final void n(int i) {
        if (i == 4) {
            this.a.a();
        }
    }

    @Override // defpackage.lrm
    public final void p(lrh lrhVar) {
        this.a.c.ifPresent(new Consumer() { // from class: cxpg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ViewGroup viewGroup = (ViewGroup) obj;
                ellj.g(new cvms(viewGroup.getResources().getString(R.string.inline_playback_error), "", new Runnable() { // from class: cxpf
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                }), viewGroup);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.a.a();
    }

    @Override // defpackage.lrm
    public final void y(int i, int i2) {
        if (i == 0 || i2 == 0) {
            this.a.a();
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
    public final /* synthetic */ void o(int i) {
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
    public final /* synthetic */ void z(lru lruVar, int i) {
    }

    @Override // defpackage.lrm
    public final /* synthetic */ void t(lrn lrnVar, lrn lrnVar2, int i) {
    }
}
