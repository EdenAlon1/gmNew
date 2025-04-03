package j$.util;

import java.util.SortedMap;

/* renamed from: j$.util.w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0187w extends C0184t implements SortedMap {
    private static final long serialVersionUID = -8806743815996713206L;
    private final SortedMap e;

    C0187w(SortedMap sortedMap) {
        super(sortedMap);
        this.e = sortedMap;
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return this.e.comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.e.firstKey();
    }

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return new C0187w(this.e.headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.e.lastKey();
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return new C0187w(this.e.subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return new C0187w(this.e.tailMap(obj));
    }
}
