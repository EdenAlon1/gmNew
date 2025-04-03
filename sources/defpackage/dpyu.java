package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpyu implements ffjn {
    public static final dpyu a = new dpyu();

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dxn dxnVar = new dxn(8.0f, true, dxr.a);
            int i = huo.a;
            hus husVar = hum.n;
            hve hveVar = hvi.e;
            ipn a2 = ebm.a(dxnVar, husVar, hfdVar, 54);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, hveVar);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
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
            dwho.a(dnaa.a(dmzz.bi, hfdVar), null, null, 0L, hfdVar, 48, 12);
            grl.b(jii.a(R.string.folders_button, hfdVar), null, 0L, kal.c(14), null, null, null, 0L, null, kal.c(20), 0, false, 0, 0, null, jpo.y(gft.d(hfdVar).m, gft.a(hfdVar).q, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), hfdVar, 3072, 6, 64502);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
