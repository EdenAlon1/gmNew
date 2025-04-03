package defpackage;

import android.content.Context;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyzr implements ffjm {
    final /* synthetic */ cyyj a;
    final /* synthetic */ cvo b;
    final /* synthetic */ crw c;

    public cyzr(cyyj cyyjVar, cvo cvoVar, crw crwVar) {
        this.a = cyyjVar;
        this.b = cvoVar;
        this.c = crwVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hvi a;
        hvi c2;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else if (this.a != null) {
            final Window window = dskj.b((Context) hfdVar.e(AndroidCompositionLocals_androidKt.b)).getWindow();
            hfdVar.v(-184461171);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfdVar.y(hicVar);
                f = hicVar;
            }
            final hho hhoVar = (hho) f;
            hfdVar.o();
            ffcu ffcuVar = ffcu.a;
            hfdVar.v(-184458719);
            boolean F = hfdVar.F(window);
            Object f2 = hfdVar.f();
            if (F || f2 == hfc.a) {
                f2 = new ffji() { // from class: cyzl
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        ((hgp) obj3).getClass();
                        Window window2 = window;
                        Boolean valueOf = Boolean.valueOf(new kxp(window2, window2.getDecorView()).d());
                        hho hhoVar2 = hhoVar;
                        hhoVar2.b(valueOf);
                        new kxp(window2, window2.getDecorView()).b(false);
                        return new cyzq(window2, hhoVar2);
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            hgs.c(ffcuVar, (ffji) f2, hfdVar);
            cyyj cyyjVar = this.a;
            List list = cyyjVar.b;
            final ffix ffixVar = cyyjVar.d;
            hfdVar.v(-184441277);
            boolean D = hfdVar.D(ffixVar);
            Object f3 = hfdVar.f();
            if (D || f3 == hfc.a) {
                f3 = new ffix() { // from class: cyzm
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffix.this.invoke();
                        return ffcu.a;
                    }
                };
                hfdVar.y(f3);
            }
            hfdVar.o();
            acu.a(false, (ffix) f3, hfdVar, 0, 1);
            c = ebs.c(hvi.e, 1.0f);
            a = dee.a(c, ibw.a, idb.a);
            hfdVar.v(-184437130);
            Object f4 = hfdVar.f();
            if (f4 == hfc.a) {
                f4 = new ffji() { // from class: cyzn
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        jkv jkvVar = (jkv) obj3;
                        jkvVar.getClass();
                        jks.a(jkvVar);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f4);
            }
            hfdVar.o();
            c2 = jjs.c(a, false, (ffji) f4);
            dwio.a(c2, hpx.d(616444959, new cyzo(this.a, ffixVar), hfdVar), null, null, null, 0, 0L, 0L, null, hpx.d(-45099148, new cyzp(this.a, this.b, list, this.c), hfdVar), hfdVar, 805306416, 508);
        }
        return ffcu.a;
    }
}
