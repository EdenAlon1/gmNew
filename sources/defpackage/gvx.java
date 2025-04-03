package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvx extends jeu implements ion {
    private final boolean a;

    public gvx(boolean z) {
        this.a = z;
    }

    @Override // defpackage.hvi
    public final /* synthetic */ hvi a(hvi hviVar) {
        return hvd.a(this, hviVar);
    }

    @Override // defpackage.hvi
    public final /* synthetic */ Object b(Object obj, ffjm ffjmVar) {
        return hvf.a(this, obj, ffjmVar);
    }

    @Override // defpackage.hvi
    public final /* synthetic */ boolean c(ffji ffjiVar) {
        return hvf.b(this, ffjiVar);
    }

    @Override // defpackage.ion
    public final /* synthetic */ int e(iny inyVar, inx inxVar, int i) {
        return iom.a(this, inyVar, inxVar, i);
    }

    public final boolean equals(Object obj) {
        gvx gvxVar = obj instanceof gvx ? (gvx) obj : null;
        return gvxVar != null && this.a == gvxVar.a;
    }

    @Override // defpackage.ion
    public final /* synthetic */ int f(iny inyVar, inx inxVar, int i) {
        return iom.b(this, inyVar, inxVar, i);
    }

    @Override // defpackage.ion
    public final /* synthetic */ int g(iny inyVar, inx inxVar, int i) {
        return iom.c(this, inyVar, inxVar, i);
    }

    @Override // defpackage.ion
    public final /* synthetic */ int h(iny inyVar, inx inxVar, int i) {
        return iom.d(this, inyVar, inxVar, i);
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    @Override // defpackage.ion
    public final ipo i(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        ipo ei2;
        iqk e = iplVar.e(j);
        if (this.a) {
            ei = ipqVar.ei(e.a, e.b, ffem.a, new gvw(e));
            return ei;
        }
        ei2 = ipqVar.ei(0, 0, ffem.a, gvv.a);
        return ei2;
    }
}
