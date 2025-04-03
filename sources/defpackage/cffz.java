package defpackage;

import j$.time.Duration;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cffz {
    public final Map a;
    public final Duration b;

    public cffz(Map map, Duration duration) {
        map.getClass();
        this.a = map;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cffz)) {
            return false;
        }
        cffz cffzVar = (cffz) obj;
        return ffkj.e(this.a, cffzVar.a) && ffkj.e(this.b, cffzVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "JanitorResult(steps=" + this.a + ", rescheduleDuration=" + this.b + ")";
    }
}
