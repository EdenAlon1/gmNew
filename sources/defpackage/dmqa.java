package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmqa implements ffjn {
    final /* synthetic */ dmrp a;

    public dmqa(dmrp dmrpVar) {
        this.a = dmrpVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        ((crw) obj).getClass();
        hfdVar.v(847645573);
        boolean D = hfdVar.D(this.a);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            final dmrp dmrpVar = this.a;
            f = new ffji() { // from class: dmpy
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    ((hgp) obj4).getClass();
                    dmrp dmrpVar2 = dmrp.this;
                    if (dmrpVar2 != null) {
                        dmrpVar2.a.invoke();
                    }
                    return new dmpz(dmrpVar2);
                }
            };
            hfdVar.y(f);
        }
        hfdVar.o();
        hgs.c(this.a, (ffji) f, hfdVar);
        dmqd.g(hfdVar, 0);
        return ffcu.a;
    }
}
