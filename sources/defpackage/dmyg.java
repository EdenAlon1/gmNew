package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmyg {
    public final String a;
    public final boolean b;
    public final dmzz c;
    public final ffix d;

    public /* synthetic */ dmyg(String str, boolean z, dmzz dmzzVar, ffix ffixVar, int i) {
        this.a = str;
        this.b = (!((i & 2) == 0)) | z;
        this.c = (i & 4) != 0 ? null : dmzzVar;
        this.d = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmyg)) {
            return false;
        }
        dmyg dmygVar = (dmyg) obj;
        return ffkj.e(this.a, dmygVar.a) && this.b == dmygVar.b && this.c == dmygVar.c && ffkj.e(this.d, dmygVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dmzz dmzzVar = this.c;
        return ((((hashCode + (true != this.b ? 1237 : 1231)) * 31) + (dmzzVar == null ? 0 : dmzzVar.hashCode())) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ExtendedFabUiData(text=" + this.a + ", enabled=" + this.b + ", icon=" + this.c + ", onClick=" + this.d + ")";
    }
}
