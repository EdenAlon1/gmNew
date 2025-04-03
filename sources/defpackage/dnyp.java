package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnyp implements dnyr {
    public final dmzz a;
    public final dnlz b;
    public final dnlz c;
    public final dnlz d;
    public final boolean e;

    public dnyp(dmzz dmzzVar, dnlz dnlzVar, dnlz dnlzVar2, dnlz dnlzVar3, boolean z) {
        this.a = dmzzVar;
        this.b = dnlzVar;
        this.c = dnlzVar2;
        this.d = dnlzVar3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnyp)) {
            return false;
        }
        dnyp dnypVar = (dnyp) obj;
        return this.a == dnypVar.a && ffkj.e(this.b, dnypVar.b) && ffkj.e(this.c, dnypVar.c) && ffkj.e(this.d, dnypVar.d) && this.e == dnypVar.e;
    }

    public final int hashCode() {
        dmzz dmzzVar = this.a;
        int hashCode = dmzzVar == null ? 0 : dmzzVar.hashCode();
        dnlz dnlzVar = this.b;
        int hashCode2 = ((hashCode * 31) + (dnlzVar == null ? 0 : dnlzVar.hashCode())) * 31;
        dnlz dnlzVar2 = this.c;
        int hashCode3 = (hashCode2 + (dnlzVar2 == null ? 0 : dnlzVar2.hashCode())) * 31;
        dnlz dnlzVar3 = this.d;
        return ((hashCode3 + (dnlzVar3 != null ? dnlzVar3.hashCode() : 0)) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "GaiaSellPageContentItemUiData(headerIcon=" + this.a + ", header=" + this.b + ", body=" + this.c + ", bodyExtension=" + this.d + ", isFooter=" + this.e + ")";
    }
}
