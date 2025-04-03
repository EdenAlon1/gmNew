package defpackage;

import java.util.Collections;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekpv {
    public final Random a;

    public ekpv(Random random) {
        this.a = random;
    }

    public static enip a(Set set, cpn cpnVar, ekpt ekptVar) {
        if (!cpnVar.containsKey(ekptVar)) {
            return enpd.a;
        }
        enin eninVar = new enin();
        for (ekpt ekptVar2 : (Set) cpnVar.get(ekptVar)) {
            if (set.contains(ekptVar2)) {
                eninVar.c(ekptVar2);
            } else {
                eninVar.j(a(set, cpnVar, ekptVar2));
            }
        }
        return eninVar.g();
    }

    public static void b(cpn cpnVar, ekpt ekptVar, ekpt ekptVar2) {
        Set set = (Set) cpnVar.get(ekptVar);
        if (set == null) {
            set = Collections.newSetFromMap(new cmh());
            cpnVar.put(ekptVar, set);
        }
        set.add(ekptVar2);
    }
}
