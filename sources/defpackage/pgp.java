package defpackage;

import java.lang.reflect.Proxy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgp {
    private final ClassLoader a;

    public pgp(ClassLoader classLoader) {
        this.a = classLoader;
    }

    public final Class a() {
        try {
            return b();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final Class b() {
        Class<?> loadClass = this.a.loadClass("java.util.function.Consumer");
        loadClass.getClass();
        return loadClass;
    }

    public final Object c(ffmo ffmoVar, ffji ffjiVar) {
        Object newProxyInstance = Proxy.newProxyInstance(this.a, new Class[]{b()}, new pgn(ffmoVar, ffjiVar));
        newProxyInstance.getClass();
        return newProxyInstance;
    }
}
