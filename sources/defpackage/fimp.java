package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fimp {
    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(fimp.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
