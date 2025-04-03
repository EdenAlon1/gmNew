package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqqe extends dqqj {
    public abstract dqoc b(dqnw dqnwVar, dqnz dqnzVar);

    public abstract Set c();

    @Override // defpackage.dqqj
    public final Set f() {
        int size = c().size();
        ffbz ffbzVar = dqnz.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet(size * dqny.a().size());
        for (dqnw dqnwVar : c()) {
            for (dqnz dqnzVar : dqny.a()) {
                dqnzVar.getClass();
                linkedHashSet.add(b(dqnwVar, dqnzVar));
            }
        }
        return linkedHashSet;
    }
}
