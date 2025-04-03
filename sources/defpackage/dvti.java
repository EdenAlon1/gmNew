package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvti extends ea {
    private static final entd am = entd.c("GnpSdk");
    public dvqv a;
    public dvdp ai;
    public evzm aj;
    public dvqr al;
    private boolean an;
    public dvtr b;
    public eafz c;
    public dvto e;
    public boolean d = false;
    public boolean ag = true;
    public boolean ah = false;
    public Boolean ak = false;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.M(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.gm_tooltip_fragment, viewGroup);
    }

    public final void a() {
        if (G() == null || G().isFinishing() || !aF() || this.s) {
            return;
        }
        dvdp dvdpVar = this.ai;
        if (dvdpVar != null) {
            dvtr dvtrVar = this.b;
            eg G = G();
            evzd evzdVar = dvdpVar.c().f;
            if (evzdVar == null) {
                evzdVar = evzd.a;
            }
            View a = dvtrVar.a(G, evzdVar.c == 5 ? (ewab) evzdVar.d : ewab.a);
            if (a != null) {
                kvo.p(a, null);
            }
        }
        fr frVar = this.B;
        if (frVar != null) {
            cg cgVar = new cg(frVar);
            cgVar.n(this);
            cgVar.k();
        }
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        if (bundle != null && !this.d) {
            a();
            return;
        }
        View findViewById = G().findViewById(android.R.id.content);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new dvtg(this, findViewById));
        findViewById.requestLayout();
    }

    @Override // defpackage.ea
    public final void ai() {
        dvto dvtoVar = this.e;
        if (dvtoVar != null) {
            dvtoVar.a();
            if (!this.ah && !this.an) {
                this.al.a(this.ai, evvt.DISMISSED);
            }
        }
        super.ai();
    }

    @Override // defpackage.ea
    public final void g(Context context) {
        super.g(context);
        try {
            ((dvbo) ((ffbr) eajj.a(context).fM().get(dvti.class)).b()).a(this);
        } catch (Exception e) {
            ((ensz) ((ensz) ((ensz) am.j()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/tooltip/TooltipFragment", "onAttach", ']', "TooltipFragment.java")).q("Failed to inject members.");
        }
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.d = bundle != null && bundle.getBoolean("showing");
        this.ak = Boolean.valueOf(bundle != null && bundle.getBoolean("IS_IMPRESSION_REPORTED"));
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putBoolean("showing", this.d);
        bundle.putBoolean("IS_IMPRESSION_REPORTED", this.ak.booleanValue());
        this.an = true;
    }
}
