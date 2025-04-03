package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eddo implements eddq {
    public final eddn a;
    private final ConcurrentMap b = new ConcurrentHashMap();

    private eddo(eddn eddnVar) {
        this.a = eddnVar;
    }

    public static eddo c() {
        return new eddo(new eddm());
    }

    public static eddo d() {
        return new eddo(new eddl());
    }

    @Override // defpackage.eddq
    public final void a(edcx edcxVar) {
        this.b.put(this.a.a(edcxVar), edcxVar);
    }

    public final edcx b(Object obj) {
        if (obj != null) {
            return (edcx) this.b.get(obj);
        }
        return null;
    }
}
