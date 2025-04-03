package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvwu implements ffjm {
    final /* synthetic */ hkx a;

    public cvwu(hkx hkxVar) {
        this.a = hkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi c = eba.c(ebs.u(ebs.w(hvi.e, cvww.c, 0.0f, cvww.d, 0.0f, 10), 0.0f, jif.a(R.dimen.max_dialog_height, hfdVar), 1), cvww.a);
            final hkx hkxVar = this.a;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
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
                Object valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            hvi a3 = dys.a(eba.c(hvi.e, cvww.b), hum.j);
            ipn a4 = dyc.a(hum.a, false);
            int a5 = hey.a(hfdVar);
            hgb c3 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, a3);
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a4, iss.e);
            hlc.b(hfdVar, c3, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a5))) {
                Object valueOf2 = Integer.valueOf(a5);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar2);
            }
            hlc.b(hfdVar, b2, iss.c);
            dwjt.b(jii.a(R.string.picker_disambiguation_title, hfdVar), null, dwek.e(hfdVar), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar).f, hfdVar, 0, 0, 65530);
            hfdVar.n();
            eey a6 = efb.a(0, hfdVar, 3);
            hfdVar.v(842702581);
            boolean D = hfdVar.D(hkxVar);
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new ffji() { // from class: cvwr
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        edp edpVar = (edp) obj3;
                        edpVar.getClass();
                        List a7 = cvww.a(hkx.this);
                        edpVar.a(a7.size(), null, new cvws(a7), new hpw(-632812321, true, new cvwt(a7)));
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            edh.a(null, a6, null, false, null, null, null, false, null, (ffji) f, hfdVar, 0, 509);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
