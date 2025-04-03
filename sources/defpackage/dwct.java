package defpackage;

import android.R;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwct {
    public static View a(dn dnVar, boolean z) {
        for (ea eaVar = dnVar.E; eaVar != null; eaVar = eaVar.E) {
            View view = eaVar.Q;
            if (view != null && (!z || dvxv.c(view) != null)) {
                return view;
            }
        }
        return dvxv.a(dnVar.G());
    }

    public static View b(dn dnVar) {
        d(dnVar);
        return dnVar.d.getWindow().findViewById(R.id.content);
    }

    public static void c(dn dnVar) {
        dvxe c = dvxv.c(b(dnVar));
        c.getClass();
        dvxe c2 = dvxv.c(a(dnVar, false));
        emxf.m(c2 != null, "Parent fragment/activity must be instrumented");
        dwcm.a(c, c2);
    }

    static void d(dn dnVar) {
        emxf.b(dnVar.d != null, "Wrap OnShowListener with SyntheticDialogs#whileDialogExists");
    }
}
