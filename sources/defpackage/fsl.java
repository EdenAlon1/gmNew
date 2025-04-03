package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsl extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;
    final /* synthetic */ long g;
    final /* synthetic */ ffjm h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsl(ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, long j, long j2, long j3, long j4, ffjm ffjmVar4) {
        super(2);
        this.a = ffjmVar;
        this.b = ffjmVar2;
        this.c = ffjmVar3;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = ffjmVar4;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ffjm ffjmVar;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi c = eba.c(hvi.e, fsx.a);
            ffjm ffjmVar2 = this.a;
            ffjm ffjmVar3 = this.b;
            ffjm ffjmVar4 = this.c;
            long j = this.d;
            long j2 = this.e;
            long j3 = this.f;
            long j4 = this.g;
            ffjm ffjmVar5 = this.h;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a2 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, c);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar6 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar6);
            }
            hlc.b(hfdVar, b, iss.c);
            if (ffjmVar2 == null) {
                hfdVar.v(455423196);
            } else {
                hfdVar.v(455423197);
                hfz.a(fzc.a.c(new ibw(j)), hpx.d(934657765, new fsi(ffjmVar2), hfdVar), hfdVar, 56);
            }
            hfdVar.o();
            if (ffjmVar3 == null) {
                hfdVar.v(455727368);
                hfdVar.o();
                ffjmVar = ffjmVar5;
            } else {
                hfdVar.v(455727369);
                ffjmVar = ffjmVar5;
                hca.a(j2, gvu.a(hdv.b, hfdVar), hpx.d(434448772, new fsj(ffjmVar2, ffjmVar3), hfdVar), hfdVar, 384);
                hfdVar.o();
            }
            if (ffjmVar4 == null) {
                hfdVar.v(456503856);
            } else {
                hfdVar.v(456503857);
                hca.a(j3, gvu.a(hdv.c, hfdVar), hpx.d(-796843771, new fsk(ffjmVar4), hfdVar), hfdVar, 384);
            }
            hfdVar.o();
            hvi a3 = dys.a(hvi.e, hum.l);
            ipn a4 = dyc.a(hum.a, false);
            int a5 = hey.a(hfdVar);
            hgb c3 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, a3);
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a4, iss.e);
            hlc.b(hfdVar, c3, iss.d);
            ffjm ffjmVar7 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar7);
            }
            hlc.b(hfdVar, b2, iss.c);
            hca.a(j4, gvu.a(hdv.a, hfdVar), ffjmVar, hfdVar, 0);
            hfdVar.n();
            hfdVar.n();
        }
        return ffcu.a;
    }
}
