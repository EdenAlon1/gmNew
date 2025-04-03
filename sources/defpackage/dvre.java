package defpackage;

import android.view.View;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvre implements dvqn {
    private static final entd a = entd.c("GnpSdk");
    private final Set b;
    private final dvqr c;

    public dvre(Set set, dvqr dvqrVar) {
        this.b = set;
        this.c = dvqrVar;
    }

    private final dvqu d(evzc evzcVar) {
        for (dvqu dvquVar : this.b) {
            if (dvquVar.c(evzcVar)) {
                return dvquVar;
            }
        }
        return null;
    }

    @Override // defpackage.dvqn
    public final View a(eg egVar, evzd evzdVar) {
        evzc b = evzc.b(evzdVar.e);
        if (b == null) {
            b = evzc.UITYPE_NONE;
        }
        dvqu d = d(b);
        if (d != null) {
            return d.a(egVar, evzdVar);
        }
        ((ensz) a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/PromoUiRendererImpl", "findView", 51, "PromoUiRendererImpl.java")).t("Could not find View for unsupported PromoUi: %s", evzdVar);
        return null;
    }

    @Override // defpackage.dvqn
    public final void b(eg egVar, View view, dvdp dvdpVar, evzm evzmVar) {
        evzd evzdVar = dvdpVar.c().f;
        if (evzdVar == null) {
            evzdVar = evzd.a;
        }
        evzc b = evzc.b(evzdVar.e);
        if (b == null) {
            b = evzc.UITYPE_NONE;
        }
        dvqu d = d(b);
        if (d != null) {
            try {
                d.b(egVar, view, dvdpVar, evzmVar);
                return;
            } catch (RuntimeException e) {
                ((ensz) ((ensz) ((ensz) a.i()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/PromoUiRendererImpl", "render", 'C', "PromoUiRendererImpl.java")).q("Failed rendering promotion.");
                this.c.b(dvdpVar, dvqt.FAILED_UNKNOWN);
                return;
            }
        }
        ensz enszVar = (ensz) a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/PromoUiRendererImpl", "render", 75, "PromoUiRendererImpl.java");
        evzd evzdVar2 = dvdpVar.c().f;
        if (evzdVar2 == null) {
            evzdVar2 = evzd.a;
        }
        enszVar.t("Could not render unsupported PromoUi: %s", evzdVar2);
        this.c.b(dvdpVar, dvqt.FAILED_UNSUPPORTED_UI);
    }

    @Override // defpackage.dvqn
    public final boolean c(evzc evzcVar) {
        return d(evzcVar) != null;
    }
}
