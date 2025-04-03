package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtrm extends duan {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final dtui d;
    public final String e;
    public final enip f;
    public final int g;
    public final duam h;

    public dtrm(boolean z, boolean z2, boolean z3, dtui dtuiVar, String str, enip enipVar, int i, duam duamVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = dtuiVar;
        this.e = str;
        this.f = enipVar;
        this.g = i;
        this.h = duamVar;
    }

    @Override // defpackage.duan
    public final int a() {
        return this.g;
    }

    @Override // defpackage.duan
    public final dtui b() {
        return this.d;
    }

    @Override // defpackage.duan
    public final duam c() {
        return this.h;
    }

    @Override // defpackage.duan
    public final enip d() {
        return this.f;
    }

    @Override // defpackage.duan
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        duam duamVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof duan) {
            duan duanVar = (duan) obj;
            if (this.a == duanVar.f() && this.b == duanVar.h() && this.c == duanVar.g() && this.d.equals(duanVar.b()) && ((str = this.e) != null ? str.equals(duanVar.e()) : duanVar.e() == null) && this.f.equals(duanVar.d()) && this.g == duanVar.a() && ((duamVar = this.h) != null ? duamVar.equals(duanVar.c()) : duanVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.duan
    public final boolean f() {
        return this.a;
    }

    @Override // defpackage.duan
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.duan
    public final boolean h() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode();
        String str = this.e;
        int hashCode2 = ((((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003;
        duam duamVar = this.h;
        return hashCode2 ^ (duamVar != null ? duamVar.hashCode() : 0);
    }

    public final String toString() {
        duam duamVar = this.h;
        enip enipVar = this.f;
        return "UpdateParameters{disableTableFilters=" + this.a + ", omitUnchangedRows=" + this.b + ", exemptFromQueryPlanChecking=" + this.c + ", loggingTag=" + this.d.toString() + ", databaseName=" + this.e + ", autoUpdateColumns=" + String.valueOf(enipVar) + ", conflictAlgorithm=" + this.g + ", valuesExpression=" + String.valueOf(duamVar) + "}";
    }
}
