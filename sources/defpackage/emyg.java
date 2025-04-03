package defpackage;

import j$.time.Duration;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emyg {
    public boolean a;
    private final emyv b;
    private long c;
    private long d;

    public emyg() {
        this.b = emyv.b;
    }

    public static emyg b() {
        emyg emygVar = new emyg();
        emygVar.f();
        return emygVar;
    }

    public static emyg c(emyv emyvVar) {
        emyg emygVar = new emyg(emyvVar);
        emygVar.f();
        return emygVar;
    }

    private final long h() {
        return this.a ? (this.b.a() - this.d) + this.c : this.c;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public final Duration d() {
        return Duration.ofNanos(h());
    }

    public final void e() {
        this.c = 0L;
        this.a = false;
    }

    public final void f() {
        emxf.m(!this.a, "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.a();
    }

    public final void g() {
        long a = this.b.a();
        emxf.m(this.a, "This stopwatch is already stopped.");
        this.a = false;
        this.c += a - this.d;
    }

    public final String toString() {
        String str;
        long h = h();
        TimeUnit timeUnit = TimeUnit.DAYS.convert(h, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.DAYS : TimeUnit.HOURS.convert(h, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.HOURS : TimeUnit.MINUTES.convert(h, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MINUTES : TimeUnit.SECONDS.convert(h, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.SECONDS : TimeUnit.MILLISECONDS.convert(h, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MILLISECONDS : TimeUnit.MICROSECONDS.convert(h, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(h / TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
        switch (emyf.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return a.w(str, format, " ");
    }

    public emyg(emyv emyvVar) {
        emyvVar.getClass();
        this.b = emyvVar;
    }
}
