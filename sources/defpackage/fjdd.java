package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjdd extends fjdm {
    private final Method a;
    private final int b;
    private final fhgh c;
    private final fjbu d;

    public fjdd(Method method, int i, fhgh fhghVar, fjbu fjbuVar) {
        this.a = method;
        this.b = i;
        this.c = fhghVar;
        this.d = fjbuVar;
    }

    @Override // defpackage.fjdm
    public final void a(fjdr fjdrVar, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            fjdrVar.c(this.c, (fhgz) this.d.a(obj));
        } catch (IOException e) {
            throw fjee.d(this.a, this.b, a.b(obj, "Unable to convert ", " to RequestBody"), e);
        }
    }
}
