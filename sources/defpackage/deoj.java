package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deoj implements ffjn {
    final /* synthetic */ deoa a;
    final /* synthetic */ god b;

    public deoj(deoa deoaVar, god godVar) {
        this.a = deoaVar;
        this.b = godVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        hvi c2;
        ebe ebeVar = (ebe) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ebeVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(ebeVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dekh dekhVar = (dekh) lnk.a(this.a.b, hfdVar).a();
            depe depeVar = (depe) lnk.a(this.a.d, hfdVar).a();
            deng dengVar = (deng) lnk.a(this.a.c, hfdVar).a();
            ffix ffixVar = (ffix) lnk.a(this.a.e, hfdVar).a();
            denc dencVar = (denc) lnk.a(this.a.f, hfdVar).a();
            int i = huo.a;
            boolean z = dekhVar instanceof deke;
            hun hunVar = hum.k;
            dxq dxqVar = z ? dxu.e : dxu.c;
            c = ebs.c(hvi.e, 1.0f);
            c2 = dix.c(eba.j(eba.c(c, ebeVar), 20.0f, 20.0f, 20.0f, 0.0f, 8), dix.a(0, hfdVar, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            hvi a = eao.a(c2, 2);
            deoa deoaVar = this.a;
            god godVar = this.b;
            ipn a2 = dyo.a(dxqVar, hunVar, hfdVar, 48);
            int a3 = hey.a(hfdVar);
            hgb c3 = hfdVar.c();
            hvi b = huz.b(hfdVar, a);
            int i2 = ist.a;
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a2, iss.e);
            hlc.b(hfdVar, c3, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            boolean z2 = dekhVar instanceof dekf;
            dys dysVar = dys.a;
            if (z2) {
                hfdVar.v(1444549868);
                deok.e(dysVar, depeVar, dencVar, deoaVar.h, hfdVar, 6);
                hfdVar.o();
            } else if (z) {
                hfdVar.v(1444553257);
                dwij.a(null, 0L, 0.0f, 0L, 0, 0.0f, hfdVar, 0, 63);
                hfdVar.o();
            } else {
                if (!(dekhVar instanceof dekg)) {
                    hfdVar.v(1444547566);
                    hfdVar.o();
                    throw new ffcd();
                }
                hfdVar.v(1444556362);
                deok.d(dysVar, dengVar, depeVar, (dekg) dekhVar, dencVar, godVar, ffixVar, deoaVar.h, hfdVar, 196678);
                hfdVar.o();
            }
            hfdVar.n();
        }
        return ffcu.a;
    }
}
