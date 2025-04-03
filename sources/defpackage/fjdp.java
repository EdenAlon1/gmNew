package defpackage;

import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fjdp {
    public static final fjdp a;
    public final Constructor b;

    static {
        a = "Dalvik".equals(System.getProperty("java.vm.name")) ? new fjdo() : new fjdp();
    }

    public fjdp() {
        Constructor constructor = null;
        try {
            constructor = iy$$ExternalSyntheticApiModelOutline1.m426m$1().getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
        }
        this.b = constructor;
    }

    public Executor a() {
        return null;
    }
}
