package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekpx {
    public static Map a(Set set) {
        cmh cmhVar = new cmh();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = (AbstractMap.SimpleImmutableEntry) it.next();
            Set set2 = (Set) cmhVar.get(simpleImmutableEntry.getKey());
            if (set2 == null) {
                set2 = Collections.newSetFromMap(new cmh());
                cmhVar.put((ekpt) simpleImmutableEntry.getKey(), set2);
            }
            set2.add((ffbr) simpleImmutableEntry.getValue());
        }
        return cmhVar;
    }
}
