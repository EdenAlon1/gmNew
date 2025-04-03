package defpackage;

import j$.time.Duration;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eofx implements Serializable {
    public static final Duration d = Duration.ofMillis(-1);

    public static int c(int i) {
        emxf.h(i > 0, "%s (%s) must be > 0", "numAttempts", i);
        return Math.min(i, 131072);
    }

    public static eofx d(Duration duration, double d2, int i) {
        duration.getClass();
        return new eoft(duration, d2, i);
    }

    public abstract Duration a(int i);

    public boolean b(int i) {
        return a(i).compareTo(Duration.ZERO) >= 0;
    }
}
