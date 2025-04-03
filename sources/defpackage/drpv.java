package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drpv implements drpy {
    public final Instant a;
    public final Duration b;

    public drpv(Instant instant, Duration duration) {
        duration.getClass();
        this.a = instant;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drpv)) {
            return false;
        }
        drpv drpvVar = (drpv) obj;
        return ffkj.e(this.a, drpvVar.a) && ffkj.e(this.b, drpvVar.b);
    }

    public final int hashCode() {
        Instant instant = this.a;
        return ((instant == null ? 0 : instant.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Audio(dateModified=" + this.a + ", duration=" + this.b + ")";
    }
}
