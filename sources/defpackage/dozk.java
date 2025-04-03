package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dozk implements fbba {
    public static Map a(Map map) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(((enoz) map).d));
        for (Map.Entry entry : ((enhk) map).entrySet()) {
            dozn doznVar = (dozn) entry.getKey();
            int i = drlw.b;
            Iterator it = drlt.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (ffkj.e(((drlw) obj).b(), doznVar.a())) {
                    break;
                }
            }
            Object obj2 = (drlw) obj;
            if (obj2 == null) {
                obj2 = new drlq(doznVar.a());
            }
            linkedHashMap.put(obj2, entry.getValue());
        }
        return linkedHashMap;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
