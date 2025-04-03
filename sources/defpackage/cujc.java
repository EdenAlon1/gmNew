package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cujc {
    public final int a;
    public final String b;

    public cujc(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cujc)) {
            return false;
        }
        cujc cujcVar = (cujc) obj;
        return this.a == cujcVar.a && ffkj.e(this.b, cujcVar.b);
    }

    public final int hashCode() {
        String str = this.b;
        return (this.a * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SubIdAndSelfDestination(subId=" + this.a + ", selfNormalizedDestination=" + this.b + ")";
    }
}
