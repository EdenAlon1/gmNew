package defpackage;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evlm implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;
    private final Type b;
    private final Type[] c;

    public evlm(Type type, Class cls, Type... typeArr) {
        cls.getClass();
        if (type == null && evlo.h(cls)) {
            throw new IllegalArgumentException("Must specify owner type for ".concat(cls.toString()));
        }
        this.a = type == null ? null : evlo.c(type);
        this.b = evlo.c(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Type type2 = this.c[i];
            type2.getClass();
            evlo.f(type2);
            Type[] typeArr3 = this.c;
            typeArr3[i] = evlo.c(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && evlo.g(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() ^ Arrays.hashCode(this.c);
        Type type = this.a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        int length = this.c.length;
        if (length == 0) {
            return evlo.b(this.b);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(evlo.b(this.b));
        sb.append("<");
        sb.append(evlo.b(this.c[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(evlo.b(this.c[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
