package defpackage;

import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hoe<E extends Map.Entry<? extends K, ? extends V>, K, V> extends ffdk<E> {
    public abstract boolean a(Map.Entry entry);

    public abstract boolean b(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if ((true != (entry instanceof Object) ? null : entry) instanceof Map.Entry) {
            return a(entry);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if ((true != (entry instanceof Object) ? null : entry) instanceof Map.Entry) {
            return b(entry);
        }
        return false;
    }
}
