package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enbt extends enbw implements NavigableMap {
    final /* synthetic */ encd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enbt(encd encdVar, NavigableMap navigableMap) {
        super(encdVar, navigableMap);
        this.c = encdVar;
    }

    final Map.Entry c(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection a = this.c.a();
        a.addAll((Collection) entry.getValue());
        it.remove();
        return new engj(entry.getKey(), this.c.e(a));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = h().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return h().ceilingKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.enbw
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final NavigableMap h() {
        return (NavigableMap) super.h();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return ((enbt) descendingMap()).j();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new enbt(this.c, h().descendingMap());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.enbw
    /* renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet i() {
        return new enbu(this.c, h());
    }

    @Override // defpackage.enbw, defpackage.enbp, defpackage.ennb, java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = h().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = h().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return h().floorKey(obj);
    }

    @Override // defpackage.enbw, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = h().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return h().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = h().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = h().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return h().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return j();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return c(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return c(descendingMap().entrySet().iterator());
    }

    @Override // defpackage.enbw, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // defpackage.enbw, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new enbt(this.c, h().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new enbt(this.c, h().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new enbt(this.c, h().tailMap(obj, z));
    }
}
