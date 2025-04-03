package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class errw {
    public final errv a;
    private volatile Object b;

    public errw(errv errvVar) {
        this.a = errvVar;
    }

    public abstract double a();

    public final Object b() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == null) {
                obj = new Object();
                this.b = obj;
            }
        }
        return obj;
    }

    public abstract long c();

    public abstract long d(long j);

    public final String toString() {
        double a;
        Locale locale = Locale.ROOT;
        synchronized (b()) {
            a = a();
        }
        return String.format(locale, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(a));
    }
}
