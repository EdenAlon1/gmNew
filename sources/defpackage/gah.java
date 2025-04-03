package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gah extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ fzr d;
    final /* synthetic */ jpo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gah(ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, fzr fzrVar, jpo jpoVar) {
        super(2);
        this.a = ffjmVar;
        this.b = ffjmVar2;
        this.c = ffjmVar3;
        this.d = fzrVar;
        this.e = jpoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi d;
        hvi d2;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            ffjm ffjmVar = this.a;
            ffjm ffjmVar2 = this.b;
            ffjm ffjmVar3 = this.c;
            fzr fzrVar = this.d;
            jpo jpoVar = this.e;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, d);
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
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar4 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar4);
            }
            hlc.b(hfdVar, b, iss.c);
            dxi dxiVar = (ffjmVar == null || ffjmVar2 == null) ? ffjmVar != null ? dxu.a : dxu.b : dxu.g;
            d2 = ebs.d(hvi.e, 1.0f);
            ipn a3 = ebm.a(dxiVar, hum.n, hfdVar, 48);
            int a4 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, d2);
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a3, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar5 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar5);
            }
            hlc.b(hfdVar, b2, iss.c);
            ebr ebrVar = ebr.a;
            if (ffjmVar != null) {
                hfdVar.v(-1246285088);
                grl.a(jpoVar, hpx.d(-962031352, new gag(ebrVar, ffjmVar), hfdVar), hfdVar, 48);
                hfdVar.o();
            } else {
                hfdVar.v(-1246094810);
                hfdVar.o();
            }
            if (ffjmVar2 == null) {
                hfdVar.v(-1246055875);
            } else {
                hfdVar.v(-1287121340);
                ffjmVar2.a(hfdVar, 0);
            }
            hfdVar.o();
            hfdVar.n();
            if (ffjmVar3 == null && ffjmVar == null && ffjmVar2 == null) {
                hfdVar.v(1726529477);
                hfdVar.o();
            } else {
                hfdVar.v(1726446831);
                gdo.a(null, 0.0f, fzrVar.x, hfdVar, 0, 3);
                hfdVar.o();
            }
            hfdVar.n();
        }
        return ffcu.a;
    }
}
