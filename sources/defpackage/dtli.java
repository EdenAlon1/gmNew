package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtli implements dtlj {
    public final Duration a;
    public final Duration b;
    public final dtiu c;

    public dtli() {
        this(Duration.ZERO, dtja.a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtli)) {
            return false;
        }
        dtli dtliVar = (dtli) obj;
        return ffkj.e(this.a, dtliVar.a) && ffkj.e(this.b, dtliVar.b) && ffkj.e(this.c, dtliVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dtiu dtiuVar = this.c;
        return (hashCode * 31) + (dtiuVar == null ? 0 : dtiuVar.hashCode());
    }

    public final String toString() {
        return "Recording(elapsedTime=" + this.a + ", maxDuration=" + this.b + ", noiseCancellationUiData=" + this.c + ")";
    }

    public dtli(Duration duration, Duration duration2, dtiu dtiuVar) {
        duration.getClass();
        duration2.getClass();
        this.a = duration;
        this.b = duration2;
        this.c = dtiuVar;
    }
}
