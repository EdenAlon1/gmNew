package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyra implements ffjn {
    final /* synthetic */ cyrt a;

    public cyra(cyrt cyrtVar) {
        this.a = cyrtVar;
    }

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
            dxn dxnVar = new dxn(8.0f, true, dxr.a);
            cyrt cyrtVar = this.a;
            hve hveVar = hvi.e;
            ipn a = ebm.a(dxnVar, husVar, hfdVar, 54);
            int a2 = hey.a(hfdVar);
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
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            dwho.b(jij.b(R.drawable.gs_group_add_vd_theme_24, hfdVar), null, null, gft.a(hfdVar).a, hfdVar, 48, 4);
            dwjt.b(cyrtVar.b, null, gft.a(hfdVar).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar).m, hfdVar, 0, 0, 65530);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
