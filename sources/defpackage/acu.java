package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acu {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(boolean z, ffix ffixVar, hfd hfdVar, int i, int i2) {
        int i3;
        boolean z2;
        hfd b = hfdVar.b(-361453782);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
            z2 = z;
        } else {
            boolean z3 = (z ? 1 : 0) | i2;
            boolean z4 = 1 == z3;
            hkx a = hku.a(ffixVar, b);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new act(z4, a);
                hfmVar.ad(R);
            }
            int i4 = i3 & 14;
            act actVar = (act) R;
            Object R2 = hfmVar.R();
            if (i4 == 4 || R2 == hfc.a) {
                R2 = new acp(actVar, z4);
                hfmVar.ad(R2);
            }
            hgs.i((ffix) R2, b);
            int i5 = acz.a;
            acd a2 = acz.a(b);
            if (a2 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            aca gE = a2.gE();
            lkr lkrVar = (lkr) b.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean F = b.F(gE) | b.F(lkrVar);
            Object R3 = hfmVar.R();
            if (F || R3 == hfc.a) {
                R3 = new acr(gE, lkrVar, actVar);
                hfmVar.ad(R3);
            }
            hgs.b(lkrVar, gE, (ffji) R3, b);
            z2 = z3;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new acs(true == z2, ffixVar, i, i2);
        }
    }
}
