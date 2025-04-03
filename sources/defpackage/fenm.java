package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fenm implements fevs {
    private Method b;
    private Method c;
    private Method d;

    public fenm(Class cls) {
        try {
            this.b = cls.getMethod("now", new Class[0]);
            this.c = cls.getMethod("getNano", new Class[0]);
            this.d = cls.getMethod("getEpochSecond", new Class[0]);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.fevs
    public final long a() {
        try {
            Object invoke = this.b.invoke(null, new Object[0]);
            return erlc.g(TimeUnit.SECONDS.toNanos(((Long) this.d.invoke(invoke, new Object[0])).longValue()), ((Integer) this.c.invoke(invoke, new Object[0])).intValue());
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
