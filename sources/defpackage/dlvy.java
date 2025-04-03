package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvy implements dlwa {
    public final dlyg a;
    public final String b;
    public final String c;
    public final dnwi d;
    public final boolean e;
    private final String f;

    public dlvy(dlyg dlygVar, String str, String str2, String str3, dnwi dnwiVar, boolean z) {
        dlygVar.getClass();
        str.getClass();
        str3.getClass();
        this.a = dlygVar;
        this.b = str;
        this.c = str2;
        this.f = str3;
        this.d = dnwiVar;
        this.e = z;
    }

    @Override // defpackage.dlwk
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlvy)) {
            return false;
        }
        dlvy dlvyVar = (dlvy) obj;
        return this.a == dlvyVar.a && ffkj.e(this.b, dlvyVar.b) && ffkj.e(this.c, dlvyVar.c) && ffkj.e(this.f, dlvyVar.f) && ffkj.e(this.d, dlvyVar.d) && this.e == dlvyVar.e;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        int hashCode2 = ((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.f.hashCode()) * 31;
        dnwi dnwiVar = this.d;
        return ((hashCode2 + (dnwiVar != null ? dnwiVar.hashCode() : 0)) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "Loaded(fileType=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", contentDescription=" + this.f + ", statusUiData=" + this.d + ", disableNewTimestampsForTalkback=" + this.e + ")";
    }
}
