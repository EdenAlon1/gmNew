package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvsa implements dvqu {
    private final dvcp a;
    private final dvqr b;

    public dvsa(dvqr dvqrVar, dvcp dvcpVar) {
        this.b = dvqrVar;
        this.a = dvcpVar;
    }

    @Override // defpackage.dvqu
    public final View a(eg egVar, evzd evzdVar) {
        return null;
    }

    @Override // defpackage.dvqu
    public final void b(eg egVar, View view, dvdp dvdpVar, evzm evzmVar) {
        evzd evzdVar = dvdpVar.c().f;
        if (evzdVar == null) {
            evzdVar = evzd.a;
        }
        try {
            evzm b = dvrn.b(evzmVar, evzdVar.c == 2 ? (evxu) evzdVar.d : evxu.a);
            evzd evzdVar2 = dvdpVar.c().f;
            if (evzdVar2 == null) {
                evzdVar2 = evzd.a;
            }
            if (evzdVar2.f) {
                this.b.b(dvdpVar, dvqt.SUCCESS);
            } else {
                this.a.i(dvdpVar);
                dvsj.aT(dvdpVar, b).s(egVar.a(), "PromoUiDialogFragment");
            }
        } catch (dvrm unused) {
            this.b.b(dvdpVar, dvqt.FAILED_THEME_NOT_FOUND);
        }
    }

    @Override // defpackage.dvqu
    public final boolean c(evzc evzcVar) {
        return evzcVar == evzc.UITYPE_GM_DIALOG;
    }
}
