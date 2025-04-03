package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fjbk {
    protected static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
        return fjee.h(i, parameterizedType);
    }

    protected static Class<?> getRawType(Type type) {
        return fjee.a(type);
    }

    public abstract fjbl<?, ?> get(Type type, Annotation[] annotationArr, fjdx fjdxVar);
}
