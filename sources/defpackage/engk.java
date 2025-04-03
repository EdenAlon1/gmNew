package defpackage;

import java.io.Serializable;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class engk implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumMap a;

    public engk(EnumMap enumMap) {
        this.a = enumMap;
    }

    Object readResolve() {
        return new engl(this.a);
    }
}
