package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.setupcompat.ISetupCompatService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eioj {
    public static final eipn a = new eipn("SetupCompatServiceProvider");
    static final Intent b = new Intent().setPackage("com.google.android.setupwizard").setAction("com.google.android.setupcompat.SetupCompatService.BIND");
    private static volatile eioj d;
    private final Context f;
    final ServiceConnection c = new eiog(this);
    private volatile eioh e = new eioh(1);
    private final AtomicReference g = new AtomicReference();

    public eioj(Context context) {
        this.f = context.getApplicationContext();
    }

    public static ISetupCompatService a(Context context, long j, TimeUnit timeUnit) {
        eioc.c(context, "Context object cannot be null.");
        eioj eiojVar = d;
        if (eiojVar == null) {
            synchronized (eioj.class) {
                eiojVar = d;
                if (eiojVar == null) {
                    eiojVar = new eioj(context.getApplicationContext());
                    d = eiojVar;
                    d.e();
                }
            }
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("getService blocks and should not be called from the main thread.");
        }
        eioh d2 = eiojVar.d();
        int i = d2.b - 1;
        if (i == 0) {
            a.f("NOT_STARTED state only possible before instance is created.");
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return d2.a;
                }
                if (i != 4) {
                    if (i != 5) {
                        eiojVar.e();
                        return eiojVar.c(j, timeUnit);
                    }
                }
            }
            return eiojVar.c(j, timeUnit);
        }
        return null;
    }

    private final ISetupCompatService c(long j, TimeUnit timeUnit) {
        CountDownLatch countDownLatch;
        eioh d2 = d();
        if (d2.b == 4) {
            return d2.a;
        }
        loop0: while (true) {
            countDownLatch = (CountDownLatch) this.g.get();
            if (countDownLatch != null) {
                break;
            }
            countDownLatch = new CountDownLatch(1);
            AtomicReference atomicReference = this.g;
            while (!atomicReference.compareAndSet(null, countDownLatch)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            break loop0;
        }
        eipn eipnVar = a;
        eipnVar.b("Waiting for service to get connected");
        if (!countDownLatch.await(j, timeUnit)) {
            e();
            throw new TimeoutException(String.format("Failed to acquire connection after [%s %s]", Long.valueOf(j), timeUnit));
        }
        eioh d3 = d();
        eipnVar.b(String.format("Finished waiting for service to get connected. Current state = %s", eioi.a(d3.b)));
        return d3.a;
    }

    private final synchronized eioh d() {
        return this.e;
    }

    private final synchronized void e() {
        int i = d().b;
        if (i == 4) {
            a.b("Refusing to rebind since current state is already connected");
            return;
        }
        if (i != 1) {
            a.b("Unbinding existing service connection.");
            this.f.unbindService(this.c);
        }
        try {
            if (this.f.bindService(b, this.c, 1)) {
                if (this.e.b != 4) {
                    b(new eioh(3));
                    a.b("Context#bindService went through, now waiting for service connection");
                    return;
                }
                return;
            }
        } catch (SecurityException e) {
            a.d("Unable to bind to compat service. ".concat(e.toString()));
        }
        b(new eioh(2));
        a.d("Context#bindService did not succeed.");
    }

    final void b(eioh eiohVar) {
        a.b(String.format("State changed: %s -> %s", eioi.a(this.e.b), eioi.a(eiohVar.b)));
        this.e = eiohVar;
        CountDownLatch countDownLatch = (CountDownLatch) this.g.getAndSet(null);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
