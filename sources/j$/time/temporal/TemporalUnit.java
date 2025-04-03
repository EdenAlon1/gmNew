package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes9.dex */
public interface TemporalUnit {
    long between(Temporal temporal, Temporal temporal2);

    Duration getDuration();

    Temporal o(Temporal temporal, long j);

    boolean u();
}
