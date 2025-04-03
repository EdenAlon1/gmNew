package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feop {
    public static final long a = TimeUnit.SECONDS.toNanos(10);
    public static final long b = TimeUnit.MILLISECONDS.toNanos(10);
    public final ScheduledExecutorService c;
    public final emyg d;
    public ScheduledFuture e;
    public ScheduledFuture f;
    public final Runnable g;
    public final Runnable h;
    public final long i;
    public final long j;
    public int k;
    public final feoo l;

    public feop(feoo feooVar, ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        emyg emygVar = new emyg();
        this.k = 1;
        this.g = new feoq(new feol(this));
        this.h = new feoq(new feom(this));
        this.l = feooVar;
        scheduledExecutorService.getClass();
        this.c = scheduledExecutorService;
        this.d = emygVar;
        this.i = j;
        this.j = j2;
        emygVar.e();
        emygVar.f();
    }

    public final synchronized void a() {
        emyg emygVar = this.d;
        emygVar.e();
        emygVar.f();
        int i = this.k;
        if (i == 2) {
            this.k = 3;
            return;
        }
        if (i == 4 || i == 5) {
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (this.k == 5) {
                this.k = 1;
                return;
            }
            this.k = 2;
            emxf.m(this.f == null, "There should be no outstanding pingFuture");
            this.f = this.c.schedule(this.h, this.i, TimeUnit.NANOSECONDS);
        }
    }

    public final synchronized void b() {
        int i = this.k;
        if (i == 1) {
            this.k = 2;
            if (this.f == null) {
                this.f = this.c.schedule(this.h, this.i - this.d.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
            }
        } else if (i == 5) {
            this.k = 4;
        }
    }

    public final synchronized void c() {
        int i = this.k;
        if (i != 2 && i != 3) {
            if (i == 4) {
                this.k = 5;
                return;
            }
            return;
        }
        this.k = 1;
    }

    public final synchronized void d() {
    }

    public final synchronized void e() {
        if (this.k != 6) {
            this.k = 6;
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture scheduledFuture2 = this.f;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.f = null;
            }
        }
    }
}
