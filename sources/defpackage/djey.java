package defpackage;

import j$.time.Duration;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djey {
    public djey() {
        int intValue = ((Integer) dizg.o().a.au.a()).intValue();
        int intValue2 = ((Integer) dizg.o().a.av.a()).intValue();
        int intValue3 = ((Integer) dizg.o().a.aw.a()).intValue();
        emxf.b(intValue > 0, "Capacity must be positive");
        emxf.b(intValue2 > 0, "Refill rate must be positive");
        emxf.b(intValue3 > 0, "Refill amount must be positive");
        Duration.ofMillis(intValue2).toNanos();
        new ArrayDeque();
    }
}
