package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aco {
    public static final ada a(adu aduVar, ffji ffjiVar, hfd hfdVar) {
        adu aduVar2;
        hku.a(aduVar, hfdVar);
        hkx a = hku.a(ffjiVar, hfdVar);
        String str = (String) hqr.c(new Object[0], null, acn.a, hfdVar, 3072, 6);
        hik hikVar = acx.a;
        ado adoVar = (ado) hfdVar.e(acx.a);
        if (adoVar == null) {
            hfdVar.v(1006590171);
            Object obj = (Context) hfdVar.e(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof ado) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            adoVar = (ado) obj;
        } else {
            hfdVar.v(1006589303);
        }
        hfdVar.o();
        if (adoVar == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        adn d = adoVar.d();
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = new acj();
            hfdVar.y(f);
        }
        acj acjVar = (acj) f;
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            f2 = new ada(acjVar);
            hfdVar.y(f2);
        }
        ada adaVar = (ada) f2;
        boolean F = hfdVar.F(acjVar) | hfdVar.F(d) | hfdVar.D(str) | hfdVar.F(aduVar) | hfdVar.D(a);
        Object f3 = hfdVar.f();
        if (F || f3 == hfc.a) {
            aduVar2 = aduVar;
            f3 = new acm(acjVar, d, str, aduVar2, a);
            hfdVar.y(f3);
        } else {
            aduVar2 = aduVar;
        }
        ffji ffjiVar2 = (ffji) f3;
        boolean D = hfdVar.D(d) | hfdVar.D(str) | hfdVar.D(aduVar2);
        Object f4 = hfdVar.f();
        if (D || f4 == hfc.a) {
            f4 = new hgn(ffjiVar2);
            hfdVar.y(f4);
        }
        return adaVar;
    }
}
