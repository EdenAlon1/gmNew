package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlt {
    public final dmzz a;
    public final int b;
    public final Integer c;
    public final xls d;
    public final Integer e;

    public xlt(dmzz dmzzVar, int i, Integer num, xls xlsVar, Integer num2) {
        dmzzVar.getClass();
        this.a = dmzzVar;
        this.b = i;
        this.c = num;
        this.d = xlsVar;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlt)) {
            return false;
        }
        xlt xltVar = (xlt) obj;
        return this.a == xltVar.a && this.b == xltVar.b && ffkj.e(this.c, xltVar.c) && this.d == xltVar.d && ffkj.e(this.e, xltVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.c;
        int hashCode2 = (((hashCode + this.b) * 31) + (num == null ? 0 : num.hashCode())) * 31;
        xls xlsVar = this.d;
        int hashCode3 = (hashCode2 + (xlsVar == null ? 0 : xlsVar.hashCode())) * 31;
        Integer num2 = this.e;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "SendIconData(icon=" + this.a + ", contentDescription=" + this.b + ", label=" + this.c + ", disabled=" + this.d + ", contentDescriptionWithProfile=" + this.e + ")";
    }

    public /* synthetic */ xlt(dmzz dmzzVar, int i, Integer num, Integer num2, int i2) {
        this(dmzzVar, i, (i2 & 4) != 0 ? null : num, (xls) null, (i2 & 16) != 0 ? null : num2);
    }
}
