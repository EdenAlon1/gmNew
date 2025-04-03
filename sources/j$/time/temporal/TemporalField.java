package j$.time.temporal;

import j$.time.format.D;
import java.util.HashMap;

/* loaded from: classes9.dex */
public interface TemporalField {
    Temporal D(Temporal temporal, long j);

    o G(TemporalAccessor temporalAccessor);

    boolean Z();

    o o();

    TemporalAccessor u(HashMap hashMap, TemporalAccessor temporalAccessor, D d);

    long v(TemporalAccessor temporalAccessor);

    boolean y(TemporalAccessor temporalAccessor);
}
