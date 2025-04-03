package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sow {
    public final boolean a;
    public final UUID b;
    public final boolean c;
    public final sos d;
    private final eqom e;

    public /* synthetic */ sow(boolean z, UUID uuid, eqom eqomVar, boolean z2, sos sosVar, int i) {
        this.a = z;
        this.b = (i & 2) != 0 ? null : uuid;
        this.e = (i & 4) != 0 ? null : eqomVar;
        this.c = (!((i & 8) == 0)) | z2;
        this.d = sosVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sow)) {
            return false;
        }
        sow sowVar = (sow) obj;
        return this.a == sowVar.a && ffkj.e(this.b, sowVar.b) && this.e == sowVar.e && this.c == sowVar.c && ffkj.e(this.d, sowVar.d);
    }

    public final int hashCode() {
        UUID uuid = this.b;
        int hashCode = uuid == null ? 0 : uuid.hashCode();
        boolean z = this.a;
        eqom eqomVar = this.e;
        return (((((((sov.a(z) * 31) + hashCode) * 31) + (eqomVar != null ? eqomVar.hashCode() : 0)) * 31) + sov.a(this.c)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "GetMetadataResult(isSuccess=" + this.a + ", sessionId=" + this.b + ", failureReason=" + this.e + ", shouldLog=" + this.c + ", result=" + this.d + ")";
    }
}
