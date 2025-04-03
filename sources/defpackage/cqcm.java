package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqcm {
    private final int a;
    private final double b;

    public cqcm(int i, double d) {
        this.a = i;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqcm)) {
            return false;
        }
        cqcm cqcmVar = (cqcm) obj;
        return this.a == cqcmVar.a && Double.compare(this.b, cqcmVar.b) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        return (this.a * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "ActiveSyncUpdate(messagesSyncedSinceLastUpdateCount=" + this.a + ", estimatedPercentComplete=" + this.b + ")";
    }
}
