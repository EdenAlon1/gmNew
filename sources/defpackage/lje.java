package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lje {
    public static final void a(Class cls, hvi hviVar, ljg ljgVar, Bundle bundle, ffji ffjiVar, hfd hfdVar, int i) {
        int i2;
        hfm hfmVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1012439764);
        if (i3 == 0) {
            i2 = (true != b.F(cls) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(ljgVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(bundle) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffjiVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            hkx a = hku.a(ffjiVar, b);
            int a2 = hey.a(b);
            View view = (View) b.e(AndroidCompositionLocals_androidKt.g);
            b.w(485393638);
            boolean D = b.D(view);
            hfm hfmVar2 = (hfm) b;
            Object R = hfmVar2.R();
            if (D || R == hfc.a) {
                R = fr.m(view);
                hfmVar2.ad(R);
            }
            fr frVar = (fr) R;
            hfmVar2.Z();
            Context context = (Context) b.e(AndroidCompositionLocals_androidKt.b);
            b.w(485397692);
            Object R2 = hfmVar2.R();
            boolean z = true;
            if (R2 == hfc.a) {
                R2 = new ljf(a2);
                hfmVar2.ad(R2);
            }
            ljf ljfVar = (ljf) R2;
            hfmVar2.Z();
            kcg.b(ljfVar, hviVar, null, b, i2 & 112, 4);
            Object[] objArr = {frVar, ljfVar, cls, ljgVar};
            b.w(485406316);
            boolean F = b.F(frVar) | b.F(ljfVar) | b.F(context) | b.F(cls);
            if ((((i2 & 896) ^ 384) <= 256 || !b.D(ljgVar)) && (i2 & 384) != 256) {
                z = false;
            }
            boolean F2 = F | z | b.F(bundle) | b.B(a2) | b.D(a);
            Object R3 = hfmVar2.R();
            if (F2 || R3 == hfc.a) {
                hfmVar = hfmVar2;
                ljc ljcVar = new ljc(frVar, ljfVar, context, cls, a, ljgVar, bundle, a2);
                hfmVar.ad(ljcVar);
                R3 = ljcVar;
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            hgs.d(objArr, (ffji) R3, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ljd(cls, hviVar, ljgVar, bundle, ffjiVar, i);
        }
    }
}
