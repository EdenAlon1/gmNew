package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvsq implements dvqu {
    private final dvsu a;
    private final dvcp b;
    private final dvqr c;

    public dvsq(dvsu dvsuVar, dvqr dvqrVar, dvcp dvcpVar) {
        this.a = dvsuVar;
        this.c = dvqrVar;
        this.b = dvcpVar;
    }

    @Override // defpackage.dvqu
    public final View a(eg egVar, evzd evzdVar) {
        return this.a.a(evzdVar.c == 3 ? (evzr) evzdVar.d : evzr.a).a(egVar, null);
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
        evzr evzrVar = evzdVar.c == 3 ? (evzr) evzdVar.d : evzr.a;
        try {
            if (dvrn.d(evzmVar, evzrVar.l)) {
                evzmVar = evzm.UNSPECIFIED;
            } else {
                dvrn.c(evzmVar, evzrVar.l);
                dvrn.c(evzmVar, evzrVar.m);
                if ((evzrVar.b & 1024) != 0) {
                    evxi evxiVar = evzrVar.p;
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
            }
            this.b.i(dvdpVar);
            dvsp dvspVar = new dvsp();
            Bundle bundle = new Bundle();
            bundle.putParcelable("promo_context", dvdpVar);
            bundle.putInt("theme", evzmVar.d);
            dvspVar.at(bundle);
            cg cgVar = new cg(egVar.a());
            cgVar.u(dvspVar, "FeatureHighlightFragment");
            cgVar.k();
        } catch (dvrm unused) {
            this.c.b(dvdpVar, dvqt.FAILED_THEME_NOT_FOUND);
        }
    }

    @Override // defpackage.dvqu
    public final boolean c(evzc evzcVar) {
        return evzcVar == evzc.UITYPE_GM_TAP_TARGET;
    }
}
