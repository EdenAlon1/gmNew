package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsaq {
    public final int a;
    public final dsap b;

    public dsaq(int i, dsap dsapVar) {
        this.a = i;
        this.b = dsapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsaq)) {
            return false;
        }
        dsaq dsaqVar = (dsaq) obj;
        return this.a == dsaqVar.a && ffkj.e(this.b, dsaqVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ", tints=" + this.b + ")";
    }
}
