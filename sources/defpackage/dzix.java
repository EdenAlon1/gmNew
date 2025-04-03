package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzix {
    public abstract dzja a();

    public abstract void b(dzjd dzjdVar);

    public abstract void c(long j);

    public abstract void d(eyee eyeeVar);

    public abstract void e(dziz dzizVar);

    public final void f(dzjc dzjcVar) {
        String str;
        dzij dzijVar = (dzij) dzjcVar;
        Set set = dzijVar.b;
        if (set != null && (str = dzijVar.d) != null) {
            b(new dzma(dzijVar.a, set, dzijVar.c, str));
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (dzijVar.b == null) {
            sb.append(" phoneNumbers");
        }
        if (dzijVar.d == null) {
            sb.append(" tachyonAppName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
