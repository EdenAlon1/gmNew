package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtkb extends ffkk implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ kgc b;
    final /* synthetic */ dtlg c;
    final /* synthetic */ dmae d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtkb(hho hhoVar, kgc kgcVar, dtlg dtlgVar, dmae dmaeVar) {
        super(2);
        this.a = hhoVar;
        this.b = kgcVar;
        this.c = dtlgVar;
        this.d = dmaeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.b(ffcu.a);
            this.b.c();
            kgc kgcVar = this.b;
            hfdVar.v(1960451446);
            kgb b = kgcVar.b();
            kfr a = b.a();
            kfr b2 = b.b();
            kfr c = b.c();
            boolean booleanValue = ((Boolean) hkf.a(this.c.b, hfdVar).a()).booleanValue();
            boolean booleanValue2 = ((Boolean) hkf.a(this.c.c, hfdVar).a()).booleanValue();
            hve hveVar = hvi.e;
            hfdVar.v(-75300113);
            boolean D = hfdVar.D(b2);
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new dtkc(b2);
                hfdVar.y(f);
            }
            hfdVar.o();
            hvi d = kgc.d(hveVar, a, (ffji) f);
            dtlg dtlgVar = this.c;
            dtih.a(booleanValue, booleanValue2, d, dtlgVar.f, dtlgVar.g, hfdVar, 0);
            dmae dmaeVar = this.d;
            hve hveVar2 = hvi.e;
            hfdVar.v(-75288305);
            boolean D2 = hfdVar.D(a) | hfdVar.D(c);
            Object f2 = hfdVar.f();
            if (D2 || f2 == hfc.a) {
                f2 = new dtkd(a, c);
                hfdVar.y(f2);
            }
            hfdVar.o();
            dmad.a(dmaeVar, kgc.d(hveVar2, b2, (ffji) f2), 0L, 0L, 3.0f, 7.0f, hfdVar, 221184, 12);
            dtca f3 = dtkp.f(this.c, dtce.c(hfdVar), hfdVar);
            f3.getClass();
            hve hveVar3 = hvi.e;
            hfdVar.v(-75272250);
            Object f4 = hfdVar.f();
            if (f4 == hfc.a) {
                f4 = dtke.a;
                hfdVar.y(f4);
            }
            hfdVar.o();
            dtce.a(f3, kgc.d(hveVar3, c, (ffji) f4), hfdVar, 0, 0);
            hfdVar.o();
            hfdVar.v(-2087871650);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
