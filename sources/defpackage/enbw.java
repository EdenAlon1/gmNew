package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
class enbw extends enbp implements SortedMap {
    SortedSet d;
    final /* synthetic */ encd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enbw(encd encdVar, SortedMap sortedMap) {
        super(encdVar, sortedMap);
        this.e = encdVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return h().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return h().firstKey();
    }

    public SortedMap h() {
        return (SortedMap) this.a;
    }

    public SortedMap headMap(Object obj) {
        return new enbw(this.e, h().headMap(obj));
    }

    @Override // defpackage.ennb
    public SortedSet i() {
        return new enbx(this.e, h());
    }

    @Override // defpackage.enbp, defpackage.ennb, java.util.AbstractMap, java.util.Map
    /* renamed from: j */
    public SortedSet keySet() {
        SortedSet sortedSet = this.d;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet i = i();
        this.d = i;
        return i;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return h().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new enbw(this.e, h().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new enbw(this.e, h().tailMap(obj));
    }
}
