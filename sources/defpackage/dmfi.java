package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmfi implements dmfk {
    public final dmzz a;
    public final dnlz b;
    public final dnlz c;
    public final dnlz d;
    public final boolean e;

    public dmfi() {
        this(null, null, null, null, false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmfi)) {
            return false;
        }
        dmfi dmfiVar = (dmfi) obj;
        return this.a == dmfiVar.a && ffkj.e(this.b, dmfiVar.b) && ffkj.e(this.c, dmfiVar.c) && ffkj.e(this.d, dmfiVar.d) && this.e == dmfiVar.e;
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
        return "GaiaOptInContentItemUiData(headerIcon=" + this.a + ", header=" + this.b + ", body=" + this.c + ", bodyExtension=" + this.d + ", isFooter=" + this.e + ")";
    }

    public /* synthetic */ dmfi(dmzz dmzzVar, dnlz dnlzVar, dnlz dnlzVar2, dnlz dnlzVar3, boolean z, int i) {
        this.a = 1 == (i & 1) ? null : dmzzVar;
        this.b = (i & 2) != 0 ? null : dnlzVar;
        this.c = (i & 4) != 0 ? null : dnlzVar2;
        this.d = (i & 8) != 0 ? null : dnlzVar3;
        this.e = ((i & 16) == 0) & z;
    }
}
