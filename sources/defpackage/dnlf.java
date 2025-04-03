package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnlf implements dnlg {
    public final dmzz a;
    public final String b;

    public dnlf(dmzz dmzzVar, String str) {
        dmzzVar.getClass();
        this.a = dmzzVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnlf)) {
            return false;
        }
        dnlf dnlfVar = (dnlf) obj;
        return this.a == dnlfVar.a && ffkj.e(this.b, dnlfVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ", bottomLabel=" + this.b + ")";
    }

    public /* synthetic */ dnlf(dmzz dmzzVar) {
        this(dmzzVar, null);
    }
}
