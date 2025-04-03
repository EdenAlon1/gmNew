package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmdn implements ffjn {
    final /* synthetic */ dmdt a;
    final /* synthetic */ ffix b;
    final /* synthetic */ ffjm c;

    public dmdn(dmdt dmdtVar, ffix ffixVar, ffjm ffjmVar) {
        this.a = dmdtVar;
        this.b = ffixVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        eqd eqdVar;
        long j;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi j2 = eba.j(hvi.e, 4.0f, 4.0f, 4.0f, 0.0f, 8);
            dmdt dmdtVar = this.a;
            hfdVar.v(346681694);
            int ordinal = dmdtVar.ordinal();
            if (ordinal == 0) {
                hfdVar.v(-1946092817);
                eqdVar = gft.c(hfdVar).d;
                hfdVar.o();
            } else {
                if (ordinal != 1) {
                    hfdVar.v(-1946094736);
                    hfdVar.o();
                    throw new ffcd();
                }
                hfdVar.v(-1946091020);
                eqdVar = gft.c(hfdVar).e;
                hfdVar.o();
            }
            eqd eqdVar2 = eqdVar;
            hfdVar.o();
            hfdVar.v(-2065540061);
            hfdVar.v(1244284579);
            boolean g = dooy.g(hfdVar);
            hfdVar.o();
            if (g) {
                hfdVar.v(-81858355);
                j = dooy.e(hfdVar).Q;
                hfdVar.o();
            } else {
                hfdVar.v(-81811297);
                j = gft.a(hfdVar).I;
                hfdVar.o();
            }
            hfdVar.o();
            hfdVar.v(1596922893);
            float f = true != dooy.g(hfdVar) ? 0.0f : 1.0f;
            hfdVar.o();
            hfdVar.v(112695920);
            boolean D = hfdVar.D(this.a) | hfdVar.D(this.b);
            final dmdt dmdtVar2 = this.a;
            final ffix ffixVar = this.b;
            Object f2 = hfdVar.f();
            if (D || f2 == hfc.a) {
                f2 = new ffix() { // from class: dmdm
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        if (dmdt.this == dmdt.b) {
                            ffixVar.invoke();
                        }
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            gpa.e((ffix) f2, j2, false, eqdVar2, j, 0L, f, null, null, this.c, hfdVar, 868);
        }
        return ffcu.a;
    }
}
