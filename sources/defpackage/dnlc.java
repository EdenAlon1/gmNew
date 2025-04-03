package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnlc implements dndt {
    public final String a;
    public final dmzz b;
    public final boolean d;
    public final ffix e;
    public final String c = null;
    public final boolean f = true;

    public dnlc(String str, dmzz dmzzVar, boolean z, ffix ffixVar) {
        this.a = str;
        this.b = dmzzVar;
        this.d = z;
        this.e = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnlc)) {
            return false;
        }
        dnlc dnlcVar = (dnlc) obj;
        if (!ffkj.e(this.a, dnlcVar.a) || this.b != dnlcVar.b) {
            return false;
        }
        String str = dnlcVar.c;
        if (!ffkj.e(null, null) || this.d != dnlcVar.d || !ffkj.e(this.e, dnlcVar.e)) {
            return false;
        }
        boolean z = dnlcVar.f;
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dmzz dmzzVar = this.b;
        return ((((((hashCode + (dmzzVar == null ? 0 : dmzzVar.hashCode())) * 961) + dnlb.a(this.d)) * 31) + this.e.hashCode()) * 31) + dnlb.a(true);
    }

    public final String toString() {
        return "SwitchListItemUiData(title=" + this.a + ", icon=" + this.b + ", subtitle=null, isChecked=" + this.d + ", onToggle=" + this.e + ", isEnabled=true)";
    }
}
