package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eygq extends AbstractMap {
    public final eygm a;
    private final Map b;

    public eygq(Map map, eygm eygmVar) {
        this.b = map;
        this.a = eygmVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new eygp(this, this.b.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2 = this.b.get(obj);
        if (obj2 == null) {
            return null;
        }
        return this.a.a(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object valueOf;
        valueOf = Integer.valueOf(((eyge) obj2).a());
        Object put = this.b.put(obj, valueOf);
        if (put == null) {
            return null;
        }
        return this.a.a(put);
    }
}
