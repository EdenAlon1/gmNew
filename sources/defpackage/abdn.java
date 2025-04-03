package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abdn {
    public final abmm a;
    public final zmz b;
    public final xen c;
    public final fgdj d;
    public final fgcq e;
    public final ffxx f;
    public final zeb g;
    public final ffxx h;
    public final fgdj i;
    public final ffjo j;
    public final ffji k;
    public final ffix l;
    public final boolean m;
    public final fgdj n;
    public final ffxx o;
    public final boolean p;
    public final abdm q;
    public final abeo r;

    public abdn(abmm abmmVar, zmz zmzVar, xen xenVar, fgdj fgdjVar, fgcq fgcqVar, ffxx ffxxVar, zeb zebVar, ffxx ffxxVar2, fgdj fgdjVar2, ffjo ffjoVar, ffji ffjiVar, ffix ffixVar, boolean z, fgdj fgdjVar3, abeo abeoVar, ffxx ffxxVar3, abdm abdmVar) {
        ffxxVar2.getClass();
        this.a = abmmVar;
        this.b = zmzVar;
        this.c = xenVar;
        this.d = fgdjVar;
        this.e = fgcqVar;
        this.f = ffxxVar;
        this.g = zebVar;
        this.h = ffxxVar2;
        this.i = fgdjVar2;
        this.j = ffjoVar;
        this.k = ffjiVar;
        this.l = ffixVar;
        this.m = z;
        this.n = fgdjVar3;
        this.r = abeoVar;
        this.o = ffxxVar3;
        this.p = true;
        this.q = abdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abdn)) {
            return false;
        }
        abdn abdnVar = (abdn) obj;
        if (!ffkj.e(this.a, abdnVar.a) || !ffkj.e(this.b, abdnVar.b) || !ffkj.e(this.c, abdnVar.c) || !ffkj.e(this.d, abdnVar.d) || !ffkj.e(this.e, abdnVar.e) || !ffkj.e(this.f, abdnVar.f) || !ffkj.e(this.g, abdnVar.g) || !ffkj.e(this.h, abdnVar.h) || !ffkj.e(this.i, abdnVar.i) || !ffkj.e(this.j, abdnVar.j) || !ffkj.e(this.k, abdnVar.k) || !ffkj.e(this.l, abdnVar.l) || this.m != abdnVar.m || !ffkj.e(this.n, abdnVar.n) || !ffkj.e(this.r, abdnVar.r) || !ffkj.e(this.o, abdnVar.o)) {
            return false;
        }
        boolean z = abdnVar.p;
        return ffkj.e(this.q, abdnVar.q);
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        zeb zebVar = this.g;
        int hashCode2 = ((((((((((((((((hashCode * 31) + (zebVar == null ? 0 : zebVar.hashCode())) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + abdk.a(this.m)) * 31) + this.n.hashCode()) * 31;
        abeo abeoVar = this.r;
        int hashCode3 = (hashCode2 + (abeoVar == null ? 0 : abeoVar.hashCode())) * 31;
        ffxx ffxxVar = this.o;
        return ((((hashCode3 + (ffxxVar != null ? ffxxVar.hashCode() : 0)) * 31) + abdk.a(true)) * 31) + this.q.hashCode();
    }

    public final String toString() {
        return "ConversationScreenUiData(topContentUiData=" + this.a + ", pagedMessageListUiData=" + this.b + ", bottomContentUiData=" + this.c + ", popupUiDataFlow=" + this.d + ", snackbarUiDataFlow=" + this.e + ", mlsWatermarkTopPaddingFlow=" + this.f + ", mlsWatermarkUiData=" + this.g + ", bottomContentHeightFlow=" + this.h + ", effectUiDataFlow=" + this.i + ", onLayoutRectUpdated=" + this.j + ", onZoomEvent=" + this.k + ", onEffectFinished=" + this.l + ", useSamsungColors=" + this.m + ", miniConversationDetailsUiDataFlow=" + this.n + ", backgroundLoader=" + this.r + ", projectorUiDataFlow=" + this.o + ", pinTopBar=true, flags=" + this.q + ")";
    }
}
