package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efnp {
    static volatile Executor a;
    private static final Object b = new Object();

    public static Executor a() {
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    a = new ThreadPoolExecutor(1, 3, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new efno());
                    ((ThreadPoolExecutor) a).allowCoreThreadTimeOut(true);
                }
            }
        }
        return a;
    }
}
