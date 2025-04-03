package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evln implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;
    private final Type b;

    public evln(Type[] typeArr, Type[] typeArr2) {
        int length = typeArr2.length;
        evlk.a(length <= 1);
        evlk.a(typeArr.length == 1);
        if (length != 1) {
            Type type = typeArr[0];
            type.getClass();
            evlo.f(type);
            this.b = null;
            this.a = evlo.c(typeArr[0]);
            return;
        }
        Type type2 = typeArr2[0];
        type2.getClass();
        evlo.f(type2);
        evlk.a(typeArr[0] == Object.class);
        this.b = evlo.c(typeArr2[0]);
        this.a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && evlo.g(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type != null ? new Type[]{type} : evlo.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.b;
        if (type != null) {
            return "? super ".concat(String.valueOf(evlo.b(type)));
        }
        Type type2 = this.a;
        return type2 == Object.class ? "?" : "? extends ".concat(String.valueOf(evlo.b(type2)));
    }
}
