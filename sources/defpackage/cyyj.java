package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyyj {
    public final String a;
    public final List b;
    public final cyxt c;
    public final ffix d;
    public final czaj e;
    public final cyyi f;

    public cyyj(String str, List list, cyxt cyxtVar, ffix ffixVar, czaj czajVar, cyyi cyyiVar) {
        czajVar.getClass();
        this.a = str;
        this.b = list;
        this.c = cyxtVar;
        this.d = ffixVar;
        this.e = czajVar;
        this.f = cyyiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyyj)) {
            return false;
        }
        cyyj cyyjVar = (cyyj) obj;
        return ffkj.e(this.a, cyyjVar.a) && ffkj.e(this.b, cyyjVar.b) && ffkj.e(this.c, cyyjVar.c) && ffkj.e(this.d, cyyjVar.d) && this.e == cyyjVar.e && ffkj.e(this.f, cyyjVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "PhotoSelectorUiData(title=" + this.a + ", photos=" + this.b + ", primaryButtonUiData=" + this.c + ", onDismiss=" + this.d + ", visibilityState=" + this.e + ", flags=" + this.f + ")";
    }
}
