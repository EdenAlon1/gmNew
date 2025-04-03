package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqfm extends vk implements ljv {
    public final ffsk a;
    public final ea d;
    public final dpnj e;
    public dpnn f;
    private final dpnl g;
    private final dqdb h;
    private final ffji i;
    private final ffji j;

    public dqfm(ffsk ffskVar, ea eaVar, dpnl dpnlVar, dqdb dqdbVar, dpnj dpnjVar, ffji ffjiVar, ffji ffjiVar2) {
        this.a = ffskVar;
        this.d = eaVar;
        this.g = dpnlVar;
        this.h = dqdbVar;
        this.e = dpnjVar;
        this.i = ffjiVar;
        this.j = ffjiVar2;
        eaVar.P().c(this);
    }

    private final void F(dpnn dpnnVar) {
        dpni dpniVar;
        dqdb dqdbVar = this.h;
        dpnj dpnjVar = dqdbVar.d.e;
        dpni dpniVar2 = null;
        if (dpnjVar != null && (dpniVar = dpnjVar.a) != null) {
            dqcz dqczVar = dqdbVar.f;
            dpniVar2 = (dqczVar == null || !ffkj.e(dqczVar, dqcx.a)) ? dpniVar : dpng.a;
        }
        dpnnVar.D(dpniVar2);
        dpnnVar.t.d(dpnn.s[0], this.h.a(2));
    }

    @Override // defpackage.vk
    public final int a() {
        return 1;
    }

    @Override // defpackage.ljv
    public final void c(lkr lkrVar) {
        ffqy.d(this.a, null, null, new dqfl(this, null), 3);
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        dpnn dpnnVar = this.f;
        if (dpnnVar != null) {
            m(dpnnVar);
        }
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return 2;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return this.g.a(viewGroup, this.e, this.i);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        dpnn dpnnVar = (dpnn) wrVar;
        dpnnVar.getClass();
        F(dpnnVar);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void i(wr wrVar) {
        dpnn dpnnVar = (dpnn) wrVar;
        dpnnVar.getClass();
        m(dpnnVar);
        this.j.invoke(true);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void j(wr wrVar) {
        ((dpnn) wrVar).getClass();
        this.j.invoke(false);
    }

    public final void m(dpnn dpnnVar) {
        this.f = dpnnVar;
        F(dpnnVar);
        ffqy.d(this.a, null, null, new dqfj(dpnnVar, null), 3);
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
