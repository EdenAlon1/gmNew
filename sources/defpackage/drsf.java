package defpackage;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drsf {
    public static final Map a(List list) {
        Parcelable drsnVar;
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            edew edewVar = ((edfq) obj).b;
            if (edewVar == null) {
                edewVar = edew.a;
            }
            String str = edewVar.c;
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(str, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffew.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            if (((List) entry.getValue()).size() != 1) {
                Object key2 = entry.getKey();
                Objects.toString(key2);
                throw new IllegalStateException("Illegal duplicated upload state for ".concat(String.valueOf(key2)));
            }
            edfq edfqVar = (edfq) ffdx.K((List) entry.getValue());
            int i = edfqVar.c;
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
            if (i2 == 0) {
                i2 = 1;
            }
            int i3 = i2 - 2;
            if (i3 == 1) {
                drsnVar = new drsn(edfqVar.d);
            } else if (i3 == 2) {
                drsnVar = new drsl(edfqVar.d);
            } else if (i3 == 3) {
                drsnVar = new drsh(edfqVar.d);
            } else {
                if (i3 != 4) {
                    Objects.toString(edfqVar);
                    throw new IllegalStateException("Unhandled proto ".concat(String.valueOf(edfqVar)));
                }
                edfb b = edfb.b(edfqVar.e);
                if (b == null) {
                    b = edfb.UNRECOGNIZED;
                }
                b.getClass();
                drsnVar = new drsj(b);
            }
            linkedHashMap2.put(key, drsnVar);
        }
        return linkedHashMap2;
    }
}
