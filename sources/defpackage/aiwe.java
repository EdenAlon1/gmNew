package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiwe {
    public final long a;
    public final long b;

    public aiwe(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiwe)) {
            return false;
        }
        aiwe aiweVar = (aiwe) obj;
        return this.a == aiweVar.a && this.b == aiweVar.b;
    }

    public final int hashCode() {
        return (aiwd.a(this.a) * 31) + aiwd.a(this.b);
    }

    public final String toString() {
        return "P13nFeatureCalculationParams(startTimeMs=" + this.a + ", endTimeMs=" + this.b + ")";
    }
}
