package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evrp implements evrr {
    public final evro a;
    private final ConcurrentMap b = new ConcurrentHashMap();

    private evrp(evro evroVar) {
        this.a = evroVar;
    }

    public static evrp c() {
        return new evrp(new evrn());
    }

    static evrp d() {
        return new evrp(new evrm());
    }

    @Override // defpackage.evrr
    public final void a(evqo evqoVar) {
        this.b.put(this.a.a(evqoVar), evqoVar);
    }

    public final evqo b(Object obj) {
        if (obj != null) {
            return (evqo) this.b.get(obj);
        }
        return null;
    }
}
