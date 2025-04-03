package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlzq {
    public final Duration a;
    public final Duration b;

    public dlzq() {
        this(ernk.g(0), ernk.g(120));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlzq)) {
            return false;
        }
        dlzq dlzqVar = (dlzq) obj;
        return ffkj.e(this.a, dlzqVar.a) && ffkj.e(this.b, dlzqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TimerUiData(elapsedTime=" + this.a + ", maxDuration=" + this.b + ")";
    }

    public dlzq(Duration duration, Duration duration2) {
        duration.getClass();
        duration2.getClass();
        this.a = duration;
        this.b = duration2;
    }
}
