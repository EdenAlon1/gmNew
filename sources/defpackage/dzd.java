package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzd extends jeu implements ion, iro {
    private final ecd a;
    private final ffjm b;
    private final hho c;

    public dzd(ecd ecdVar, ffjm ffjmVar) {
        this.a = ecdVar;
        this.b = ffjmVar;
        this.c = new hic(ecdVar, hla.a);
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

    @Override // defpackage.iro
    public final void d(irw irwVar) {
        this.c.b(new dze(this.a, (ecd) irwVar.r(ecm.a)));
    }

    @Override // defpackage.ion
    public final /* synthetic */ int e(iny inyVar, inx inxVar, int i) {
        return iom.a(this, inyVar, inxVar, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzd)) {
            return false;
        }
        dzd dzdVar = (dzd) obj;
        return ffkj.e(this.a, dzdVar.a) && this.b == dzdVar.b;
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
        ecd ecdVar = this.a;
        return (((dxb) ecdVar).a * 31) + this.b.hashCode();
    }

    @Override // defpackage.ion
    public final ipo i(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        ipo ei2;
        int intValue = ((Number) this.b.a((ecd) this.c.a(), ipqVar)).intValue();
        if (intValue == 0) {
            ei2 = ipqVar.ei(0, 0, ffem.a, dzb.a);
            return ei2;
        }
        iqk e = iplVar.e(jzk.m(j, 0, 0, intValue, intValue, 3));
        ei = ipqVar.ei(e.a, intValue, ffem.a, new dzc(e));
        return ei;
    }
}
