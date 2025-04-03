package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtms implements Runnable {
    final Runnable a = this;
    final /* synthetic */ Runnable b;
    final /* synthetic */ SettableFuture c;
    final /* synthetic */ dtmu d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ dtmw g;

    public dtms(dtmw dtmwVar, Runnable runnable, SettableFuture settableFuture, dtmu dtmuVar, long j, TimeUnit timeUnit) {
        this.b = runnable;
        this.c = settableFuture;
        this.d = dtmuVar;
        this.e = j;
        this.f = timeUnit;
        this.g = dtmwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Runnable runnable = this.b;
        final SettableFuture settableFuture = this.c;
        final dtmu dtmuVar = this.d;
        final long j = this.e;
        final TimeUnit timeUnit = this.f;
        this.g.execute(new Runnable() { // from class: dtmr
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                dtms dtmsVar = dtms.this;
                Runnable runnable2 = runnable;
                SettableFuture settableFuture2 = settableFuture;
                dtmu dtmuVar2 = dtmuVar;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (settableFuture2.isDone()) {
                        return;
                    }
                    errk schedule = dtmsVar.g.a.schedule(dtmsVar.a, j2, timeUnit2);
                    dtmuVar2.a = schedule;
                    if (dtmuVar2.isDone()) {
                        schedule.cancel(false);
                    }
                } catch (Throwable th) {
                    settableFuture2.setException(th);
                }
            }
        });
    }
}
