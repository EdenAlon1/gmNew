package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtmw extends erqi implements errm {
    public static final /* synthetic */ int b = 0;
    public final errm a;
    private final errl c;

    public dtmw(errl errlVar, errm errmVar) {
        this.c = errlVar;
        this.a = errmVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final errk schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        final errj errjVar = new errj(runnable);
        return j <= 0 ? new dtmv(this.c.submit(runnable), System.nanoTime()) : new dtmu(errjVar, this.a.schedule(new Runnable() { // from class: dtmo
            @Override // java.lang.Runnable
            public final void run() {
                dtmw.this.execute(errjVar);
            }
        }, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final errk schedule(Callable callable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return new dtmv(this.c.submit(callable), System.nanoTime());
        }
        final errj errjVar = new errj(callable);
        return new dtmu(errjVar, this.a.schedule(new Runnable() { // from class: dtmq
            @Override // java.lang.Runnable
            public final void run() {
                dtmw.this.execute(errjVar);
            }
        }, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final errk scheduleAtFixedRate(final Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        final ersb ersbVar = new ersb(this);
        final SettableFuture create = SettableFuture.create();
        return new dtmu(create, this.a.scheduleAtFixedRate(new Runnable() { // from class: dtmp
            @Override // java.lang.Runnable
            public final void run() {
                int i = dtmw.b;
                final Runnable runnable2 = runnable;
                final SettableFuture settableFuture = create;
                ersbVar.execute(new Runnable() { // from class: dtmn
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = dtmw.b;
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
        dtmu dtmuVar = new dtmu(create, null);
        dtmuVar.a = this.a.schedule(new dtms(this, runnable, create, dtmuVar, j2, timeUnit), j, timeUnit);
        return dtmuVar;
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
