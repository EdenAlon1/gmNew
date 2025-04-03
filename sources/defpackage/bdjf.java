package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdjf extends bdne {
    private final byzb a;
    private final String b;

    public bdjf(byzb byzbVar, String str) {
        if (byzbVar == null) {
            throw new NullPointerException("Null recipientType");
        }
        this.a = byzbVar;
        if (str == null) {
            throw new NullPointerException("Null recipientValue");
        }
        this.b = str;
    }

    @Override // defpackage.bdne
    public final byzb a() {
        return this.a;
    }

    @Override // defpackage.bdne
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdne) {
            bdne bdneVar = (bdne) obj;
            if (this.a.equals(bdneVar.a()) && this.b.equals(bdneVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RecipientInfo{recipientType=" + this.a.toString() + ", recipientValue=" + this.b + "}";
    }
}
