package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ersd extends errw {
    public double b;
    public double c;
    public double d;
    private long e;

    public ersd(errv errvVar) {
        super(errvVar);
        this.e = 0L;
    }

    @Override // defpackage.errw
    public final double a() {
        return TimeUnit.SECONDS.toMicros(1L) / this.d;
    }

    @Override // defpackage.errw
    public final long c() {
        return this.e;
    }

    @Override // defpackage.errw
    public final long d(long j) {
        f(j);
        long j2 = this.e;
        double min = Math.min(1.0d, this.b);
        this.e = erlc.g(this.e, (long) ((1.0d - min) * this.d));
        this.b -= min;
        return j2;
    }

    public abstract double e();

    public final void f(long j) {
        if (j > this.e) {
            this.b = Math.min(this.c, this.b + ((j - r0) / e()));
            this.e = j;
        }
    }
}
