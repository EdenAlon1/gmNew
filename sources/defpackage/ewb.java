package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewb extends ffkk implements ffjn {
    final /* synthetic */ ibq a;
    final /* synthetic */ eva b;
    final /* synthetic */ jvu c;
    final /* synthetic */ jvj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewb(ibq ibqVar, eva evaVar, jvu jvuVar, jvj jvjVar) {
        super(3);
        this.a = ibqVar;
        this.b = evaVar;
        this.c = jvuVar;
        this.d = jvjVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Object obj4;
        hvi hviVar = (hvi) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-84507373);
        boolean booleanValue = ((Boolean) hfdVar.e(jdr.r)).booleanValue();
        boolean E = hfdVar.E(booleanValue);
        Object f = hfdVar.f();
        if (E || f == hfc.a) {
            f = new ezy(booleanValue);
            hfdVar.y(f);
        }
        ibq ibqVar = this.a;
        ezy ezyVar = (ezy) f;
        boolean z = true;
        if ((ibqVar instanceof idl) && ((idl) ibqVar).a == 16) {
            z = false;
        }
        if (((jgp) hfdVar.e(jdr.o)).b() && this.b.p() && jpm.i(this.c.c) && z) {
            hfdVar.v(808460990);
            jvu jvuVar = this.c;
            jpm jpmVar = new jpm(jvuVar.c);
            boolean F = hfdVar.F(ezyVar);
            Object f2 = hfdVar.f();
            if (F || f2 == hfc.a) {
                f2 = new evz(ezyVar, null);
                hfdVar.y(f2);
            }
            hgs.f(jvuVar.b, jpmVar, (ffjm) f2, hfdVar);
            boolean F2 = hfdVar.F(ezyVar) | hfdVar.F(this.d) | hfdVar.D(this.c) | hfdVar.F(this.b) | hfdVar.D(this.a);
            jvj jvjVar = this.d;
            jvu jvuVar2 = this.c;
            eva evaVar = this.b;
            ibq ibqVar2 = this.a;
            Object f3 = hfdVar.f();
            if (F2 || f3 == hfc.a) {
                Object ewaVar = new ewa(ezyVar, jvjVar, jvuVar2, evaVar, ibqVar2);
                hfdVar.y(ewaVar);
                f3 = ewaVar;
            }
            obj4 = hxs.c(hviVar, (ffji) f3);
            hfdVar.o();
        } else {
            hfdVar.v(810474750);
            hfdVar.o();
            obj4 = hvi.e;
        }
        hfdVar.o();
        return obj4;
    }
}
