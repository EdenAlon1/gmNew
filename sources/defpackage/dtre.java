package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtre extends dtvz {
    public final dtyq a;
    public final dtry b;
    public final dtry c;
    public final String d;
    public final duap e;
    public final String f;
    public final boolean g;

    public dtre(dtyq dtyqVar, dtry dtryVar, dtry dtryVar2, String str, duap duapVar, String str2, boolean z) {
        this.a = dtyqVar;
        this.b = dtryVar;
        this.c = dtryVar2;
        this.d = str;
        this.e = duapVar;
        this.f = str2;
        this.g = z;
    }

    @Override // defpackage.dtvz
    public final dtry a() {
        return this.b;
    }

    @Override // defpackage.dtvz
    public final dtry b() {
        return this.c;
    }

    @Override // defpackage.dtvz
    public final dtyq c() {
        return this.a;
    }

    @Override // defpackage.dtvz
    public final duap d() {
        return this.e;
    }

    @Override // defpackage.dtvz
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        dtry dtryVar;
        dtry dtryVar2;
        String str;
        duap duapVar;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtvz) {
            dtvz dtvzVar = (dtvz) obj;
            if (this.a.equals(dtvzVar.c()) && ((dtryVar = this.b) != null ? dtryVar.equals(dtvzVar.a()) : dtvzVar.a() == null) && ((dtryVar2 = this.c) != null ? dtryVar2.equals(dtvzVar.b()) : dtvzVar.b() == null) && ((str = this.d) != null ? str.equals(dtvzVar.e()) : dtvzVar.e() == null) && ((duapVar = this.e) != null ? duapVar.equals(dtvzVar.d()) : dtvzVar.d() == null) && ((str2 = this.f) != null ? str2.equals(dtvzVar.f()) : dtvzVar.f() == null) && this.g == dtvzVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dtvz
    public final String f() {
        return this.f;
    }

    @Override // defpackage.dtvz
    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        dtry dtryVar = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (dtryVar == null ? 0 : dtryVar.hashCode())) * 1000003;
        dtry dtryVar2 = this.c;
        int hashCode3 = (hashCode2 ^ (dtryVar2 == null ? 0 : dtryVar2.hashCode())) * 1000003;
        String str = this.d;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        duap duapVar = this.e;
        int hashCode5 = (hashCode4 ^ (duapVar == null ? 0 : duapVar.hashCode())) * 1000003;
        String str2 = this.f;
        return ((hashCode5 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ (true != this.g ? 1237 : 1231);
    }

    public final String toString() {
        duap duapVar = this.e;
        dtry dtryVar = this.c;
        dtry dtryVar2 = this.b;
        return "JoinSpec{query=" + this.a.toString() + ", joinColumn=" + String.valueOf(dtryVar2) + ", parentJoinColumn=" + String.valueOf(dtryVar) + ", onClauseComparator=" + this.d + ", onClause=" + String.valueOf(duapVar) + ", retrievalTag=" + this.f + ", isExemptFromIndexRequirementOnJoinedColumn=" + this.g + "}";
    }
}
