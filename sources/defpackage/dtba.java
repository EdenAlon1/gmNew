package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtba implements dtbd {
    private final int a;
    private final Duration b;

    public dtba(int i, Duration duration) {
        this.a = i;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtba)) {
            return false;
        }
        dtba dtbaVar = (dtba) obj;
        return this.a == dtbaVar.a && ffkj.e(this.b, dtbaVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Loaded(selectedItemCount=" + this.a + ", loadingTime=" + this.b + ")";
    }
}
