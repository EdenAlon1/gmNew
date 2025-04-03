package defpackage;

import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeol {
    public final eeop a;
    public final long b = System.nanoTime();
    private final Throwable c;

    public eeol(eeop eeopVar, Throwable th) {
        this.a = eeopVar;
        this.c = th;
    }

    public static eeol a(eeop eeopVar, Throwable th) {
        th.getClass();
        return new eeol(eeopVar, th);
    }

    public final Optional b() {
        return Optional.ofNullable(this.c);
    }

    public final boolean c() {
        return this.c == null;
    }

    public final String toString() {
        return String.format(Locale.US, "StateTransition<%s>(state: %s, isValid: %s, transitionTimeNanos: %d, failureCause: %s)", this.a.getClass().getName(), this.a, Boolean.valueOf(c()), Long.valueOf(this.b), b().orElse(null));
    }
}
