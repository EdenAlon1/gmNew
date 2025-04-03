package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lke implements owt {
    @Override // defpackage.owt
    public final void a(owz owzVar) {
        if (!(owzVar instanceof lmy)) {
            Objects.toString(owzVar);
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ".concat(owzVar.toString()));
        }
        lmx S = ((lmy) owzVar).S();
        owv U = owzVar.U();
        Iterator it = S.b().iterator();
        while (it.hasNext()) {
            lml a = S.a((String) it.next());
            if (a != null) {
                lkg.b(a, U, owzVar.P());
            }
        }
        if (S.b().isEmpty()) {
            return;
        }
        U.c(lke.class);
    }
}
