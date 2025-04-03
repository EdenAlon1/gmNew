package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqqg extends dqqj {
    public abstract dqob b(dqnw dqnwVar);

    public abstract Set c();

    @Override // defpackage.dqqj
    public final Set f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(c().size());
        Iterator it = c().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(b((dqnw) it.next()));
        }
        return linkedHashSet;
    }
}
