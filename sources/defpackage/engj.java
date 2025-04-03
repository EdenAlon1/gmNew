package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class engj extends enci implements Serializable {
    private static final long serialVersionUID = 0;
    final Object a;
    final Object b;

    public engj(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // defpackage.enci, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
