package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eygn implements Map.Entry {
    final /* synthetic */ eygq a;
    private final Map.Entry b;

    public eygn(eygq eygqVar, Map.Entry entry) {
        this.a = eygqVar;
        this.b = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.a.a(this.b.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object valueOf;
        Map.Entry entry = this.b;
        valueOf = Integer.valueOf(((eyge) obj).a());
        Object value = entry.setValue(valueOf);
        if (value == null) {
            return null;
        }
        return this.a.a.a(value);
    }
}
