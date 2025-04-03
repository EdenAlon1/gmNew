package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuco {
    public final cula a;
    public final erer b;

    public cuco(cula culaVar, erer ererVar) {
        this.a = culaVar;
        this.b = ererVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuco)) {
            return false;
        }
        cuco cucoVar = (cuco) obj;
        return ffkj.e(this.a, cucoVar.a) && this.b == cucoVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Verdict(confidenceScore=" + this.a + ", outcome=" + this.b + ")";
    }
}
