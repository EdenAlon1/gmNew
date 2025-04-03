package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjcx extends fjdm {
    private final Method a;
    private final int b;
    private final fjbu c;

    public fjcx(Method method, int i, fjbu fjbuVar) {
        this.a = method;
        this.b = i;
        this.c = fjbuVar;
    }

    @Override // defpackage.fjdm
    public final void a(fjdr fjdrVar, Object obj) {
        if (obj == null) {
            throw fjee.d(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            fjdrVar.m = (fhgz) this.c.a(obj);
        } catch (IOException e) {
            throw fjee.e(this.a, e, this.b, a.b(obj, "Unable to convert ", " to RequestBody"), new Object[0]);
        }
    }
}
