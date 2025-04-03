package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djza extends dkam {
    private final String a;
    private final djtc b;

    public djza(String str, djtc djtcVar) {
        if (str == null) {
            throw new NullPointerException("Null simId");
        }
        this.a = str;
        this.b = djtcVar;
    }

    @Override // defpackage.dkam
    public final djtc a() {
        return this.b;
    }

    @Override // defpackage.dkam
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkam) {
            dkam dkamVar = (dkam) obj;
            if (this.a.equals(dkamVar.b()) && this.b.equals(dkamVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AvailabilityUpdate{simId=" + this.a + ", rcsAvailability=" + this.b.toString() + "}";
    }
}
