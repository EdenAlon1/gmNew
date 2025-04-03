package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hog extends hof implements Map.Entry, fflj {
    private final hom b;
    private Object c;

    public hog(hom homVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.b = homVar;
        this.c = obj2;
    }

    @Override // defpackage.hof, java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // defpackage.hof, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.c;
        this.c = obj;
        hok hokVar = this.b.a;
        hoj hojVar = hokVar.d;
        Object obj3 = this.a;
        if (!hojVar.containsKey(obj3)) {
            return obj2;
        }
        if (hokVar.c) {
            Object a = hokVar.a();
            hokVar.d.put(obj3, obj);
            hokVar.b(a != null ? a.hashCode() : 0, hokVar.d.b, a, 0);
        } else {
            hokVar.d.put(obj3, obj);
        }
        hokVar.e = hokVar.d.d;
        return obj2;
    }
}
