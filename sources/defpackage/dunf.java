package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dunf implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ SettableFuture b;
    final /* synthetic */ dunh c;
    final /* synthetic */ long d;
    final /* synthetic */ TimeUnit e;
    final /* synthetic */ duni f;

    public dunf(duni duniVar, Runnable runnable, SettableFuture settableFuture, dunh dunhVar, long j, TimeUnit timeUnit) {
        this.a = runnable;
        this.b = settableFuture;
        this.c = dunhVar;
        this.d = j;
        this.e = timeUnit;
        this.f = duniVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Runnable runnable = this.a;
        final SettableFuture settableFuture = this.b;
        final dunh dunhVar = this.c;
        final long j = this.d;
        final TimeUnit timeUnit = this.e;
        this.f.execute(new Runnable() { // from class: dune
            @Override // java.lang.Runnable
            public final void run() {
                dunf dunfVar = dunf.this;
                long j2 = j;
                Runnable runnable2 = runnable;
                SettableFuture settableFuture2 = settableFuture;
                dunh dunhVar2 = dunhVar;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (settableFuture2.isDone()) {
                        return;
                    }
                    errk schedule = dunfVar.f.a.schedule(dunfVar, j2, timeUnit2);
                    dunhVar2.a = schedule;
                    if (dunhVar2.isDone()) {
                        schedule.cancel(false);
                    }
                } catch (Throwable th) {
                    settableFuture2.setException(th);
                }
            }
        });
    }
}
