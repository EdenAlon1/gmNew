package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adkn extends adkm {
    private final adko a = adko.FAILED;
    private final int b;

    public adkn(int i) {
        this.b = i;
    }

    @Override // defpackage.adkm
    public final adko a() {
        return this.a;
    }

    @Override // defpackage.adkm
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adkn) && this.b == ((adkn) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FailedCapabilityResult(umaCode=");
        int i = this.b;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN_CAPABILITY_CODE" : "REQUEST_FAILED_CODE" : "NOT_PERMITTED_CODE" : "FAILED_TO_SYNC_CODE" : "ERROR_CODE" : "UNKNOWN_RESPONSE_CODE"));
        sb.append(")");
        return sb.toString();
    }
}
