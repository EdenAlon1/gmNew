package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtnl extends ernr implements Runnable, errk {
    final long a;
    final long b;
    final boolean c;
    final AtomicLong d = new AtomicLong(0);
    Runnable e;
    final /* synthetic */ dtnn f;

    public dtnl(dtnn dtnnVar, Runnable runnable, long j, long j2, boolean z) {
        this.f = dtnnVar;
        this.e = runnable;
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    private final long d() {
        return Math.max(0L, ((this.d.get() * this.b) + this.a) - this.f.a.a());
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return dtnn.h(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(d(), TimeUnit.MILLISECONDS);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        this.d.incrementAndGet();
        try {
            this.e.run();
            if (this.c) {
                dtnn dtnnVar = this.f;
                dtnnVar.b.postDelayed(this, d());
            } else {
                dtnn dtnnVar2 = this.f;
                dtnnVar2.b.postDelayed(this, this.b);
            }
        } catch (Throwable th) {
            this.e = null;
            setException(th);
        }
    }
}
