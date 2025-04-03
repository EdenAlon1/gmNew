package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyqa extends dyqn {
    private final long a;
    private final int b;

    public dyqa(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // defpackage.dyqn
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dyqn
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyqn) {
            dyqn dyqnVar = (dyqn) obj;
            if (this.a == dyqnVar.b() && this.b == dyqnVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "LighterCheckBootstrapRequiredResult{earliestCloudMessageTimestampUs=" + this.a + ", resultType=" + this.b + "}";
    }
}
