package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayhf extends ayvk {
    public final String a;
    public final String b;
    private final String c;
    private final ayvl d;
    private final epvb e;
    private final epvh f;

    public ayhf(String str, String str2, String str3, ayvl ayvlVar, epvb epvbVar, epvh epvhVar) {
        if (str == null) {
            throw new NullPointerException("Null deviceCountry");
        }
        this.c = str;
        this.a = str2;
        this.b = str3;
        this.d = ayvlVar;
        this.e = epvbVar;
        this.f = epvhVar;
    }

    @Override // defpackage.ayvk
    public final ayvl a() {
        return this.d;
    }

    @Override // defpackage.ayvk
    public final epvb b() {
        return this.e;
    }

    @Override // defpackage.ayvk
    public final epvh c() {
        return this.f;
    }

    @Override // defpackage.ayvk
    public final String d() {
        return this.c;
    }

    @Override // defpackage.ayvk
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ayvl ayvlVar;
        epvb epvbVar;
        epvh epvhVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ayvk) {
            ayvk ayvkVar = (ayvk) obj;
            if (this.c.equals(ayvkVar.d()) && this.a.equals(ayvkVar.f()) && this.b.equals(ayvkVar.e()) && ((ayvlVar = this.d) != null ? ayvlVar.equals(ayvkVar.a()) : ayvkVar.a() == null) && ((epvbVar = this.e) != null ? epvbVar.equals(ayvkVar.b()) : ayvkVar.b() == null) && ((epvhVar = this.f) != null ? epvhVar.equals(ayvkVar.c()) : ayvkVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ayvk
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = ((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
        ayvl ayvlVar = this.d;
        int hashCode2 = ((hashCode * 1000003) ^ (ayvlVar == null ? 0 : ayvlVar.hashCode())) * 1000003;
        epvb epvbVar = this.e;
        int hashCode3 = (hashCode2 ^ (epvbVar == null ? 0 : epvbVar.hashCode())) * 1000003;
        epvh epvhVar = this.f;
        return hashCode3 ^ (epvhVar != null ? epvhVar.hashCode() : 0);
    }

    public final String toString() {
        epvh epvhVar = this.f;
        epvb epvbVar = this.e;
        return "AnonymizedDestination{deviceCountry=" + this.c + ", rawAnonymizedWithExplicitCountryCode=" + this.a + ", rawAnonymizedWithAnonymizedCountryCode=" + this.b + ", phoneAnonymizationResult=" + String.valueOf(this.d) + ", anonymizedBotInfo=" + String.valueOf(epvbVar) + ", anonymizedRcsGroupInfo=" + String.valueOf(epvhVar) + "}";
    }
}
