package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enbe implements Map.Entry {
    final Object a;
    Object b;
    final /* synthetic */ enbf c;

    public enbe(enbf enbfVar, Object obj, Object obj2) {
        this.c = enbfVar;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.a.equals(entry.getKey()) && this.b.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
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
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object put = this.c.put(this.a, obj);
        this.b = obj;
        return put;
    }

    public final String toString() {
        return String.valueOf(this.a) + "=" + String.valueOf(this.b);
    }
}
