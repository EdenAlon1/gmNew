package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekbl {
    public final String a;
    public final String b;

    public ekbl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekbl)) {
            return false;
        }
        ekbl ekblVar = (ekbl) obj;
        return ffkj.e(this.a, ekblVar.a) && ffkj.e(this.b, ekblVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PackageAndFlagName(packageName=" + this.a + ", flagName=" + this.b + ")";
    }
}
