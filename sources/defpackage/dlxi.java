package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlxi implements ffjm {
    final /* synthetic */ dlvq a;
    final /* synthetic */ hvi b;
    final /* synthetic */ idh c;
    final /* synthetic */ kah d;

    public dlxi(dlvq dlvqVar, hvi hviVar, idh idhVar, kah kahVar) {
        this.a = dlvqVar;
        this.b = hviVar;
        this.c = idhVar;
        this.d = kahVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dlvq dlvqVar = this.a;
            dowd d = dlvqVar.d();
            dowd d2 = dlvqVar.d();
            boolean z = d2 != null ? d2.h : true;
            boolean z2 = dlvqVar instanceof dlvj ? ((dlvj) dlvqVar).a : false;
            hfdVar.v(-488778276);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = dlxc.a;
                hfdVar.y(f);
            }
            hfdVar.o();
            dowa.a(d, null, z, 5, z2, (ffjm) ((ffmq) f), hpx.d(-1211761644, new dlxh(this.a, this.b, this.c, this.d), hfdVar), hfdVar, 1772544, 2);
        }
        return ffcu.a;
    }
}
