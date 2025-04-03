package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class einx {
    public static final einx a = new einx(new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new ArrayBlockingQueue(50), new ThreadFactory() { // from class: einw
        public final /* synthetic */ String a = "SetupCompatServiceInvoker";

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            einx einxVar = einx.a;
            return new Thread(runnable, this.a);
        }
    }));
    public final Executor b;

    private einx(Executor executor) {
        this.b = executor;
    }
}
