package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes6.dex */
class ffbu {
    public static final void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            if (ffid.a()) {
                th.addSuppressed(th2);
                return;
            }
            Method method = ffhz.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }
}
