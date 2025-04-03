package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjek extends fjbk {
    @Override // defpackage.fjbk
    public final fjbl<?, ?> get(Type type, Annotation[] annotationArr, fjdx fjdxVar) {
        if (getRawType(type) != ListenableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("ListenableFuture return type must be parameterized as ListenableFuture<Foo> or ListenableFuture<? extends Foo>");
        }
        Type parameterUpperBound = getParameterUpperBound(0, (ParameterizedType) type);
        if (getRawType(parameterUpperBound) != fjdu.class) {
            return new fjeg(parameterUpperBound);
        }
        if (parameterUpperBound instanceof ParameterizedType) {
            return new fjej(getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
