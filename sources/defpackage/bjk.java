package defpackage;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bjk implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.a.getAndIncrement())));
        return thread;
    }
}
