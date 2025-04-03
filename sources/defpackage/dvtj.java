package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvtj implements dvqu {
    private final dvtr a;
    private final dvcp b;
    private final dvqr c;

    public dvtj(dvtr dvtrVar, dvqr dvqrVar, dvcp dvcpVar) {
        this.a = dvtrVar;
        this.c = dvqrVar;
        this.b = dvcpVar;
    }

    @Override // defpackage.dvqu
    public final View a(eg egVar, evzd evzdVar) {
        return this.a.a(egVar, evzdVar.c == 5 ? (ewab) evzdVar.d : ewab.a);
    }

    @Override // defpackage.dvqu
    public final void b(eg egVar, View view, dvdp dvdpVar, evzm evzmVar) {
        if (view == null) {
            this.c.b(dvdpVar, dvqt.FAILED_VIEW_NOT_FOUND);
            return;
        }
        evzd evzdVar = dvdpVar.c().f;
        if (evzdVar == null) {
            evzdVar = evzd.a;
        }
        ewab ewabVar = evzdVar.c == 5 ? (ewab) evzdVar.d : ewab.a;
        try {
            if (dvrn.d(evzmVar, ewabVar.i)) {
                evzmVar = evzm.UNSPECIFIED;
            } else {
                dvrn.c(evzmVar, ewabVar.i);
                if ((ewabVar.b & 16) != 0) {
                    evxi evxiVar = ewabVar.j;
                    if (evxiVar == null) {
                        evxiVar = evxi.a;
                    }
                    dvrn.c(evzmVar, evxiVar.i);
                }
            }
            evzd evzdVar2 = dvdpVar.c().f;
            if (evzdVar2 == null) {
                evzdVar2 = evzd.a;
            }
            if (evzdVar2.f) {
                this.c.b(dvdpVar, dvqt.SUCCESS);
                return;
            }
            this.b.i(dvdpVar);
            dvti dvtiVar = new dvti();
            Bundle bundle = new Bundle();
            bundle.putParcelable("promo_context", dvdpVar);
            bundle.putInt("theme", evzmVar.d);
            dvtiVar.at(bundle);
            cg cgVar = new cg(egVar.a());
            cgVar.u(dvtiVar, "TooltipFragment");
            cgVar.k();
        } catch (dvrm unused) {
            this.c.b(dvdpVar, dvqt.FAILED_THEME_NOT_FOUND);
        }
    }

    @Override // defpackage.dvqu
    public final boolean c(evzc evzcVar) {
        return evzcVar == evzc.UITYPE_GM_TOOLTIP;
    }
}
