package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvu implements dlvw {
    public final String a;
    public final dnwq b;
    public final dnwi c;
    public final boolean d;
    public final boolean e;
    private final String f;

    public dlvu(String str, dnwq dnwqVar, String str2, dnwi dnwiVar, boolean z, boolean z2) {
        this.a = str;
        this.b = dnwqVar;
        this.f = str2;
        this.c = dnwiVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.dlwk
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlvu)) {
            return false;
        }
        dlvu dlvuVar = (dlvu) obj;
        return ffkj.e(this.a, dlvuVar.a) && ffkj.e(this.b, dlvuVar.b) && ffkj.e(this.f, dlvuVar.f) && ffkj.e(this.c, dlvuVar.c) && this.d == dlvuVar.d && this.e == dlvuVar.e;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.f.hashCode();
        dnwi dnwiVar = this.c;
        return (((((hashCode * 31) + (dnwiVar == null ? 0 : dnwiVar.hashCode())) * 31) + dlvt.a(this.d)) * 31) + dlvt.a(this.e);
    }

    public final String toString() {
        return "Info(name=" + this.a + ", image=" + this.b + ", contentDescription=" + this.f + ", statusUiData=" + this.c + ", enableInBubbleReadReceipts=" + this.d + ", disableNewTimestampsForTalkback=" + this.e + ")";
    }
}
