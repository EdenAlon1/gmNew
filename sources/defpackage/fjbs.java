package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjbs extends fjbk {
    static final fjbk a = new fjbs();

    @Override // defpackage.fjbk
    public final fjbl<?, ?> get(Type type, Annotation[] annotationArr, fjdx fjdxVar) {
        if (getRawType(type) != iy$$ExternalSyntheticApiModelOutline3.m431m()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type parameterUpperBound = getParameterUpperBound(0, (ParameterizedType) type);
        if (getRawType(parameterUpperBound) != fjdu.class) {
            return new fjbo(parameterUpperBound);
        }
        if (parameterUpperBound instanceof ParameterizedType) {
            return new fjbr(getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
