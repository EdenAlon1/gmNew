package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evll implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;

    public evll(Type type) {
        type.getClass();
        this.a = evlo.c(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && evlo.g(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.valueOf(evlo.b(this.a)).concat("[]");
    }
}
