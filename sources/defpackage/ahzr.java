package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahzr {
    public final fgdj a;
    public final ffxx b;
    public final fgdj c;
    public final ffji d;
    public final ffix e;
    public final ffix f;
    public final ahzq g;

    public ahzr(fgdj fgdjVar, ffxx ffxxVar, fgdj fgdjVar2, ffji ffjiVar, ffix ffixVar, ffix ffixVar2, ahzq ahzqVar) {
        fgdjVar.getClass();
        ffxxVar.getClass();
        this.a = fgdjVar;
        this.b = ffxxVar;
        this.c = fgdjVar2;
        this.d = ffjiVar;
        this.e = ffixVar;
        this.f = ffixVar2;
        this.g = ahzqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahzr)) {
            return false;
        }
        ahzr ahzrVar = (ahzr) obj;
        return ffkj.e(this.a, ahzrVar.a) && ffkj.e(this.b, ahzrVar.b) && ffkj.e(this.c, ahzrVar.c) && ffkj.e(this.d, ahzrVar.d) && ffkj.e(this.e, ahzrVar.e) && ffkj.e(this.f, ahzrVar.f) && ffkj.e(this.g, ahzrVar.g);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "MultiShareListUiData(conversationsFlow=" + this.a + ", contactsFlow=" + this.b + ", headerIndexFlow=" + this.c + ", onMultiShareListScroll=" + this.d + ", onMultiShareListInteractive=" + this.e + ", onActivateFastScroll=" + this.f + ", flags=" + this.g + ")";
    }
}
