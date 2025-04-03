package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cenm {
    public final String a;
    public final int b;

    public cenm(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cenm)) {
            return false;
        }
        cenm cenmVar = (cenm) obj;
        return ffkj.e(this.a, cenmVar.a) && this.b == cenmVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "StageNameAndDurationData(stageName=" + this.a + ", stageDuration=" + this.b + ")";
    }
}
