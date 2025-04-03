package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dihx extends diia {
    final /* synthetic */ diib a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dihx(diib diibVar, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(timeUnit, blockingQueue);
        this.a = diibVar;
    }

    @Override // defpackage.diia, java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (!(runnable instanceof dihw)) {
            dkty.h(diib.a, "Business metadata download executed: Runnable is not an instance of BusinessInfoRetrievalRunnable", new Object[0]);
            return;
        }
        dihw dihwVar = (dihw) runnable;
        String str = dihwVar.b;
        dkty.l(diib.a, "Business metadata download executed for botId %s", dktx.GENERIC.c(str));
        if (dihwVar.d == dihz.INFO_LOCALLY_AVAILABLE) {
            dkty.l(diib.a, "Checking business media retrieval for botId %s", dktx.GENERIC.c(str));
            this.a.e(str);
        } else {
            this.a.h(str);
            dkty.h(diib.a, "Unable to start business media retrieval for botId %s, business info is not locally available", dktx.GENERIC.c(str));
        }
    }
}
