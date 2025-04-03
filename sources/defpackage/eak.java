package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eak implements ion, iro, irv {
    private final ecd a;
    private final hho b;
    private final hho c;

    public eak(ecd ecdVar) {
        this.a = ecdVar;
        this.b = new hic(ecdVar, hla.a);
        this.c = new hic(ecdVar, hla.a);
    }

    private final ecd l() {
        return (ecd) this.b.a();
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
        ecd ecdVar = (ecd) irwVar.r(ecm.a);
        this.b.b(new dze(this.a, ecdVar));
        this.c.b(new eby(ecdVar, this.a));
    }

    @Override // defpackage.ion
    public final /* synthetic */ int e(iny inyVar, inx inxVar, int i) {
        return iom.a(this, inyVar, inxVar, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eak) {
            return ffkj.e(((eak) obj).a, this.a);
        }
        return false;
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
        return this.a.hashCode();
    }

    @Override // defpackage.ion
    public final ipo i(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        int b = l().b(ipqVar, ipqVar.q());
        int d = l().d(ipqVar);
        int c = l().c(ipqVar, ipqVar.q()) + b;
        int a = l().a(ipqVar) + d;
        iqk e = iplVar.e(jzl.h(j, -c, -a));
        int i = e.a + c;
        int i2 = e.b + a;
        ei = ipqVar.ei(jzl.c(j, i), jzl.b(j, i2), ffem.a, new eaj(e, b, d));
        return ei;
    }

    @Override // defpackage.irv
    public final irx j() {
        return ecm.a;
    }

    @Override // defpackage.irv
    public final /* synthetic */ Object k() {
        return (ecd) this.c.a();
    }
}
