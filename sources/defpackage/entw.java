package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class entw extends entz {
    private final Map a;
    private final Map b;
    private final enty c;
    private final entx d;

    public entw(entv entvVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.putAll(entvVar.c);
        hashMap2.putAll(entvVar.d);
        this.c = entvVar.e;
        this.d = entvVar.f;
    }

    @Override // defpackage.entz
    protected final void a(ensn ensnVar, Object obj, Object obj2) {
        enty entyVar = (enty) this.a.get(ensnVar);
        if (entyVar != null) {
            entyVar.a(ensnVar, obj, obj2);
        } else {
            this.c.a(ensnVar, obj, obj2);
        }
    }

    @Override // defpackage.entz
    protected final void b(ensn ensnVar, Iterator it, Object obj) {
        entx entxVar = (entx) this.b.get(ensnVar);
        if (entxVar != null) {
            entxVar.a(ensnVar, it, obj);
        } else if (this.d != null && !this.a.containsKey(ensnVar)) {
            this.d.a(ensnVar, it, obj);
        } else {
            while (it.hasNext()) {
                a(ensnVar, it.next(), obj);
            }
        }
    }
}
