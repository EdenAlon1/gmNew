package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class diia extends ThreadPoolExecutor {
    private final ConcurrentHashMap a;

    public diia(TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(1, 3, 1L, timeUnit, blockingQueue);
        this.a = new ConcurrentHashMap();
    }

    final void a(dihw dihwVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        String b = dihwVar.b();
        if (concurrentHashMap.putIfAbsent(b, dihwVar) != null) {
            dkty.l(diib.a, "Business info retrieval is already active for key %s", dktx.GENERIC.c(b));
        } else {
            dkty.l(diib.a, "Executing business info retrieval for key %s", dktx.GENERIC.c(b));
            execute(dihwVar);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (runnable instanceof dihw) {
            this.a.remove(((dihw) runnable).b());
        }
    }
}
