package defpackage;

import j$.util.Set;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hor<K, V> extends ffdl<Map.Entry<? extends K, ? extends V>> implements Set<Map.Entry<? extends K, ? extends V>>, hnl {
    private final hoh a;

    public hor(hoh hohVar) {
        this.a = hohVar;
    }

    @Override // defpackage.ffcy
    public final int a() {
        return this.a.c();
    }

    @Override // defpackage.ffcy, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        Object obj2 = this.a.get(entry.getKey());
        return obj2 != null ? ffkj.e(obj2, entry.getValue()) : entry.getValue() == null && this.a.containsKey(entry.getKey());
    }

    @Override // defpackage.ffdl, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new hos(this.a.b);
    }
}
