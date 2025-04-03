package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hth implements Map.Entry, fflj {
    final /* synthetic */ hti a;
    private final Object b;
    private Object c;

    public hth(hti htiVar) {
        this.a = htiVar;
        Map.Entry entry = htiVar.c;
        entry.getClass();
        this.b = entry.getKey();
        Map.Entry entry2 = htiVar.c;
        entry2.getClass();
        this.c = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        hti htiVar = this.a;
        if (htiVar.a.a() != htiVar.b) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.c;
        htiVar.a.put(this.b, obj);
        this.c = obj;
        return obj2;
    }
}
