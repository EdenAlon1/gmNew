package defpackage;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cywc implements ffjm {
    final /* synthetic */ cyxb a;

    public cywc(cyxb cyxbVar) {
        this.a = cyxbVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cyyj cyyjVar = this.a.f;
            boolean z = (cyyjVar != null ? cyyjVar.e : null) == czaj.c;
            ViewParent parent = ((View) hfdVar.e(AndroidCompositionLocals_androidKt.g)).getParent();
            parent.getClass();
            kei keiVar = (kei) parent;
            hfdVar.v(-283252681);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                hic hicVar = new hic(Float.valueOf(0.0f), hla.a);
                hfdVar.y(hicVar);
                f = hicVar;
            }
            hho hhoVar = (hho) f;
            hfdVar.o();
            Boolean valueOf = Boolean.valueOf(z);
            hfdVar.v(-283249994);
            boolean E = hfdVar.E(z) | hfdVar.F(keiVar);
            Object f2 = hfdVar.f();
            if (E || f2 == hfc.a) {
                f2 = new cywb(z, hhoVar, keiVar, null);
                hfdVar.y(f2);
            }
            hfdVar.o();
            hgs.g(valueOf, (ffjm) f2, hfdVar);
            cyxb cyxbVar = this.a;
            cywo.b(cyxbVar, cyxbVar.d, cyxbVar.c == cyxc.c, hfdVar, 0);
        }
        return ffcu.a;
    }
}
