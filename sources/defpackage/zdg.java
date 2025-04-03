package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zdg implements ffjn {
    final /* synthetic */ zcm a;
    final /* synthetic */ ffji b;
    final /* synthetic */ hkx c;
    final /* synthetic */ hho d;

    public zdg(zcm zcmVar, ffji ffjiVar, hkx hkxVar, hho hhoVar) {
        this.a = zcmVar;
        this.b = ffjiVar;
        this.c = hkxVar;
        this.d = hhoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi b;
        hvi c;
        dys dysVar = (dys) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dysVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dysVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            b = dys.b(hvi.e, 1.0f, true);
            int i = huo.a;
            zcm zcmVar = this.a;
            ffji ffjiVar = this.b;
            hkx hkxVar = this.c;
            hho hhoVar = this.d;
            ipn a = dyo.a(dxu.c, hum.k, hfdVar, 48);
            int a2 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, b);
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
            hlc.b(hfdVar, b2, iss.c);
            if (athu.a()) {
                hfdVar.v(641603962);
                c = eba.d(hvi.e, eci.a(ecv.h(hfdVar), hfdVar).d());
                hfdVar.o();
            } else {
                hfdVar.v(641719344);
                c = eba.c(hvi.e, eci.a(ecv.g(hfdVar), hfdVar));
                hfdVar.o();
            }
            ebv.a(c, hfdVar);
            hfdVar.v(-2057505866);
            if (((Configuration) hfdVar.e(AndroidCompositionLocals_androidKt.a)).orientation == 1) {
                zdl.e(hfdVar, 0);
            }
            hfdVar.o();
            zdl.h(zcmVar.b, zcmVar.c, zdl.a(hkxVar), zdl.b(hhoVar), ffjiVar, hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
