package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eniz extends enhk implements NavigableMap, Map {
    public static final Comparator a;
    private static final eniz e;
    private static final long serialVersionUID = 0;
    public final transient enpe c;
    public final transient engw d;
    private transient eniz f;

    static {
        enoe enoeVar = enoe.a;
        a = enoeVar;
        enpe G = enjc.G(enoeVar);
        int i = engw.d;
        e = new eniz(G, enou.a);
    }

    public eniz(enpe enpeVar, engw engwVar, eniz enizVar) {
        this.c = enpeVar;
        this.d = engwVar;
        this.f = enizVar;
    }

    private final eniz C(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return w(comparator());
        }
        return new eniz(this.c.K(i, i2), this.d.subList(i, i2));
    }

    public static eniz a(java.util.Map map, Comparator comparator) {
        boolean z = false;
        if (map instanceof SortedMap) {
            Comparator comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                z = comparator.equals(comparator2);
            } else if (comparator == a) {
                z = true;
            }
        }
        if (z && (map instanceof eniz)) {
            eniz enizVar = (eniz) map;
            if (!enizVar.hH()) {
                return enizVar;
            }
        }
        return x(comparator, z, map.entrySet());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    static eniz w(Comparator comparator) {
        if (enoe.a.equals(comparator)) {
            return e;
        }
        enpe G = enjc.G(comparator);
        int i = engw.d;
        return new eniz(G, enou.a);
    }

    public static eniz x(final Comparator comparator, boolean z, Iterable iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) enjk.t(iterable, b);
        int length = entryArr.length;
        if (length == 0) {
            return w(comparator);
        }
        int i = 1;
        if (length == 1) {
            Map.Entry entry = entryArr[0];
            entry.getClass();
            return z(comparator, entry.getKey(), entry.getValue());
        }
        Object[] objArr = new Object[length];
        Object[] objArr2 = new Object[length];
        if (z) {
            for (int i2 = 0; i2 < length; i2++) {
                Map.Entry entry2 = entryArr[i2];
                entry2.getClass();
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                endr.a(key, value);
                objArr[i2] = key;
                objArr2[i2] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new Comparator() { // from class: eniu
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Map.Entry entry3 = (Map.Entry) obj;
                    Map.Entry entry4 = (Map.Entry) obj2;
                    Comparator comparator2 = eniz.a;
                    entry3.getClass();
                    entry4.getClass();
                    return comparator.compare(entry3.getKey(), entry4.getKey());
                }
            });
            Map.Entry entry3 = entryArr[0];
            entry3.getClass();
            Object key2 = entry3.getKey();
            objArr[0] = key2;
            Object value2 = entry3.getValue();
            objArr2[0] = value2;
            endr.a(objArr[0], value2);
            while (i < length) {
                Map.Entry entry4 = entryArr[i - 1];
                entry4.getClass();
                Map.Entry entry5 = entryArr[i];
                entry5.getClass();
                Object key3 = entry5.getKey();
                Object value3 = entry5.getValue();
                endr.a(key3, value3);
                objArr[i] = key3;
                objArr2[i] = value3;
                if (comparator.compare(key2, key3) == 0) {
                    throw new IllegalArgumentException(a.c(entry5, entry4, "Multiple entries with same key: ", " and "));
                }
                i++;
                key2 = key3;
            }
        }
        return new eniz(new enpe(engw.h(objArr), comparator), engw.h(objArr2));
    }

    public static eniz z(Comparator comparator, Object obj, Object obj2) {
        return new eniz(new enpe(engw.r(obj), comparator), engw.r(obj2));
    }

    @Override // java.util.NavigableMap
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final eniz subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        emxf.i(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final eniz tailMap(Object obj, boolean z) {
        obj.getClass();
        return C(this.c.J(obj, z), size());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ennc.e(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((enjc) this.c).a;
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.c.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        eniz enizVar = this.f;
        return enizVar == null ? isEmpty() ? w(enom.d(comparator()).c()) : new eniz((enpe) this.c.descendingSet(), this.d.a(), this) : enizVar;
    }

    @Override // defpackage.enhk
    public final engi e() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.enhk, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // defpackage.enhk
    /* renamed from: f */
    public final engi values() {
        return this.d;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().g().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.c.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ennc.e(floorEntry(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
    
        if (r4 < 0) goto L4;
     */
    @Override // defpackage.enhk, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            enpe r0 = r3.c
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            engw r2 = r0.d     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.a     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r4 = 0
            return r4
        L16:
            engw r0 = r3.d
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eniz.get(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.enhk
    public final enip hE() {
        return isEmpty() ? enpd.a : new eniw(this);
    }

    @Override // defpackage.enhk
    public final enip hF() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.enhk
    public final boolean hH() {
        return this.c.l() || this.d.l();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ennc.e(higherEntry(obj));
    }

    @Override // defpackage.enhk, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().g().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.c.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ennc.e(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // defpackage.enhk
    /* renamed from: t */
    public final /* synthetic */ enip keySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // defpackage.enhk, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.d;
    }

    @Override // defpackage.enhk
    public Object writeReplace() {
        return new eniy(this);
    }

    @Override // java.util.NavigableMap
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final eniz headMap(Object obj, boolean z) {
        obj.getClass();
        return C(0, this.c.I(obj, z));
    }

    public eniz(enpe enpeVar, engw engwVar) {
        this(enpeVar, engwVar, null);
    }
}
