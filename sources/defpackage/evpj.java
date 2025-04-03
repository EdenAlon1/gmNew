package defpackage;

import j$.util.Objects;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class evpj<T> {
    public final Class a;
    public final Type b;
    private final int c;

    protected evpj() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == evpj.class) {
                Type c = evlo.c(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    b(c);
                }
                this.b = c;
                this.a = evlo.a(c);
                this.c = c.hashCode();
                return;
            }
        } else if (genericSuperclass == evpj.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ".concat(evnd.a("type-token-raw")));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static evpj a(Type type, Type... typeArr) {
        Class cls = (Class) type;
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        if (evlo.h(type)) {
            throw new IllegalArgumentException(a.N(cls, "Raw type ", " is not supported because it requires specifying an owner type"));
        }
        for (int i = 0; i < length; i++) {
            Type type2 = typeArr[i];
            type2.getClass();
            Class<?> a = evlo.a(type2);
            TypeVariable<Class<T>> typeVariable = typeParameters[i];
            for (Type type3 : typeVariable.getBounds()) {
                if (!evlo.a(type3).isAssignableFrom(a)) {
                    throw new IllegalArgumentException("Type argument " + type2.toString() + " does not satisfy bounds for type variable " + String.valueOf(typeVariable) + " declared by " + type.toString());
                }
            }
        }
        return new evpj(new evlm(null, cls, typeArr));
    }

    private static void b(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + String.valueOf(typeVariable.getGenericDeclaration()) + "\nSee " + evnd.a("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            b(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                b(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                b(actualTypeArguments[i]);
                i++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            b(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            b(upperBounds[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof evpj) && evlo.g(this.b, ((evpj) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return evlo.b(this.b);
    }

    public evpj(Type type) {
        type.getClass();
        Type c = evlo.c(type);
        this.b = c;
        this.a = evlo.a(c);
        this.c = c.hashCode();
    }
}
