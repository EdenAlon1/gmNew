package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aehc implements ajhy {
    public final Optional a;
    private final ea b;
    private final ffbr c;
    private final ffsk d;
    private final ffbr e;
    private ajid f;

    public aehc(ea eaVar, ffbr ffbrVar, ffsk ffskVar, Optional optional, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffskVar.getClass();
        ffbrVar2.getClass();
        this.b = eaVar;
        this.c = ffbrVar;
        this.d = ffskVar;
        this.a = optional;
        this.e = ffbrVar2;
    }

    private final void h() {
        axol.c(this.d, ffhe.a, ffsm.a, new aeha(this, null));
    }

    @Override // defpackage.ajhy
    public final elfl b() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new aehb(this, null));
        return c;
    }

    @Override // defpackage.ajhy
    public final void c(ajid ajidVar, ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f = ajidVar;
    }

    @Override // defpackage.ajhy
    public final void d() {
        h();
        ajid ajidVar = this.f;
        if (ajidVar == null) {
            ffkj.c("host");
            ajidVar = null;
        }
        ajidVar.b();
    }

    @Override // defpackage.ajhy
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        if (z) {
            return false;
        }
        ((akzt) this.e.b()).e("Bugle.HomeScreen.PopupHost.Show", 18);
        entd entdVar = aegz.a;
        Object b = this.c.b();
        b.getClass();
        aegw aegwVar = new aegw();
        fbae.e(aegwVar);
        ekky.b(aegwVar, (eisx) b);
        aegwVar.t(this.b.I(), "GroupUpgradeBottomSheetFragmentPeer");
        aegwVar.H().d = this;
        h();
        return true;
    }

    @Override // defpackage.ajhy
    public final int f() {
        return 19;
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ int n() {
        return ajhx.a();
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ void g() {
    }
}
