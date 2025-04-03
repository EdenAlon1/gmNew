package defpackage;

import android.view.ViewGroup;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpnp implements dpnl {
    private final dpnq a;
    private final Optional b;
    private final dpyf c;

    public dpnp(dpnq dpnqVar, Optional optional, dpyf dpyfVar) {
        this.a = dpnqVar;
        this.b = optional;
        this.c = dpyfVar;
    }

    @Override // defpackage.dpnl
    public final dpnn a(ViewGroup viewGroup, dpnj dpnjVar, ffji ffjiVar) {
        dpnl dpnlVar;
        dpni dpniVar = dpnjVar.a;
        if ((dpniVar instanceof dpnf) || (dpniVar instanceof dpng)) {
            Object orElseThrow = this.b.orElseThrow(new Supplier() { // from class: dpno
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new UnsupportedOperationException("Include :module_with_in_app_camera to use mini camera.");
                }
            });
            orElseThrow.getClass();
            dpnlVar = (dpnl) orElseThrow;
        } else {
            dpnlVar = dpniVar instanceof dpnh ? this.c : this.a;
        }
        return dpnlVar.a(viewGroup, dpnjVar, ffjiVar);
    }
}
