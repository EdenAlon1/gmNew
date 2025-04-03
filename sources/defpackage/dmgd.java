package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmgd implements ffjm {
    final /* synthetic */ dmgh a;

    public dmgd(dmgh dmghVar) {
        this.a = dmghVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmgh dmghVar = this.a;
            hvi hviVar = hvi.e;
            if (dmghVar.c) {
                hviVar = cry.b(hvi.e);
            }
            int i = huo.a;
            dmgh dmghVar2 = this.a;
            ipn a = ebm.a(dxu.a, hum.n, hfdVar, 48);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, hviVar);
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
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            dmzz dmzzVar = dmghVar2.b;
            hfdVar.v(36914755);
            if (dmzzVar != null) {
                dmgf.a(dmzzVar, hfdVar, 0);
            }
            hfdVar.o();
            dmgf.b(dmghVar2.a, dmghVar2.b != null, hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
