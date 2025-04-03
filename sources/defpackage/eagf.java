package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eagf implements Runnable {
    final Runnable a = this;
    final /* synthetic */ Runnable b;
    final /* synthetic */ SettableFuture c;
    final /* synthetic */ eagh d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ eagj g;

    public eagf(eagj eagjVar, Runnable runnable, SettableFuture settableFuture, eagh eaghVar, long j, TimeUnit timeUnit) {
        this.b = runnable;
        this.c = settableFuture;
        this.d = eaghVar;
        this.e = j;
        this.f = timeUnit;
        this.g = eagjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Runnable runnable = this.b;
        final SettableFuture settableFuture = this.c;
        final eagh eaghVar = this.d;
        final long j = this.e;
        final TimeUnit timeUnit = this.f;
        this.g.execute(new Runnable() { // from class: eage
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                eagf eagfVar = eagf.this;
                Runnable runnable2 = runnable;
                SettableFuture settableFuture2 = settableFuture;
                eagh eaghVar2 = eaghVar;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (settableFuture2.isDone()) {
                        return;
                    }
                    errk schedule = eagfVar.g.a.schedule(eagfVar.a, j2, timeUnit2);
                    eaghVar2.a = schedule;
                    if (eaghVar2.isDone()) {
                        schedule.cancel(false);
                    }
                } catch (Throwable th) {
                    settableFuture2.setException(th);
                }
            }
        });
    }
}
