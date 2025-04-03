package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edug extends edvp {
    private final long a;
    private final edxt b;

    public edug(long j, edxt edxtVar) {
        this.a = j;
        if (edxtVar == null) {
            throw new NullPointerException("Null observations");
        }
        this.b = edxtVar;
    }

    @Override // defpackage.edvp
    public final long a() {
        return this.a;
    }

    @Override // defpackage.edvp
    public final edxt b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edvp) {
            edvp edvpVar = (edvp) obj;
            if (this.a == edvpVar.a() && this.b.equals(edvpVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ObservationStoreData{observationStoreId=" + this.a + ", observations=" + this.b.toString() + "}";
    }
}
