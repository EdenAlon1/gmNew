package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvgu implements dvgo {
    private static final entd a = entd.c("GnpSdk");
    private final Set b;
    private final dvcp c;
    private final dvdy d;

    public dvgu(Set set, dvcp dvcpVar, dvdy dvdyVar) {
        this.b = set;
        this.c = dvcpVar;
        this.d = dvdyVar;
    }

    @Override // defpackage.emva
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        ewag ewagVar = (ewag) obj;
        dvgn dvgnVar = (dvgn) obj2;
        ArrayList arrayList = new ArrayList();
        dvdp a2 = dvgnVar.a();
        if (ewagVar == null) {
            ((ensz) ((ensz) a.i()).h("com/google/android/libraries/internal/growth/growthkit/internal/predicates/impl/CompositeTriggeringConditionsPredicate", "apply", 46, "CompositeTriggeringConditionsPredicate.java")).q("Error evaluating Triggering Conditions.");
        } else {
            boolean z = false;
            for (dvgl dvglVar : this.b) {
                if (!dvglVar.b(ewagVar, dvgnVar)) {
                    arrayList.add(dvglVar.a());
                    this.d.c(a2, "Failed Triggering Condition for [%s]", dvglVar.a().name());
                    z = true;
                }
            }
            this.c.c(a2, arrayList);
            if (!z) {
                return true;
            }
        }
        return false;
    }
}
