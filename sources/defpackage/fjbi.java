package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjbi extends fjbt {
    private boolean a = true;

    @Override // defpackage.fjbt
    public final fjbu a(Type type, Annotation[] annotationArr, fjdx fjdxVar) {
        if (type == fhhe.class) {
            return fjee.p(annotationArr, fjfl.class) ? fjbe.a : fjbc.a;
        }
        if (type == Void.class) {
            return fjbh.a;
        }
        if (!this.a || type != ffcu.class) {
            return null;
        }
        try {
            return fjbg.a;
        } catch (NoClassDefFoundError unused) {
            this.a = false;
            return null;
        }
    }

    @Override // defpackage.fjbt
    public final fjbu b(Type type) {
        if (fhgz.class.isAssignableFrom(fjee.a(type))) {
            return fjbd.a;
        }
        return null;
    }
}
