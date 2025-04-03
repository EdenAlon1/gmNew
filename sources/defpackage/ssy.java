package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssy implements srq {
    public final dmdx a;
    public final ffix b;

    public ssy(dmdx dmdxVar, ffix ffixVar) {
        this.a = dmdxVar;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssy)) {
            return false;
        }
        ssy ssyVar = (ssy) obj;
        return ffkj.e(this.a, ssyVar.a) && ffkj.e(this.b, ssyVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FullBannerUiData(bannerUiData=" + this.a + ", onShownCallback=" + this.b + ")";
    }
}
