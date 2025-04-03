package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dihy extends diia {
    final /* synthetic */ diib a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dihy(diib diibVar, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(timeUnit, blockingQueue);
        this.a = diibVar;
    }

    @Override // defpackage.diia, java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (!(runnable instanceof dihu)) {
            dkty.h(diib.a, "Business media download executed: Runnable is not an instance of BusinessInfoMediaRetrievalRunnable", new Object[0]);
            return;
        }
        dihu dihuVar = (dihu) runnable;
        String str = dihuVar.b;
        dkty.l(diib.a, "Business media download executed for botId %s", dktx.GENERIC.c(str));
        int i = dihuVar.a;
        if (i == 0 || i == 2) {
            diib diibVar = this.a;
            dihz dihzVar = dihuVar.d;
            diibVar.h(str);
        }
    }
}
