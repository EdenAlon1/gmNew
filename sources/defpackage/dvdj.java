package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvdj extends dvdp {
    public final evts a;
    private final String c;
    private final long d;
    private final enhk e;
    private final exwa f;
    private final String g;

    public dvdj(String str, evts evtsVar, long j, enhk enhkVar, exwa exwaVar, String str2) {
        this.c = str;
        this.a = evtsVar;
        this.d = j;
        this.e = enhkVar;
        this.f = exwaVar;
        this.g = str2;
    }

    @Override // defpackage.dvdp
    public final long a() {
        return this.d;
    }

    @Override // defpackage.dvdp
    public final enhk b() {
        return this.e;
    }

    @Override // defpackage.dvdp
    public final evts c() {
        return this.a;
    }

    @Override // defpackage.dvdp
    public final exwa d() {
        return this.f;
    }

    @Override // defpackage.dvdp
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        exwa exwaVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvdp) {
            dvdp dvdpVar = (dvdp) obj;
            String str2 = this.c;
            if (str2 != null ? str2.equals(dvdpVar.e()) : dvdpVar.e() == null) {
                if (this.a.equals(dvdpVar.c()) && this.d == dvdpVar.a() && this.e.equals(dvdpVar.b()) && ((exwaVar = this.f) != null ? exwaVar.equals(dvdpVar.d()) : dvdpVar.d() == null) && ((str = this.g) != null ? str.equals(dvdpVar.f()) : dvdpVar.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dvdp
    public final String f() {
        return this.g;
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.a.hashCode();
        long j = this.d;
        int hashCode2 = (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode();
        exwa exwaVar = this.f;
        int hashCode3 = ((hashCode2 * 1000003) ^ (exwaVar == null ? 0 : exwaVar.hashCode())) * 1000003;
        String str2 = this.g;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        exwa exwaVar = this.f;
        enhk enhkVar = this.e;
        return "PromoContext{accountName=" + this.c + ", promotion=" + String.valueOf(this.a) + ", triggeringEventTimeMs=" + this.d + ", actionTypeIntentMap=" + String.valueOf(enhkVar) + ", versionedIdentifier=" + String.valueOf(exwaVar) + ", representativeTargetId=" + this.g + "}";
    }
}
