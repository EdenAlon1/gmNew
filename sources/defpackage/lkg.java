package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lkg {
    public static final llx a(owv owvVar, lkk lkkVar, String str, Bundle bundle) {
        llx llxVar = new llx(str, llt.a(owvVar.a(str), bundle));
        llxVar.b(owvVar, lkkVar);
        c(owvVar, lkkVar);
        return llxVar;
    }

    public static final void b(lml lmlVar, owv owvVar, lkk lkkVar) {
        lkkVar.getClass();
        llx llxVar = (llx) lmlVar.fz("androidx.lifecycle.savedstate.vm.tag");
        if (llxVar == null || llxVar.b) {
            return;
        }
        llxVar.b(owvVar, lkkVar);
        c(owvVar, lkkVar);
    }

    private static final void c(owv owvVar, lkk lkkVar) {
        lkj a = lkkVar.a();
        if (a == lkj.INITIALIZED || a.a(lkj.STARTED)) {
            owvVar.c(lke.class);
        } else {
            lkkVar.c(new lkf(lkkVar, owvVar));
        }
    }
}
