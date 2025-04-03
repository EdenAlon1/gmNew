package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjec implements ParameterizedType {
    private final Type a;
    private final Type b;
    private final Type[] c;

    public fjec(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            type3.getClass();
            fjee.l(type3);
        }
        this.a = type;
        this.b = type2;
        this.c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && fjee.n(this, (ParameterizedType) obj);
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
            return fjee.f(this.b);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(fjee.f(this.b));
        sb.append("<");
        sb.append(fjee.f(this.c[0]));
        for (int i = 1; i < this.c.length; i++) {
            sb.append(", ");
            sb.append(fjee.f(this.c[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
