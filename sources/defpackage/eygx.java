package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eygx implements Map.Entry {
    public final Map.Entry a;

    public eygx(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((eygz) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof eyhs)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        eygz eygzVar = (eygz) this.a.getValue();
        eyhs eyhsVar = eygzVar.a;
        eygzVar.b = null;
        eygzVar.a = (eyhs) obj;
        return eyhsVar;
    }
}
