package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnz {
    public static final lms a(Map map) {
        Collection values = map.values();
        values.getClass();
        lob[] lobVarArr = (lob[]) values.toArray(new lob[0]);
        return new lny((lob[]) Arrays.copyOf(lobVarArr, lobVarArr.length));
    }

    public static final void b(ffmo ffmoVar, ffji ffjiVar, Map map) {
        if (!map.containsKey(ffmoVar)) {
            map.put(ffmoVar, new lob(ffmoVar, ffjiVar));
            return;
        }
        throw new IllegalArgumentException("A `initializer` with the same `clazz` has already been added: " + lom.a(ffmoVar) + '.');
    }
}
