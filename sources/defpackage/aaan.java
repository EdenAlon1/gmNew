package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaan implements dnoq {
    public final dmfu a;
    public final dnoq b;

    public aaan(dmfu dmfuVar, dnoq dnoqVar) {
        this.a = dmfuVar;
        this.b = dnoqVar;
    }

    @Override // defpackage.dnoq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final ffix b() {
        return this.a.b;
    }

    @Override // defpackage.dnoq
    public final ffix c() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaan)) {
            return false;
        }
        aaan aaanVar = (aaan) obj;
        return ffkj.e(this.a, aaanVar.a) && ffkj.e(this.b, aaanVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dnoq dnoqVar = this.b;
        return hashCode + (dnoqVar == null ? 0 : dnoqVar.hashCode());
    }

    public final String toString() {
        return "BugleBreadcrumbBubbleUiData(data=" + this.a + ", replacedData=" + this.b + ")";
    }
}
