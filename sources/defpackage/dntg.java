package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dntg implements dnsp {
    public final dnym a;
    public final dntf b;

    public dntg(dnym dnymVar, dntf dntfVar) {
        this.a = dnymVar;
        this.b = dntfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dntg)) {
            return false;
        }
        dntg dntgVar = (dntg) obj;
        return ffkj.e(this.a, dntgVar.a) && ffkj.e(this.b, dntgVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.a;
    }

    public final String toString() {
        return "MetatextMonogramItemUiData(monogram=" + this.a + ", flags=" + this.b + ")";
    }
}
