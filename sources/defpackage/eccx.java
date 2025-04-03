package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eccx implements Executor, ecgw {
    public final errm a;
    private final ecgx b;
    private final ffbr e;
    private final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private volatile boolean d = false;
    private final AtomicBoolean f = new AtomicBoolean();

    public eccx(errm errmVar, ecgx ecgxVar, ffbr ffbrVar) {
        this.a = errmVar;
        this.b = ecgxVar;
        this.e = ffbrVar;
        ecgy ecgyVar = ecgxVar.a.a;
        int i = ecgy.c;
        if (ecgyVar.b.get() > 0) {
            k();
        } else {
            ecgxVar.a(this);
        }
    }

    private final void j() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable == null) {
                return;
            } else {
                this.a.execute(runnable);
            }
        }
    }

    private final void k() {
        this.a.schedule(new Callable() { // from class: eccw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterResume", 120, "DeferrableExecutor.java")).q("DeferrableExecutor unblocked after onResume");
                eccx.this.i();
                return null;
            }
        }, 3000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.ecgw
    public final void d(Activity activity) {
        this.b.b(this);
        k();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.d) {
            this.a.execute(runnable);
            return;
        }
        this.c.add(runnable);
        if (this.d) {
            j();
        } else {
            if (this.f.getAndSet(true)) {
                return;
            }
            if (((Boolean) ((emxc) ((fbbb) this.e).a).e(false)).booleanValue()) {
                Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: eccu
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        eccx eccxVar = eccx.this;
                        eccxVar.a.schedule(new eccv(eccxVar), 7000L, TimeUnit.MILLISECONDS);
                        return false;
                    }
                });
            } else {
                this.a.schedule(new eccv(this), 7000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void i() {
        this.d = true;
        j();
    }

    @Override // defpackage.ecgw
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.ecgw
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.ecgw
    public final /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.ecgw
    public final /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.ecgw
    public final /* synthetic */ void h(int i) {
    }

    @Override // defpackage.ecgw
    public final /* synthetic */ void a(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.ecgw
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
