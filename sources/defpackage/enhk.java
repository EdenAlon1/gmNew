package defpackage;

import j$.util.Map;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enhk<K, V> implements Map<K, V>, Serializable, j$.util.Map<K, V> {
    static final Map.Entry[] b = new Map.Entry[0];
    private static final long serialVersionUID = 912559;
    private transient enip a;
    private transient enip c;
    private transient engi d;
    private transient enit e;

    public static enhd h(int i) {
        endr.c(i, "expectedSize");
        return new enhd(i);
    }

    public static enhk i(Iterable iterable) {
        enhd enhdVar = new enhd(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        enhdVar.l(iterable);
        return enhdVar.c();
    }

    public static enhk j(Map map) {
        if ((map instanceof enhk) && !(map instanceof SortedMap)) {
            enhk enhkVar = (enhk) map;
            if (!enhkVar.hH()) {
                return enhkVar;
            }
        }
        return i(map.entrySet());
    }

    public static enhk k() {
        return enoz.a;
    }

    public static enhk l(Object obj, Object obj2) {
        endr.a(obj, obj2);
        return enoz.a(1, new Object[]{obj, obj2});
    }

    public static enhk m(Object obj, Object obj2, Object obj3, Object obj4) {
        endr.a(obj, obj2);
        endr.a(obj3, obj4);
        return enoz.a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static enhk n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        endr.a(obj, obj2);
        endr.a(obj3, obj4);
        endr.a(obj5, obj6);
        return enoz.a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    public static enhk o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        endr.a(obj, obj2);
        endr.a(obj3, obj4);
        endr.a(obj5, obj6);
        endr.a(obj7, obj8);
        return enoz.a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static enhk p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        endr.a(obj, obj2);
        endr.a(obj3, obj4);
        endr.a(obj5, obj6);
        endr.a(obj7, obj8);
        endr.a(obj9, obj10);
        return enoz.a(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static enhk q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        endr.a(obj, obj2);
        endr.a(obj3, obj4);
        endr.a(obj5, obj6);
        endr.a(obj7, obj8);
        endr.a(obj9, obj10);
        endr.a(obj11, obj12);
        return enoz.a(6, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12});
    }

    public static enhk r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        endr.a(obj, obj2);
        endr.a(obj3, obj4);
        endr.a(obj5, obj6);
        endr.a(obj7, obj8);
        endr.a(obj9, obj10);
        endr.a(obj11, obj12);
        endr.a(obj13, obj14);
        endr.a(obj15, obj16);
        return enoz.a(8, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16});
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static Collector v() {
        return endq.a(new Function() { // from class: engz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getKey();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: enha
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getValue();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract engi e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return ennc.m(this, obj);
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public engi values() {
        engi engiVar = this.d;
        if (engiVar != null) {
            return engiVar;
        }
        engi e = e();
        this.d = e;
        return e;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public abstract enip hE();

    public abstract enip hF();

    public enqu hG() {
        return new enhb(entrySet().listIterator());
    }

    public abstract boolean hH();

    @Override // java.util.Map
    public int hashCode() {
        return enpw.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final enip entrySet() {
        enip enipVar = this.a;
        if (enipVar != null) {
            return enipVar;
        }
        enip hE = hE();
        this.a = hE;
        return hE;
    }

    @Override // java.util.Map
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public enip keySet() {
        enip enipVar = this.c;
        if (enipVar != null) {
            return enipVar;
        }
        enip hF = hF();
        this.c = hF;
        return hF;
    }

    public final String toString() {
        return ennc.g(this);
    }

    public final enit u() {
        if (isEmpty()) {
            return eneu.a;
        }
        enit enitVar = this.e;
        if (enitVar != null) {
            return enitVar;
        }
        enit enitVar2 = new enit(new enhi(this), size());
        this.e = enitVar2;
        return enitVar2;
    }

    public Object writeReplace() {
        return new enhj(this);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
