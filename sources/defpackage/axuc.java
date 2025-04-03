package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axuc {
    public final cqoh a;
    public double b;
    public Instant c;
    public AtomicReference d;
    public Instant e;
    private final ffbr f;
    private final long g;
    private final Duration h;
    private final double i;

    public axuc(cqoh cqohVar, ffbr ffbrVar, long j, Duration duration) {
        this.a = cqohVar;
        this.f = ffbrVar;
        this.g = j;
        this.h = duration;
        if (j <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (duration.compareTo(Duration.ZERO) <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        double d = j;
        this.i = ((Number) ffbrVar.b()).doubleValue() * d;
        this.b = d;
        this.c = Instant.MIN;
        this.d = new AtomicReference(false);
        this.e = Instant.MIN;
    }

    public final double a() {
        Duration.between(this.c, Instant.ofEpochMilli(this.a.a())).getClass();
        return Math.min(this.g, this.b + (erne.a(r0) / erne.a(this.h)));
    }

    public final void b() {
        synchronized (this) {
            this.b = this.g;
            this.c = Instant.ofEpochMilli(this.a.a());
            this.d.set(false);
            this.e = Instant.ofEpochMilli(this.a.a());
        }
    }

    public final boolean c() {
        synchronized (this) {
            if (!((Boolean) this.d.get()).booleanValue()) {
                return false;
            }
            if (Duration.between(this.e, Instant.ofEpochMilli(this.a.a())).compareTo(Duration.ofSeconds(60L)) < 0) {
                return true;
            }
            if (a() < this.i) {
                return true;
            }
            this.d.set(false);
            return false;
        }
    }
}
