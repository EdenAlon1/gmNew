package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eewh implements eewi {
    private final Object a;
    private final Method b;

    public eewh(Object obj, Method method) {
        this.a = obj;
        this.b = method;
    }

    private static eewm b(String str, Exception exc) {
        return new eexa(str, new eewg(exc));
    }

    @Override // defpackage.eewi
    public final Object a() {
        try {
            Object invoke = this.b.invoke(this.a, new Object[0]);
            return invoke == null ? b(this.b.getName(), new NullPointerException()) : invoke;
        } catch (Exception e) {
            return b(this.b.getName(), e);
        }
    }
}
