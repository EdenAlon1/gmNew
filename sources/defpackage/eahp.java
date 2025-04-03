package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eahp extends eaib {
    private final exwl a;
    private final int b;

    public eahp(exwl exwlVar, int i) {
        this.a = exwlVar;
        this.b = i;
    }

    @Override // defpackage.eaib
    public final exwl a() {
        return this.a;
    }

    @Override // defpackage.eaib
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eaib) {
            eaib eaibVar = (eaib) obj;
            if (this.a.equals(eaibVar.a()) && this.b == eaibVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.b;
        return a.d(i != 1 ? i != 2 ? "PLACEHOLDER" : "ENCRYPTED" : "CLEARTEXT", this.a.toString(), "ExtractedPayloadData{androidPayload=", ", pushPayloadType=", "}");
    }
}
