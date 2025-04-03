package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfl {
    public static final qgg a(qci qciVar, boolean z, boolean z2, qgk qgkVar, float f, int i, hfd hfdVar, int i2, int i3) {
        qfn qfnVar;
        Object[] objArr;
        hfdVar.v(683659508);
        int i4 = i3 & 64;
        qgh qghVar = qgh.a;
        int i5 = i4 != 0 ? 1 : i;
        if (i5 <= 0) {
            throw new IllegalArgumentException("Iterations must be a positive number (0).");
        }
        float f2 = (i3 & 32) != 0 ? 1.0f : f;
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            throw new IllegalArgumentException("Speed must be a finite number. It is " + f2 + ".");
        }
        boolean z3 = (!((i3 & 2) == 0)) | z;
        qfn c = qfx.c(hfdVar);
        hfdVar.v(-1303844859);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (R == hfc.a) {
            hic hicVar = new hic(Boolean.valueOf(z3), hla.a);
            hfmVar.ad(hicVar);
            R = hicVar;
        }
        qgk qgkVar2 = (i3 & 16) != 0 ? null : qgkVar;
        hho hhoVar = (hho) R;
        hfmVar.Z();
        hfdVar.v(-1303840640);
        float b = f2 / qlw.b((Context) hfdVar.e(AndroidCompositionLocals_androidKt.b));
        hfmVar.Z();
        boolean z4 = true;
        Object[] objArr2 = {qciVar, Boolean.valueOf(z3), qgkVar2, Float.valueOf(b), Integer.valueOf(i5)};
        hfdVar.v(-1303832942);
        boolean z5 = (((i2 & 112) ^ 48) > 32 && hfdVar.E(z3)) || (i2 & 48) == 32;
        boolean z6 = (!((i3 & 4) == 0)) | z2;
        boolean D = ((((i2 & 896) ^ 384) > 256 && hfdVar.E(z6)) || (i2 & 384) == 256) | z5 | hfdVar.D(c) | hfdVar.F(qciVar) | ((((3670016 & i2) ^ 1572864) > 1048576 && hfdVar.B(i5)) || (i2 & 1572864) == 1048576) | ((((i2 & 7168) ^ 3072) > 2048 && hfdVar.E(false)) || (i2 & 3072) == 2048) | hfdVar.A(b);
        if ((((57344 & i2) ^ 24576) <= 16384 || !hfdVar.D(qgkVar2)) && (i2 & 24576) != 16384) {
            z4 = false;
        }
        boolean D2 = D | z4 | hfdVar.D(qghVar) | hfdVar.E(false);
        Object R2 = hfmVar.R();
        if (D2 || R2 == hfc.a) {
            qfnVar = c;
            objArr = objArr2;
            qfk qfkVar = new qfk(z3, z6, qfnVar, qciVar, i5, b, qgkVar2, qghVar, hhoVar, null);
            hfmVar.ad(qfkVar);
            R2 = qfkVar;
        } else {
            objArr = objArr2;
            qfnVar = c;
        }
        hfmVar.Z();
        hgs.h(objArr, (ffjm) R2, hfdVar);
        hfmVar.Z();
        return qfnVar;
    }
}
