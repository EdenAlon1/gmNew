package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eevu implements eevr {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    @Override // defpackage.eevr
    public final Object a(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        this.a.putIfAbsent(obj, new Object());
        return this.a.get(obj);
    }
}
