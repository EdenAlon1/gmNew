package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmc {
    public static final lnw a = new llz();
    public static final lnw b = new lma();
    public static final lnw c = new lmb();

    public static final llv a(lnx lnxVar) {
        owz owzVar = (owz) lnxVar.a(a);
        if (owzVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        lmy lmyVar = (lmy) lnxVar.a(b);
        if (lmyVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) lnxVar.a(c);
        String str = (String) lnxVar.a(lmw.a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        owu e = owzVar.U().e();
        Bundle bundle2 = null;
        lme lmeVar = e instanceof lme ? (lme) e : null;
        if (lmeVar == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        lmf b2 = b(lmyVar);
        llv llvVar = (llv) b2.a.get(str);
        if (llvVar != null) {
            return llvVar;
        }
        lmeVar.b();
        Bundle bundle3 = lmeVar.a;
        if (bundle3 != null && bundle3.containsKey(str)) {
            if (!bundle3.containsKey(str)) {
                kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
            }
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                lmeVar.a = null;
            }
            bundle2 = bundle4;
        }
        llv a2 = llt.a(bundle2, bundle);
        b2.a.put(str, a2);
        return a2;
    }

    public static final lmf b(lmy lmyVar) {
        loc locVar = lmq.b(lmyVar, new lly(), 4).b;
        int i = fflc.a;
        return (lmf) locVar.a(new ffkb(lmf.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void c(owz owzVar) {
        lkj a2 = owzVar.P().a();
        if (a2 != lkj.INITIALIZED && a2 != lkj.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (owzVar.U().e() == null) {
            lme lmeVar = new lme(owzVar.U(), (lmy) owzVar);
            owzVar.U().b("androidx.lifecycle.internal.SavedStateHandlesProvider", lmeVar);
            owzVar.P().c(new llw(lmeVar));
        }
    }
}
