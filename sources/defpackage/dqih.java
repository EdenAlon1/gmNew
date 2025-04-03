package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqih {
    private final Map a;

    public dqih(Map map) {
        this.a = map;
    }

    public final boolean a(wr wrVar, int i, List list) {
        if (true == list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        for (Object obj : list) {
            if (true != (obj instanceof Object)) {
                obj = null;
            }
            if (obj != null) {
                Map map = this.a;
                int i2 = fflc.a;
                Object obj2 = map.get(new ffkb(obj.getClass()));
                dqig dqigVar = obj2 instanceof dqig ? (dqig) obj2 : null;
                if (dqigVar != null && dqigVar.a(wrVar, i, obj)) {
                }
            }
            return false;
        }
        return true;
    }
}
