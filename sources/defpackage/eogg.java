package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eogg {
    static final ScheduledExecutorService a;
    private static final ThreadFactory b;

    static {
        ersf ersfVar = new ersf();
        ersfVar.d("RetryingFuture-Timer-%d");
        ersfVar.c(true);
        ThreadFactory b2 = ersf.b(ersfVar);
        b = b2;
        a = Executors.newSingleThreadScheduledExecutor(b2);
    }
}
