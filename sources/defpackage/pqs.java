package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pqs {
    public abstract pqb a(String str);

    public abstract pqb b(String str);

    public abstract pqb c(UUID uuid);

    public final pqb d(pqv pqvVar) {
        return e(ffdx.b(pqvVar));
    }

    public abstract pqb e(List list);

    public abstract pqb f(String str, poz pozVar, pqi pqiVar);

    public final pqb g(String str, ppa ppaVar, ppw ppwVar) {
        str.getClass();
        ppaVar.getClass();
        return h(str, ppaVar, ffdx.b(ppwVar));
    }

    public abstract pqb h(String str, ppa ppaVar, List list);

    public abstract pqb i();

    public final pql j(String str, ppa ppaVar, ppw ppwVar) {
        ppaVar.getClass();
        return k(str, ppaVar, ffdx.b(ppwVar));
    }

    public abstract pql k(String str, ppa ppaVar, List list);

    public abstract ListenableFuture l(pqt pqtVar);
}
