package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoce {
    public final Map a;
    public volatile transient Map.Entry b;

    public eoce(Map map) {
        this.a = map;
    }

    public final Object a(Object obj) {
        obj.getClass();
        Object b = b(obj);
        return b == null ? this.a.get(obj) : b;
    }

    public final Object b(Object obj) {
        Map.Entry entry = this.b;
        if (entry == null || entry.getKey() != obj) {
            return null;
        }
        return entry.getValue();
    }
}
