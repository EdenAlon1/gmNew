package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxx implements ffjn {
    final /* synthetic */ dmxz a;
    final /* synthetic */ dmzz b;

    public dmxx(dmxz dmxzVar, dmzz dmzzVar) {
        this.a = dmxzVar;
        this.b = dmzzVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        String a;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dxn dxnVar = new dxn(4.0f, true, dxr.a);
            int i = huo.a;
            dmxz dmxzVar = this.a;
            hus husVar = hum.n;
            hve hveVar = hvi.e;
            if (dmxzVar.b) {
                hfdVar.v(99479850);
                a = jii.a(R.string.expandable_list_button_collapse_action, hfdVar);
                hfdVar.o();
            } else {
                hfdVar.v(99482440);
                a = jii.a(R.string.expandable_list_button_expand_action, hfdVar);
                hfdVar.o();
            }
            hvi d = dfb.d(hveVar, false, a, dmxzVar.c, 5);
            dmxz dmxzVar2 = this.a;
            dmzz dmzzVar = this.b;
            ipn a2 = ebm.a(dxnVar, husVar, hfdVar, 54);
            int a3 = hey.a(hfdVar);
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
            hlc.b(hfdVar, a2, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            dwjt.b(dmxzVar2.a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131070);
            dwho.a(dnaa.a(dmzzVar, hfdVar), null, null, 0L, hfdVar, 48, 12);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
