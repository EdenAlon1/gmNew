package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aico implements ffjn {
    final /* synthetic */ aicj a;
    final /* synthetic */ rva b;

    public aico(aicj aicjVar, rva rvaVar) {
        this.a = aicjVar;
        this.b = rvaVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebe) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-289563960);
            c = ebs.c(hvi.e, 1.0f);
            hfdVar.o();
            aicj aicjVar = this.a;
            int i = huo.a;
            ipn a = dyc.a(hum.a, false);
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
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            fgdj fgdjVar = aicjVar.c;
            dyi dyiVar = dyi.a;
            hfdVar.v(-43228120);
            hvi a3 = dyiVar.a(hvr.a(hvi.e, 3.0f), hum.i);
            hfdVar.v(-43227574);
            hvi c3 = aicjVar.f.a ? eba.c(ecm.b(a3, new eat(ecv.f(hfdVar), 32)), eba.h(0.0f, 0.0f, 16.0f, 17.0f, 3)) : eba.c(ecs.a(a3), eba.h(0.0f, 0.0f, 16.0f, 17.0f, 3));
            hfdVar.o();
            hfdVar.o();
            aicc.a(fgdjVar, c3, hfdVar, 0);
            ahvv.b(aicjVar.e, hvr.a(hvi.e, 2.0f), hfdVar, 48);
            aicp.a(aicjVar, hfdVar, 0);
            hfdVar.n();
            cwni.a(this.b, ibw.g, false, null, hfdVar, 48, 12);
        }
        return ffcu.a;
    }
}
