package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmgy implements ffjm {
    final /* synthetic */ dmzz a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;

    public dmgy(dmzz dmzzVar, String str, long j) {
        this.a = dmzzVar;
        this.b = str;
        this.c = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            c = ebs.c(hvi.e, 1.0f);
            dmzz dmzzVar = this.a;
            String str = this.b;
            long j = this.c;
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
            dwho.a(dnaa.a(dmzzVar, hfdVar), str, dyi.a.a(ebs.c(hvi.e, 0.5f), hum.e), j, hfdVar, 0, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
