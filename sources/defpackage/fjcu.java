package defpackage;

import j$.util.Optional;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjcu extends fjbt {
    static final fjbt a = new fjcu();

    @Override // defpackage.fjbt
    public final fjbu a(Type type, Annotation[] annotationArr, fjdx fjdxVar) {
        if (fjee.a(type) != Optional.class) {
            return null;
        }
        return new fjct(fjdxVar.b(fjee.h(0, (ParameterizedType) type), annotationArr));
    }
}
