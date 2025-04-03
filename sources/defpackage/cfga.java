package defpackage;

import j$.time.Duration;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfga {
    public final Set a;
    public final Duration b;

    public cfga(Set set, Duration duration) {
        this.a = set;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfga)) {
            return false;
        }
        cfga cfgaVar = (cfga) obj;
        return ffkj.e(this.a, cfgaVar.a) && ffkj.e(this.b, cfgaVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "JanitorStepResult(affectedQueues=" + this.a + ", queryDuration=" + this.b + ")";
    }
}
