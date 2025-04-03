package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ernm {
    public final Object a;
    public final Duration b;

    public ernm(Object obj, Duration duration) {
        duration.getClass();
        this.a = obj;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ernm)) {
            return false;
        }
        ernm ernmVar = (ernm) obj;
        return ffkj.e(this.a, ernmVar.a) && ffkj.e(this.b, ernmVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + this.b + ")";
    }
}
