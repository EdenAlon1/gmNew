package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akdm {
    public final boolean a;
    public final boolean b;
    public final eqom c;
    public final UUID d;
    public final akdj e;
    public final dfkd f;

    public akdm(boolean z, boolean z2, eqom eqomVar, UUID uuid, akdj akdjVar, dfkd dfkdVar) {
        akdjVar.getClass();
        this.a = z;
        this.b = z2;
        this.c = eqomVar;
        this.d = uuid;
        this.e = akdjVar;
        this.f = dfkdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akdm)) {
            return false;
        }
        akdm akdmVar = (akdm) obj;
        return this.a == akdmVar.a && this.b == akdmVar.b && this.c == akdmVar.c && ffkj.e(this.d, akdmVar.d) && ffkj.e(this.e, akdmVar.e) && this.f == akdmVar.f;
    }

    public final int hashCode() {
        eqom eqomVar = this.c;
        int hashCode = eqomVar == null ? 0 : eqomVar.hashCode();
        boolean z = this.a;
        boolean z2 = this.b;
        UUID uuid = this.d;
        int a = (((((((akdl.a(z) * 31) + akdl.a(z2)) * 31) + hashCode) * 31) + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.e.hashCode();
        dfkd dfkdVar = this.f;
        return (a * 31) + (dfkdVar != null ? dfkdVar.hashCode() : 0);
    }

    public final String toString() {
        return "RestoreCustomD2DItemResult(isSuccess=" + this.a + ", shouldLogSuccess=" + this.b + ", failureReason=" + this.c + ", sessionId=" + this.d + ", result=" + this.e + ", source=" + this.f + ")";
    }

    public /* synthetic */ akdm(eqom eqomVar, UUID uuid, akdj akdjVar, dfkd dfkdVar, int i) {
        this(false, (i & 2) != 0, (i & 4) != 0 ? null : eqomVar, uuid, akdjVar, (i & 32) != 0 ? null : dfkdVar);
    }
}
