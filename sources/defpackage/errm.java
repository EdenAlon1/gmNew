package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface errm extends ScheduledExecutorService, errl {
    errk d(Runnable runnable, long j, TimeUnit timeUnit);

    errk e(Callable callable, long j, TimeUnit timeUnit);

    errk f(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    errk g(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
