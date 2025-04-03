package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enfk extends enfm implements Map.Entry {
    protected enfk() {
    }

    protected abstract Map.Entry b();

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        return b().equals(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return b().getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return b().getValue();
    }

    @Override // defpackage.enfm
    protected /* bridge */ /* synthetic */ Object hC() {
        throw null;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return b().hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        return b().setValue(obj);
    }
}
