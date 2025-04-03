package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbke implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ ffix b;
    final /* synthetic */ boolean c;
    final /* synthetic */ String d;

    public dbke(String str, ffix ffixVar, boolean z, String str2) {
        this.a = str;
        this.b = ffixVar;
        this.c = z;
        this.d = str2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi a;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi d = eba.d(hvi.e, 12.0f);
            int i = huo.a;
            String str = this.a;
            ffix ffixVar = this.b;
            boolean z = this.c;
            String str2 = this.d;
            ipn a2 = ebm.a(dxu.a, hum.n, hfdVar, 48);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, d);
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
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            a = ebr.a.a(hvi.e, 1.0f, true);
            dwjt.b(str, a, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131068);
            dwfj.b(ffixVar, null, z, null, null, null, null, hpx.d(-1240457261, new dbkd(str2), hfdVar), hfdVar, 805306368, 506);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
