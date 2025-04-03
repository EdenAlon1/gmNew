package defpackage;

import io.grpc.Status;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fejl implements Runnable, fdyh {
    public final boolean a;
    public final boolean b;
    public final long c;
    public volatile ScheduledFuture d;
    public volatile boolean e;
    final /* synthetic */ fejr f;

    public fejl(fejr fejrVar, fdys fdysVar, boolean z) {
        long b;
        this.f = fejrVar;
        this.a = z;
        if (fdysVar == null) {
            this.b = false;
            b = 0;
        } else {
            this.b = true;
            b = fdysVar.b(TimeUnit.NANOSECONDS);
        }
        this.c = b;
    }

    @Override // defpackage.fdyh
    public final void a(fdyn fdynVar) {
        if (this.b && this.a && (fdynVar.c() instanceof TimeoutException)) {
            this.f.h.c(b());
        } else {
            this.f.h.c(fdyp.a(fdynVar));
        }
    }

    final Status b() {
        long abs = Math.abs(this.c) / TimeUnit.SECONDS.toNanos(1L);
        long abs2 = Math.abs(this.c) % TimeUnit.SECONDS.toNanos(1L);
        StringBuilder sb = new StringBuilder();
        sb.append(true != this.a ? "CallOptions" : "Context");
        sb.append(" deadline exceeded after ");
        if (this.c < 0) {
            sb.append('-');
        }
        sb.append(abs);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        sb.append("s. ");
        sb.append(String.format(Locale.US, "Name resolution delay %.9f seconds.", Double.valueOf(((Long) this.f.g.h(fdxt.f)) == null ? eobe.a : r0.longValue() / fejr.a)));
        if (this.f.h != null) {
            fenl fenlVar = new fenl();
            this.f.h.b(fenlVar);
            sb.append(" ");
            sb.append(fenlVar);
        }
        return Status.f.withDescription(sb.toString());
    }

    final void c() {
        this.e = true;
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f.e.g(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.h.c(b());
    }
}
