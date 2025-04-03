package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjca extends fjbk {
    private final Executor a;

    public fjca(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.fjbk
    public final fjbl<?, ?> get(Type type, Annotation[] annotationArr, fjdx fjdxVar) {
        if (getRawType(type) != fjbj.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new fjbv(fjee.h(0, (ParameterizedType) type), fjee.p(annotationArr, fjdz.class) ? null : this.a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
