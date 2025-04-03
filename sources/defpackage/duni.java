package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duni extends erqi implements errm {
    public static final /* synthetic */ int b = 0;
    public final errm a;
    private final errl c;

    public duni(errl errlVar, errm errmVar) {
        this.c = errlVar;
        this.a = errmVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final errk schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        final errj errjVar = new errj(runnable);
        return new dunh(errjVar, this.a.schedule(new Runnable() { // from class: dunb
            @Override // java.lang.Runnable
            public final void run() {
                duni.this.execute(errjVar);
            }
        }, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final errk schedule(Callable callable, long j, TimeUnit timeUnit) {
        final errj errjVar = new errj(callable);
        return new dunh(errjVar, this.a.schedule(new Runnable() { // from class: dunc
            @Override // java.lang.Runnable
            public final void run() {
                duni.this.execute(errjVar);
            }
        }, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final errk scheduleAtFixedRate(final Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        final Executor b2 = dunl.b(this);
        final SettableFuture create = SettableFuture.create();
        return new dunh(create, this.a.scheduleAtFixedRate(new Runnable() { // from class: dund
            @Override // java.lang.Runnable
            public final void run() {
                int i = duni.b;
                final Runnable runnable2 = runnable;
                final SettableFuture settableFuture = create;
                b2.execute(new Runnable() { // from class: duna
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = duni.b;
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
        dunh dunhVar = new dunh(create, null);
        dunhVar.a = this.a.schedule(new dunf(this, runnable, create, dunhVar, j2, timeUnit), j, timeUnit);
        return dunhVar;
    }

    @Override // defpackage.erqi
    protected final errl h() {
        return this.c;
    }

    @Override // defpackage.erqd, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.c;
    }

    @Override // defpackage.erqi, defpackage.erqd
    protected final /* synthetic */ ExecutorService i() {
        return this.c;
    }
}
