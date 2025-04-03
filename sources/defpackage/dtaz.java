package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtaz implements dtbd {
    private final int a;
    private final Duration b;

    public dtaz(int i, Duration duration) {
        this.a = i;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtaz)) {
            return false;
        }
        dtaz dtazVar = (dtaz) obj;
        return this.a == dtazVar.a && ffkj.e(this.b, dtazVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Closing(selectedItemCount=" + this.a + ", timeSpent=" + this.b + ")";
    }
}
