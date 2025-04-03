package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjdc extends fjdm {
    private final Method a;
    private final int b;

    public fjdc(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // defpackage.fjdm
    public final /* bridge */ /* synthetic */ void a(fjdr fjdrVar, Object obj) {
        fhgh fhghVar = (fhgh) obj;
        if (fhghVar == null) {
            throw fjee.d(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
        }
        fhgf fhgfVar = fjdrVar.h;
        int a = fhghVar.a();
        for (int i = 0; i < a; i++) {
            fhgfVar.c(fhghVar.c(i), fhghVar.d(i));
        }
    }
}
