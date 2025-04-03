package defpackage;

import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edde {
    private final LinkedHashMap a = new eddd();

    public final synchronized Object a(Object obj) {
        return this.a.get(obj);
    }

    public final synchronized void b(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }
}
