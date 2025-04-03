package defpackage;

import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evra {
    private final LinkedHashMap a = new evqz();

    public final synchronized Object a(Object obj) {
        return this.a.get(obj);
    }

    public final synchronized void b(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }
}
