package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hoj extends ffdj implements Map, hno {
    public hpl a = new hpl();
    public hoy b;
    public Object c;
    public int d;
    public int e;
    private hoh f;

    public hoj(hoh hohVar) {
        this.f = hohVar;
        hoh hohVar2 = this.f;
        this.b = hohVar2.b;
        this.e = hohVar2.c();
    }

    @Override // defpackage.ffdj
    public final int b() {
        return this.e;
    }

    @Override // defpackage.hno
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public hoh a() {
        hoy hoyVar = this.b;
        hoh hohVar = this.f;
        if (hoyVar != hohVar.b) {
            this.a = new hpl();
            hohVar = new hoh(hoyVar, b());
        }
        this.f = hohVar;
        return hohVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = hoy.a;
        g(0);
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

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.b.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.ffdj
    public final Collection d() {
        return new hop(this);
    }

    @Override // defpackage.ffdj
    public final Set e() {
        return new hol(this);
    }

    @Override // defpackage.ffdj
    public final Set f() {
        return new hon(this);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final void g(int i) {
        this.e = i;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.b.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.c = null;
        this.b = this.b.e(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        hoh hohVar = map instanceof hoh ? (hoh) map : null;
        if (hohVar == null) {
            hoj hojVar = map instanceof hoj ? (hoj) map : null;
            hohVar = hojVar != null ? hojVar.a() : null;
        }
        if (hohVar == null) {
            super.putAll(map);
            return;
        }
        hpi hpiVar = new hpi(null);
        int b = b();
        hoy hoyVar = this.b;
        hoy hoyVar2 = hohVar.b;
        hoyVar2.getClass();
        this.b = hoyVar.f(hoyVar2, 0, hpiVar, this);
        int c = (hohVar.c() + b) - hpiVar.a;
        if (b != c) {
            g(c);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.c = null;
        hoy g = this.b.g(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (g == null) {
            g = hoy.a;
        }
        this.b = g;
        return this.c;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int b = b();
        hoy h = this.b.h(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (h == null) {
            h = hoy.a;
        }
        this.b = h;
        return b != b();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
