package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhm {
    public static final void a(boolean z, jyi jyiVar, fhi fhiVar, hfd hfdVar, int i) {
        int i2;
        exq d;
        jpg jpgVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1344558920);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(jyiVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(fhiVar) ? 128 : 256;
        }
        if (b.J((i2 & 147) != 146, i2 & 1)) {
            boolean z2 = (i2 & 14) == 4;
            boolean D = b.D(fhiVar) | z2;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new fgu(fhiVar, z);
                hfmVar.ad(R);
            }
            evy evyVar = (evy) R;
            boolean F = b.F(fhiVar) | z2;
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                R2 = new fhj(fhiVar, z);
                hfmVar.ad(R2);
            }
            fcu fcuVar = (fcu) R2;
            boolean j = jpm.j(fhiVar.f().c);
            int e = z ? jpm.e(fhiVar.f().c) : jpm.a(fhiVar.f().c);
            eva evaVar = fhiVar.d;
            float f = 0.0f;
            if (evaVar != null && (d = evaVar.d()) != null && (jpgVar = d.a) != null) {
                f = exp.a(jpgVar, e);
            }
            float f2 = f;
            hve hveVar = hvi.e;
            boolean F2 = b.F(evyVar);
            Object R3 = hfmVar.R();
            if (F2 || R3 == hfc.a) {
                R3 = new fhk(evyVar);
                hfmVar.ad(R3);
            }
            fci.d(fcuVar, z, jyiVar, j, 0L, f2, ilv.a(hveVar, evyVar, (PointerInputEventHandler) R3), b, (i2 << 3) & 1008);
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fhl(z, jyiVar, fhiVar, i);
        }
    }

    public static final boolean b(fhi fhiVar, boolean z) {
        ioc e;
        eva evaVar = fhiVar.d;
        if (evaVar == null || (e = evaVar.e()) == null) {
            return false;
        }
        return ffu.c(ffu.b(e), fhiVar.a(z));
    }
}
