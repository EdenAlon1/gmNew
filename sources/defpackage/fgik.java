package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgik {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;

    static {
        long b2;
        long b3;
        String a2 = fghq.a("kotlinx.coroutines.scheduler.default.name");
        if (a2 == null) {
            a2 = "DefaultDispatcher";
        }
        a = a2;
        b2 = fghr.b("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        b = b2;
        c = fghp.a("kotlinx.coroutines.scheduler.core.pool.size", ffmk.f(fghq.a, 2), 1, 0, 8);
        d = fghp.a("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b3 = fghr.b("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE);
        e = timeUnit.toNanos(b3);
    }
}
