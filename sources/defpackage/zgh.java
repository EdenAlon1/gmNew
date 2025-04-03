package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgh implements ffjp {
    final /* synthetic */ zgm a;

    public zgh(zgm zgmVar) {
        this.a = zgmVar;
    }

    @Override // defpackage.ffjp
    public final /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dspm dspmVar = (dspm) obj;
        hvi hviVar = (hvi) obj2;
        zgv zgvVar = (zgv) obj3;
        hfd hfdVar = (hfd) obj4;
        int intValue = ((Number) obj5).intValue();
        dspmVar.getClass();
        hviVar.getClass();
        zgvVar.getClass();
        fgcm fgcmVar = this.a.a;
        if (fgcmVar == null) {
            ffkj.c("currentPage");
            fgcmVar = null;
        }
        zfj zfjVar = (zfj) Map.EL.getOrDefault(zgvVar.a, fgcmVar.c(), null);
        ffxx ffxxVar = zfjVar != null ? zfjVar.a : null;
        hfdVar.v(-1518699045);
        hkx b = ffxxVar == null ? null : hkt.b(ffxxVar, null, null, hfdVar, 2);
        hfdVar.o();
        zhq zhqVar = b != null ? (zhq) b.a() : null;
        zgm zgmVar = this.a;
        hve hveVar = hvi.e;
        int i = huo.a;
        ipn a = dyc.a(hum.a, false);
        int a2 = hey.a(hfdVar);
        hgb c = hfdVar.c();
        hvi b2 = huz.b(hfdVar, hveVar);
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
        hlc.b(hfdVar, b2, iss.c);
        dyi dyiVar = dyi.a;
        boolean h = zgm.h(zgvVar);
        int i3 = dsrp.a;
        cru.b(h, null, dsrq.a, dsrq.b, null, hpx.d(-115763448, new zgg(zgmVar), hfdVar), hfdVar, 196608, 18);
        zha.a(dspmVar, dyiVar.a(hviVar, hum.b), zhqVar, hfdVar, intValue & 14);
        hfdVar.n();
        return ffcu.a;
    }
}
