package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zns implements ffjo {
    final /* synthetic */ zkp a;
    final /* synthetic */ zmz b;
    final /* synthetic */ eey c;
    final /* synthetic */ hkx d;
    final /* synthetic */ cxj e;

    public zns(zkp zkpVar, zmz zmzVar, eey eeyVar, hkx hkxVar, cxj cxjVar) {
        this.a = zkpVar;
        this.b = zmzVar;
        this.c = eeyVar;
        this.d = hkxVar;
        this.e = cxjVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        zqy zqyVar;
        final int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue2 = ((Number) obj4).intValue();
        ((edi) obj).getClass();
        if ((intValue2 & 48) == 0) {
            intValue2 |= true != hfdVar.B(intValue) ? 16 : 32;
        }
        if ((intValue2 & 145) == 144 && hfdVar.I()) {
            hfdVar.s();
        } else {
            zkp zkpVar = this.a;
            hfdVar.v(-324173789);
            Object a = zkpVar.c.a();
            a.getClass();
            if (((Boolean) a).booleanValue() && ((Boolean) zkpVar.b.a()).booleanValue()) {
                hfdVar.v(-783324038);
                zqz zqzVar = (zqz) zkpVar.a.g(intValue);
                axrc b = zqzVar != null ? zqzVar.b() : null;
                zqyVar = b != null ? (zqy) zkx.a(b, hfdVar) : null;
                hfdVar.o();
            } else {
                hfdVar.v(-783255745);
                zqz zqzVar2 = (zqz) zkpVar.a.f(intValue);
                axrc b2 = zqzVar2 != null ? zqzVar2.b() : null;
                zqyVar = b2 != null ? (zqy) zkx.a(b2, hfdVar) : null;
                hfdVar.o();
            }
            final zqy zqyVar2 = zqyVar;
            hfdVar.o();
            if (zqyVar2 != null) {
                hfdVar.v(1241382074);
                hfdVar.v(1148423367);
                if (intValue == 0) {
                    zoz.c(zqyVar2, this.b, hfdVar, 0);
                    zoz.a(this.b, this.c, zqyVar2, hfdVar, 0);
                    intValue = 0;
                }
                hfdVar.o();
                zrl.a(zqyVar2, ((Boolean) this.d.a()).booleanValue(), this.e, hfdVar, 512, 0);
                hfdVar.v(1148431292);
                boolean D = hfdVar.D(this.b) | ((intValue2 & 112) == 32) | hfdVar.D(zqyVar2);
                final zmz zmzVar = this.b;
                Object f = hfdVar.f();
                if (D || f == hfc.a) {
                    f = new ffji() { // from class: znq
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj5) {
                            ((hgp) obj5).getClass();
                            return new znr(zmz.this, intValue, zqyVar2);
                        }
                    };
                    hfdVar.y(f);
                }
                hfdVar.o();
                hgs.c(zqyVar2, (ffji) f, hfdVar);
                hfdVar.o();
            } else {
                hfdVar.v(1241709217);
                dnts.c(hfdVar, 0);
                hfdVar.o();
            }
        }
        return ffcu.a;
    }
}
