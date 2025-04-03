package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emnq extends emny {
    private final exmx a;
    private final long b;

    public emnq(exmx exmxVar, long j) {
        this.a = exmxVar;
        this.b = j;
    }

    @Override // defpackage.emny
    public final long a() {
        return this.b;
    }

    @Override // defpackage.emny
    public final exmx b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof emny) {
            emny emnyVar = (emny) obj;
            if (this.a.equals(emnyVar.b()) && this.b == emnyVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "TextClassifierResult{classificationResult=" + this.a.toString() + ", timestampMs=" + this.b + "}";
    }
}
