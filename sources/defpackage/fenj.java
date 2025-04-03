package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fenj {
    private static final Logger f = Logger.getLogger(fenj.class.getName());
    public final long a;
    public final emyg b;
    public Map c = new LinkedHashMap();
    public boolean d;
    public Throwable e;

    public fenj(long j, emyg emygVar) {
        this.a = j;
        this.b = emygVar;
    }

    public static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", th);
        }
    }

    public static void b(feon feonVar, Executor executor) {
        a(executor, new feni(feonVar));
    }
}
