package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnia implements dndt {
    public final String a;
    public final String b;
    public final dmzz c;
    public final boolean d;
    public final ffix e;

    public dnia(String str, String str2, dmzz dmzzVar, boolean z, ffix ffixVar) {
        ffixVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = dmzzVar;
        this.d = z;
        this.e = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnia)) {
            return false;
        }
        dnia dniaVar = (dnia) obj;
        return ffkj.e(this.a, dniaVar.a) && ffkj.e(this.b, dniaVar.b) && this.c == dniaVar.c && this.d == dniaVar.d && ffkj.e(this.e, dniaVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        dmzz dmzzVar = this.c;
        return ((((hashCode2 + (dmzzVar != null ? dmzzVar.hashCode() : 0)) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "RadioButtonListItemUiData(title=" + this.a + ", subtitle=" + this.b + ", icon=" + this.c + ", isSelected=" + this.d + ", onClick=" + this.e + ")";
    }

    public /* synthetic */ dnia(String str, String str2, boolean z, ffix ffixVar) {
        this(str, str2, null, z, ffixVar);
    }
}
