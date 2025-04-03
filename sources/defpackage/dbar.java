package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbar {
    public final String a;
    public final hkx b;

    public dbar(String str, hkx hkxVar) {
        hkxVar.getClass();
        this.a = str;
        this.b = hkxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbar)) {
            return false;
        }
        dbar dbarVar = (dbar) obj;
        return ffkj.e(this.a, dbarVar.a) && ffkj.e(this.b, dbarVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "OverviewCardRowData(label=" + this.a + ", valueState=" + this.b + ")";
    }
}
