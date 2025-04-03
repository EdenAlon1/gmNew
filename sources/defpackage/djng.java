package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djng {
    public int a = 0;
    private final long b;
    private final long c;
    private final long d;
    private int e;
    private int f;
    private final djnf g;
    private final dktn h;

    public djng(long j, long j2, long j3, djnf djnfVar, dktn dktnVar) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.g = djnfVar;
        this.h = dktnVar;
        this.e = ((Integer) djnfVar.a.d()).intValue();
        this.f = ((Integer) djnfVar.b.d()).intValue();
    }

    public final long a() {
        long j;
        dkty.d(this.h, "retries=%d throttleCounter=%d retryAfter=%d", Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.a));
        int i = this.e;
        if (i > 0) {
            int i2 = i > 3 ? i - 3 : 0;
            long nextInt = new Random().nextInt(32);
            long j2 = this.b;
            j = Math.max(Math.min((j2 * (1 << i2)) + ((nextInt * j2) / 64), this.c), this.a);
        } else {
            j = 0;
        }
        if (this.f < this.d) {
            return j;
        }
        dkty.d(this.h, "Reached at throttling threshold. returning min delay at minimum.", new Object[0]);
        return Math.max(j, this.b);
    }

    public final synchronized void b() {
        this.e++;
        if (dkvj.a().longValue() - this.g.a() > TimeUnit.DAYS.toMillis(1L)) {
            dkty.d(this.h, "Reset throttleCounter.", new Object[0]);
            this.f = 0;
            this.g.c(0);
            djnf djnfVar = this.g;
            Long a = dkvj.a();
            a.longValue();
            djnfVar.c.e(a);
        }
        this.f++;
        this.g.b(this.e);
        this.g.c(this.f);
    }

    public final synchronized void c() {
        this.e = 0;
        this.g.b(0);
    }

    public final String toString() {
        djnf djnfVar = this.g;
        return "[RetryDelayCalculator - retries=" + this.e + ", throttleCounter=" + this.f + ", lastThrottleTimerResetTimestamp=" + djnfVar.a() + "]";
    }
}
