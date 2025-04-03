package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enih {
    public static final enij a(List list) {
        enop enopVar = enop.a;
        Collections.sort(list, new encx(enms.KEY, enoo.a));
        engr engrVar = new engr(list.size());
        engr engrVar2 = new engr(list.size());
        for (int i = 0; i < list.size(); i++) {
            enop enopVar2 = (enop) ((Map.Entry) list.get(i)).getKey();
            if (i > 0) {
                enop enopVar3 = (enop) ((Map.Entry) list.get(i - 1)).getKey();
                if (enopVar2.g(enopVar3) && !enopVar2.e(enopVar3).h()) {
                    throw new IllegalArgumentException(a.E(enopVar2, enopVar3, "Overlapping ranges: range ", " overlaps with entry "));
                }
            }
            engrVar.h(enopVar2);
            engrVar2.h(((Map.Entry) list.get(i)).getValue());
        }
        return new enij(engrVar.g(), engrVar2.g());
    }

    public static final void b(enop enopVar, Object obj, List list) {
        enopVar.getClass();
        obj.getClass();
        emxf.f(!enopVar.h(), "Range must not be empty, but was %s", enopVar);
        list.add(new engj(enopVar, obj));
    }
}
