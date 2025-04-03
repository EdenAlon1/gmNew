package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlxl implements ffjn {
    final /* synthetic */ long a;

    public dlxl(long j) {
        this.a = j;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi a;
        ebq ebqVar = (ebq) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ebqVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(ebqVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi d = eba.d(ebs.k(hvi.e, 48.0f), 6.0f);
            int i = huo.a;
            long j = this.a;
            ipn a2 = dyc.a(hum.e, false);
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
            ebv.a(doaq.d(hxo.a(dyi.a.b(hvi.e), eqm.a), new ibw(j), 6), hfdVar);
            dwho.a(dnaa.a(dmzz.cU, hfdVar), jii.a(R.string.audiobubble_loading_text, hfdVar), dmzy.a(hvi.e, (kah) hfdVar.e(jdr.j)), gft.a(hfdVar).n, hfdVar, 0, 0);
            hfdVar.n();
            a = ebqVar.a(hvi.e, 1.0f, true);
            dyc.b(doaq.d(hxo.a(ebs.e(eba.j(a, 8.0f, 0.0f, 0.0f, 0.0f, 14), 14.0f), gft.c(hfdVar).f), new ibw(this.a), 6), hfdVar, 0);
        }
        return ffcu.a;
    }
}
