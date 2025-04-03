package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekby implements fbba {
    public static Map a(Map map, Map map2, Map map3, Map map4, Map map5) {
        map4.getClass();
        map5.getClass();
        enhd enhdVar = new enhd();
        for (Map.Entry entry : ((enhk) map).entrySet()) {
            ekeo ekeoVar = (ekeo) entry.getKey();
            final ffbr ffbrVar = (ffbr) entry.getValue();
            enhdVar.k(ekbx.a(map3, ekeoVar), new erog() { // from class: ekbt
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return erqt.i(ffbr.this.b());
                }
            });
        }
        for (Map.Entry entry2 : ((enhk) map2).entrySet()) {
            ekeo ekeoVar2 = (ekeo) entry2.getKey();
            final ffbr ffbrVar2 = (ffbr) entry2.getValue();
            enhdVar.k(ekbx.a(map3, ekeoVar2), new erog() { // from class: ekbu
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return ((erog) ffbr.this.b()).a();
                }
            });
        }
        enhk c = enhdVar.c();
        Set keySet = map4.keySet();
        enip keySet2 = c.keySet();
        keySet2.getClass();
        if (!keySet.containsAll(keySet2)) {
            throw new IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map4.keySet() + ", params provided: " + c.keySet());
        }
        enip keySet3 = c.keySet();
        keySet3.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet3) {
            if (map5.keySet().contains((String) obj)) {
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
