package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avlf extends avlk {
    private final enip a;

    public avlf(enip enipVar) {
        if (enipVar == null) {
            throw new NullPointerException("Null capabilityTags");
        }
        this.a = enipVar;
    }

    @Override // defpackage.avlk
    public final enip a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avlk) {
            return this.a.equals(((avlk) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RcsCapabilities{capabilityTags=" + this.a.toString() + "}";
    }
}
