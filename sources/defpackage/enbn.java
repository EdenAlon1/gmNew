package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enbn extends enmt {
    final /* synthetic */ enbp a;

    public enbn(enbp enbpVar) {
        this.a = enbpVar;
    }

    @Override // defpackage.enmt
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.enmt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return endu.b(this.a.a.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new enbo(this.a);
    }

    @Override // defpackage.enmt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        enbp enbpVar = this.a;
        Object key = entry.getKey();
        encd encdVar = enbpVar.b;
        Map map = encdVar.a;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        encdVar.b -= size;
        return true;
    }
}
