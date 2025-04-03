package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bdjg extends bdnj {
    private final byzb a;
    private final String b;

    public bdjg(byzb byzbVar, String str) {
        if (byzbVar == null) {
            throw new NullPointerException("Null recipientType");
        }
        this.a = byzbVar;
        if (str == null) {
            throw new NullPointerException("Null recipientValue");
        }
        this.b = str;
    }

    @Override // defpackage.bdnj
    public final byzb a() {
        return this.a;
    }

    @Override // defpackage.bdnj
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdnj) {
            bdnj bdnjVar = (bdnj) obj;
            if (this.a.equals(bdnjVar.a()) && this.b.equals(bdnjVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MessageDestinationRowInfo{recipientType=" + this.a.toString() + ", recipientValue=" + this.b + "}";
    }
}
