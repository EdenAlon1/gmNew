package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekbz implements fbba {
    public static Map a(Map map, Map map2, Map map3, Map map4) {
        boolean I;
        map3.getClass();
        map4.getClass();
        enhd enhdVar = new enhd();
        for (Map.Entry entry : ((enhk) map).entrySet()) {
            ekeo ekeoVar = (ekeo) entry.getKey();
            ffbr ffbrVar = (ffbr) entry.getValue();
            String a = ekeoVar.a();
            I = ffpc.I(a, "#", false);
            if (I) {
                throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(String.valueOf(a)));
            }
            String str = (String) map2.get(a);
            if (str != null) {
                a = a.w(str, a, "#");
            }
            enhdVar.k(a, ffbrVar.b());
        }
        enhk c = enhdVar.c();
        Set keySet = map3.keySet();
        enip keySet2 = c.keySet();
        keySet2.getClass();
        if (!keySet.containsAll(keySet2)) {
            throw new IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map3.keySet() + ", params provided: " + c.keySet());
        }
        enip keySet3 = c.keySet();
        keySet3.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet3) {
            if (map4.keySet().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return c;
        }
        arrayList.toString();
        throw new IllegalStateException("Packages cannot use both @PhenotypeApplicationSpecificProperties and @PhenotypeRuntimeProperties. Conflicting packages: ".concat(arrayList.toString()));
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
