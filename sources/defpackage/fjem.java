package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjem extends fjbt {
    private final evkn a;

    private fjem(evkn evknVar) {
        this.a = evknVar;
    }

    public static fjem c(evkn evknVar) {
        if (evknVar != null) {
            return new fjem(evknVar);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // defpackage.fjbt
    public final fjbu a(Type type, Annotation[] annotationArr, fjdx fjdxVar) {
        return new fjeo(this.a.a(new evpj(type)));
    }

    @Override // defpackage.fjbt
    public final fjbu b(Type type) {
        return new fjen(this.a, this.a.a(new evpj(type)));
    }
}
