package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class psf implements pse {
    private final Map a = new LinkedHashMap();

    @Override // defpackage.pse
    public final psb a(pxs pxsVar) {
        return (psb) this.a.remove(pxsVar);
    }

    @Override // defpackage.pse
    public final psb b(pxs pxsVar) {
        Map map = this.a;
        Object obj = map.get(pxsVar);
        if (obj == null) {
            obj = new psb(pxsVar);
            map.put(pxsVar, obj);
        }
        return (psb) obj;
    }

    @Override // defpackage.pse
    public final /* synthetic */ psb c(pyj pyjVar) {
        return psc.a(this, pyjVar);
    }

    @Override // defpackage.pse
    public final List d(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            if (ffkj.e(((pxs) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.a.remove((pxs) it.next());
        }
        return ffdx.ak(linkedHashMap.values());
    }

    @Override // defpackage.pse
    public final boolean e(pxs pxsVar) {
        return this.a.containsKey(pxsVar);
    }
}
