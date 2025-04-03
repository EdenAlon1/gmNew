package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ensh {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    protected ensh() {
    }

    protected abstract Object a();

    public final Object b(ensf ensfVar, ents entsVar) {
        Object obj = this.a.get(ensfVar);
        if (obj != null) {
            return obj;
        }
        Object a = a();
        Object putIfAbsent = this.a.putIfAbsent(ensfVar, a);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        int i = ((ensa) entsVar).b;
        ensg ensgVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (enrz.f.equals(entsVar.c(i2))) {
                Object e = entsVar.e(i2);
                if (e instanceof ensl) {
                    if (ensgVar == null) {
                        ensgVar = new ensg(this, ensfVar);
                    }
                    ((ensl) e).a();
                }
            }
        }
        return a;
    }
}
