package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjdk extends fjdm {
    private final Method a;
    private final int b;

    public fjdk(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // defpackage.fjdm
    public final void a(fjdr fjdrVar, Object obj) {
        if (obj == null) {
            throw fjee.d(this.a, this.b, "@Url parameter is null.", new Object[0]);
        }
        fjdrVar.e = obj.toString();
    }
}
