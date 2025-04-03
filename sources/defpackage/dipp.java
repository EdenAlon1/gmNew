package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dipp {
    public static final AtomicReference a = new AtomicReference();

    public static Object a(Class cls) {
        Object obj;
        Supplier m108m = afg$$ExternalSyntheticApiModelOutline0.m108m(a.get());
        m108m.getClass();
        obj = m108m.get();
        obj.getClass();
        emxf.f(cls.isInstance(obj), "SingletonEntryPoints (i.e SingletonComponent) does not implement %s", cls.getName());
        return cls.cast(obj);
    }
}
