package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnr implements Map.Entry, fflg {
    private final Object a;
    private final Object b;

    public cnr(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
