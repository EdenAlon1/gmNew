package defpackage;

import android.app.Activity;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unf {
    public static final dcle a;
    public final /* synthetic */ uns b;

    static {
        eptq eptqVar = (eptq) eptv.a.createBuilder();
        eptqVar.getClass();
        eqni.b(epts.FILE, eptqVar);
        eqni.c(eptu.EXPANDED, eptqVar);
        eptv a2 = eqni.a(eptqVar);
        dcle dcleVar = dcle.a;
        int i = dclf.b;
        a = new dclg(a2);
    }

    public unf(Activity activity, unt untVar, ffhd ffhdVar, alcb alcbVar, bdvi bdviVar, csum csumVar, ffix ffixVar, Supplier supplier) {
        this.b = untVar.a(epts.FILE, new adw(), new ffix() { // from class: umz
            @Override // defpackage.ffix
            public final Object invoke() {
                dcle dcleVar = unf.a;
                return "*/*";
            }
        }, new une(activity, ffixVar, ffhdVar, alcbVar, bdviVar, supplier, csumVar));
    }
}
