package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyom {
    private final Map a;
    private final Map b;

    public dyom() {
        enks enksVar = new enks();
        enksVar.f(enlh.WEAK);
        this.a = enksVar.e();
        this.b = new HashMap();
    }

    public final synchronized dzwu a(dzpt dzptVar) {
        Collection collection;
        if (this.a.containsKey(dzptVar)) {
            return (dzwu) this.a.get(dzptVar);
        }
        if (this.b.containsKey(dzptVar)) {
            collection = ((Map) this.b.get(dzptVar)).values();
        } else {
            int i = engw.d;
            collection = enou.a;
        }
        dzxa dzxaVar = new dzxa(engw.n(collection));
        this.a.put(dzptVar, dzxaVar);
        return dzxaVar;
    }

    public final synchronized void b(dzpt dzptVar, String str) {
        if (this.b.containsKey(dzptVar)) {
            ((Map) this.b.get(dzptVar)).remove(str);
            if (this.a.containsKey(dzptVar)) {
                ((dzxa) this.a.get(dzptVar)).c(engw.n(((Map) this.b.get(dzptVar)).values()));
            }
            if (((Map) this.b.get(dzptVar)).isEmpty()) {
                this.b.remove(dzptVar);
            }
        }
    }

    public final synchronized void c(dzpt dzptVar) {
        if (this.b.containsKey(dzptVar)) {
            this.b.remove(dzptVar);
            if (this.a.containsKey(dzptVar)) {
                dzxa dzxaVar = (dzxa) this.a.get(dzptVar);
                int i = engw.d;
                dzxaVar.c(enou.a);
            }
        }
    }
}
