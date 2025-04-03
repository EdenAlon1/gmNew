package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpyk implements ffjn {
    public static final dpyk a = new dpyk();

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            int i = huo.a;
            hus husVar = hum.n;
            hve hveVar = hvi.e;
            ipn a2 = ebm.a(dxu.a, husVar, hfdVar, 48);
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
            dwho.a(dnaa.a(dmzz.ds, hfdVar), null, ebs.k(hvi.e, 20.0f), gft.a(hfdVar).b, hfdVar, 432, 0);
            ebv.a(ebs.o(hvi.e, 8.0f), hfdVar);
            grl.b(jii.a(R.string.settings_button_text, hfdVar), null, gft.a(hfdVar).b, 0L, null, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, gft.d(hfdVar).m, hfdVar, 0, 0, 65018);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
