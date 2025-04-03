package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eagj extends erqi implements errm {
    public static final /* synthetic */ int b = 0;
    public final errm a;
    private final errl c;

    public eagj(errl errlVar, errm errmVar) {
        this.c = errlVar;
        this.a = errmVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final errk schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        final errj errjVar = new errj(runnable);
        return j <= 0 ? new eagi(this.c.submit(runnable), System.nanoTime()) : new eagh(errjVar, this.a.schedule(new Runnable() { // from class: eaga
            @Override // java.lang.Runnable
            public final void run() {
                eagj.this.execute(errjVar);
            }
        }, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final errk schedule(Callable callable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return new eagi(this.c.submit(callable), System.nanoTime());
        }
        final errj errjVar = new errj(callable);
        return new eagh(errjVar, this.a.schedule(new Runnable() { // from class: eagd
            @Override // java.lang.Runnable
            public final void run() {
                eagj.this.execute(errjVar);
            }
        }, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final errk scheduleAtFixedRate(final Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        final ersb ersbVar = new ersb(this);
        final SettableFuture create = SettableFuture.create();
        return new eagh(create, this.a.scheduleAtFixedRate(new Runnable() { // from class: eagb
            @Override // java.lang.Runnable
            public final void run() {
                int i = eagj.b;
                final Runnable runnable2 = runnable;
                final SettableFuture settableFuture = create;
                ersbVar.execute(new Runnable() { // from class: eagc
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = eagj.b;
                        try {
                            runnable2.run();
                        } catch (Throwable th) {
                            settableFuture.setException(th);
                        }
                    }
                });
            }
        }, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g */
    public final errk scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        SettableFuture create = SettableFuture.create();
        eagh eaghVar = new eagh(create, null);
        eaghVar.a = this.a.schedule(new eagf(this, runnable, create, eaghVar, j2, timeUnit), j, timeUnit);
        return eaghVar;
    }

    @Override // defpackage.erqi
    public final errl h() {
        return this.c;
    }

    @Override // defpackage.erqd, defpackage.enfm
    public final /* synthetic */ Object hC() {
        return this.c;
    }

    @Override // defpackage.erqi, defpackage.erqd
    public final /* synthetic */ ExecutorService i() {
        return this.c;
    }
}
