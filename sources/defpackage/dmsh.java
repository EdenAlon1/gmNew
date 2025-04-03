package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmsh implements ffjn {
    final /* synthetic */ dmsk a;
    final /* synthetic */ hho b;
    final /* synthetic */ ffji c;

    public dmsh(dmsk dmskVar, hho hhoVar, ffji ffjiVar) {
        this.a = dmskVar;
        this.b = hhoVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ffix ffixVar;
        hvi hviVar = (hvi) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hviVar.getClass();
        hfdVar.v(1130044996);
        Context context = (Context) hfdVar.e(AndroidCompositionLocals_androidKt.b);
        iir iirVar = (iir) hfdVar.e(jdr.h);
        Object e = hfdVar.e(jdr.j);
        kah kahVar = kah.a;
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = hgs.a(ffhe.a, hfdVar);
            hfdVar.y(f);
        }
        ffsk ffskVar = (ffsk) f;
        hfdVar.v(807523391);
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            hic hicVar = new hic(false, hla.a);
            hfdVar.y(hicVar);
            f2 = hicVar;
        }
        hho hhoVar = (hho) f2;
        hfdVar.o();
        hfdVar.v(807525695);
        Object f3 = hfdVar.f();
        if (f3 == hfc.a) {
            hic hicVar2 = new hic(false, hla.a);
            hfdVar.y(hicVar2);
            f3 = hicVar2;
        }
        hho hhoVar2 = (hho) f3;
        hfdVar.o();
        fflb fflbVar = new fflb();
        hfdVar.v(807528174);
        Object f4 = hfdVar.f();
        if (f4 == hfc.a) {
            hfdVar.y(null);
            f4 = null;
        }
        hfdVar.o();
        fflbVar.a = (ffss) f4;
        dmsk dmskVar = this.a;
        hfdVar.v(807530116);
        boolean D = hfdVar.D(this.a) | hfdVar.F(context) | hfdVar.D(this.b);
        dmsk dmskVar2 = this.a;
        hho hhoVar3 = this.b;
        Object f5 = hfdVar.f();
        if (D || f5 == hfc.a) {
            ffixVar = null;
            f5 = new dmsb(dmskVar2, context, hhoVar3, null);
            hfdVar.y(f5);
        } else {
            ffixVar = null;
        }
        hfdVar.o();
        hgs.g(dmskVar.h, (ffjm) f5, hfdVar);
        ffix ffixVar2 = ffixVar;
        hvi a = ilv.a(hviVar, ffcu.a, new dmsg(fflbVar, this.a, context, ffskVar, this.b, iirVar, hhoVar, hhoVar2, this.c));
        hho hhoVar4 = this.b;
        dmsk dmskVar3 = this.a;
        dmrp dmrpVar = dmskVar3.c;
        hvi a2 = ilv.a(a, ffcu.a, new dmrv(new ffky(), new ffky(), hhoVar, hhoVar2, hhoVar4, dmskVar3.f, context, e == kahVar, dmrpVar != null ? dmrpVar.c : ffixVar2, iirVar));
        dmsk dmskVar4 = this.a;
        ffky ffkyVar = new ffky();
        ffji ffjiVar = dmskVar4.g;
        hvi a3 = ilv.a(a2, ffjiVar, new dmsa(ffkyVar, ffjiVar, context));
        hfdVar.o();
        return a3;
    }
}
