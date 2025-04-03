package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebmd extends ebmg {
    public final lld a;
    public final lld b;

    public ebmd(lld lldVar, lld lldVar2) {
        this.a = lldVar;
        this.b = lldVar2;
    }

    @Override // defpackage.ebmg
    public final lld a() {
        return this.b;
    }

    @Override // defpackage.ebmg
    public final lld b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebmg) {
            ebmg ebmgVar = (ebmg) obj;
            lld lldVar = this.a;
            if (lldVar != null ? lldVar.equals(ebmgVar.b()) : ebmgVar.b() == null) {
                lld lldVar2 = this.b;
                if (lldVar2 != null ? lldVar2.equals(ebmgVar.a()) : ebmgVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        lld lldVar = this.a;
        int hashCode = lldVar == null ? 0 : lldVar.hashCode();
        lld lldVar2 = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ (lldVar2 != null ? lldVar2.hashCode() : 0);
    }

    public final String toString() {
        lld lldVar = this.b;
        return "CardsLiveDatas{importantCards=" + String.valueOf(this.a) + ", commonActions=" + String.valueOf(lldVar) + "}";
    }
}
