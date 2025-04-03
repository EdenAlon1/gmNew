package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xok {
    public static final xob a(hkx hkxVar) {
        return (xob) hkxVar.a();
    }

    public static final void b(final dmzz dmzzVar, ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-615835388);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            ffixVar2 = ffixVar;
            dwhl.b(ffixVar2, null, false, null, null, hpx.d(-1581196510, new xoj(dmzzVar), b), b, ((i2 >> 3) & 14) | 1572864, 62);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: xoc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmzz dmzzVar2 = dmzz.this;
                    int i4 = i;
                    xok.b(dmzzVar2, ffixVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dspm dspmVar, final hvi hviVar, final xqb xqbVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1966014864);
        if (i3 == 0) {
            i2 = (true != b.F(dspmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? b.D(xqbVar) : b.F(xqbVar)) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hkx a = hkf.a(xqbVar.a, b);
            final View view = (View) b.e(AndroidCompositionLocals_androidKt.g);
            final dsma dsmaVar = (dsma) b.e(dsmp.a);
            int i4 = acz.a;
            dweu.a(hpx.d(1338311732, new xof(a), b), hviVar, hpx.d(-386530506, new xoh(acz.a(b), a), b), hpx.d(455404127, new xoi(a), b), 0.0f, null, dwkh.b(ibw.g, 0L, dooy.e(b).h, b, 54), null, b, (i2 & 112) | 3462, 176);
            hfdVar2 = b;
            hfdVar2.v(-717717571);
            boolean F = hfdVar2.F(dsmaVar) | hfdVar2.F(view) | hfdVar2.F(dspmVar);
            hfm hfmVar = (hfm) hfdVar2;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffix() { // from class: xod
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dsma dsmaVar2 = dsma.this;
                        if ((dsmaVar2 != null ? dsmaVar2.d() : null) == dsmm.a) {
                            dsmaVar2.e(view, false);
                        } else {
                            dspmVar.a.invoke();
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            acu.a(false, (ffix) R, hfdVar2, 0, 1);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: xoe
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dspm dspmVar2 = dspm.this;
                    hvi hviVar2 = hviVar;
                    int i5 = i;
                    xok.c(dspmVar2, hviVar2, xqbVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
